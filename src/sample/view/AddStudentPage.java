package sample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import sample.controller.MainPageController;


public class AddStudentPage extends VBox {


    private TextField nameField, lastNameField, idField;
    private Button addButton;


    public AddStudentPage() {


        Label idlLabel = new Label("ID :");
        idField = new TextField();
        HBox idRow = new HBox(idlLabel, idField);
        idRow.setAlignment(Pos.CENTER);

        Label nameLabel = new Label("Name :");
        nameField = new TextField();
        HBox nameRow = new HBox(nameLabel, nameField);
        nameRow.setAlignment(Pos.CENTER);

        Label lastNameLabel = new Label("Last Name :");
        lastNameField = new TextField();
        HBox lastNameRow = new HBox(lastNameLabel, lastNameField);
        lastNameRow.setAlignment(Pos.CENTER);


        addButton = new Button("New Student");


        this.getChildren().addAll(idRow, nameRow, lastNameRow, addButton);


        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setWidth(200);
        this.setHeight(200);


    }

    public TextField getNameField() {
        return nameField;
    }

    public void setNameField(TextField nameField) {
        this.nameField = nameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public TextField getIdField() {
        return idField;
    }

    public void setIdField(TextField idField) {
        this.idField = idField;
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }
}
