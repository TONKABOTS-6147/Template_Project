package frc.robot;

import javax.sound.sampled.Port;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TransferCommand;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {

  public final Joystick joystick = new Joystick(0); 
  public final JoystickButton buttonA = new JoystickButton(joystick, 0);

  public final TransferSubsystem transferSubsystem = new TransferSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    buttonA.whileTrue(new TransferCommand(transferSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
