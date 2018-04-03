package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ToggleClaw extends Command {

	protected void execute() {
		Robot.claw.toggleClaw();
	}

	public boolean isFinished() {
		return true;
	}
}
