package org.design_pattern.mediator_pattern;

public class Textbox extends Component {
    private String name;
    private String text = "";

    public Textbox(Mediator dialog, String name) {
        super(dialog);
        this.name = name;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    // For demo purposes
    public void show()  { System.out.println("Showing textbox: "  + name); }
    public void hide()  { System.out.println("Hiding textbox: "  + name); }
}
