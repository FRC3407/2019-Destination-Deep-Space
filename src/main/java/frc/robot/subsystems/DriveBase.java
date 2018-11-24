package main.java.frc.robot.subsystems;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import main.java.frc.robot.RobotMap;
import main.java.frc.robot.commands.DriveCommand;

public class DriveBase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Victor frontLeft = new Victor(RobotMap.frontLeft);
    private Victor rearLeft = new Victor(RobotMap.rearLeft);
    private SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, rearLeft);
    private Victor frontRight = new Victor(RobotMap.frontRight);
    private Victor rearRight = new Victor(RobotMap.rearRight);
    private SpeedControllerGroup right = new SpeedControllerGroup(frontRight,rearRight);

    DifferentialDrive drive =  new DifferentialDrive(left, right);

    public void tank(double leftPower, double rightPower){
        drive.tankDrive(leftPower,rightPower);
    }

    public void arcade(double power, double angle){
        drive.arcadeDrive(power, angle);
    }

    public void stop(){
        drive.tankDrive(0,0);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
}

