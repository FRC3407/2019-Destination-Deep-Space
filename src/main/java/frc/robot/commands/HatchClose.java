package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;

public class HatchClose extends CommandBase {

    //NOTE: This class used to implement a counter that would determine how many iterations of 'execute()' should run before the command 
    //finished. Add this back if needed (threshold was 10 iterations). Code will also need to be added back to 'execute()' in this case. 

    public HatchClose() {
        addRequirements(Robot.hatchGrab);
    }

    @Override
    public void initialize() {}
    @Override
    public void execute() {
        Robot.hatchGrab.close();

        //System.out.println("HatchGrabCommand");
        //System.out.println();
        //System.out.println(System.currentTimeMillis());
        //counter++;
    }
    @Override
    public boolean isFinished() {
        // Make this return true when this Command no longer needs to run execute()
        //return counter >= HatchGrab.threshold;'
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        //TODO determine if resetting counter here is necessary (depends on how the command is called)
        //System.out.println(System.currentTimeMillis());
        //counter = 0;
        //HatchGrab.isOpen = !HatchGrab.isOpen;
        Robot.hatchGrab.stop();
    }
}