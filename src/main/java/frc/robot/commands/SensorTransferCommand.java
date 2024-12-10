// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class SensorTransferCommand extends Command {
TransferSubsystem m_transferSubsystem = new TransferSubsystem();
  public SensorTransferCommand(TransferSubsystem transferSubsystemPara) {
    m_transferSubsystem = transferSubsystemPara;
    addRequirements(m_transferSubsystem);
  }
  @Override
  public void initialize() {}
  @Override
  public void execute(){
    m_transferSubsystem.runMotor();
  }
  @Override
  public void end(boolean interrupted) {
    m_transferSubsystem.stopMotor();
  }
  @Override
  public boolean isFinished() {
    boolean sensorValue = m_transferSubsystem.transferSensor.get();
    return true;
  }
}
//useless comment in loving memory of ile