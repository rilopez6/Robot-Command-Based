// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //------------------------DriveTrain------------------------//
    //SET VALUES | PWM'S for wiring teams
    public static final int LEFT_FRONT = 0;
    public static final int LEFT_BACK = 1;
    public static final int RIGHT_FRONT = 2;
    public static final int RIGHT_BACK = 3;

    //Remote Control | Check Driver Station to get values
    public static final int XBOX_LEFT_Y_AXIS = 1;
    public static final int XBOX_LEFT_X_AXIS = 0;

    public static final double DRIVETRAINSPEED = 0.7; // 70%

    public static final double DRIVE_FORWARD_TIME = 3.0; //3 seconds
    public static final double AUTONOMOUS_SPEED = 0.4; //40% speed in autonomous
    public static final int JOYSTICK_NUMBER = 0; //Controller number | USB Entry | 

    //------------------------Shooter------------------------//
    public static final int SHOOTER = 4; //PWM
    public static final double SHOOTER_SPEED = 0.5; //Runs at 50% when button held

    //--------------------Elevator/Intake--------------------//
    //-------------------Works with Shooter------------------//
    public static final int INTAKE = 5; //PWM
    public static final int RIGHT_TRIGGER = 3;
    public static final double INTAKE_SPEED = 0.7;

    //------------------------Camera------------------------//
    public static final int CAMERA_RES_X = 320; //Resolution
    public static final int CAMERA_RES_Y = 240;
    public static final double AUTO_SHOOT_TIME = 2; //2 seconds

    //--------------------Proximity Sensor------------------//
    public static final int RANGE_FINDER = 0; //PWM | Analog Input
    public static final double SETPOINT_FORWARD = 1.5; //1.5 Meters

    //--------------------------Arm------------------------//
    public static final int FOREARM = 0;
    public static final int LEFT_UPPER_ARM = 0;
    public static final int RIGHT_UPPER_ARM = 0;
}
