package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TransferSubsystem;

public class SensorCommand extends Command {
 TransferSubsystem m_TransferSubsystem; 

  public SensorCommand(TransferSubsystem transferSubsystemPara) {
    m_TransferSubsystem = transferSubsystemPara;
    addRequirements(m_TransferSubsystem);
  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_TransferSubsystem.runMotor(); 
  }
    
  
  @Override
  public void end(boolean interrupted) {
    m_TransferSubsystem.stopMotor();
  }

  
  @Override
  public boolean isFinished(){
    boolean sensorValue = m_TransferSubsystem.transferSensor.get(); 
    return sensorValue;
  }
}
  
