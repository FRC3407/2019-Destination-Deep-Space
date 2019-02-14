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
    public static int leftFront = 3;
    public static int leftBack = 1;
    public static int rightFront = 2;
    public static int rightBack = 0;

    //joysticks
    public static int stickL = 0;
    public static int stickR = 1;

    public static int hatchGrabButton = 1;
    //hatch grabber
    public final static int talon = 6;

    //double solenoid for hatch piston
    public static int dSol1 = 6;
    public static int dSol2 = 7;
}
