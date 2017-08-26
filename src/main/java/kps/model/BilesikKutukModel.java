package kps.model;

/**
 * Created by ramazancesur on 26.08.2017.
 */
public class BilesikKutukModel extends BaseModel {
    private long kimlikNo;
    private long tcKimlikNo;
    private String ad;
    private String soyad;
    private TarihModel dogumTarih;

    private long cuzdanTcKimlikNo;
    private String cuzdanAd;
    private String cuzdanSoyad;
    private String seri;
    private int no;

    private long tckkTcKimlikNo;
    private String tckkAd;
    private String tckkSoyad;
    private String tckkSeriNo;

    private long geciciKimlikTcKimlikNo;
    private String geciciKimlikAd;
    private String geciciKimlikSoyad;

    private long maviKartliKimlikNo;
    private String maviKartliAd;
    private String maviKartliSoyad;
    private TarihModel maviKartliDogumTarih;


    private long maviKartKimlikNo;
    private String maviKartAd;
    private String maviKartSoyad;
    private String maviKartSeri;
    private int maviKartNo;

    private long ybKimlikNo;
    private String ybAd;
    private String ybSoyad;
    private TarihModel ybDogumTarih;


    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public TarihModel getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(TarihModel dogumTarih) {
        this.dogumTarih = dogumTarih;
    }

    public long getCuzdanTcKimlikNo() {
        return cuzdanTcKimlikNo;
    }

    public void setCuzdanTcKimlikNo(long cuzdanTcKimlikNo) {
        this.cuzdanTcKimlikNo = cuzdanTcKimlikNo;
    }

    public String getCuzdanAd() {
        return cuzdanAd;
    }

    public void setCuzdanAd(String cuzdanAd) {
        this.cuzdanAd = cuzdanAd;
    }

    public String getCuzdanSoyad() {
        return cuzdanSoyad;
    }

    public void setCuzdanSoyad(String cuzdanSoyad) {
        this.cuzdanSoyad = cuzdanSoyad;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public long getTckkTcKimlikNo() {
        return tckkTcKimlikNo;
    }

    public void setTckkTcKimlikNo(long tckkTcKimlikNo) {
        this.tckkTcKimlikNo = tckkTcKimlikNo;
    }

    public String getTckkAd() {
        return tckkAd;
    }

    public void setTckkAd(String tckkAd) {
        this.tckkAd = tckkAd;
    }

    public String getTckkSoyad() {
        return tckkSoyad;
    }

    public void setTckkSoyad(String tckkSoyad) {
        this.tckkSoyad = tckkSoyad;
    }

    public String getTckkSeriNo() {
        return tckkSeriNo;
    }

    public void setTckkSeriNo(String tckkSeriNo) {
        this.tckkSeriNo = tckkSeriNo;
    }

    public long getGeciciKimlikTcKimlikNo() {
        return geciciKimlikTcKimlikNo;
    }

    public void setGeciciKimlikTcKimlikNo(long geciciKimlikTcKimlikNo) {
        this.geciciKimlikTcKimlikNo = geciciKimlikTcKimlikNo;
    }

    public String getGeciciKimlikAd() {
        return geciciKimlikAd;
    }

    public void setGeciciKimlikAd(String geciciKimlikAd) {
        this.geciciKimlikAd = geciciKimlikAd;
    }

    public String getGeciciKimlikSoyad() {
        return geciciKimlikSoyad;
    }

    public void setGeciciKimlikSoyad(String geciciKimlikSoyad) {
        this.geciciKimlikSoyad = geciciKimlikSoyad;
    }

    public long getMaviKartliKimlikNo() {
        return maviKartliKimlikNo;
    }

    public void setMaviKartliKimlikNo(long maviKartliKimlikNo) {
        this.maviKartliKimlikNo = maviKartliKimlikNo;
    }

    public String getMaviKartliAd() {
        return maviKartliAd;
    }

    public void setMaviKartliAd(String maviKartliAd) {
        this.maviKartliAd = maviKartliAd;
    }

    public String getMaviKartliSoyad() {
        return maviKartliSoyad;
    }

    public void setMaviKartliSoyad(String maviKartliSoyad) {
        this.maviKartliSoyad = maviKartliSoyad;
    }

    public TarihModel getMaviKartliDogumTarih() {
        return maviKartliDogumTarih;
    }

    public void setMaviKartliDogumTarih(TarihModel maviKartliDogumTarih) {
        this.maviKartliDogumTarih = maviKartliDogumTarih;
    }

    public long getMaviKartKimlikNo() {
        return maviKartKimlikNo;
    }

    public void setMaviKartKimlikNo(long maviKartKimlikNo) {
        this.maviKartKimlikNo = maviKartKimlikNo;
    }

    public String getMaviKartAd() {
        return maviKartAd;
    }

    public void setMaviKartAd(String maviKartAd) {
        this.maviKartAd = maviKartAd;
    }

    public String getMaviKartSoyad() {
        return maviKartSoyad;
    }

    public void setMaviKartSoyad(String maviKartSoyad) {
        this.maviKartSoyad = maviKartSoyad;
    }

    public String getMaviKartSeri() {
        return maviKartSeri;
    }

    public void setMaviKartSeri(String maviKartSeri) {
        this.maviKartSeri = maviKartSeri;
    }

    public int getMaviKartNo() {
        return maviKartNo;
    }

    public void setMaviKartNo(int maviKartNo) {
        this.maviKartNo = maviKartNo;
    }

    public long getYbKimlikNo() {
        return ybKimlikNo;
    }

    public void setYbKimlikNo(long ybKimlikNo) {
        this.ybKimlikNo = ybKimlikNo;
    }

    public String getYbAd() {
        return ybAd;
    }

    public void setYbAd(String ybAd) {
        this.ybAd = ybAd;
    }

    public String getYbSoyad() {
        return ybSoyad;
    }

    public void setYbSoyad(String ybSoyad) {
        this.ybSoyad = ybSoyad;
    }

    public TarihModel getYbDogumTarih() {
        return ybDogumTarih;
    }

    public void setYbDogumTarih(TarihModel ybDogumTarih) {
        this.ybDogumTarih = ybDogumTarih;
    }


    @Override
    public String toString() {
        return "BilesikKutukModel{" +
                "kimlikNo=" + kimlikNo +
                ", tcKimlikNo=" + tcKimlikNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumTarih=" + dogumTarih +
                ", cuzdanTcKimlikNo=" + cuzdanTcKimlikNo +
                ", cuzdanAd='" + cuzdanAd + '\'' +
                ", cuzdanSoyad='" + cuzdanSoyad + '\'' +
                ", seri='" + seri + '\'' +
                ", no=" + no +
                ", tckkTcKimlikNo=" + tckkTcKimlikNo +
                ", tckkAd='" + tckkAd + '\'' +
                ", tckkSoyad='" + tckkSoyad + '\'' +
                ", tckkSeriNo='" + tckkSeriNo + '\'' +
                ", geciciKimlikTcKimlikNo=" + geciciKimlikTcKimlikNo +
                ", geciciKimlikAd='" + geciciKimlikAd + '\'' +
                ", geciciKimlikSoyad='" + geciciKimlikSoyad + '\'' +
                ", maviKartliKimlikNo=" + maviKartliKimlikNo +
                ", maviKartliAd='" + maviKartliAd + '\'' +
                ", maviKartliSoyad='" + maviKartliSoyad + '\'' +
                ", maviKartliDogumTarih=" + maviKartliDogumTarih +
                ", maviKartKimlikNo=" + maviKartKimlikNo +
                ", maviKartAd='" + maviKartAd + '\'' +
                ", maviKartSoyad='" + maviKartSoyad + '\'' +
                ", maviKartSeri='" + maviKartSeri + '\'' +
                ", maviKartNo=" + maviKartNo +
                ", ybKimlikNo=" + ybKimlikNo +
                ", ybAd='" + ybAd + '\'' +
                ", ybSoyad='" + ybSoyad + '\'' +
                ", ybDogumTarih=" + ybDogumTarih +
                '}';
    }
}
