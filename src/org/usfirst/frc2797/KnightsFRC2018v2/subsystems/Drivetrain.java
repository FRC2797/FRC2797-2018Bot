// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2797.KnightsFRC2018v2.subsystems;

import org.usfirst.frc2797.KnightsFRC2018v2.RobotMap;
import org.usfirst.frc2797.KnightsFRC2018v2.commands.TeleopDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drivetrain extends Subsystem implements PIDOutput{

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	private final double WheelCircumference = .5 * Math.PI;
	private PIDController wheelControl;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController frontLeft = RobotMap.drivetrainfrontLeft;
    private final SpeedController rearLeft = RobotMap.drivetrainrearLeft;
    private final SpeedControllerGroup left = RobotMap.drivetrainleft;
    private final SpeedController frontRight = RobotMap.drivetrainfrontRight;
    private final SpeedController rearRight = RobotMap.drivetrainrearRight;
    private final SpeedControllerGroup right = RobotMap.drivetrainright;
    private final DifferentialDrive drive = RobotMap.drivetrainDrive;
    private final Encoder leftEnc = RobotMap.drivetrainleftEnc;
    private final Encoder rightEnc = RobotMap.drivetrainrightEnc;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new TeleopDrive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Drivetrain() {
		wheelControl = new PIDController(0.0075, 0.0, 0.0, leftEnc, this);
		
		wheelControl.setPercentTolerance(10.0);
		
		wheelControl.setOutputRange(-0.75, 0.75);
		
		wheelControl.setContinuous(false);
		
		wheelControl.enable();
	}
    
    public void driveRobot(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed * -1, rightSpeed * -1);
	}
    
    public void stop() {
		drive.tankDrive(0, 0);
		wheelControl.disable();
	}
    
    public void driveForwardDistance(double distance, double speed) {
		//System.out.println((int) (distance * (360 / WheelCircumference)));
		wheelControl.setSetpoint((int) (distance * (360 / WheelCircumference)));
		// wheelControl.setOutputRange(-speed, speed);
		
		//System.out.println("Enabling wheelController");
		//wheelControl.enable();

	}
    
    public PIDController getPIDController() {
		return wheelControl;
	}
    
    public void pidWrite(double output) {
		drive.tankDrive(output, output);
	}
}

