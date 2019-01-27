package frc.team3407.commands;

import frc.team3407.Robot;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class TimedDrive extends TimedCommand {
    private double left, right;

    public TimedDrive(double timeout, double left, double right) {
        super(timeout);
        this.left = left;
        this.right = right;
        requires(Robot.driveBase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("TimedDrive left=" + left + " right=" + right);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.driveBase.tank(left,right);

    }

    // Called once after timeout
    protected void end() {
        Robot.driveBase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.driveBase.stop();
    }
}