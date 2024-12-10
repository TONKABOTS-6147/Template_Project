

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TransferSubsystem extends SubsystemBase {

  public final TalonFX transferMotor;
  public final DigitalInput transferSensor;


  /** Creates a new TransferSubsystem. */
  public TransferSubsystem() {

    transferMotor = new TalonFX(60, "canivore_main");
    transferSensor = new DigitalInput(2);


    transferMotor.setInverted(false);
  }

  public void runMotor() {
    transferMotor.set(.40);
  }

  public void runMotorReverse() {
    transferMotor.set(-0.4);
  }

  public void stopMotor() {
    transferMotor.set(0);
  }

  @Override
  public void periodic() {
  //  System.out.println("Motor is running");
  }
}
