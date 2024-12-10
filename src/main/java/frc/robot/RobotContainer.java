package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.MotorBackwardsCommand;
import frc.robot.commands.RunMotorCommand;
import frc.robot.commands.RunShooterCommand;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {
  public final TransferSubsystem transferSubsystem = new TransferSubsystem();
  public final Joystick driverJoystick = new Joystick(0);
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(driverJoystick, 1).whileTrue(new RunMotorCommand(transferSubsystem));
    new JoystickButton(driverJoystick, 2).whileTrue(new MotorBackwardsCommand(transferSubsystem));
    new JoystickButton(driverJoystick, 3).whileTrue(new RunShooterCommand(shooterSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
//useless comment