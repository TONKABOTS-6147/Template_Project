package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.RunTransferCommand;
import frc.robot.subsystems.TransferSubsystem;
public class RobotContainer {
  private final TransferSubsystem transferSubsystem = new TransferSubsystem();
  private final Joystick driverJoystick = new Joystick(0);
  private final JoystickButton button1 = new JoystickButton(driverJoystick, 0);


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    button1.whileTrue(new RunTransferCommand(transferSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
