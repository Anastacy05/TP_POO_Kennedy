package data;

public class Desktop extends Ordinateur {

    private String alimentation; // "500W", "80+ Gold", etc.
    private String formatCarteMere; // ATX, Micro-ATX, etc.
    private boolean estUpgradable;
    private boolean aRefroidissementLiquide;
    private int slotsPCIe; // Pour cartes additionnelles

    public Desktop(String adresseMAC, String marque, String modele, double poids, double prix, String systemeExploitation, double tailleEcran, int capaciteStockageGo, int RAMGo, int anneeFabrication, boolean estAllume, String processeur, String typeStockage, String carteGraphique, int portsUSB, boolean aWifi, boolean aBluetooth, String alimentation, String formatCarteMere, boolean estUpgradable, boolean aRefroidissementLiquide) {
        super(adresseMAC, marque, modele, poids, prix, systemeExploitation, tailleEcran, capaciteStockageGo, RAMGo, anneeFabrication, estAllume, processeur, typeStockage, carteGraphique, portsUSB, aWifi, aBluetooth);
        this.alimentation = alimentation;
        this.formatCarteMere = formatCarteMere;
        this.estUpgradable = estUpgradable;
        this.aRefroidissementLiquide = aRefroidissementLiquide;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    public String getFormatCarteMere() {
        return formatCarteMere;
    }

    public void setFormatCarteMere(String formatCarteMere) {
        this.formatCarteMere = formatCarteMere;
    }

    public boolean isEstUpgradable() {
        return estUpgradable;
    }

    public void setEstUpgradable(boolean estUpgradable) {
        this.estUpgradable = estUpgradable;
    }

    public boolean isaRefroidissementLiquide() {
        return aRefroidissementLiquide;
    }

    public void setaRefroidissementLiquide(boolean aRefroidissementLiquide) {
        this.aRefroidissementLiquide = aRefroidissementLiquide;
    }

    public int getSlotsPCIe() {
        return slotsPCIe;
    }

    public void setSlotsPCIe(int slotsPCIe) {
        this.slotsPCIe = slotsPCIe;
    }
}
