// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class SensorCommand extends Command {
  TransferSubsystem m_transferSubsystem;
  /** Creates a new OpenSensorCommand. */
  public SensorCommand(TransferSubsystem transferSubsystemPara) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_transferSubsystem = transferSubsystemPara;
    addRequirements(m_transferSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("the SENSOR begins!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_transferSubsystem.motorUp();
    System.out.println("Running!");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_transferSubsystem.motorStop();
    System.out.println("the SENSOR is done!");
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    boolean sensorValue = m_transferSubsystem.transferSensor.get();
    return sensorValue;
    
  }
}