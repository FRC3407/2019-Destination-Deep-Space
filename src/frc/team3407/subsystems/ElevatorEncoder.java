package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import frc.team3407.Robot;
import frc.team3407.RobotMap;

public class ElevatorEncoder extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Encoder encoder = new Encoder(RobotMap.encoderInput1, RobotMap.encoderInput2, RobotMap.encoderReverseDirection, RobotMap.encoderType);

    public ElevatorEncoder(){
        encoder.reset();
        encoder.setDistancePerPulse(RobotMap.distancePerPulse);
    }

    public void reset(){
        encoder.reset();
    }

    public double getDistance(){
        return encoder.getDistancePerPulse();
    }

    public int getCount(){
        return encoder.get();
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

