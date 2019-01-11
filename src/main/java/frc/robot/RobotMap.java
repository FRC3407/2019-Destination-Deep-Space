/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package main.java.frc.robot;

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
     public static int  frontLeft = 0;
     public static int rearLeft = 1;
     public static int frontRight = 2;
     public static int rearRight =3;

     public static int stickL = 0;
     public static int stickR = 1;
     public static int gyroPort = 0;

     //cameras
     public static final int FIXED_CAM = 0;
     public static final int SERVO_CAM = 1;

 // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
