package kps.model;

import java.io.Serializable;

/**
 * Created by ramazancesur on 26.08.2017.
 */
public class ParametreModel implements Serializable {
    private int kod;
    private String aciklama;

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }


    @Override
    public String toString() {
        return "ParametreModel{" +
                "kod=" + kod +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }

}
