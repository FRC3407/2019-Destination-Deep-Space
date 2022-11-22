package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class DriveBase extends SubsystemBase {

    private double d_speed = Constants.driveSpeedLow;

    private MotorController 
        leftMotors = new MotorControllerGroup(new Victor(Constants.leftFront), new Victor(Constants.leftBack)), 
        rightMotors = new MotorControllerGroup(new Victor(Constants.rightFront), new Victor(Constants.rightBack));
    private DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    public DriveBase() {
        leftMotors.setInverted(false);
        rightMotors.setInverted(true);
    }

    public void setSpeed(double multiplier) {
        this.d_speed = multiplier;
    }
    public double getSpeed() {
        return this.d_speed;
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        this.drive.tankDrive(leftSpeed*d_speed, rightSpeed*d_speed);
    }


    public void setLeft(double speed) {
        leftMotors.set(speed);
    }
    public void setRight(double speed) {
        rightMotors.set(speed);
    }
    public void stop(){
        this.drive.tankDrive(0,0);
    }

    public double getLeft() {
        return leftMotors.get();
    }
    public double getRight() {
        return rightMotors.get();
    }
}