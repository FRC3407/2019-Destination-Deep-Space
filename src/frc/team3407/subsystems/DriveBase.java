package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team3407.RobotMap;

public class DriveBase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Victor leftFront = new Victor(RobotMap.leftFront);
    Victor leftBack = new Victor(RobotMap.leftBack);
    Victor rightFront = new Victor(RobotMap.rightFront);
    Victor rightBack = new Victor(RobotMap.rightBack);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFront, rightBack);

    private DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void tank(double leftSpeed, double rightSpeed){
        drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop(){
        drive.tankDrive(0,0);
    }

}