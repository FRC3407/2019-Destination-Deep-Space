package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class ElevatorUp extends CommandBase {

    public ElevatorUp() {
        addRequirements(Robot.elevator);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        if(Robot.elevator.getTopSwitch()) {
            Robot.elevator.hold();
        } else {
            Robot.elevator.moveUp();
        }
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