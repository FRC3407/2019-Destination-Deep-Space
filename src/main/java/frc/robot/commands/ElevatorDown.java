package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class ElevatorDown extends CommandBase {

    public ElevatorDown() {
        addRequirements(Robot.elevator);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Robot.elevator.stop();
    }
    @Override
    public boolean isFinished() {
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        Robot.elevator.hold();
    }
}