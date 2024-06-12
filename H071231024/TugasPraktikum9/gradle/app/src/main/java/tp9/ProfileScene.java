package tp9;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class ProfileScene {
    private Stage stage;

    ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void showWithTransition() {
        show();
        stage.getScene().getRoot().setTranslateX(800);
        TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), stage.getScene().getRoot());
        slideIn.setFromX(800);
        slideIn.setToX(0);
        slideIn.play();
    }

    private void setCircularImage(ImageView imageView, double radius) {
        Circle clip = new Circle(radius, radius, radius);
        imageView.setClip(clip);
    }

    public void show() {
        HBox layout = new HBox(50);
        layout.setId("layout");
        layout.setAlignment(Pos.CENTER);

        // RADINATA
        VBox person1 = new VBox(10);
        person1.setAlignment(Pos.CENTER);
        ImageView profilePhoto1 = new ImageView(new Image("/images/gaza.jpg"));
        profilePhoto1.setFitWidth(150);
        profilePhoto1.setFitHeight(150);
        setCircularImage(profilePhoto1, 75);
        profilePhoto1.setId("foto-gaza");


        Text userName1 = new Text("GAZA");
        userName1.setId("nama-gaza");
        
        Text description1 = new Text("Gaza, lautan keberanian di antara samudera konflik\nmenari dalam keabadian tekadnya yang mengilhami dunia.");
        description1.setId("tentang-gaza");
        person1.getChildren().addAll(profilePhoto1, userName1, description1);

        // MIRAI
        VBox person2 = new VBox(10);
        person2.setAlignment(Pos.CENTER);
        ImageView profilePhoto2 = new ImageView(new Image("/images/rafah.jpg"));
        profilePhoto2.setFitWidth(150);
        profilePhoto2.setFitHeight(150);
        setCircularImage(profilePhoto2, 75);
        profilePhoto2.setId("foto-rafah");

        Text userName2 = new Text("RAFAH");
        userName2.setId("nama-rafah");
        Text description2 = new Text("Rafah, gerbang harapan di antara padang pasir dan pelabuhan,\nmengalun indah dalam cerita ketabahan dan kerinduan yang tak terputus.");
        description2.setId("tentang-rafah");
        person2.getChildren().addAll(profilePhoto2, userName2, description2);

        Button btnToHome = new Button("BACK TO HOME");
        btnToHome.setId("homeButton");

        btnToHome.setOnAction(v -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.showWithTransition();
        });

        VBox btnContainer = new VBox(btnToHome);
        btnContainer.setAlignment(Pos.CENTER);
        btnContainer.setId("buttonContainer");

        VBox combinedLayout = new VBox(layout, btnContainer);
        combinedLayout.setAlignment(Pos.CENTER);
        combinedLayout.setId("combinedLayout");

        layout.getChildren().addAll(person1, person2);
        Scene scene = new Scene(combinedLayout, 1000, 500);
        scene.getStylesheets().add("/styles/profile.css");
        stage.setScene(scene);
        stage.show();
    }
}
