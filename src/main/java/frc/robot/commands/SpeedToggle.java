package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;
import frc.robot.Constants;

public class SpeedToggle extends CommandBase {

    public SpeedToggle() {
        addRequirements(Robot.driveBase);
    }

    @Override
    public void initialize() {  //this way of setting speed might make the drivebase stop for one interval, if its a problem this needs to be integrated elsewhere
        if(Robot.driveBase.getSpeed() == Constants.driveSpeedHigh) {
            Robot.driveBase.setSpeed(Constants.driveSpeedLow);
        } else {
            Robot.driveBase.setSpeed(Constants.driveSpeedHigh);
        }
    }
    @Override
    public void execute() {}
    @Override
    public boolean isFinished() {
        return true;
    }
    @Override
    public void end(boolean interrupted) {}
}