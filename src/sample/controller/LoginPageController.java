package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.Main;
import sample.view.LoginPage;

public class LoginPageController {


    private LoginPage loginPage;

    public LoginPageController() {
        loginPage = new LoginPage();

        iniButton();
    }

    public void iniButton() {

        loginPage.getLoginButton().setOnAction(event -> {
            if (Main.admin.getPassword().equals(getLoginPage().getPasswordField().getText())
                    && Main.admin.getUsername().equals(loginPage.getUsernameField().getText())) {

                getLoginPage().getErrorLabel().setTextFill(Color.GREEN);
                getLoginPage().getErrorLabel().setText(" Valid");

                loginPage.getScene().getWindow().hide();


                MainPageController mainPageController = new MainPageController();
                Stage mainPageStage = new Stage();
                mainPageStage.setScene(new Scene(mainPageController.getMainPage()));
                mainPageStage.setHeight(500);
                mainPageStage.setWidth(1000);
                mainPageStage.show();


            } else {
                getLoginPage().getErrorLabel().setTextFill(Color.RED);
                getLoginPage().getErrorLabel().setText("un Valid");
            }
        });
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}
