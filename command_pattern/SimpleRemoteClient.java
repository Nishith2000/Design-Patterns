package org.design_pattern.command_pattern;

import org.design_pattern.command_pattern.command.LightOnCommand;
import org.design_pattern.command_pattern.device.Light;

public class SimpleRemoteClient {

    public static void main(String[] args) {
        // Create Light command
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // Pass Created Light command to controller or invoker
        // Here we can also pass any other command, making things flexible.
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.onButtonPress();
    }
}
