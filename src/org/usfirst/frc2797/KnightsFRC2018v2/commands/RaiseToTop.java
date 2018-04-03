package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RaiseToTop extends Command {
	private boolean done;

	public RaiseToTop() {
		this.done = false;
	}

	protected void initialize() {
		Robot.elevator.goToTop();
	}

	protected void execute() {
		done = true;
	}

	protected boolean isFinished() {
		return done;
	}

}
