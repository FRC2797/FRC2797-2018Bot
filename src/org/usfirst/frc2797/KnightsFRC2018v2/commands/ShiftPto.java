package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftPto extends Command {

	private boolean done;

	public ShiftPto() {
		done = false;
	}

	protected void execute() {
		Robot.elevator.shiftPTO();
		done = true;
	}

	protected boolean isFinished() {
		System.out.println("Pto Shifted");
		return done;
	}
}
