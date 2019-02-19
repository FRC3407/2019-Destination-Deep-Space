package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static double speed = RobotMap.elevatorSpeed;

    Victor elevatorMotor = new Victor(RobotMap.elevatorMotor);

    public void moveUp(){
        //TODO: "input speed?" -kelton (not sure what this means)
        elevatorMotor.set(speed);
    }

    public void moveDown(){
        elevatorMotor.set(-speed);
    }

    public void stop(){
        elevatorMotor.stopMotor();
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

