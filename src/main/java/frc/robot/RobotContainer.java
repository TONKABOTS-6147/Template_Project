package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.TransferCommand;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {
  // Joysticks, Subsystems
  public final Joystick joystick = new Joystick(0);
  public final JoystickButton buttonA = new JoystickButton(joystick, 2);
  public final JoystickButton buttonB = new JoystickButton(joystick, 1);

  public final TransferSubsystem transferSubsystem = new TransferSubsystem();
  public final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    buttonA.whileTrue(new TransferCommand(transferSubsystem));
    buttonB.whileTrue(new ShooterCommand(shooterSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
