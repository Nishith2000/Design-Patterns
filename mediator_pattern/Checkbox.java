package org.design_pattern.mediator_pattern;

public class Checkbox extends Component {
    private String name;
    private boolean checked = false;

    public Checkbox(Mediator dialog, String name) {
        super(dialog);
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean value) {
        this.checked = value;
    }

    public void check() {
        checked = !checked;
        System.out.println(name + " checkbox is now " + (checked ? "checked" : "unchecked"));
        dialog.notify(this, "check");
    }

    // For demo purposes
    public void show()  { System.out.println("Showing checkbox: "  + name); }
    public void hide()  { System.out.println("Hiding checkbox: "  + name); }
}