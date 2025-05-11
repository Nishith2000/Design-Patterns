package org.design_pattern.mediator_pattern;

public class Client {

    public static void main(String[] args) {
        AuthenticationDialog dialog = new AuthenticationDialog();

        // User toggles to "Register"
        dialog.getLoginOrRegisterChkBx().check();

        // Fill registration fields
        dialog.getRegUsername().setText("new_user");
        dialog.getRegPassword().setText("s3cr3t");
        dialog.getRegEmail().setText("user@example.com");

        // Click OK to register
        dialog.getOkButton().click();

        // Now switch back to login
        dialog.getLoginOrRegisterChkBx().check();

        // Attempt to login
        dialog.getLoginUsername().setText("new_user");
        dialog.getLoginPassword().setText("wrong");
        dialog.getOkButton().click();

        // Finally cancel
        dialog.getCancelButton().click();
    }
}
