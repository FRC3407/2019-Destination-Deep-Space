package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private static double speed = RobotMap.elevatorSpeed;
    Victor elevator1 = new Victor(RobotMap.elevator1);
    Victor elevator2 = new Victor(RobotMap.elevator2);

    private SpeedControllerGroup elevatorMotorGroup = new SpeedControllerGroup(elevator1, elevator2);

    public void moveUp(){//input speed?
        elevatorMotorGroup.set(speed);
    }
    public void moveDown(){
        elevatorMotorGroup.set(-speed);
    }
    public void stop(){
        elevatorMotorGroup.set(0);
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

