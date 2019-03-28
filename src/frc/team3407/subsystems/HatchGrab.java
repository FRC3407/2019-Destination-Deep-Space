package frc.team3407.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3407.RobotMap;

public class HatchGrab extends Subsystem {

    private final static double speed = RobotMap.hatchGrabSpeed;

    //public static boolean isOpen = false;

    //used in HatchGrabCommand
    //TODO determine counter threshold
    public final static int threshold = 10;

    Victor talon = new Victor(RobotMap.hatchGrabMotor); //TODO: give a lecture why setting things to NULL as a placeholder is always a bad idea
    //you need to put a TO_DO at the very least

    public void initDefaultCommand(){}

    public void stop(){
        //"Motor can be moved again by calling set without having to re-enable the motor."
        talon.stopMotor();
    };

    public void open(){
        talon.set(speed);
        //testing
        //System.out.println(talon.isAlive());
        //System.out.println(talon.get());
    }

    public void close(){
        talon.set(-speed);
    }

}
