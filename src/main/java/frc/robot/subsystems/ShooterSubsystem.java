// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class ShooterSubsystem extends SubsystemBase {

  public final TalonFX topMotor;
  public final TalonFX bottomMotor;

  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    topMotor = new TalonFX(53, "canivore_main");
    bottomMotor = new TalonFX(52, "canivore_main");

  
    topMotor.setInverted(false);
    bottomMotor.setInverted(true);
  }



  public void runShooter() {
     topMotor.set(.6);
     bottomMotor.set(.6);
  }

  public void stopShooter() {
    topMotor.set(0);
    bottomMotor.set(0);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
