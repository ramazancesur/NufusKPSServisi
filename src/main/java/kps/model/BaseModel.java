package kps.model;

import java.io.Serializable;

/**
 * Created by ramazancesur on 26.08.2017.
 */
public class BaseModel implements Serializable {
    private ParametreModel hata;

    public ParametreModel getHata() {
        return hata;
    }

    public void setHata(ParametreModel hata) {
        this.hata = hata;
    }

    public boolean hasHata() {
        return hata != null;
    }
}

