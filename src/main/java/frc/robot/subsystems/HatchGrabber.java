package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;

import frc.robot.Constants;

public class HatchGrabber extends SubsystemBase {

    //public static final int threshold = 10;
    private boolean hatch_extended = false;

    private Victor hatch = new Victor(Constants.hatchGrabMotor); 
    private DoubleSolenoid 
        hatchSolenoid = new DoubleSolenoid(Constants.hatchSolOpen, Constants.hatchSolClose);

    public void open() {
        hatch.set(Constants.hatchGrabSpeed);
    }
    public void close() {
        hatch.set(-Constants.hatchGrabSpeed);
    }
    public void stop() {
        hatch.stopMotor();
    }

    public void hatchPush() {
        hatchSolenoid.set(DoubleSolenoid.Value.kForward);
        this.hatch_extended = true;
    }
    public void hatchPull() {
        hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
        this.hatch_extended = false;
    }
    public void hatchOff() {
        hatchSolenoid.set(DoubleSolenoid.Value.kOff);
    }
    public boolean getHatch() {
        return this.hatch_extended;
    }
}