package data;

public abstract class Appareil {

    private String adresseMAC;
    private String marque;
    private String modele;
    private double poids; // en grammes
    private double prix;
    private String systemeExploitation;
    private double tailleEcran;
    private int capaciteStockageGo;
    private int RAMGo;
    private int anneeFabrication;
    private boolean estAllume;

    public Appareil(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume) {
        this.adresseMAC = adresseMAC;
        this.marque = marque;
        this.modele = modele;
        this.poids = poids;
        this.prix = prix;
        this.systemeExploitation = systemeExploitation;
        this.tailleEcran = tailleEcran;
        this.capaciteStockageGo = capaciteStockageGo;
        this.RAMGo = RAMGo;
        this.anneeFabrication = anneeFabrication;
        this.estAllume = estAllume;
    }

    public String getAdresseMAC() {
        return adresseMAC;
    }

    public void setAdresseMAC(String adresseMAC) {
        this.adresseMAC = adresseMAC;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getSystemeExploitation() {
        return systemeExploitation;
    }

    public void setSystemeExploitation(String systemeExploitation) {
        this.systemeExploitation = systemeExploitation;
    }

    public double getTailleEcran() {
        return tailleEcran;
    }

    public void setTailleEcran(double tailleEcran) {
        this.tailleEcran = tailleEcran;
    }

    public int getCapaciteStockageGo() {
        return capaciteStockageGo;
    }

    public void setCapaciteStockageGo(int capaciteStockageGo) {
        this.capaciteStockageGo = capaciteStockageGo;
    }

    public int getRAMGo() {
        return RAMGo;
    }

    public void setRAMGo(int RAMGo) {
        this.RAMGo = RAMGo;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public boolean isEstAllume() {
        return estAllume;
    }

    public void setEstAllume(boolean estAllume) {
        this.estAllume = estAllume;
    }
}