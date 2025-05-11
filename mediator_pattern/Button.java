package org.design_pattern.mediator_pattern;

public class Button extends Component {
    private String name;

    public Button(Mediator dialog, String name) {
        super(dialog);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // For demo purposes
    public void show()  { System.out.println("Showing button: "  + name); }
    public void hide()  { System.out.println("Hiding button: "  + name); }
}

