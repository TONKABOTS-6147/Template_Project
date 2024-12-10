package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TransferMotorUpCommand;
import frc.robot.subsystems.TransferSubsystem;

public class RobotContainer {

  TransferSubsystem transferSubsystem = new TransferSubsystem();
  Joystick driverJoystick = new Joystick(0);
  JoystickButton buttonA = new JoystickButton(driverJoystick, 1);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    buttonA.whileTrue(new TransferMotorUpCommand(transferSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
