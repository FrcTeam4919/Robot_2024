// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Pickup;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class  lowPistonOn extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Pickup m_Pickup;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public lowPistonOn(Pickup Pickup) {
    m_Pickup = Pickup;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_Pickup);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   m_Pickup.SqushLow();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
