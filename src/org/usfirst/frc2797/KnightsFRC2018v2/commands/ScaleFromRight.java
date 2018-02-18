package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScaleFromRight extends CommandGroup {
	
	private String gameData;
	
	public ScaleFromRight() {
		this.gameData = "RLR"; //DriverStation.getInstance().getGameSpecificMessage();
		
		// Scale Code
		if(gameData.charAt(1) == 'R')
		{
		// Right Scale
			addSequential(new DriveDistance(19.0, 0.50));
			addSequential(new RotateToAngle(-90, 0.50));
			addSequential(new DriveDistance(2.5, 0.50));
			addSequential(new RotateToAngle(90, 0.50));
			addSequential(new MoveElevator(5.0, 1.0));
			addSequential(new DriveDistance(2.0, 0.50));
			addSequential(new OpenClaw());
			
		} else {	
		// Left Scale
			addSequential(new DriveDistance(19.5, 0.50));
			addSequential(new RotateToAngle(-90, 0.50));
			addSequential(new DriveDistance(19.0, 0.50));
			addSequential(new RotateToAngle(90, 0.50));
			addSequential(new MoveElevator(5.0, 1.0));
			addSequential(new DriveDistance(2.0, 0.50));
			addSequential(new OpenClaw());
			
		}
	}
}
