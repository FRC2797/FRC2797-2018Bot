package org.usfirst.frc2797.KnightsFRC2018v2.commands;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.command.Command;

public class WaitMilli extends Command{

	private long time;
	
	public WaitMilli(long time) {
		this.time = time;
	}
	
	protected void execute() {
		try {
			TimeUnit.MILLISECONDS.sleep(time);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	protected boolean isFinished() {
		return true;
	}
}
