package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class Cargo extends SubsystemBase {

    private boolean arms_extended = false; 

    private DoubleSolenoid arms_ud = new DoubleSolenoid(Constants.armsSolOpen, Constants.armsSolClose);
    private Victor 
        armL = new Victor(Constants.cargoMotorL),   //convert to speedcontrollergroup with one side inverted
        armR = new Victor(Constants.cargoMotorR);


    public void armsPush(){
        arms_ud.set(DoubleSolenoid.Value.kForward);
        this.arms_extended = true;
    }
    public void armsPull(){
        arms_ud.set(DoubleSolenoid.Value.kReverse);
        this.arms_extended = false;
    }
    public void armsOff(){
        arms_ud.set(DoubleSolenoid.Value.kOff);
    }
    public boolean getArms() {
        return this.arms_extended;
    }

    public void intake() {
        armL.set(-Constants.cargoSpeed*0.8); 
        armR.set(Constants.cargoSpeed*0.8);
    }
    public void outtake() {
        armL.set(Constants.cargoSpeed);
        armR.set(-Constants.cargoSpeed);
    }
    public void hold() {
        armL.set(-Constants.cargoSpeed*Constants.cargoHoldSpeed);
        armR.set(Constants.cargoSpeed*Constants.cargoHoldSpeed);
    }
    public void stop() {
        armL.stopMotor();
        armR.stopMotor();
    }
}