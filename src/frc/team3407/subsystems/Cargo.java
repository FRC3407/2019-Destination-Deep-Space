package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.Robot;
import frc.team3407.RobotMap;

public class Cargo extends Subsystem {

    private static final double speed = RobotMap.cargoSpeed;
    private static final double holdSpeed = speed*RobotMap.cargoHoldSpeed;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Victor armL = new Victor(RobotMap.armL);
    Victor armR = new Victor(RobotMap.armR);

    public void intake(){
        armL.set(speed);
        armR.set(speed);
    }
    public void hold(){
        armL.set(holdSpeed);
        armR.set(holdSpeed);
    }
    public void outtake(){
        armL.set(-speed);
        armR.set(-speed);
    }
    public void stop(){
        armL.stopMotor();
        armR.stopMotor();
    }
    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

