package org.design_pattern.command_pattern.command;

import org.design_pattern.command_pattern.device.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(50);
        System.out.println("Stereo On and CD inserted !!!");
    }

    @Override
    public void undo() {
        stereo.ejectCD();
        stereo.off();
        System.out.println("CD ejected and Stereo Off !!!");
    }
}
