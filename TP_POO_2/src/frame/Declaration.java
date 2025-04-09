package frame;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Declaration extends HBox {

    public Declaration() {

        super();
        this.setSpacing(30);
        type = "Desktop";

        Marge.setAlignment(Pos.CENTER);
        this.getChildren().add(Marge);

        titre.getStyleClass().add("title");
        Marge.getChildren().add(intitule);

        Types.getItems().add("Desktop");
        Types.getItems().add("Laptop");
        Types.getItems().add("Tablette");
        Types.getItems().add("Telephone");
        Types.getSelectionModel().select(0);
        Marge.getChildren().add(Types);

        formulaire.setHgap(10);
        formulaire.setVgap(10);
        formulaire.setAlignment(Pos.CENTER);

        titre.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        formulaire.add(titre, 0, 0, 2, 1);

        proprio_.setPromptText("Votre nom en lettres svp");
        numTel_.setPromptText("6 __ __ __ __");
        date_vol_.setPromptText("JJ/MM/AA");
        adresseMAC_.setPromptText("Unique a chaque Appareil");
        marque_.setPromptText("HP, Dell, ...");
        modele_.setPromptText("M1");
        poids_.setPromptText("En kg");
        prix_.setPromptText("En FCFA");
        systemeExploitation_.setPromptText("Windows, Linux, Android, ...");
        tailleEcran_.setPromptText("Taille en Pouces");
        capaciteStockageGo_.setPromptText("100, 500, 1000, ...");
        RAMGo_.setPromptText("2, 4, 8, 16");
        anneeFabrication_.setPromptText("iiii");

        processeur_.setPromptText("Itel, AMD");
        typeStockage_.setPromptText("SSD, HDD");
        carteGraphique_.setPromptText("");
        portsUSB_.setPromptText("1, 2, 3, ...");

        alimentation_.setPromptText("\"500W\", \"80+ Gold\", etc");
        formatCarteMere_.setPromptText("ATX, Micro-ATX, etc");

        autonomieHeures_.setPromptText("1, 2, 3, ...");

        typeEcran_.setPromptText("OLED, LCD, etc");

        reseauMobile_.setPromptText("4G, 5G, etc");
        appareilPhotoPrincipal_.setPromptText("\"50MP f/1.8\", etc");

        vrai.setToggleGroup(linked);
        faux.setToggleGroup(linked);

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
            estAllume_HB.getChildren().add(vrai);
            estAllume_HB.getChildren().add(faux);

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
            aWiFi_HB.getChildren().add(vrai);
            aWiFi_HB.getChildren().add(faux);
        formulaire.add(aBluetooth, 0, 20);
        formulaire.add(aBluetooth_HB, 1, 20);
            aBluetooth_HB.getChildren().add(vrai);
            aBluetooth_HB.getChildren().add(faux);

        formulaire.add(alimentation, 0, 21);
        formulaire.add(alimentation_, 1, 21);
        formulaire.add(formatCarteMere, 0, 22);
        formulaire.add(formatCarteMere_, 1, 22);
        formulaire.add(estUpgradable, 0, 23);
        formulaire.add(estUpgradable_HB, 1, 23);
            estUpgradable_HB.getChildren().add(vrai);
            estUpgradable_HB.getChildren().add(faux);
        formulaire.add(aRefroidissementLiquide, 0, 24);
        formulaire.add(aRefroidissementLiquide_HB, 1, 24);
            aRefroidissementLiquide_HB.getChildren().add(vrai);
            aRefroidissementLiquide_HB.getChildren().add(faux);

        formulaire.add(valider, 1, 26);
        formulaire.add(consulter, 1, 27);

        this.getChildren().add(formulaire);
    }

    private String type;
    private VBox Marge = new VBox();
    private Label intitule = new Label("Type d'Appareil");
    private ComboBox<String> Types = new ComboBox<>();

    private Label titre = new Label("Signalez le vol de votre Appareil");
    private GridPane formulaire = new GridPane();

    RadioButton vrai = new RadioButton("Oui");
    RadioButton faux = new RadioButton("Non");
    ToggleGroup linked = new ToggleGroup();

    Button valider = new Button("Déclarer le vol");
    Button consulter = new Button("Consulter la liste");

    //Vol
    private Label proprio = new Label("Nom");
    private TextField proprio_ = new TextField();
    private Label numTel = new Label("Numéro de Téléphone");
    private  TextField numTel_ = new TextField();
    private Label date_vol = new Label("Date du Vol");
    private DatePicker date_vol_ = new DatePicker();

    //Appareil
    private Label adresseMAC = new Label("Adresse MAC");
    private TextField adresseMAC_ = new TextField();
    private Label marque = new Label("Marque");
    private TextField marque_ = new TextField();
    private Label modele = new Label("Modele");
    private TextField modele_ = new TextField();
    private Label poids = new Label("Poids");
    private TextField poids_ = new TextField();
    private Label prix = new Label("Prix");
    private TextField prix_ = new TextField();
    private Label systemeExploitation = new Label("Systeme d'Exploitation");
    private TextField systemeExploitation_ = new TextField();
    private Label tailleEcran = new Label("Taille de l'Ecran");
    private TextField tailleEcran_ = new TextField();
    private Label capaciteStockageGo = new Label("Capacite de Stockage en Go");
    private TextField capaciteStockageGo_ = new TextField();
    private Label RAMGo = new Label("RAM en Go");
    private TextField RAMGo_ = new TextField();
    private Label anneeFabrication = new Label("Annee de Fabrication");
    private TextField anneeFabrication_ = new TextField();
    private Label estAllume = new Label("Est Allume");
    private HBox estAllume_HB = new HBox();
    private ToggleGroup estAllume_ = new ToggleGroup();

    //Ordinateur
    private Label processeur = new Label("Processeur");
    private TextField processeur_ = new TextField();
    private Label typeStockage = new Label("Type de Stockage");
    private TextField typeStockage_ = new TextField();
    private Label carteGraphique = new Label("Carte Graphique");
    private TextField carteGraphique_ = new TextField();
    private Label portsUSB = new Label("Nombre de Ports USB");
    private TextField portsUSB_ = new TextField();
    private Label aWiFi = new Label("A une interface WiFi");
    private HBox aWiFi_HB = new HBox();
    private ToggleGroup aWiFi_ = new ToggleGroup();
    private Label aBluetooth = new Label("A une interface Bluetooth");
    private HBox aBluetooth_HB = new HBox();
    private ToggleGroup aBluetooth_ = new ToggleGroup();

    //Desktop
    private Label alimentation = new Label("Alimentation");
    private TextField alimentation_ = new TextField();
    private Label formatCarteMere = new Label("Format de Carte Mere");
    private TextField formatCarteMere_ = new TextField();
    private Label estUpgradable = new Label("Est Upgradable");
    private HBox estUpgradable_HB = new HBox();
    private ToggleGroup estUpgradable_ = new ToggleGroup();
    private Label aRefroidissementLiquide = new Label("A Refroidissement Liquide");
    private HBox aRefroidissementLiquide_HB = new HBox();
    private ToggleGroup aRefroidissementLiquide_ = new ToggleGroup();

    //Laptop
    private Label autonomieHeures = new Label("Autonomie en Heure"); //Tablette aussi
    private TextField autonomieHeures_ = new TextField();
    private Label aEcranTactile = new Label("A un Ecran Tactile");
    private HBox aEcranTactile_HB = new HBox();
    private ToggleGroup aEcranTactile_ = new ToggleGroup();
    private Label aClavierRetroEclaire = new Label("A un Clavier Retro Eclaire");
    private HBox aClavierRetroEclaire_HB = new HBox();
    private ToggleGroup aClavierRetroEclaire_ = new ToggleGroup();
    private Label aPortHDMI = new Label("A un Port HDMI");
    private HBox aPortHDMI_HB = new HBox();
    private ToggleGroup aPortHDMI_ = new ToggleGroup();
    private Label aChargeRapide = new Label("A la Charge Rapide");
    private HBox aChargeRapide_HB = new HBox();
    private ToggleGroup aChargeRapide_ = new ToggleGroup();
    private Label aLecteur = new Label("A un Lecteur CD/DVD");
    private HBox aLecteur_HB = new HBox();
    private ToggleGroup aLecteur_ = new ToggleGroup();


    //Tablette
    private Label aStylet = new Label("A un Stylet");
    private HBox aStylet_HB = new HBox();
    private ToggleGroup aStylet_ = new ToggleGroup();
    private Label aRechargeSansFil = new Label("A une Recharge Sans Fil");
    private HBox aRechargeSansFil_HB = new HBox();
    private ToggleGroup aRechargeSansFil_ = new ToggleGroup();
    private Label aCapteurBiometrique = new Label("A un Capteur Biometrique");
    private HBox aCapteurBiometrique_HB = new HBox();
    private ToggleGroup aCapteurBiometrique_ = new ToggleGroup();
    private Label typeEcran = new Label("Type d'Ecran");
    private TextField typeEcran_ = new TextField();

    //Telephone
    private Label reseauMobile = new Label("Reseau Mobile");
    private TextField reseauMobile_ = new TextField();
    private Label estResistantEau = new Label("A une interface WiFi");
    private HBox estResistantEau_HB = new HBox();
    private ToggleGroup estResistantEau_ = new ToggleGroup();
    private Label appareilPhotoPrincipal = new Label("Appareil Photo Principal");
    private TextField appareilPhotoPrincipal_ = new TextField();
    private Label aDoubleSIM = new Label("A une interface WiFi");
    private HBox aDoubleSIM_HB = new HBox();
    private ToggleGroup aDoubleSIM_ = new ToggleGroup();

    public void changement() {

        switch (type) {
            case "Desktop":
                formulaire.getChildren().removeAll(processeur, processeur_, typeStockage, typeStockage_, carteGraphique, carteGraphique_, portsUSB, portsUSB_, aWiFi, aWiFi_HB, aBluetooth, aBluetooth_HB);
                formulaire.getChildren().removeAll(alimentation, alimentation_, formatCarteMere, formatCarteMere_, estUpgradable, estUpgradable_HB, aRefroidissementLiquide, aRefroidissementLiquide_HB);
                formulaire.getChildren().removeAll(valider, consulter);
            case "Laptop":
                formulaire.getChildren().removeAll(processeur, processeur_, typeStockage, typeStockage_, carteGraphique, carteGraphique_, portsUSB, portsUSB_, aWiFi, aWiFi_HB, aBluetooth, aBluetooth_HB);
                formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aEcranTactile, aEcranTactile_HB, aClavierRetroEclaire, aClavierRetroEclaire_HB, aPortHDMI, aPortHDMI_HB, aChargeRapide, aChargeRapide_HB, aLecteur, aLecteur_HB);
                formulaire.getChildren().removeAll(valider, consulter);
            case "Tablette":
                formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aStylet, aStylet_HB, aRechargeSansFil, aRechargeSansFil_HB, aCapteurBiometrique, aCapteurBiometrique_HB, typeEcran, typeEcran_);
                formulaire.getChildren().removeAll(valider, consulter);
            case "Telephone":
                formulaire.getChildren().removeAll(autonomieHeures, autonomieHeures_, aStylet, aStylet_HB, aRechargeSansFil, aRechargeSansFil_HB, aCapteurBiometrique, aCapteurBiometrique_HB, typeEcran, typeEcran_);
                formulaire.getChildren().removeAll(reseauMobile, reseauMobile_, estResistantEau, estResistantEau_HB, appareilPhotoPrincipal, appareilPhotoPrincipal, aDoubleSIM, aDoubleSIM_HB);
                formulaire.getChildren().removeAll(valider, consulter);
        }

        type = Types.getSelectionModel().getSelectedItem();

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
                    aWiFi_HB.getChildren().add(vrai);
                    aWiFi_HB.getChildren().add(faux);
                formulaire.add(aBluetooth, 0, 20);
                formulaire.add(aBluetooth_HB, 1, 20);
                    aBluetooth_HB.getChildren().add(vrai);
                    aBluetooth_HB.getChildren().add(faux);

                formulaire.add(alimentation, 0, 21);
                formulaire.add(alimentation_, 1, 21);
                formulaire.add(formatCarteMere, 0, 22);
                formulaire.add(formatCarteMere_, 1, 22);
                formulaire.add(estUpgradable, 0, 23);
                formulaire.add(estUpgradable_HB, 1, 23);
                    estUpgradable_HB.getChildren().add(vrai);
                    estUpgradable_HB.getChildren().add(faux);
                formulaire.add(aRefroidissementLiquide, 0, 24);
                formulaire.add(aRefroidissementLiquide_HB, 1, 24);
                    aRefroidissementLiquide_HB.getChildren().add(vrai);
                    aRefroidissementLiquide_HB.getChildren().add(faux);

                formulaire.add(valider, 1, 26);
                formulaire.add(consulter, 1, 27);

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
                    aWiFi_HB.getChildren().add(vrai);
                    aWiFi_HB.getChildren().add(faux);
                formulaire.add(aBluetooth, 0, 20);
                formulaire.add(aBluetooth_HB, 1, 20);
                    aBluetooth_HB.getChildren().add(vrai);
                    aBluetooth_HB.getChildren().add(faux);

                formulaire.add(autonomieHeures, 0, 21);
                formulaire.add(autonomieHeures_, 1, 21);
                formulaire.add(aEcranTactile, 0, 22);
                formulaire.add(aEcranTactile_HB, 1, 22);
                    aEcranTactile_HB.getChildren().add(vrai);
                    aEcranTactile_HB.getChildren().add(faux);
                formulaire.add(aClavierRetroEclaire, 0, 23);
                formulaire.add(aClavierRetroEclaire_HB, 1, 23);
                    aClavierRetroEclaire_HB.getChildren().add(vrai);
                    aClavierRetroEclaire_HB.getChildren().add(faux);
                formulaire.add(aPortHDMI, 0, 24);
                formulaire.add(aPortHDMI_HB, 1, 24);
                    aPortHDMI_HB.getChildren().add(vrai);
                    aPortHDMI_HB.getChildren().add(faux);
                formulaire.add(aChargeRapide, 0, 25);
                formulaire.add(aChargeRapide_HB, 1, 25);
                    aChargeRapide_HB.getChildren().add(vrai);
                    aChargeRapide_HB.getChildren().add(faux);
                formulaire.add(aLecteur, 0, 26);
                formulaire.add(aLecteur_HB, 1, 26);
                    aLecteur_HB.getChildren().add(vrai);
                    aLecteur_HB.getChildren().add(faux);

                formulaire.add(valider, 1, 28);
                formulaire.add(consulter, 1, 29);

            case "Tablette":

                formulaire.add(autonomieHeures, 0, 15);
                formulaire.add(autonomieHeures_, 1, 15);
                formulaire.add(aStylet, 0, 16);
                formulaire.add(aStylet_HB, 1, 16);
                    aStylet_HB.getChildren().add(vrai);
                    aStylet_HB.getChildren().add(faux);
                formulaire.add(aRechargeSansFil, 0, 17);
                formulaire.add(aRechargeSansFil_HB, 1, 17);
                    aRechargeSansFil_HB.getChildren().add(vrai);
                    aRechargeSansFil_HB.getChildren().add(faux);
                formulaire.add(aCapteurBiometrique, 0, 18);
                formulaire.add(aCapteurBiometrique_HB, 1, 18);
                    aCapteurBiometrique_HB.getChildren().add(vrai);
                    aCapteurBiometrique_HB.getChildren().add(faux);
                formulaire.add(typeEcran, 0, 19);
                formulaire.add(typeEcran_, 1, 19);

                formulaire.add(valider, 1, 21);
                formulaire.add(consulter, 1, 22);

            case "Telephone":

                formulaire.add(autonomieHeures, 0, 15);
                formulaire.add(autonomieHeures_, 1, 15);
                formulaire.add(aStylet, 0, 16);
                formulaire.add(aStylet_HB, 1, 16);
                    aStylet_HB.getChildren().add(vrai);
                    aStylet_HB.getChildren().add(faux);
                formulaire.add(aRechargeSansFil, 0, 17);
                formulaire.add(aRechargeSansFil_HB, 1, 17);
                    aRechargeSansFil_HB.getChildren().add(vrai);
                    aRechargeSansFil_HB.getChildren().add(faux);
                formulaire.add(aCapteurBiometrique, 0, 18);
                formulaire.add(aCapteurBiometrique_HB, 1, 18);
                    aCapteurBiometrique_HB.getChildren().add(vrai);
                    aCapteurBiometrique_HB.getChildren().add(faux);
                formulaire.add(typeEcran, 0, 19);
                formulaire.add(typeEcran_, 1, 19);

                formulaire.add(reseauMobile, 0, 20);
                formulaire.add(reseauMobile_, 1, 20);
                formulaire.add(estResistantEau, 0, 21);
                formulaire.add(estResistantEau_HB, 1, 21);
                    estResistantEau_HB.getChildren().add(vrai);
                    estResistantEau_HB.getChildren().add(faux);
                formulaire.add(appareilPhotoPrincipal, 0, 22);
                formulaire.add(appareilPhotoPrincipal_, 1, 22);
                formulaire.add(aStylet, 0, 23);
                formulaire.add(aDoubleSIM_HB, 1, 23);
                    aDoubleSIM_HB.getChildren().add(vrai);
                    aDoubleSIM_HB.getChildren().add(faux);

                formulaire.add(valider, 1, 25);
                formulaire.add(consulter, 1, 26);

        }

    }

    public ComboBox<String> getTypes() {
        return Types;
    }

    public String getType() {
        return type;
    }

    public Button getValider() {
        return valider;
    }

    public Button getConsulter() {
        return consulter;
    }

    public TextField getProprio_() {
        return proprio_;
    }

    public TextField getNumTel_() {
        return numTel_;
    }

    public DatePicker getDate_vol_() {
        return date_vol_;
    }

    public TextField getAdresseMAC_() {
        return adresseMAC_;
    }

    public TextField getMarque_() {
        return marque_;
    }

    public TextField getModele_() {
        return modele_;
    }

    public TextField getPoids_() {
        return poids_;
    }

    public TextField getPrix_() {
        return prix_;
    }

    public TextField getSystemeExploitation_() {
        return systemeExploitation_;
    }

    public TextField getTailleEcran_() {
        return tailleEcran_;
    }

    public TextField getCapaciteStockageGo_() {
        return capaciteStockageGo_;
    }

    public TextField getRAMGo_() {
        return RAMGo_;
    }

    public TextField getAnneeFabrication_() {
        return anneeFabrication_;
    }

    public ToggleGroup getEstAllume_() {
        return estAllume_;
    }

    public TextField getProcesseur_() {
        return processeur_;
    }

    public TextField getTypeStockage_() {
        return typeStockage_;
    }

    public TextField getCarteGraphique_() {
        return carteGraphique_;
    }

    public TextField getPortsUSB_() {
        return portsUSB_;
    }

    public ToggleGroup getaWiFi_() {
        return aWiFi_;
    }

    public ToggleGroup getaBluetooth_() {
        return aBluetooth_;
    }

    public TextField getAlimentation_() {
        return alimentation_;
    }

    public TextField getFormatCarteMere_() {
        return formatCarteMere_;
    }

    public ToggleGroup getEstUpgradable_() {
        return estUpgradable_;
    }

    public ToggleGroup getaRefroidissementLiquide_() {
        return aRefroidissementLiquide_;
    }

    public TextField getAutonomieHeures_() {
        return autonomieHeures_;
    }

    public ToggleGroup getaEcranTactile_() {
        return aEcranTactile_;
    }

    public ToggleGroup getaClavierRetroEclaire_() {
        return aClavierRetroEclaire_;
    }

    public ToggleGroup getaPortHDMI_() {
        return aPortHDMI_;
    }

    public ToggleGroup getaChargeRapide_() {
        return aChargeRapide_;
    }

    public ToggleGroup getaLecteur_() {
        return aLecteur_;
    }

    public ToggleGroup getaStylet_() {
        return aStylet_;
    }

    public ToggleGroup getaRechargeSansFil_() {
        return aRechargeSansFil_;
    }

    public ToggleGroup getaCapteurBiometrique_() {
        return aCapteurBiometrique_;
    }

    public TextField getTypeEcran_() {
        return typeEcran_;
    }

    public TextField getReseauMobile_() {
        return reseauMobile_;
    }

    public ToggleGroup getEstResistantEau_() {
        return estResistantEau_;
    }

    public TextField getAppareilPhotoPrincipal_() {
        return appareilPhotoPrincipal_;
    }

    public ToggleGroup getaDoubleSIM_() {
        return aDoubleSIM_;
    }
}