package sample.controller;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.Student;
import sample.view.AddStudentPage;
import sample.view.MainPage;

public class MainPageController {

    private MainPage mainPage;
    private  AddStudentController addStudentController;

    public MainPageController() {

        mainPage = new MainPage();


        mainPage.getAddButton().setOnAction( event -> {

            addStudentController = new AddStudentController(this);
            Stage addStudentStage = new Stage();

            System.out.println("testsss");
            addStudentStage.setScene(new Scene(addStudentController.getAddStudentPage()));
            addStudentStage.show();

        });


        mainPage.getRemoveButton().setOnAction(event -> {

            Student selectedStudent = mainPage.getTableView().getSelectionModel().getSelectedItem();
            if (selectedStudent != null) {
                mainPage.getTableView().getItems().remove(selectedStudent);


            }
        });
        mainPage.getExitButton().setOnAction(event -> {
            Platform.exit();
        });

    }
    public void  addStudentTable(Student student)
    {
        mainPage.getTableView().getItems().add(student);

    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }
}
