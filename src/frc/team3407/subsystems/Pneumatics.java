package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.Robot;
import frc.team3407.RobotMap;

public class Pneumatics extends Subsystem {

    private DoubleSolenoid doubleSolenoid = new DoubleSolenoid(RobotMap.dSolOpen, RobotMap.dSolClose); //expects open, close
    private Solenoid solenoid = new Solenoid(RobotMap.singleSol);
    //private Compressor compressor = new Compressor(RobotMap.compressor);

    public static boolean isExtended = false;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {}

    public void push(){
        solenoid.set(true);
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void pull(){
        solenoid.set(false);
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void off(){
        solenoid.set(false);
        doubleSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

