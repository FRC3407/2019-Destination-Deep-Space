package main.java.frc.robot.subsystems;


import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.java.frc.robot.RobotMap;
import edu.wpi.first.wpilibj.SerialPort;

public class GyroSub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    // Initialize new object gyro
    //private AnalogGyro geoff = new AnalogGyro(RobotMap.gyroPort);
    private AHRS ahrs = new AHRS(SerialPort.Port.kMXP);

    public void gyroCalibrate(){
        //geoff.initGyro();
        //geoff.calibrate();
    }

    public double getAngle(){
        return ahrs.getAngle();
    }

    public static double squishAngle(double angle){
        if(angle>180){
            angle = ((angle-180)*-1);
        }
        angle/=180;
        return angle;
    }



    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

