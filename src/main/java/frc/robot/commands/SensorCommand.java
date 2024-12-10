// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;




public class SensorCommand extends Command {

  TransferSubsystem m_TransferSubsystem;

  /** Creates a new SensorCommand. */
  public SensorCommand(TransferSubsystem transferSubsystemPara) {
    m_TransferSubsystem = transferSubsystemPara;
    addRequirements(m_TransferSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_TransferSubsystem.runMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_TransferSubsystem.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    boolean sensorValue = m_TransferSubsystem.transferSensor.get();

    return sensorValue;
  }
}
