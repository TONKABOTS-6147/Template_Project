package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TransferCommand;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {

  private final TransferSubsystem transferSubsystem = new TransferSubsystem();
  
  private final Joystick joystickControl = new Joystick(0);
  
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(joystickControl, 1).whileTrue(new TransferCommand(transferSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
