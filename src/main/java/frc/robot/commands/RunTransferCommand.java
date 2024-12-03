// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class RunTransferCommand extends Command {

  TransferSubsystem m_transferSubsystem;

  public RunTransferCommand(TransferSubsystem transferSubsystemPara) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_transferSubsystem = transferSubsystemPara;
    addRequirements(m_transferSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Waylon has exploded");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_transferSubsystem.waylonExplodes();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}