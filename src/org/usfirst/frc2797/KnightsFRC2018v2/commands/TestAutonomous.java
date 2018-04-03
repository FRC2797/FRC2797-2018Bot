package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TestAutonomous extends CommandGroup {

	public TestAutonomous() {
//
//		if(data.charAt(0) == 'R') {
//			addSequential(new DriveDistance(15.0, 0.7));
//			addSequential(new RotateToAngle(-80.0, 0.65));
//			addSequential(new FlipClaw());
//			addSequential(new MoveElevator(1500, 0.75));
//			addSequential(new DriveDistance(3.0, 1.0));
//			addSequential(new OpenClaw());
//		}
//		
//		else if(data.charAt(0) == 'L') {
//			addSequential(new DriveDistance(20.0, 0.7));
//		}
//		
//		switch(data.charAt(0)) {
//		case 'D':
//			addSequential(new DriveDistance(20.0, 0.7));
//			break;
//		case 'R':
//			addSequential(new RotateToAngle(-90.0, 0.65));
//			break;
//		case 'E':
//			addSequential()
//			break;
//		case 'F':
//			break;
//		case 'O':
//			break;
//		
//		}
//		
//		addSequential(new DriveDistance(20.0, 0.7));
//		addSequential(new FlipClaw());
//		addSequential(new MoveElevator(36.0, 0.7));
//		addSequential(new OpenClaw());
//		addSequential(new DriveDistance(-3.0, 0.7));
//		addSequential(new MoveElevator(0.0, 0.7));
		

		addSequential(new DriveDistance(24.5, 0.7)); //12' 3"
		addSequential(new FlipClaw());
		addSequential(new MoveElevator(3000, 0.75));
		addSequential(new RotateToAngle(-70.0, 0.65));
		//addSequential(new DriveDistance(1.0, 0.65));
		addSequential(new ClawIntakeOutMilli(1000));
		//addSequential(new DriveDistance(-3.0, 0.65));
		addSequential(new FlipClaw());
		addSequential(new WaitMilli(1500));
		addSequential(new MoveElevator(1000, 0.5));
		
		addSequential(new RotateToAngle(-70.0, 0.65));
		
		//addSequential(new RotateToAngle(-70.0, 0.65));
		
	}

	protected void initialize() {
		System.out.println("Running TEST AUTONOMOUS");
	}

}
