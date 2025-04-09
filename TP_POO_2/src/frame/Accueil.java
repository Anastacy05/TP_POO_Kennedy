package frame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Accueil extends VBox {

    public Accueil() {

        super();
        this.setSpacing(30);
        this.setAlignment(Pos.CENTER);

        this.getChildren().addAll(ceci, declarer, consulter);

    }

    private Label ceci = new Label("Application de lutte contre le Vol");
    private Button declarer = new Button("Declarer un Vol");
    private Button consulter = new Button("Consulter la Liste des Vols");

    public Button getDeclarer() {
        return declarer;
    }

    public Button getConsulter() {
        return consulter;
    }

}
