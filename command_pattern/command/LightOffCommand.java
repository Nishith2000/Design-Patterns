package org.design_pattern.command_pattern.command;

import org.design_pattern.command_pattern.device.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOffLight();
    }

    @Override
    public void undo() {
        light.switchOnLight();
    }
}
