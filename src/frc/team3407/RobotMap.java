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
    /* MOTORS & PORTS*/
    //hatch grab
    public final static int hatchGrabMotor = 0;

    //drive base
    public final static int leftFront = 4;
    public final static int leftBack = 3    ;
    public final static int rightFront = 5;
    public final static int rightBack = 6;

    //pnuematics
    public final static int hatchSolClose = 1;
    public final static int hatchSolOpen = 2;
    public static final int cargoSolClose = 3;
    public static final int cargoSolOpen = 4;

    //cargo
    public static final int cargoMotorR = 7;
    public static final int cargoMotorL = 8;

    //elevator
    public static final int elevatorMotor = 9;

    //encoder
    public static final int encoderInput1 = 0;
    public static final int encoderInput2 = 1;
    public static final boolean encoderReverseDirection = false; //final?
    public static final int distancePerPulse = 2; //TODO same old
    public static final CounterBase.EncodingType encoderType = Encoder.EncodingType.k4X;

    //limit switches
    public static final int topSwitch = 4; //TODO change port
    public static final int bottomSwitch = 2; //TODO change port

    //cameras
    public static final int highCamera = 0;
    public static final int lowCamera = 1;

    /* SPEEDS AND NON-PORTS */

    //speeds TODO tune speeds, especially hold speed
    public static final double elevatorSpeed = 0.5; //TODO: tune value
    public static final double elevatorHoldSpeed = .3; //TODO: find correct value
    public static final double cargoSpeed = 0.5;
    public static final double cargoHoldSpeed = .4;
    public static double driveSpeed  = .9;
    public final static double hatchGrabSpeed = .5;

    //speed toggle TODO explain yourself
    public final static int speedToggle = 1;

    /* JOYSTICKS AND BUTTONS */
    //joysticks
    public final static int stickL = 0;
    public final static int stickR = 1;
    public final static int stick3 = 2;
    //hatchGrabber buttons
    public final static int hatchGrabOpen1 = 4;
    public final static int hatchGrabOpen2 = 5;
    public final static int hatchGrabClose1 = 2;
    public final static int hatchGrabClose2 = 3;

    //pnuematic buttons
    public final static int hatchPistonIn = 5;
    public final static int hatchPistonOut = 4;

    //cargo buttons
    public static final int cargoIn = 2;
    public static final int cargoOut = 3;
    //Elevator buttons
    public static int elevatorDown = 3;
    public static int elevatorUp = 2;
}
