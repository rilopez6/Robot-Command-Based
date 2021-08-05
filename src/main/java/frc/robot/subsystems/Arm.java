// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  Spark forearm;
  Spark leftUpperArm;
  Spark rightUpperArm;
  SpeedControllerGroup upperMotors;
  SpeedControllerGroup allMotors;
  /** Creates a new Arm. */
  
  public Arm() {
    forearm = new Spark (Constants.FOREARM);  
    forearm.setInverted(false);

    leftUpperArm = new Spark (Constants.LEFT_UPPER_ARM);  
    leftUpperArm.setInverted(false);

    rightUpperArm = new Spark (Constants.RIGHT_UPPER_ARM);  
    rightUpperArm.setInverted(false);

    upperMotors = new SpeedControllerGroup (leftUpperArm, rightUpperArm);
    allMotors = new SpeedControllerGroup(leftUpperArm, rightUpperArm, forearm);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  //unfolds the whole robot at the same time
  //Needs update. First activate the upperarm then the forearm.
  //To not get the shooter, forearm, and screen Damaged. 
  public void unfold(double speed) {
    allMotors.setInverted(false);
    allMotors.set(speed);
  }

  //Unfolds forearm only
  public void foreArm_Unfold(double speed){
    forearm.setInverted(false);
    forearm.set(speed);
  }

  //unfolds upperarm only
  public void upperMotors_Unfold(double speed){
    upperMotors.setInverted(false);
    upperMotors.set(speed);
  }

  public void fold (double speed){
    allMotors.setInverted(true);
    allMotors.set(speed);
  }

  public void foreArm_Fold (double speed){
    forearm.setInverted(true);
    forearm.set(speed);
  }

  public void upperMotors_Fold (double speed){
    upperMotors.setInverted(true);
    upperMotors.set(speed);
  }
  public void stop(){
    allMotors.set(0);
  }
}
