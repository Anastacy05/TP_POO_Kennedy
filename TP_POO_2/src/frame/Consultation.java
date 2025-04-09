package frame;

import data.Registre_vols;
import data.Vol;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Consultation extends HBox {

    public Consultation() {

        super();
        this.setSpacing(20);

        Marge.setSpacing(20);
        Marge.setAlignment(Pos.CENTER);
        Marge.getChildren().add(gauche);
        Marge.getChildren().add(droite);
        Marge.getChildren().add(declarer);

        titre.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        formulaire.add(titre, 0, 0, 2, 1);

        formulaire.add(proprio, 0, 1);
        formulaire.add(proprio_, 1, 1);
        formulaire.add(numTel, 0, 2);
        formulaire.add(numTel_, 1, 2);
        formulaire.add(date_vol, 0, 3);
        formulaire.add(date_vol_, 1, 3);
        formulaire.add(adresseMAC, 0, 4);
        formulaire.add(adresseMAC_, 1, 4);
        formulaire.add(marque, 0, 5);
        formulaire.add(marque_, 1, 5);
        formulaire.add(modele, 0, 6);
        formulaire.add(modele_, 1, 6);
        formulaire.add(poids, 0, 7);
        formulaire.add(poids_, 1, 7);
        formulaire.add(prix, 0, 8);
        formulaire.add(prix_, 1, 8);
        formulaire.add(systemeExploitation, 0, 9);
        formulaire.add(systemeExploitation_, 1, 9);
        formulaire.add(tailleEcran, 0, 10);
        formulaire.add(tailleEcran_, 1, 10);
        formulaire.add(capaciteStockageGo, 0, 11);
        formulaire.add(capaciteStockageGo_, 1, 11);
        formulaire.add(RAMGo, 0, 12);
        formulaire.add(RAMGo_, 1, 12);
        formulaire.add(anneeFabrication, 0, 13);
        formulaire.add(anneeFabrication_, 1, 13);
        formulaire.add(estAllume, 0, 14);
        formulaire.add(estAllume_HB, 1, 14);

        formulaire.add(processeur, 0, 15);
        formulaire.add(processeur_, 1, 15);
        formulaire.add(typeStockage, 0, 16);
        formulaire.add(typeStockage_, 1, 16);
        formulaire.add(carteGraphique, 0, 17);
        formulaire.add(carteGraphique_, 1, 17);
        formulaire.add(portsUSB, 0, 18);
        formulaire.add(portsUSB_, 1, 18);
        formulaire.add(aWiFi, 0, 19);
        formulaire.add(aWiFi_HB, 1, 19);
        formulaire.add(aBluetooth, 0, 20);
        formulaire.add(aBluetooth_HB, 1, 20);

        formulaire.add(alimentation, 0, 21);
        formulaire.add(alimentation_, 1, 21);
        formulaire.add(formatCarteMere, 0, 22);
        formulaire.add(formatCarteMere_, 1, 22);
        formulaire.add(estUpgradable, 0, 23);
        formulaire.add(estUpgradable_HB, 1, 23);
        formulaire.add(aRefroidissementLiquide, 0, 24);
        formulaire.add(aRefroidissementLiquide_HB, 1, 24);

        this.getChildren().add(Marge);
        this.getChildren().add(formulaire);

    }

    private Registre_vols registre_vols;
    private int indice;
    private String type;
    private VBox Marge = new VBox();
    private GridPane formulaire = new GridPane();

    private Button gauche = new Button("Elément précédent");
    private Button droite = new Button("Elément suivant");
    private Button declarer = new Button("Déclarer un vol");

    private Label titre = new Label("Consultez les appareils volés");

    private Label proprio = new Label("Nom");
    private Label proprio_ = new Label();
    private Label numTel = new Label("Numéro de Téléphone");
    private Label numTel_ = new Label();
    private Label date_vol = new Label("Date du Vol");
    private Label date_vol_ = new Label();

    //Appareil
    private Label adresseMAC = new Label("Adresse MAC");
    private Label adresseMAC_ = new Label();
    private Label marque = new Label("Marque");
    private Label marque_ = new Label();
    private Label modele = new Label("Modele");
    private Label modele_ = new Label();
    private Label poids = new Label("Poids");
    private Label poids_ = new Label();
    private Label prix = new Label("Prix");
    private Label prix_ = new Label();
    private Label systemeExploitation = new Label("Systeme d'Exploitation");
    private Label systemeExploitation_ = new Label();
    private Label tailleEcran = new Label("Taille de l'Ecran");
    private Label tailleEcran_ = new Label();
    private Label capaciteStockageGo = new Label("Capacite de Stockage en Go");
    private Label capaciteStockageGo_ = new Label();
    private Label RAMGo = new Label("RAM en Go");
    private Label RAMGo_ = new Label();
    private Label anneeFabrication = new Label("Annee de Fabrication");
    private Label anneeFabrication_ = new Label();
    private Label estAllume = new Label("Est Allume");
    private Label estAllume_HB = new Label();

    //Ordinateur
    private Label processeur = new Label("Processeur");
    private Label processeur_ = new Label();
    private Label typeStockage = new Label("Type de Stockage");
    private Label typeStockage_ = new Label();
    private Label carteGraphique = new Label("Carte Graphique");
    private Label carteGraphique_ = new Label();
    private Label portsUSB = new Label("Nombre de Ports USB");
    private Label portsUSB_ = new Label();
    private Label aWiFi = new Label("A une interface WiFi");
    private Label aWiFi_HB = new Label();
    private Label aBluetooth = new Label("A une interface Bluetooth");
    private Label aBluetooth_HB = new Label();

    //Desktop
    private Label alimentation = new Label("Alimentation");
    private Label alimentation_ = new Label();
    private Label formatCarteMere = new Label("Format de Carte Mere");
    private Label formatCarteMere_ = new Label();
    private Label estUpgradable = new Label("Est Upgradable");
    private Label estUpgradable_HB = new Label();
    private Label aRefroidissementLiquide = new Label("A Refroidissement Liquide");
    private Label aRefroidissementLiquide_HB = new Label();

    //Laptop
    private Label autonomieHeures = new Label("Autonomie en Heure"); //Tablette aussi
    private Label autonomieHeures_ = new Label();
    private Label aEcranTactile = new Label("A un Ecran Tactile");
    private Label aEcranTactile_HB = new Label();
    private Label aClavierRetroEclaire = new Label("A un Clavier Retro Eclaire");
    private Label aClavierRetroEclaire_HB = new Label();
    private Label aPortHDMI = new Label("A un Port HDMI");
    private Label aPortHDMI_HB = new Label();
    private Label aChargeRapide = new Label("A la Charge Rapide");
    private Label aChargeRapide_HB = new Label();
    private Label aLecteur = new Label("A un Lecteur CD/DVD");
    private Label aLecteur_HB = new Label();


    //Tablette
    private Label aStylet = new Label("A un Stylet");
    private Label aStylet_HB = new Label();
    private Label aRechargeSansFil = new Label("A une Recharge Sans Fil");
    private Label aRechargeSansFil_HB = new Label();
    private Label aCapteurBiometrique = new Label("A un Capteur Biometrique");
    private Label aCapteurBiometrique_HB = new Label();
    private Label typeEcran = new Label("Type d'Ecran");
    private Label typeEcran_ = new Label();

    //Telephone
    private Label reseauMobile = new Label("Reseau Mobile");
    private Label reseauMobile_ = new Label();
    private Label estResistantEau = new Label("A une interface WiFi");
    private Label estResistantEau_HB = new Label();
    private Label appareilPhotoPrincipal = new Label("Appareil Photo Principal");
    private Label appareilPhotoPrincipal_ = new Label();
    private Label aDoubleSIM = new Label("A une interface WiFi");
    private Label aDoubleSIM_HB = new Label();

    public void changement() {

        if (!type.equals(registre_vols.get(indice).getClass().getSimpleName())) {

            switch (type) {
                case "Desktop":
                    formulaire.getChildren().removeAll(processeur, processeur_, typeStockage, typeStockage_, carteGraphique, carteGraphique_, portsUSB, portsUSB_, aWiFi, aWiFi_HB, aBluetooth, aBluetooth_HB);
                    formulaire.getChildren().removeAll(alimentation, alimentation_, formatCarteMere, formatCarteMere_, estUpgradable, estUpgradable_HB, aRefroidissementLiquide, aRefroidissementLiquide_HB);
                case "Laptop":
                    formulaire.getChildren().removeAll(processeur, processeur_, typeStockage, typeStockage_, carteGraphique, carteGraphique_, portsUSB, portsUSB_, aWiFi, aWiFi_HB, aBluetooth, aBluetooth_HB);
                    formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aEcranTactile, aEcranTactile_HB, aClavierRetroEclaire, aClavierRetroEclaire_HB, aPortHDMI, aPortHDMI_HB, aChargeRapide, aChargeRapide_HB, aLecteur, aLecteur_HB);
                case "Tablette":
                    formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aStylet, aStylet_HB, aRechargeSansFil, aRechargeSansFil_HB, aCapteurBiometrique, aCapteurBiometrique_HB, typeEcran, typeEcran_);
                case "Telephone":
                    formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aStylet, aStylet_HB, aRechargeSansFil, aRechargeSansFil_HB, aCapteurBiometrique, aCapteurBiometrique_HB, typeEcran, typeEcran_);
                    formulaire.getChildren().removeAll(reseauMobile, reseauMobile_, estResistantEau, estResistantEau_HB, appareilPhotoPrincipal, appareilPhotoPrincipal_, aDoubleSIM, aDoubleSIM_HB);
            }

            type = registre_vols.get(indice).getAppareil().getClass().getSimpleName();

            switch (type) {

                case "Desktop":

                    formulaire.add(processeur, 0, 15);
                    formulaire.add(processeur_, 1, 15);
                    formulaire.add(typeStockage, 0, 16);
                    formulaire.add(typeStockage_, 1, 16);
                    formulaire.add(carteGraphique, 0, 17);
                    formulaire.add(carteGraphique_, 1, 17);
                    formulaire.add(portsUSB, 0, 18);
                    formulaire.add(portsUSB_, 1, 18);
                    formulaire.add(aWiFi, 0, 19);
                    formulaire.add(aWiFi_HB, 1, 19);
                    formulaire.add(aBluetooth, 0, 20);
                    formulaire.add(aBluetooth_HB, 1, 20);

                    formulaire.add(alimentation, 0, 21);
                    formulaire.add(alimentation_, 1, 21);
                    formulaire.add(formatCarteMere, 0, 22);
                    formulaire.add(formatCarteMere_, 1, 22);
                    formulaire.add(estUpgradable, 0, 23);
                    formulaire.add(estUpgradable_HB, 1, 23);
                    formulaire.add(aRefroidissementLiquide, 0, 24);
                    formulaire.add(aRefroidissementLiquide_HB, 1, 24);

                case "Laptop":

                    formulaire.add(processeur, 0, 15);
                    formulaire.add(processeur_, 1, 15);
                    formulaire.add(typeStockage, 0, 16);
                    formulaire.add(typeStockage_, 1, 16);
                    formulaire.add(carteGraphique, 0, 17);
                    formulaire.add(carteGraphique_, 1, 17);
                    formulaire.add(portsUSB, 0, 18);
                    formulaire.add(portsUSB_, 1, 18);
                    formulaire.add(aWiFi, 0, 19);
                    formulaire.add(aWiFi_HB, 1, 19);
                    formulaire.add(aBluetooth, 0, 20);
                    formulaire.add(aBluetooth_HB, 1, 20);

                    formulaire.add(autonomieHeures, 0, 21);
                    formulaire.add(autonomieHeures_, 1, 21);
                    formulaire.add(aEcranTactile, 0, 22);
                    formulaire.add(aEcranTactile_HB, 1, 22);
                    formulaire.add(aClavierRetroEclaire, 0, 23);
                    formulaire.add(aClavierRetroEclaire_HB, 1, 23);
                    formulaire.add(aPortHDMI, 0, 24);
                    formulaire.add(aPortHDMI_HB, 1, 24);
                    formulaire.add(aChargeRapide, 0, 25);
                    formulaire.add(aChargeRapide_HB, 1, 25);
                    formulaire.add(aLecteur, 0, 26);
                    formulaire.add(aLecteur_HB, 1, 26);

                case "Tablette":

                    formulaire.add(autonomieHeures, 0, 15);
                    formulaire.add(autonomieHeures_, 1, 15);
                    formulaire.add(aStylet, 0, 16);
                    formulaire.add(aStylet_HB, 1, 16);
                    formulaire.add(aRechargeSansFil, 0, 17);
                    formulaire.add(aRechargeSansFil_HB, 1, 17);
                    formulaire.add(aCapteurBiometrique, 0, 18);
                    formulaire.add(aCapteurBiometrique_HB, 1, 18);
                    formulaire.add(typeEcran, 0, 19);
                    formulaire.add(typeEcran_, 1, 19);

                case "Telephone":

                    formulaire.add(autonomieHeures, 0, 15);
                    formulaire.add(autonomieHeures_, 1, 15);
                    formulaire.add(aStylet, 0, 16);
                    formulaire.add(aStylet_HB, 1, 16);
                    formulaire.add(aRechargeSansFil, 0, 17);
                    formulaire.add(aRechargeSansFil_HB, 1, 17);
                    formulaire.add(aCapteurBiometrique, 0, 18);
                    formulaire.add(aCapteurBiometrique_HB, 1, 18);
                    formulaire.add(typeEcran, 0, 19);
                    formulaire.add(typeEcran_, 1, 19);

                    formulaire.add(reseauMobile, 0, 20);
                    formulaire.add(reseauMobile_, 1, 20);
                    formulaire.add(estResistantEau, 0, 21);
                    formulaire.add(estResistantEau_HB, 1, 21);
                    formulaire.add(appareilPhotoPrincipal, 0, 22);
                    formulaire.add(appareilPhotoPrincipal_, 1, 22);
                    formulaire.add(aStylet, 0, 23);
                    formulaire.add(aDoubleSIM_HB, 1, 23);

            }
        }
    }

    public void setVol(Vol vol) {
        if (vol != null) {

            adresseMAC_.setText(vol.getAppareil().getAdresseMAC());
            marque_.setText(vol.getAppareil().getMarque());
            modele_.setText(vol.getAppareil().getModele());
            poids_.setText(String.valueOf(vol.getAppareil().getPoids()));
            prix_.setText(String.valueOf(vol.getAppareil().getPrix()));
            systemeExploitation_.setText(vol.getAppareil().getSystemeExploitation());
            tailleEcran_.setText(String.valueOf(vol.getAppareil().getTailleEcran()));
            capaciteStockageGo_.setText(String.valueOf(vol.getAppareil().getCapaciteStockageGo()));
            RAMGo_.setText(String.valueOf(vol.getAppareil().getRAMGo()));
            anneeFabrication.setText(String.valueOf(vol.getAppareil().getAnneeFabrication()));
            estAllume.setText(BooltoString(vol.getAppareil().isEstAllume()));

            if (type.equals(vol.getClass().getSimpleName())) {
                switch (vol.getClass().getSimpleName()) {

                }
            }

        }
    }

    public Button getDeclarer() {
        return declarer;
    }

    public Button getDroite() {
        return droite;
    }

    public Button getGauche() {
        return gauche;
    }

    public Registre_vols getRegistre_vols() {
        return registre_vols;
    }

    public String getType() {
        return type;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String BooltoString(boolean rep) {
        if (rep) {
            return "Oui";
        }
        else {
            return "Non";
        }
    }
}
