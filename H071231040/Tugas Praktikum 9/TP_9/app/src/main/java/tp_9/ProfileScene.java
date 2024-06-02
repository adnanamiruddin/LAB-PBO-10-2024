package tp_9;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;

public class ProfileScene {
    Stage stage;
    private List<Profile> profiles;

    public ProfileScene(Stage stage, List<Profile> profiles) {
        this.stage = stage;
        this.profiles = profiles;
    }


    public void show() {
        Label profil = new Label("Profile");

        VBox sceneLayout = new VBox(50, profil);

        for (Profile profile : profiles) {
            HBox profileBox = new HBox(40);
            profileBox.setPadding(new Insets(10));
            // profileBox.setStyle("-fx-border-color: black; -fx-border-width: 1px;");
            profileBox.setAlignment(Pos.CENTER);

            VBox infoBox = new VBox(10);
            infoBox.setAlignment(Pos.CENTER_LEFT);

            Label nameLabel = new Label("Name \t: " + profile.getName());
            Label nimLabel = new Label("NIM \t\t: " + profile.getNim());
            Label ageLabel = new Label("Age \t\t: " + profile.getAge());
            Label majorLabel = new Label("Major \t: " + profile.getMajor());

            infoBox.getChildren().addAll(nameLabel, nimLabel, ageLabel, majorLabel);

            Image profileImage = new Image("file:src\\main\\resources\\Default.png");
            ImageView imageView = new ImageView(profileImage);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);

            profileBox.getChildren().addAll(imageView, infoBox);
            sceneLayout.getChildren().add(profileBox);
        };


        Button btnBackHome = new Button("Back to Home");
        btnBackHome.setOnAction(action -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();
        });
        
        sceneLayout.getChildren().add(btnBackHome);
        sceneLayout.setAlignment(Pos.CENTER);

        ScrollPane scrollPane = new ScrollPane(sceneLayout);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane, 400, 500);
        scene.getStylesheets().add("file:src/main/resources/styles/style.css");
        sceneLayout.getStyleClass().add("root-with-background");
        stage.setScene(scene);
    }

}
