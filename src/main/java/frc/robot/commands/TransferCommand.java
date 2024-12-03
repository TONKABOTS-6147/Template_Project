// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class TransferCommand extends Command {
  /** Creates a new TransferCommand. */

  TransferSubsystem m_transferSubsystem;

  public TransferCommand(TransferSubsystem transferSubsystemPara) { // Para -- Parameter
    // Use addRequirements() here to declare subsystem dependencies
    m_transferSubsystem = transferSubsystemPara;
    addRequirements(m_transferSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Transfer Command Started");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_transferSubsystem.up();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_transferSubsystem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
/*
 * :)
 */