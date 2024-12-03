package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.MotorBackwardsCommand;
import frc.robot.commands.RunMotorCommand;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {
  public final TransferSubsystem transferSubsystem = new TransferSubsystem();
  public final Joystick driverJoystick = new Joystick(0);
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(driverJoystick, 0).whileTrue(new RunMotorCommand(transferSubsystem));
    new JoystickButton(driverJoystick, 1).whileTrue(new MotorBackwardsCommand(transferSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
//useless comment