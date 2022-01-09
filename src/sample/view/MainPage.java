package sample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import sample.model.Student;

public class MainPage extends BorderPane {


    private TableView<Student> tableView;
    private Button addButton;
    private Button removeButton;
    private Button exitButton;


    public MainPage() {

        createNewElement();

        TableColumn<Student, Integer> studentId = new TableColumn<>("Student ID");
        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        TableColumn<Student, String> lastNameColumn = new TableColumn<>("Last Name");


        studentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));



        tableView.getColumns().addAll(studentId, nameColumn, lastNameColumn);
        tableView.setColumnResizePolicy(tableView.CONSTRAINED_RESIZE_POLICY);

        VBox vBox = new VBox(addButton,removeButton,exitButton);
        vBox.setSpacing(15);
        vBox.setAlignment(Pos.BOTTOM_CENTER);


        this.setCenter(tableView);
        this.setRight(vBox);



    }

    private void createNewElement() {

        tableView = new TableView<>();
        addButton = new Button("Add Student");
        removeButton = new Button("Remove Student");
        exitButton = new Button("Exit");


        addButton.setMaxWidth(Double.MAX_VALUE);
        removeButton.setMaxWidth(Double.MAX_VALUE);
        exitButton.setMaxWidth(Double.MAX_VALUE);


    }

    public TableView<Student> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Student> tableView) {
        this.tableView = tableView;
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public Button getRemoveButton() {
        return removeButton;
    }

    public void setRemoveButton(Button removeButton) {
        this.removeButton = removeButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }
}
