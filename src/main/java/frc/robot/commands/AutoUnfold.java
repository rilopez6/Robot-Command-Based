// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Arm;

public class AutoUnfold extends CommandBase {
  Arm arm;
  Timer timer;
  private boolean finish = false;

  /** Creates a new Unfold. */
  public AutoUnfold(Arm a) {
    arm = a;
    addRequirements(arm);
    timer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.reset(); //Sets to 0
    timer.start();
    while (timer.get() < Constants.UNFOLDING_TIME){
      arm.upperMotors_Unfold(Constants.ARM_SPEED);
    }

    timer.reset(); //Sets to 0
    timer.start();
    while (timer.get() < Constants.UNFOLDING_TIME){
      arm.foreArm_Unfold(Constants.ARM_SPEED);
    }
    finish = true;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arm.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return finish;
  }
}
