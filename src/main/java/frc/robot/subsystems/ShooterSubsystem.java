// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  public final TalonFX shooterMotor;
  public final TalonFX secondShooterMotor;
  public ShooterSubsystem() {
    //lower
    shooterMotor = new TalonFX(52, "canivore_main");
    shooterMotor.setInverted(true);
    //upper
    secondShooterMotor = new TalonFX(53, "canivore_main");
    secondShooterMotor.setInverted(true);
  }
  
  public void firstMotorUp() {
    shooterMotor.set(0.5);
  }
   public void firstMotorDown() {
    shooterMotor.set(-0.5);
  }

  public void firstMotorStop() {
    shooterMotor.set(0);
  }
  
  public void secondMotorStop() {
    secondShooterMotor.set(0);
  }

   public void secondMotorUp() {
    secondShooterMotor.set(0.5);
  }
  public void secondMotorDown() {
    secondShooterMotor.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
