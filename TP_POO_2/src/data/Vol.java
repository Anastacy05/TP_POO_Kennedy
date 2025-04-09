package data;

import java.sql.Date;

public class Vol {

    public Vol (Appareil appareil, String proprio, String numTel, Date date_vol) {
        this.appareil = appareil;
        this.proprio = proprio;
        this.numTel = numTel;
        this.date_vol = date_vol;
    }

    private Appareil appareil;
    private String proprio;
    private String numTel;
    private Date date_vol;

    public Appareil getAppareil() {
        return appareil;
    }

    public void setAppareil(Appareil appareil) {
        this.appareil = appareil;
    }

    public String getProprio() {
        return proprio;
    }

    public void setProprio(String proprio) {
        this.proprio = proprio;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Date getDate_vol() {
        return date_vol;
    }

    public void setDate_vol(Date date_vol) {
        this.date_vol = date_vol;
    }
}
