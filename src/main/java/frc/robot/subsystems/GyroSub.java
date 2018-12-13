package main.java.frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import main.java.frc.robot.RobotMap;
import edu.wpi.first.wpilibj.SerialPort;

public class GyroSub extends Subsystem {

    private AHRS ahrs = new AHRS(SerialPort.Port.kMXP);

    public void gyroCalibrate() {
        ahrs.resetDisplacement();
        //geoff.initGyro();
        //geoff.calibrate();
    }

    public double getAngle() {
        return ahrs.getAngle();
    }

    public double getXPosition() {
        return ahrs.getDisplacementX();
    }

    public double getYPosition() {
        return ahrs.getDisplacementY();
    }

    public boolean isCalibrate() {
        return ahrs.isCalibrating();
    }

    public static double squishAngle(double angle) {
        if (angle > 180) {
            angle = ((angle - 180) * -1);
        }
        angle /= 180;
        return angle;
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public String getStatusMessage() {
        SmartDashboard.putNumber("NavX/X", ahrs.getDisplacementX());
        SmartDashboard.putNumber("NavX/Y", ahrs.getDisplacementY());
        SmartDashboard.putNumber("NavX/Angle", ahrs.getAngle());
        return String.format("GYRO: x=%s y=%s angle=%s isCalibrating=%s",
                getXPosition(), getYPosition(), getAngle(), isCalibrate());
    }
}
