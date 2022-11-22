package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
//import edu.wpi.first.wpilibj.Encoder;

import frc.robot.Constants;

public class Elevator extends SubsystemBase {

    private Victor elevatorMotor = new Victor(Constants.elevatorMotor);
    private DigitalInput topSwitch = new DigitalInput(Constants.topSwitch); //TODO upper limit switch reset the encoder (can't reset too)
    //private DigitalInput bottomSwitch = new DigitalInput(RobotMap.bottomSwitch);
    //private Encoder encoder = new Encoder(Constants.encoderInput1, Constants.encoderInput2, Constants.encoderReverseDirection, Constants.encoderType);

    // public Elevator() {
    //     encoder.reset();
    //     encoder.setDistancePerPulse(Constants.distancePerPulse);
    // }

    public boolean getTopSwitch() {
        return topSwitch.get();
    }
    // public boolean getBottomSwitch() {
    //    return bottomSwitch.get();
    //}

    public void moveUp(){ //maybe this take a speed input (i.e .set(speed*input))
        elevatorMotor.set(Constants.elevatorSpeed);
    }
    public void moveDown(){
        elevatorMotor.set(-Constants.elevatorSpeed);
    }

    public void hold(){
        elevatorMotor.set(Constants.elevatorHoldSpeed);
    }
    public void stop(){
        elevatorMotor.stopMotor();
    }

    // public void reset(){
    //     encoder.reset();
    // }
    // public int getCount(){
    //     return encoder.get();
    // }
}