package org.design_pattern.command_pattern;

import org.design_pattern.command_pattern.command.Command;
import org.design_pattern.command_pattern.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command previousCommand;

    public RemoteControl(int size) {
        onCommands = new Command[size];
        offCommands = new Command[size];
        Command noCommand = new NoCommand();
        for (int i = 0; i < size; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        previousCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        previousCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        previousCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        previousCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append(
                    String.format("[slot %d] %s %s\n", (i + 1), onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }
        return stringBuilder.toString();
    }
}