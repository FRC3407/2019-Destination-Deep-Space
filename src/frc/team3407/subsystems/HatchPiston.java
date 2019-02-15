package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class HatchPiston extends Subsystem {

    private DoubleSolenoid doubleSolenoid = new DoubleSolenoid(RobotMap.dSol1, RobotMap.dSol2);

    public static boolean isExtended = false;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {}

    public void push(){
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void pull(){
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    //public void off(){ doubleSolenoid.set(DoubleSolenoid.Value.kOff); }

}

