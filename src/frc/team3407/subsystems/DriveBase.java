package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team3407.RobotMap;
import frc.team3407.commands.DriveCommand;

public class DriveBase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Victor leftFront = new Victor(RobotMap.leftFront);
    private Victor leftBack = new Victor(RobotMap.leftBack);
    private Victor rightFront = new Victor(RobotMap.rightFront);
    private Victor rightBack = new Victor(RobotMap.rightBack);

    private SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    private SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFront, rightBack);

    private DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);


    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }

    public void tank(double leftSpeed, double rightSpeed){
        drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop(){
        drive.tankDrive(0,0);
    }

}