package frc.team3407.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class Pneumatics extends Subsystem {

    private DoubleSolenoid doubleSolenoid = new DoubleSolenoid(RobotMap.dSol1, RobotMap.dSol2);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        //  TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void push(){
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void pull(){
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void stop(){
        doubleSolenoid.set(DoubleSolenoid.Value.kOff);
    }

}

