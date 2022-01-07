package sample.view;

import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class LoginPage extends VBox {

    private TextField usernameField;
    private PasswordField passwordField;
    private Label errorLabel;
    private Button loginButton;


    public LoginPage() {


        Label usernameLabel = new Label("username :");
        usernameField = new TextField();
        HBox usernameRow = new HBox(usernameLabel,usernameField);
        usernameRow.setAlignment(Pos.CENTER);

        passwordField =new PasswordField();
        Label passwordLabel =new Label("password :");
        HBox passwordRow = new HBox(passwordLabel,passwordField);
        passwordRow.setAlignment(Pos.CENTER);


        errorLabel = new Label("");
        loginButton = new Button("Login");

        this.getChildren().addAll(usernameRow,passwordRow,errorLabel,loginButton);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);



    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabel(Label errorLabel) {
        this.errorLabel = errorLabel;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }
}
