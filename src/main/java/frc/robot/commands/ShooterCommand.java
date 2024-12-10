package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends Command {
  ShooterSubsystem m_ShooterSubsystem; 

  public ShooterCommand(ShooterSubsystem shooterSubsystemPara){
    m_ShooterSubsystem = shooterSubsystemPara; 
    addRequirements(m_ShooterSubsystem);
  }

 
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_ShooterSubsystem.runShooter(); 
  }

  @Override
  public void end(boolean interrupted) {
    m_ShooterSubsystem.stopShooter(); 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
