package frame;

import data.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.sql.Date;

public class MainFrmApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Accueil accueil = new Accueil();
        Declaration declaration = new Declaration();
        Consultation consultation = new Consultation();

        Scene scene1 = new Scene(accueil, 500, 500);
        Scene scene2 = new Scene(declaration, 500, 1200);
        Scene scene3 = new Scene(consultation, 500, 1200);

        stage.setScene(scene1);
        accueil.getDeclarer().setOnAction(actionEvent -> stage.setScene(scene2));
        accueil.getConsulter().setOnAction(actionEvent -> stage.setScene(scene3));

        declaration.getTypes().setOnAction(actionEvent -> declaration.changement());
        declaration.getValider().setOnAction(actionEvent -> {
            String type = declaration.getType();
            Appareil appareil;
            Vol vol;
            switch (type) {
                case "Desktop":
                    appareil = new Desktop(declaration.getAdresseMAC_().getText(), declaration.getMarque_().getText(), declaration.getModele_().getText(), Double.parseDouble(declaration.getPoids_().getText()), Double.parseDouble(declaration.getPrix_().getText()), declaration.getSystemeExploitation_().getText(), Double.parseDouble(declaration.getTailleEcran_().getText()), Integer.parseInt(declaration.getCapaciteStockageGo_().getText()), Integer.parseInt(declaration.getRAMGo_().getText()), Integer.parseInt(declaration.getAnneeFabrication_().getText()), RadiotoBool(declaration.getEstAllume_()), declaration.getProcesseur_().getText(), declaration.getTypeStockage_().getText(), declaration.getCarteGraphique_().getText(), Integer.parseInt(declaration.getPortsUSB_().getText()), RadiotoBool(declaration.getaWiFi_()), RadiotoBool(declaration.getaBluetooth_()), declaration.getAlimentation_().getText(), declaration.getFormatCarteMere_().getText(), RadiotoBool(declaration.getEstUpgradable_()), RadiotoBool(declaration.getaRefroidissementLiquide_()));
                case "Laptop":
                    appareil = new Laptop(declaration.getAdresseMAC_().getText(), declaration.getMarque_().getText(), declaration.getModele_().getText(), Double.parseDouble(declaration.getPoids_().getText()), Double.parseDouble(declaration.getPrix_().getText()), declaration.getSystemeExploitation_().getText(), Double.parseDouble(declaration.getTailleEcran_().getText()), Integer.parseInt(declaration.getCapaciteStockageGo_().getText()), Integer.parseInt(declaration.getRAMGo_().getText()), Integer.parseInt(declaration.getAnneeFabrication_().getText()), RadiotoBool(declaration.getEstAllume_()), declaration.getProcesseur_().getText(), declaration.getTypeStockage_().getText(), declaration.getCarteGraphique_().getText(), Integer.parseInt(declaration.getPortsUSB_().getText()), RadiotoBool(declaration.getaWiFi_()), RadiotoBool(declaration.getaBluetooth_()), Double.parseDouble(declaration.getAutonomieHeures_().getText()), RadiotoBool(declaration.getaEcranTactile_()), RadiotoBool(declaration.getaClavierRetroEclaire_()), RadiotoBool(declaration.getaPortHDMI_()), RadiotoBool(declaration.getaChargeRapide_()), RadiotoBool(declaration.getaLecteur_()));
                case "Tablette":
                    appareil = new Tablette(declaration.getAdresseMAC_().getText(), declaration.getMarque_().getText(), declaration.getModele_().getText(), Double.parseDouble(declaration.getPoids_().getText()), Double.parseDouble(declaration.getPrix_().getText()), declaration.getSystemeExploitation_().getText(), Double.parseDouble(declaration.getTailleEcran_().getText()), Integer.parseInt(declaration.getCapaciteStockageGo_().getText()), Integer.parseInt(declaration.getRAMGo_().getText()), Integer.parseInt(declaration.getAnneeFabrication_().getText()), RadiotoBool(declaration.getEstAllume_()), Double.parseDouble(declaration.getAutonomieHeures_().getText()), RadiotoBool(declaration.getaStylet_()), RadiotoBool(declaration.getaRechargeSansFil_()), RadiotoBool(declaration.getaCapteurBiometrique_()), declaration.getTypeEcran_().getText());
                default:
                    appareil = new Telephone(declaration.getAdresseMAC_().getText(), declaration.getMarque_().getText(), declaration.getModele_().getText(), Double.parseDouble(declaration.getPoids_().getText()), Double.parseDouble(declaration.getPrix_().getText()), declaration.getSystemeExploitation_().getText(), Double.parseDouble(declaration.getTailleEcran_().getText()), Integer.parseInt(declaration.getCapaciteStockageGo_().getText()), Integer.parseInt(declaration.getRAMGo_().getText()), Integer.parseInt(declaration.getAnneeFabrication_().getText()), RadiotoBool(declaration.getEstAllume_()), Double.parseDouble(declaration.getAutonomieHeures_().getText()), RadiotoBool(declaration.getaStylet_()), RadiotoBool(declaration.getaRechargeSansFil_()), RadiotoBool(declaration.getaCapteurBiometrique_()), declaration.getTypeEcran_().getText(), declaration.getReseauMobile_().getText(), RadiotoBool(declaration.getEstResistantEau_()), declaration.getAppareilPhotoPrincipal_().getText(), RadiotoBool(declaration.getaDoubleSIM_()));
            }
            vol = new Vol(appareil, declaration.getProprio_().getText(), declaration.getNumTel_().getText(), Date.valueOf(declaration.getDate_vol_().getValue()));
            consultation.getRegistre_vols().declarerVol(vol);
            consultation.setIndice(consultation.getRegistre_vols().indexOf(vol));
            consultation.setVol(vol);
            stage.setScene(scene3);
        });
        declaration.getConsulter().setOnAction(actionEvent -> {
            stage.setScene(scene3);
            consultation.setIndice(0);
            consultation.setVol(consultation.getRegistre_vols().getFirst());
        });

        consultation.getDeclarer().setOnAction(actionEvent -> stage.setScene(scene2));
        consultation.getDroite().setOnAction(actionEvent -> {
            int i = consultation.getIndice();
            i++;
            i = i%consultation.getRegistre_vols().size();
            consultation.setIndice(i);
            if (!consultation.getType().equals(consultation.getRegistre_vols().get(i).getAppareil().getClass().getSimpleName())) {
                consultation.changement();
            }
            consultation.setVol(consultation.getRegistre_vols().get(i));
        });
        consultation.getGauche().setOnAction(actionEvent -> {
            int i = consultation.getIndice();
            i--;
            i = i%consultation.getRegistre_vols().size();
            consultation.setIndice(i);
            if (!consultation.getType().equals(consultation.getRegistre_vols().get(i).getAppareil().getClass().getSimpleName())) {
                consultation.changement();
            }
            consultation.setVol(consultation.getRegistre_vols().get(i));
        });

        stage.setTitle("Vols d'Appareils");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public boolean RadiotoBool(ToggleGroup toggleGroup) {
        if(toggleGroup.getSelectedToggle().toString().equals("Oui")) {
            return true;
        }
        return false;
    }

}
