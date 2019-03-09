/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3407;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team3407.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
// If you rename or move this class, update the build.properties file in the project root
public class Robot extends TimedRobot {

    public static Cargo cargo = new Cargo();

    public static Elevator elevator = new Elevator();

    public static DriveBase driveBase = new DriveBase();

    public static HatchGrab hatchGrab = new HatchGrab();

    public static Pneumatics pneumatics = new Pneumatics();

    public static ElevatorEncoder encoder = new ElevatorEncoder();

    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();
    public static OI oi = new OI();

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        // chooser.addDefault("Default Auto", new ExampleCommand());
        // chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
        VideoSource highCam = CameraServer.getInstance().startAutomaticCapture("High Camera", 0);
        VideoSource lowCam = CameraServer.getInstance().startAutomaticCapture("Low Camera", 1);

        //CameraServer.getInstance().startAutomaticCapture("test1", 1);
        lowCam.setResolution(250 ,150);
        lowCam.setFPS(10);
        highCam.setResolution(360, 240);
        highCam.setFPS(20);
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
        //System.out.println("AutonomousInit");
        //HatchGrabCommand test1 = new HatchGrabCommand();
        //HatchGrabCommand test2 = new HatchGrabCommand();
        //CommandGroup testGroup = new CommandGroup();
        //testGroup.addSequential(test1);
        //testGroup.addSequential(new WaitCommand(3));
        //testGroup.addSequential(test2);
        //autonomousCommand = testGroup;

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
        Scheduler.getInstance().run();
        System.out.println(RobotMap.driveSpeed);
    }

    @Override
    public void testInit() {
        System.out.println("Test init..");

    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() 
    {
        driveBase.tank(0.4, 0.4);
        System.out.println("Test..");
    }
}
