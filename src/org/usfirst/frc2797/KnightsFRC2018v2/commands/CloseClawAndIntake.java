package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CloseClawAndIntake extends CommandGroup {

	public CloseClawAndIntake() {
		addParallel(new CloseClaw());
		addParallel(new ClawIntakeIn(00));
	}
}
