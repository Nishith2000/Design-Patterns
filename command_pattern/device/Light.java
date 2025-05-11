package org.design_pattern.command_pattern.device;

public class Light {

    private boolean isOn = false;

    public void switchOnLight() {
        if (!isOn) isOn = true;
        System.out.println("Light Bulb is On !!!");
    }

    public void switchOffLight() {
        if (isOn) isOn = false;
        System.out.println("Light Bulb is Off !!!");
    }

    @Override
    public String toString() {
        return isOn ? "Light Bulb is On !!!" : "Light Bulb is Off !!!";
    }
}
