

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class TransferCommand extends Command {
  /** Creates a new TransferCommand. */
  TransferSubsystem m_TransferSubsystem;

  public TransferCommand(TransferSubsystem transferSubsystemPara) {   //para meaning paremeter

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
    return false;
  }
}
