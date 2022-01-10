package sample.controller;

import sample.model.Student;
import sample.view.AddStudentPage;
import sample.view.MainPage;

public class AddStudentController {


    private AddStudentPage addStudentPage;
    private MainPageController mainPageController;

    public  AddStudentController(MainPageController mainPageController){
        addStudentPage = new AddStudentPage();

        this.mainPageController = mainPageController;

        addStudentPage.getAddButton().setOnAction(event -> {
            String name = addStudentPage.getNameField().getText();
            String lastName = addStudentPage.getLastNameField().getText();
            Integer idStudent  = Integer.valueOf( addStudentPage.getIdField().getText());

            Student student = new Student(idStudent,name,lastName);

            mainPageController.addStudentTable(student);
        });
    }

    public AddStudentPage getAddStudentPage() {
        return addStudentPage;
    }

    public void setAddStudentPage(AddStudentPage addStudentPage) {
        this.addStudentPage = addStudentPage;
    }
}
