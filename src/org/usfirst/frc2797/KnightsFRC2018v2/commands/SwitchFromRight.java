package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchFromRight extends CommandGroup{
	
	public SwitchFromRight(String data) {
		
		
		if(data.charAt(0) == 'R') {
			addSequential(new DriveDistance(12.0, 1.0));
			addSequential(new RotateToAngle(-80.0, 0.5));
			addSequential(new FlipClaw());
			addSequential(new MoveElevator(1500, 0.75));
			addSequential(new DriveDistance(3.0, 1.0));
			addSequential(new OpenClaw());
		}
		
		else if(data.charAt(0) == 'L') {
			addSequential(new DriveDistance(19.5, 0.75));
			addSequential(new RotateToAngle(-80.0, 0.6));
			addSequential(new DriveDistance(11.0, 1.0));
			addSequential(new RotateToAngle(-80.0, 0.5));
			addSequential(new FlipClaw());
			addSequential(new MoveElevator(1500, 0.75));
			addSequential(new DriveDistance(3.0, 1.0));
			addSequential(new OpenClaw());
			
			
		}
	}
}
