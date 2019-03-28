package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.Robot;
import frc.team3407.RobotMap;

public class Pneumatics extends Subsystem {

    private DoubleSolenoid hatchSolenoid = new DoubleSolenoid(RobotMap.hatchSolOpen, RobotMap.hatchSolClose); //expects open, close
    private DoubleSolenoid cargoSolenoid = new DoubleSolenoid(RobotMap.cargoSolOpen, RobotMap.cargoSolClose);
    //private Compressor compressor = new Compressor(RobotMap.compressor);

    public static boolean isExtended = false;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {}

    public void push(){
        cargoSolenoid.set(DoubleSolenoid.Value.kForward);
        hatchSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void pull(){
        cargoSolenoid.set(DoubleSolenoid.Value.kReverse);
        hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void off(){
        cargoSolenoid.set(DoubleSolenoid.Value.kOff);
        hatchSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

