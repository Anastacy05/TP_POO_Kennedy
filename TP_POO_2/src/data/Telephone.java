package data;

public class Telephone extends Tablette {

    private String reseauMobile; // 4G, 5G, etc.
    private boolean estResistantEau; // IP67, IP68, etc.
    private String appareilPhotoPrincipal; // "50MP f/1.8", etc.
    private boolean aDoubleSIM;

    public Telephone(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume, double autonomieHeures, boolean aStylet, boolean aRechargeSansFil, boolean aCapteurBiometrique, String typeEcran, String reseauMobile, boolean estResistantEau, String appareilPhotoPrincipal, boolean aDoubleSIM) {
        super(adresseMAC, marque, modele, poids, prix, systemeExploitation, tailleEcran, capaciteStockageGo, RAMGo, anneeFabrication, estAllume, autonomieHeures, aStylet, aRechargeSansFil, aCapteurBiometrique, typeEcran);
        this.reseauMobile = reseauMobile;
        this.estResistantEau = estResistantEau;
        this.appareilPhotoPrincipal = appareilPhotoPrincipal;
        this.aDoubleSIM = aDoubleSIM;
    }

    public String getReseauMobile() {
        return reseauMobile;
    }

    public void setReseauMobile(String reseauMobile) {
        this.reseauMobile = reseauMobile;
    }

    public boolean isEstResistantEau() {
        return estResistantEau;
    }

    public void setEstResistantEau(boolean estResistantEau) {
        this.estResistantEau = estResistantEau;
    }

    public String getAppareilPhotoPrincipal() {
        return appareilPhotoPrincipal;
    }

    public void setAppareilPhotoPrincipal(String appareilPhotoPrincipal) {
        this.appareilPhotoPrincipal = appareilPhotoPrincipal;
    }

    public boolean isaDoubleSIM() {
        return aDoubleSIM;
    }

    public void setaDoubleSIM(boolean aDoubleSIM) {
        this.aDoubleSIM = aDoubleSIM;
    }
}
