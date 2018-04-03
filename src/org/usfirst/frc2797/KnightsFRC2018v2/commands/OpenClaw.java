package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenClaw extends Command {

	public OpenClaw() {
	}

	protected void execute() {
		Robot.claw.openClaw();
	}

	protected boolean isFinished() {
		// System.out.println("Opened Claw");
		return true;
	}
}
