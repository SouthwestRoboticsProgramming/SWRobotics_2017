package org.usfirst.frc.team2129.robot.commands.auto;

import org.usfirst.frc.team2129.robot.commands.AutomatedClimbCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class FullAutoClimbCommand extends CommandGroup {
	public FullAutoClimbCommand(){
		System.err.println("THIS IS SUPPOSED TO RUN");
		addSequential(new AutomatedClimbCommand("auto_grab"));
		addSequential(new AutomatedClimbCommand("auto_climb"));
	}
}
