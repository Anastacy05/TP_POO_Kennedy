package data;

public class Laptop extends Ordinateur {

    private double autonomieHeures;
    private boolean aEcranTactile;
    private boolean aClavierRetroEclaire;
    private boolean aPortHDMI;
    private boolean aChargeRapide;
    private boolean aLecteur;

    public Laptop(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume, String processeur, String typeStockage, String carteGraphique, int portsUSB, boolean aWifi, boolean aBluetooth, double autonomieHeures, boolean aEcranTactile, boolean aClavierRetroEclaire, boolean aPortHDMI, boolean aChargeRapide, boolean aLecteur) {
        super(adresseMAC, marque, modele, poids, prix, systemeExploitation, tailleEcran, capaciteStockageGo, RAMGo, anneeFabrication, estAllume, processeur, typeStockage, carteGraphique, portsUSB, aWifi, aBluetooth);
        this.autonomieHeures = autonomieHeures;
        this.aEcranTactile = aEcranTactile;
        this.aClavierRetroEclaire = aClavierRetroEclaire;
        this.aPortHDMI = aPortHDMI;
        this.aChargeRapide = aChargeRapide;
        this.aLecteur = aLecteur;
    }

    public double getAutonomieHeures() {
        return autonomieHeures;
    }

    public void setAutonomieHeures(double autonomieHeures) {
        this.autonomieHeures = autonomieHeures;
    }

    public boolean isaEcranTactile() {
        return aEcranTactile;
    }

    public void setaEcranTactile(boolean aEcranTactile) {
        this.aEcranTactile = aEcranTactile;
    }

    public boolean isaClavierRetroEclaire() {
        return aClavierRetroEclaire;
    }

    public void setaClavierRetroEclaire(boolean aClavierRetroEclaire) {
        this.aClavierRetroEclaire = aClavierRetroEclaire;
    }

    public boolean isaPortHDMI() {
        return aPortHDMI;
    }

    public void setaPortHDMI(boolean aPortHDMI) {
        this.aPortHDMI = aPortHDMI;
    }

    public boolean isaChargeRapide() {
        return aChargeRapide;
    }

    public void setaChargeRapide(boolean aChargeRapide) {
        this.aChargeRapide = aChargeRapide;
    }

    public boolean isaLecteur() {
        return aLecteur;
    }

    public void setaLecteur(boolean aLecteur) {
        this.aLecteur = aLecteur;
    }
}
