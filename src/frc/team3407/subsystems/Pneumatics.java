package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Pneumatics extends Subsystem {

    private DoubleSolenoid hatchSolenoid = new DoubleSolenoid(RobotMap.hatchSolOpen, RobotMap.hatchSolClose); //expects open, close
    private DoubleSolenoid armsSolenoid = new DoubleSolenoid(RobotMap.armsSolOpen, RobotMap.armsSolClose);

    //private Compressor compressor = new Compressor(RobotMap.compressor);

    //isExtendedHatch can never be true while isExtendedArms is false!
    public static boolean isExtendedArms = true;
    public static boolean isExtendedHatch = false;

    public void initDefaultCommand() {}


    public void armsPush(){
        armsSolenoid.set(DoubleSolenoid.Value.kForward);
        System.out.println("PUSHING ARMS");
    }

    public void armsPull(){
        armsSolenoid.set(DoubleSolenoid.Value.kReverse);
        System.out.println("PULLING ARMS");
    }

    public void armsOff(){
        armsSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    public void hatchPush(){
        hatchSolenoid.set(DoubleSolenoid.Value.kForward);
        System.out.println("PUSHING HATCH");
    }

    public void hatchPull(){
        hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
        System.out.println("PULLING HATCH");
    }

    public void hatchOff(){
        hatchSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

