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

  public void unfold(double speed) {
      allMotors.set(speed);
  }

  public void foreArm_Unfold(double speed){
    forearm.set(speed);
  }

  public void upperMotors_Unfold(double speed){
    upperMotors.set(speed);
  }

  public void stop(){
    allMotors.set(0);
  }
}
