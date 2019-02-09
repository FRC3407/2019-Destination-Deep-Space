package frc.team3407.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class HatchGrab extends Subsystem {

    private static double talonConstant;
    Talon talon = new Talon(RobotMap.talon);

    public void initDefaultCommand(){}

    //unusable garbage code, fix later
    public void grab(){
        talon.set(talonConstant);
    }

}
