package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import org.usfirst.frc2797.KnightsFRC2018v2.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

public class BlockOnScale extends Command {

	private String gameData;

	public BlockOnScale() {

	}

	protected void initialize() {
		System.out.println("Running Scale from right Autonomous");
	}

	protected void execute() {

		while (gameData == null) {
			gameData = DriverStation.getInstance().getGameSpecificMessage();
		}
		Command scale = new ScaleFromRight(gameData);
		scale.start();

	}

	public boolean isFinished() {
		return true;
	}

	protected void end() {

	}
}
