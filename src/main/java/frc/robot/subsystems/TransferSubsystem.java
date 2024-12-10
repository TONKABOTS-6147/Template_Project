// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TransferSubsystem extends SubsystemBase {
  /** Creates a new TransferSubsystem. */
  public final TalonFX transferMotor;
  public final DigitalInput transferSensor;
  public TransferSubsystem(){
    transferMotor = new TalonFX(60, "canivore_main");
    transferMotor.setInverted(false);
    transferSensor = new DigitalInput(2);
  }
  public void runMotor(){
    transferMotor.set(.5);
  }
  public void runMotorBackwards(){
    transferMotor.set(-.5);
  }
  public void stopMotor(){
    transferMotor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
//even more useless comment