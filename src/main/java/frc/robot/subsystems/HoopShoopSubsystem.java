// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HoopShoopSubsystem extends SubsystemBase {
  /** Creates a new HoopShoopSubsystem. */
  public final TalonFX hoopMotor;
  public final TalonFX shoopMotor;
  public HoopShoopSubsystem() {
    hoopMotor = new TalonFX(52,"canivore_main");
    //hoopMotor is lower motor and shoopMotor is upper motor//
    shoopMotor = new TalonFX(53,"canivore_main");

    hoopMotor.setInverted(false);

    shoopMotor.setInverted(false);
  }

  public void hoopPositive() {
    hoopMotor.set(0.5);
  }  
  public void hoopNegative() {
    hoopMotor.set(-0.5);
  }
  public void shoopPositive() {
    shoopMotor.set(0.5);
  }
  public void shoopNegative() {
    shoopMotor.set(-0.5);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
