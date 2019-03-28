package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Pneumatics extends Subsystem {

    private DoubleSolenoid armsSolenoid = new DoubleSolenoid(RobotMap.dSolOpenArms, RobotMap.dSolCloseArms);
    private DoubleSolenoid hatchSolenoid = new DoubleSolenoid(RobotMap.dSolOpenHatch, RobotMap.dSolCloseHatch); //expects open, close
    //private Compressor compressor = new Compressor(RobotMap.compressor);

    //isExtendedHatch can never be true while isExtendedArms is false!
    public static boolean isExtendedArms = true;
    public static boolean isExtendedHatch = false;

    public void initDefaultCommand() {}

    public void armsPush(){
        armsSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void armsPull(){
        armsSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void armsOff(){
        armsSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    public void hatchPush(){
        hatchSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void hatchPull(){
        hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void hatchOff(){
        hatchSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

