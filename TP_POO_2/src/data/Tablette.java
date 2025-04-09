package data;

public class Tablette extends Appareil {

    private double autonomieHeures;
    private boolean aStylet;
    private boolean aRechargeSansFil;
    private boolean aCapteurBiometrique; // Empreinte ou reconnaissance faciale
    private String typeEcran; // OLED, LCD, etc.

    public Tablette(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume, double autonomieHeures, boolean aStylet, boolean aRechargeSansFil, boolean aCapteurBiometrique, String typeEcran) {
        super(adresseMAC, marque, modele, poids, prix, systemeExploitation, tailleEcran, capaciteStockageGo, RAMGo, anneeFabrication, estAllume);
        this.autonomieHeures = autonomieHeures;
        this.aStylet = aStylet;
        this.aRechargeSansFil = aRechargeSansFil;
        this.aCapteurBiometrique = aCapteurBiometrique;
        this.typeEcran = typeEcran;
    }

    public double getAutonomieHeures() {
        return autonomieHeures;
    }

    public void setAutonomieHeures(double autonomieHeures) {
        this.autonomieHeures = autonomieHeures;
    }

    public boolean isaStylet() {
        return aStylet;
    }

    public void setaStylet(boolean aStylet) {
        this.aStylet = aStylet;
    }

    public boolean isaRechargeSansFil() {
        return aRechargeSansFil;
    }

    public void setaRechargeSansFil(boolean aRechargeSansFil) {
        this.aRechargeSansFil = aRechargeSansFil;
    }

    public boolean isaCapteurBiometrique() {
        return aCapteurBiometrique;
    }

    public void setaCapteurBiometrique(boolean aCapteurBiometrique) {
        this.aCapteurBiometrique = aCapteurBiometrique;
    }

    public String getTypeEcran() {
        return typeEcran;
    }

    public void setTypeEcran(String typeEcran) {
        this.typeEcran = typeEcran;
    }
}
