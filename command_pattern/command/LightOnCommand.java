package org.design_pattern.command_pattern.command;

import org.design_pattern.command_pattern.device.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOnLight();
    }

    @Override
    public void undo() {
        light.switchOffLight();
    }
}
