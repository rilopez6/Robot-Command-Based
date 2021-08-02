// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  SpeedControllerGroup shooter;
  Spark left;
  Spark right;
   
  /** Creates a new Shooter. */
  public Shooter() {
    left = new Spark (Constants.LEFT_SHOOTER);
    right = new Spark(Constants.RIGHT_SHOOTER);
    shooter = new SpeedControllerGroup(left, right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootBall(double speed){
    shooter.set(speed); // Sets speed of shooter. Distance of ball travel.
  }

  public void stop(){
    shooter.set(0);
  }
}
