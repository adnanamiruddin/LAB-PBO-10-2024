package tp_9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage) {
        this.stage = stage;
    }

    protected void show() {
        Button btnToAddProfile = new Button("Add Profile");
        btnToAddProfile.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                AddProfileScene addProfileScene = new AddProfileScene(stage);
                addProfileScene.show();
            }
        });

        Button btnToProfile = new Button("Go to Profile");
        btnToProfile.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                ProfileScene profileScene = new ProfileScene(stage, App.getProfiles());
                profileScene.show();  
            }
        });

        VBox sceneLayout = new VBox(50);
        sceneLayout.getChildren().addAll(btnToProfile, btnToAddProfile);
        sceneLayout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(sceneLayout, 400, 500);
        scene.getStylesheets().add("file:src/main/resources/styles/style.css");
        
        sceneLayout.getStyleClass().add("root-with-background");
        stage.setScene(scene);
    }
}
