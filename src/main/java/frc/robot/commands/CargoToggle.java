package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class CargoToggle extends CommandBase {

    public CargoToggle() {
        addRequirements(Robot.cargo);
    }

    @Override
    public void initialize() {
        if(Robot.cargo.getArms()) {
            Robot.cargo.armsPull();
        } else if(!Robot.cargo.getArms() && !Robot.hatchGrab.getHatch()) {
            Robot.cargo.armsPush();
        }
        else {
            System.out.println("Arms not not activated because hatch is extended");
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