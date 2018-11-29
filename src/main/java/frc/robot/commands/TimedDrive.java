package main.java.frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;
import main.java.frc.robot.Robot;
import main.java.frc.robot.subsystems.GyroSub;


public class TimedDrive extends TimedCommand{
    private double right, left, initAngle;
    private  double currentAngle = 0;
    private double kP = 0.03; //arbitrary value, would need to be tested.
    //TODO: PID tune that
    public TimedDrive(double timeout, double right, double left) {
        super(timeout);
        initAngle = GyroSub.squishAngle(Robot.gyro.getAngle());
        this.right = right;
        this.left = left;
        requires(Robot.drive);
    }

    /**
     *
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {
        //init = .5
        //current .3

        if(left == right){
            currentAngle = GyroSub.squishAngle(Robot.gyro.getAngle());

            Robot.drive.arcade(left, (initAngle-currentAngle)*kP); //seems to be correct. similar to other solutons online.

        }else {
            Robot.drive.tank(left , right);
        }
    }


    /**
     * <p>
     * Returns whether this command is finished. If it is, then the command will be removed and
     * {@link #end()} will be called.
     * </p><p>
     * It may be useful for a team to reference the {@link #isTimedOut()}
     * method for time-sensitive commands.
     * </p><p>
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Returning true will result in the
     * command executing once and finishing immediately. It is recommended to use
     * {@link edu.wpi.first.wpilibj.command.InstantCommand} (added in 2017) for this.
     * </p>
     *
     * @return whether this command is finished.
     * @see Command#isTimedOut() isTimedOut()
     */

    /**
     * Called once when the command ended peacefully; that is it is called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    @Override
    protected void end() {
        Robot.drive.stop();
    }


    /**
     * <p>
     * Called when the command ends because somebody called {@link #cancel()} or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run.
     * </p><p>
     * This is where you may want to wrap up loose ends, like shutting off a motor that was being
     * used in the command.
     * </p><p>
     * Generally, it is useful to simply call the {@link #end()} method within this
     * method, as done here.
     * </p>
     */
    @Override
    protected void interrupted() {
        super.interrupted();
        Robot.drive.stop();
    }
}
