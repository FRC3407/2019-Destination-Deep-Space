/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team3407;

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
    public final static int leftFront = 3;
    public final static int leftBack = 2;
    public final static int rightFront = 4;
    public final static int rightBack = 5  ;
    public final static double driveSpeed  = .7;

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

    //hatch piston
    public final static int hatchPistonButton = 1;
    //cargo
    //TODO determine ports (7, 8, 9 are open)
    public static final int armR = 7;
    public static final int armL = 8;
    //TODO tune speeds, especially hold speed
    public static final double cargoSpeed = 0.5;
    public static final double cargoHoldSpeed = .8;
    public static final int cargoIn = 3;
    public static final int cargoOut = 2;

    //elevator
    public static final double elevatorSpeed = 0.7; //TODO: tune value
    public static final int elevatorMotor = 0; //TODO: setup the correct port
    public static int elevatorDown = 3;
    public static int elevatorUp = 2;
}
