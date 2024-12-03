// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TransferSubsystem extends SubsystemBase {

  public final TalonFX transferMotor;

  public TransferSubsystem() {
    transferMotor = new TalonFX(0);
    
    transferMotor.setInverted(false);
  }

  public void up() {
    transferMotor.set(0.8);
  }

  public void down() {
    transferMotor.set(-0.8);
  }

  public void stop() {
    transferMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    System.out.println("Transfer Motor Position: " + transferMotor.getPosition());
  }
}
