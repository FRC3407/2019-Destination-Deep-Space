/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3407;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
    /* MOTORS & PORTS */
    //PWM
    //elevator
    public static final int elevatorMotor = 0;
    //cargo
    public static final int cargoMotorR = 1;
    public static final int cargoMotorL = 2;
    //hatchgrab
    public final static int hatchGrabMotor = 4;
    //drivetrain
    public final static int leftFront = 6;
    public final static int rightBack = 7;
    public final static int rightFront = 8;
    public final static int leftBack = 9;

    //PCM
    //piston for moving hatch in/out
    public final static int hatchSolClose = 0;
    public final static int hatchSolOpen = 1; //TODO: see if it's the other way around (close/open)
    //piston for moving arms up/down
    public static final int armsSolClose = 3; //is this right?
    public static final int armsSolOpen = 4;//ditto

    //encoder TODO: find out type of port
    public static final int encoderInput1 = 0;
    public static final int encoderInput2 = 1;

    //limit switches (CAN? Analog?)
    public static final int topSwitch = 4; //TODO change port
    public static final int bottomSwitch = 2; //TODO change port

    //USB
    public static final int highCamera = 0;
    public static final int lowCamera = 1;

    /* CONSTANTS AND NON-PORTS */

    //speeds TODO tune speeds, especially hold speed
    public static final double elevatorSpeed = 0.5; //TODO: tune value
    public static final double elevatorHoldSpeed = .3; //TODO: find correct value
    public static final double cargoSpeed = 0.5;
    public static final double cargoHoldSpeed = .4;
    public static double driveSpeed  = .9;
    public final static double hatchGrabSpeed = .5;

    //encoder
    public static final boolean encoderReverseDirection = false; //final?
    public static final int distancePerPulse = 2; //TODO same old
    public static final CounterBase.EncodingType encoderType = Encoder.EncodingType.k4X;

    /* JOYSTICKS AND BUTTONS */
    //joysticks
    public final static int stickL = 0;
    public final static int stickR = 1;
    public final static int stick3 = 2;

    //STICKL BUTTONS
    //(cargo/arms) piston button.
    public static final int armsPistonToggle = 1;
    //cargo motor buttons
    public static final int cargoIn = 2;
    public static final int cargoOut = 3;
    //hatch piston buttons
    public final static int hatchPistonOut = 4;
    public final static int hatchPistonIn = 5;

    //STICKR BUTTONS
    public final static int speedToggle = 1;
    //hatchGrabber motor  buttons
    public final static int hatchGrabOpen2 = 2;
    public final static int hatchGrabOpen1 = 3; //open and closed are inverted as of thursday of 10,000 lakes. (2 and 3 actually close)
    public final static int hatchGrabClose1 = 4;
    public final static int hatchGrabClose2 = 5;

    //STICK3 BUTTONS
    public static int elevatorDown = 3;
    public static int elevatorUp = 5;

}
