package org.design_pattern.command_pattern;

import org.design_pattern.command_pattern.command.*;
import org.design_pattern.command_pattern.device.Light;
import org.design_pattern.command_pattern.device.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(2);

        // Initialize stereo device and its command object
        Stereo stereo = new Stereo();
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        // Initialize light device and its command object
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(0, stereoOnWithCDCommand, stereoOffWithCDCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.undoButtonWasPushed();

        // Macro command that can execute or undo multiple commands
        // it encapsulated multiple commands
        Command[] commands = new Command[2];
        commands[0] = lightOnCommand;
        commands[1] = stereoOnWithCDCommand;
        MacroCommand macroCommand = new MacroCommand(commands);
        macroCommand.execute();
    }
}
