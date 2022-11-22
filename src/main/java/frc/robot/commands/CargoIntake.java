package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class CargoIntake extends CommandBase {

    public CargoIntake() {
        addRequirements(Robot.cargo);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Robot.cargo.intake();
    }
    @Override
    public boolean isFinished() {
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        Robot.cargo.hold();
    }
}