package org.design_pattern.command_pattern;

import org.design_pattern.command_pattern.command.Command;

public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onButtonPress() {
        command.execute();
    }
}
