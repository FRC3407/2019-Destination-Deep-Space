package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class AutoDrive extends CommandBase {
    private double left, right;

    public AutoDrive(double left, double right) {
        this.left = left;
        this.right = right;
        addRequirements(Robot.driveBase);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Robot.driveBase.tankDrive(left,right);
    }
    @Override
    public boolean isFinished() {
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        Robot.driveBase.stop();
    }
}