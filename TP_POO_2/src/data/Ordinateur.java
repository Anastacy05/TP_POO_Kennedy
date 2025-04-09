package data;

public abstract class Ordinateur extends Appareil {

    private String processeur;
    private String typeStockage; // SSD/HDD
    private String carteGraphique;
    private int portsUSB;
    private boolean aWifi;
    private boolean aBluetooth;

    public Ordinateur(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume, String processeur, String typeStockage, String carteGraphique, int portsUSB, boolean aWifi, boolean aBluetooth) {
        super(adresseMAC, marque, modele, poids, prix, systemeExploitation, tailleEcran, capaciteStockageGo, RAMGo, anneeFabrication, estAllume);
        this.processeur = processeur;
        this.typeStockage = typeStockage;
        this.carteGraphique = carteGraphique;
        this.portsUSB = portsUSB;
        this.aWifi = aWifi;
        this.aBluetooth = aBluetooth;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public String getTypeStockage() {
        return typeStockage;
    }

    public void setTypeStockage(String typeStockage) {
        this.typeStockage = typeStockage;
    }

    public String getCarteGraphique() {
        return carteGraphique;
    }

    public void setCarteGraphique(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }

    public int getPortsUSB() {
        return portsUSB;
    }

    public void setPortsUSB(int portsUSB) {
        this.portsUSB = portsUSB;
    }

    public boolean isaWifi() {
        return aWifi;
    }

    public void setaWifi(boolean aWifi) {
        this.aWifi = aWifi;
    }

    public boolean isaBluetooth() {
        return aBluetooth;
    }

    public void setaBluetooth(boolean aBluetooth) {
        this.aBluetooth = aBluetooth;
    }
}
