package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static double speed = RobotMap.elevatorSpeed;

    private Victor elevatorMotor = new Victor(RobotMap.elevatorMotor);
    private DigitalInput topSwitch = new DigitalInput(RobotMap.topSwitch); //TODO have the limit switches reset the encoder
    private DigitalInput bottomSwitch = new DigitalInput(RobotMap.bottomSwitch);

    public void moveUp(){
        //TODO: "input speed?" -kelton (not sure what this means)
        elevatorMotor.set(speed);
    }

    public void hold(){
        elevatorMotor.set(RobotMap.elevatorHoldSpeed);
    }

    public boolean getTopSwitch(){
        return topSwitch.get();
    }
    public boolean getBottomSwitch() {return bottomSwitch.get();}
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

