package tp_9;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddProfileScene {
    private Stage stage;

    public AddProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void show() {
        // Field Name
        TextField nameField = new TextField();
        nameField.setPromptText("Name");
        nameField.setPrefWidth(200);

        HBox inputName = new HBox(nameField);
        inputName.setAlignment(Pos.CENTER);

        // Field NIM
        TextField nimField = new TextField();
        nimField.setPromptText("NIM");
        nimField.setPrefWidth(200);

        HBox inputNim = new HBox(nimField);
        inputNim.setAlignment(Pos.CENTER);

        // Field Age
        TextField ageField = new TextField();
        ageField.setPromptText("Age");
        ageField.setPrefWidth(200);

        HBox inputAge = new HBox(ageField);
        inputAge.setAlignment(Pos.CENTER);

        // Field Major
        TextField majorField = new TextField();
        majorField.setPromptText("Major");
        majorField.setPrefWidth(200);

        HBox inputMajor = new HBox(majorField);
        inputMajor.setAlignment(Pos.CENTER);

        // Button
        Button btnSubmit = new Button("Submit");
        btnSubmit.setOnAction(action -> {
            String name = nameField.getText();
            String nim = nimField.getText();
            String age = ageField.getText();
            String major = majorField.getText();

            Profile profile = new Profile(name, nim, age, major);
            App.addProfile(profile);
            
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        Button btnBackHome = new Button("Back");
        btnBackHome.setOnAction(action -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });

        HBox button = new HBox(50, btnBackHome, btnSubmit);
        button.setAlignment(Pos.CENTER);

        // Add key event handling
        nameField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                nimField.requestFocus();
            }
        });

        nimField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                ageField.requestFocus();
            }
        });

        ageField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                majorField.requestFocus();
            }
        });

        majorField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                // Optional: Move focus to the submit button or perform submit action
                btnSubmit.fire();
            }
        });

        VBox sceneLayout = new VBox(20);
        sceneLayout.getChildren().addAll(
            inputName, 
            inputNim, 
            inputAge, 
            inputMajor, 
            button);
        sceneLayout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(sceneLayout, 400, 500);
        scene.getStylesheets().add("file:src/main/resources/styles/style.css");
        
        sceneLayout.getStyleClass().add("root-with-background");
        stage.setScene(scene);
    }
}
