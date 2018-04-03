package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.command.Command;

public class DoNothing extends Command {

	protected void initialize() {
		System.out.println("Running Do Nothing Autonomous");
	}

	public boolean isFinished() {
		return true;
	}
}
