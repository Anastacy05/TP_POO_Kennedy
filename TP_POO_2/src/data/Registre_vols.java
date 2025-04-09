package data;

import java.util.ArrayList;

public class Registre_vols extends ArrayList<Vol> {

    public Registre_vols() { super(); }

    public void declarerVol(Vol vol) {
        this.add(vol);
    }

    public boolean estVole(Appareil appareil) {
        if (!this.isEmpty()) {
            for (Vol vol : this) {
                if (vol.getAppareil().getAdresseMAC().equals(appareil.getAdresseMAC())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean restituer(Appareil appareil, String proprio) {
        if (!this.isEmpty()) {
            for (Vol vol : this) {
                if (vol.getAppareil().getAdresseMAC().equals(appareil.getAdresseMAC()) && vol.getProprio().equals(proprio)) {
                    this.remove(vol);
                    return true;
                }
            }
        }
        return false;
    }

}
