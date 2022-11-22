package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class HatchToggle extends CommandBase {

    //TODO: split this into two commands like the others

    private boolean outCommand;

    public HatchToggle(boolean outCommand) {
        addRequirements(Robot.hatchGrab);
        this.outCommand = outCommand;
    }

    @Override
    public void initialize() {
        //only runs if the arms are up, out of the way (piston extended)
        if(!Robot.cargo.getArms()){
            if(Robot.hatchGrab.getHatch() && !outCommand){
                Robot.hatchGrab.hatchPull();
            } else if(!Robot.hatchGrab.getHatch() && outCommand){
                Robot.hatchGrab.hatchPush();
            }
        }
        else {
            System.out.println("Hatch not activated because arms are extended");
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