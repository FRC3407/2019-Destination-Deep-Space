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
    private DigitalInput topSwitch = new DigitalInput(RobotMap.topSwitch); //TODO upper limit switch reset the encoder (can't reset to)
    private DigitalInput bottomSwitch = new DigitalInput(RobotMap.bottomSwitch);

    public void moveUp(){ //maybe this take a speed input (i.e .set(speed*input))
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

