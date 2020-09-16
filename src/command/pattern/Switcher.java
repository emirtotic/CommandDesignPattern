package command.pattern;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {

	public List<Command> commands;

	public Switcher() {
		this.commands = new ArrayList<>();
	}

	public void addCommand(Command commmand) {
		this.commands.add(commmand);
	}

	public void executeCommands() {
		for (Command command : commands) {
			command.execute();
		}
	}

}
