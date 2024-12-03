// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class MotorBackwardsCommand extends Command {
   /** Creates a new RunMotorCommand. */
  TransferSubsystem m_transferSubsystem;
  public MotorBackwardsCommand(TransferSubsystem transferSubsystemParameter) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_transferSubsystem = transferSubsystemParameter;
    addRequirements(m_transferSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_transferSubsystem.runMotorBackwards();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_transferSubsystem.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
