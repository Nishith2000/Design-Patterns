package org.design_pattern.mediator_pattern;

// AuthenticationDialog.java
public class AuthenticationDialog implements Mediator {
    private String title;

    // components
    private Checkbox loginOrRegisterChkBx;
    private Textbox loginUsername, loginPassword;
    private Textbox registrationUsername, registrationPassword, registrationEmail;
    private Button okBtn, cancelBtn;

    public AuthenticationDialog() {
        // 1. create components, passing this mediator
        loginOrRegisterChkBx    = new Checkbox(this, "Login/Register");
        loginUsername           = new Textbox(this, "Login Username");
        loginPassword           = new Textbox(this, "Login Password");
        registrationUsername    = new Textbox(this, "Reg Username");
        registrationPassword    = new Textbox(this, "Reg Password");
        registrationEmail       = new Textbox(this, "Reg Email");
        okBtn                   = new Button(this, "OK");
        cancelBtn               = new Button(this, "Cancel");

        // 2. initialize UI state
        loginOrRegisterChkBx.setChecked(true);
        updateFormVisibility();
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkBx && event.equals("check")) {
            updateFormVisibility();
        }

        if (sender == okBtn && event.equals("click")) {
            if (loginOrRegisterChkBx.isChecked()) {
                // login flow
                System.out.println("Attempting login for user: " + loginUsername.getText());
                boolean found = false; // stub
                if (!found) {
                    System.out.println("Error: user not found or incorrect password");
                }
            } else {
                // registration flow
                System.out.println("Registering user: " + registrationUsername.getText()
                        + " / " + registrationEmail.getText());
                System.out.println("Registration successful. Logging in...");
            }
        }

        if (sender == cancelBtn && event.equals("click")) {
            System.out.println("Dialog canceled. Closing.");
        }
    }

    private void updateFormVisibility() {
        if (loginOrRegisterChkBx.isChecked()) {
            title = "Log in";
            System.out.println("\n=== " + title + " Form ===");
            // show login, hide registration
            loginUsername.show();
            loginPassword.show();
            registrationUsername.hide();
            registrationPassword.hide();
            registrationEmail.hide();
        } else {
            title = "Register";
            System.out.println("\n=== " + title + " Form ===");
            // show registration, hide login
            registrationUsername.show();
            registrationPassword.show();
            registrationEmail.show();
            loginUsername.hide();
            loginPassword.hide();
        }
        okBtn.show();
        cancelBtn.show();
    }

    // Expose components to client for demo
    public Checkbox getLoginOrRegisterChkBx() { return loginOrRegisterChkBx; }
    public Textbox   getLoginUsername()       { return loginUsername; }
    public Textbox   getLoginPassword()       { return loginPassword; }
    public Textbox   getRegUsername()         { return registrationUsername; }
    public Textbox   getRegPassword()         { return registrationPassword; }
    public Textbox   getRegEmail()            { return registrationEmail; }
    public Button    getOkButton()            { return okBtn; }
    public Button    getCancelButton()        { return cancelBtn; }
}
