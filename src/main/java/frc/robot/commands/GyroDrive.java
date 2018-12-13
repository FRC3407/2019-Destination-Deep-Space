package main.java.frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import main.java.frc.robot.Robot;

public class GyroDrive extends Command {
    private double power, angle, initAngle;
    private double threshold = 3;
    private double kP = .03; //random value. requires tuning.
    private boolean isFinished = false;
    //TODO: Tune kP & make a3 shuffleboard (or whatever) value for tuning

    public GyroDrive(double power, double angle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.gyro);
        requires(Robot.drive);
        this.initAngle = Robot.gyro.getAngle();
        this.power = power;
        this.angle = initAngle + angle;
    }


    /**
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
        double error = angle - Robot.gyro.getAngle();
        System.out.println(String.format("e=%s target=%s, current=%s", error, angle, Robot.gyro.getAngle()));
        if(Math.abs(error) > threshold){
            Robot.drive.arcade(power, getTurn(error));
        } else {
            Robot.drive.arcade(0,0);
            isFinished = true;
        }

    }

    private double getTurn(double error) {
        return ((error > 0) ? 1 : -1) * getAbsoluteTurn(error);
    }
    private double getAbsoluteTurn(double error) {
        error = Math.abs(error);
        if (error > 25) {
            return 0.4;
        } else if (error > 10) {
            return 0.3;
        } else {
            return 0.2;
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
    @Override
    protected boolean isFinished() {
        return isFinished;
    }


    /**
     * Called once when the command ended peacefully; that is it is called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    @Override
    protected void end() {
        Robot.drive.arcade(0,0);
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
        Robot.drive.arcade(0,0);
        super.interrupted();
    }
}
