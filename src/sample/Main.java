package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controller.LoginPageController;
import sample.model.Admin;

public class Main extends Application {

   public static Admin admin = new Admin("123","123");
    @Override
    public void start(Stage primaryStage) throws Exception {


        LoginPageController loginPageController = new LoginPageController();


        primaryStage.setScene(new Scene(loginPageController.getLoginPage()));
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }


}
