// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TransferSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
  public final TalonFX transferMotor; 
  public final DigitalInput transferSensor;

  public TransferSubsystem() {
    transferMotor = new TalonFX(60, "canivore_main");
    transferMotor.setInverted(true);
    transferSensor = new DigitalInput(2);
  }
  public void motorUp() {
    transferMotor.set(0.5);
  }
  public void motorDown(){
    transferMotor.set(0.5);
  }
  public void motorStop(){
    transferMotor.set(0.0);
  }
  @Override
  public void periodic() {
    System.out.println("waah ");
  }
}
