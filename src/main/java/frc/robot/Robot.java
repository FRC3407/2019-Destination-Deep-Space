package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Command;

import edu.wpi.cscore.VideoSource;
import edu.wpi.first.cameraserver.CameraServer;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.subsystems.*;

public class Robot extends TimedRobot {
    public static DriveBase driveBase = new DriveBase();
    public static Elevator elevator = new Elevator();
    public static HatchGrabber hatchGrab = new HatchGrabber();
    public static Cargo cargo = new Cargo();

    public static Input input = new Input(1);

    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();

    public Robot() {

    }



    @Override
    public void robotInit() {
        //add ~chooser~ autonomous commands here
        SmartDashboard.putData("Auto mode", chooser);

        VideoSource highCam = CameraServer.getInstance().startAutomaticCapture("High Camera", Constants.highCamera);
        highCam.setResolution(240, 144);
        highCam.setFPS(20);

        //VideoSource lowCam = CameraServer.getInstance().startAutomaticCapture("Low Camera", RobotMap.lowCamera);
        //lowCam.setResolution(175 ,100); //Disabled because of bandwith/lack of cams.
        //lowCam.setFPS(10);
    }
    @Override 
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }



    /**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
     * the robot is disabled.
     */
    @Override
    public void disabledInit() {}
    @Override
    public void disabledPeriodic() {}



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
            autonomousCommand.schedule();
        }
    }
    @Override
    public void autonomousPeriodic() {}



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

        input.teleop_control.schedule();
    }
    @Override
    public void teleopPeriodic() {}



    @Override
    public void testInit() {}
    @Override
    public void testPeriodic() {}
}