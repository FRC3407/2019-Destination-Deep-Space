package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class TeleopDrive extends CommandBase {

    public TeleopDrive() {
        addRequirements(Robot.driveBase);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Robot.driveBase.tankDrive(Robot.input.getController().getAxis(1), Robot.input.getController().getAxis(2));
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