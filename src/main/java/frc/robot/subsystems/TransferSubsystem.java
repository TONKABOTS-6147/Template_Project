package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.DeviceIdentifier;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TransferSubsystem extends SubsystemBase {

  public final TalonFX transferMotor;
  
  public TransferSubsystem() {
    transferMotor = new TalonFX(60, "carnivore_main"); 

    transferMotor.setInverted(false);
  }

  public void runMotor(){
    transferMotor.set(4.0);
  }

  public void runMotoReverse(){
    transferMotor.set(-0.4);
  }

  public void stopMotor(){
    transferMotor.set(0);
  }

  @Override
  public void periodic() {
    System.out.println("Motor is running"); 
  }
}
