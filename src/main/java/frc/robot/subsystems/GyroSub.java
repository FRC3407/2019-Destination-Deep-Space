package main.java.frc.robot.subsystems;


import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class GyroSub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // Initialize new object gyro
    private AnalogGyro geoff = new AnalogGyro(1);

    public void gyroCalibrate(){
        geoff.initGyro();
        geoff.calibrate();
    }

    public double getAngle(){
        return geoff.getAngle();
    }



    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

