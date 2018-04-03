package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CloseClaw extends Command {

	public CloseClaw() {
	}

	protected void execute() {
		Robot.claw.closeClaw();
	}

	protected boolean isFinished() {
		// System.out.println("Closed Claw");
		return true;
	}
}
