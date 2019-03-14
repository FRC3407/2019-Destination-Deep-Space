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
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

    //drive base
    public final static int leftFront = 8;
    public final static int leftBack = 4;
    public final static int rightFront = 5;
    public final static int rightBack = 6;
    public static double driveSpeed  = .9;

    //speed toggle
    public final static int speedToggle = 1;

    //joysticks
    public final static int stickL = 0;
    public final static int stickR = 1;
    public final static int stick3 = 2;


    //hatch grabber
    //public final static int hatchGrabButton = 1;
    public final static int hatchGrabOpen1 = 4;
    public final static int hatchGrabOpen2 = 5;
    public final static int hatchGrabClose1 = 2;
    public final static int hatchGrabClose2 = 3;

    public final static double hatchGrabSpeed = .35;
    public final static int talon = 6;

    //double solenoid for hatch piston
    public final static int dSolClose = 0; //ports accurate for lambda, will need update for Phil
    public final static int dSolOpen = 1; //TODO: update ports for Phil
    //pnuematics
    public static final int singleSol = 3; //TODO: set correct port
    public final static int hatchPistonIn = 5;
    public final static int hatchPistonOut = 4;

    //cargo
    //TODO determine ports (7, 8, 9 are open)
    public static final int armR = 7;
    public static final int armL = 8;
    //TODO tune speeds, especially hold speed
    public static final double cargoSpeed = 0.5;
    public static final double cargoHoldSpeed = .8;
    public static final int cargoIn = 2;
    public static final int cargoOut = 3;

    //elevator
    public static final double elevatorSpeed = 0.7; //TODO: tune value
    public static final int elevatorMotor = 0; //TODO: setup the correct port
    public static int elevatorDown = 3;
    public static int elevatorUp = 5;
    //encoder
    public static final int encoderInput1 = 0;
    public static final int encoderInput2 = 1;
    public static final boolean encoderReverseDirection = false;
    public static final CounterBase.EncodingType encoderType = Encoder.EncodingType.k4X;
    public static final int topSwitch = 4; //TODO change port
    public static final double elevatorHoldSpeed = .5; //TODO: find correct value
    public static final int bottomSwitch = 2; //TODO change port
    public static final int distancePerPulse = 2; //TODO same old
}
