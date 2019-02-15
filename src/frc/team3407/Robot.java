/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3407;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team3407.commands.HatchGrabCommand;
import frc.team3407.subsystems.DriveBase;
import frc.team3407.subsystems.HatchGrab;
import frc.team3407.subsystems.HatchPiston;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
// If you rename or move this class, update the build.properties file in the project root
public class Robot extends TimedRobot 
{

    public static OI oi = new OI();

    public static DriveBase driveBase = new DriveBase();

    public static HatchGrab hatchGrab = new HatchGrab();

    public static HatchPiston hatchPiston = new HatchPiston();

    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        // chooser.addDefault("Default Auto", new ExampleCommand());
        // chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
        CameraServer.getInstance().startAutomaticCapture("test0", 0);
        CameraServer.getInstance().startAutomaticCapture("test1", 1);
        //testCam.setResolution(1280, 720);
        //testCam.setFPS(28);
    }
    /**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
     * the robot is disabled.
     */
    @Override
    public void disabledInit() 
    {
        
    }

    @Override
    public void disabledPeriodic(){
        Scheduler.getInstance().run();
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different auton @Value was introduced as experimental feature in lombok v0.11.4. omous modes using the dashboard. The sendable
     * chooser code works with the Java SmartDashboard. If you prefer the
     * LabVIEW Dashboard, remove all of the chooser code and uncomment the
     * getString code to get the auto name from the text box below the Gyro
     *
     * <p>You can add additional auto modes by adding additional commands to the
     * chooser code above (like the commented example) or additional comparisons
     * to the switch structure below with additional strings & commands.
     */
    @Override
    public void autonomousInit() 
    {
        //autonomousCommand = chooser.getSelected();

        /*
         * String autoSelected = SmartDashboard.getString("Auto Selector",
         * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
         * = new MyAutoCommand(); break; case "Default Auto": default:
         * autonomousCommand = new ExampleCommand(); break; }
         */

        //replace the following
        /*TimedDrive test1 = new TimedDrive(1, .5, 0);
        TimedDrive test2 = new TimedDrive(1, 0, .5);
        TimedDrive test3 = new TimedDrive(2, .5, .5);
        CommandGroup testSeq = new CommandGroup();
        testSeq.addSequential(test1);
        testSeq.addSequential(test2);
        testSeq.addSequential(test3);
        autonomousCommand = testSeq;*/

        //TODO test this with motor to ensure HatchGrabCommand() works properly
        HatchGrabCommand test1 = new HatchGrabCommand();
        //HatchGrabCommand test2 = new HatchGrabCommand();
        CommandGroup testGroup = new CommandGroup();
        testGroup.addSequential(test1);
        testGroup.addSequential(new WaitCommand(3));
        testGroup.addSequential(test1);
        autonomousCommand = testGroup;

        // schedule the autonomous command (example)
        if (autonomousCommand != null) 
        {
            autonomousCommand.start();
        }
    }

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() 
    {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.

        if (autonomousCommand != null) 
        {
            autonomousCommand.cancel();
        }
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() 
    {
        //oi.hatchGrabButton.whenPressed(new HatchGrabCommand());

        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() 
    {

    }
}
