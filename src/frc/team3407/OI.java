/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3407;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team3407.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
    //TODO test everything (especially elevator and cargo arms)
    public OI(){
        //triggers hatch grab mechanism
        //hatchGrabButton.whenPressed(new HatchGrabCommand());
        hatchGrabOpen1.whileHeld(new HatchGrabCommand(true));
        hatchGrabOpen2.whileHeld(new HatchGrabCommand(true));
        hatchGrabClose1.whileHeld(new HatchGrabCommand(false));
        hatchGrabClose2.whileHeld(new HatchGrabCommand(false));

        //triggers hatch piston mechanism
        hatchPistonIn.whenPressed(new HatchPistonCommand(false));
        hatchPistonOut.whenPressed(new HatchPistonCommand(true));

        //triggers arms piston
        armsPistonToggle.whenPressed(new CargoArms());

        //cargo arms
        cargoIn.whileHeld(new CargoCommand(false));
        cargoOut.whileHeld(new CargoCommand(true));

        //elevator
        elevatorUp.whileHeld(new ElevatorCommand(true));
        elevatorDown.whileHeld(new ElevatorCommand(false));

        //speed toggle
        speedToggle.whenPressed(new SpeedToggle());

        //TODO: WIP
        //spooky elevator code (with encoder)
        //elevatorUp.whenPressed(new ElevatorCommand(true));
        //elevatorDown.whenPressed(new ElevatorCommand(false));
    }

    // CREATING BUTTONS
    // One type of button is a joystick button which is any button on a
    // joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick stickL = new Joystick(RobotMap.stickL);
    public Joystick stickR = new Joystick(RobotMap.stickR);
    public Joystick stick3 = new Joystick(RobotMap.stick3);

    //public JoystickButton hatchGrabButton = new JoystickButton(stickR, RobotMap.hatchGrabButton);
    public JoystickButton hatchPistonIn = new JoystickButton(stickL, RobotMap.hatchPistonIn);
    public JoystickButton hatchPistonOut = new JoystickButton(stickL, RobotMap.hatchPistonOut);
    public JoystickButton hatchGrabOpen1 = new JoystickButton(stickR, RobotMap.hatchGrabOpen1);
    public JoystickButton hatchGrabOpen2 = new JoystickButton(stickR, RobotMap.hatchGrabOpen2);
    public JoystickButton hatchGrabClose1 = new JoystickButton(stickR, RobotMap.hatchGrabClose1);
    public JoystickButton hatchGrabClose2 = new JoystickButton(stickR, RobotMap.hatchGrabClose2);

    public JoystickButton armsPistonToggle = new JoystickButton(stickL,RobotMap.armsPistonToggle);

    public JoystickButton cargoIn = new JoystickButton(stickL, RobotMap.cargoIn);
    public JoystickButton cargoOut = new JoystickButton(stickL, RobotMap.cargoOut);
    //TODO: give a lecture on why you can't uncomment essential things in master
    private JoystickButton elevatorUp = new JoystickButton(stick3,RobotMap.elevatorUp);
    private JoystickButton elevatorDown = new JoystickButton(stick3, RobotMap.elevatorDown);

    private JoystickButton speedToggle = new JoystickButton(stickR, RobotMap.speedToggle);
}
