
package services.kps.bilesikkutuk;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.kps.bilesikkutuk package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _YabanciKisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "YabanciKisiDurumBilgisi");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri");
    private final static QName _YabanciKisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "YabanciKisiBilgisi");
    private final static QName _BilesikKutukSorgulaKimlikNoSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BilesikKutukSorgulaKimlikNoSorguKriteri");
    private final static QName _TCVatandasiKisiKutukleri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCVatandasiKisiKutukleri");
    private final static QName _MaviKartKisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "MaviKartKisiDurumBilgisi");
    private final static QName _MaviKartKisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "MaviKartKisiTemelBilgisi");
    private final static QName _TCGeciciKimlikBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCGeciciKimlikBilgisi");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _YabanciKisiKutukleri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "YabanciKisiKutukleri");
    private final static QName _TCCuzdanBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCCuzdanBilgisi");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _YabanciKisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "YabanciKisiTemelBilgisi");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _MaviKartKisiKutukleri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MaviKartKisiKutukleri");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _TarihBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TarihBilgisi");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _TCKisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TCKisiDurumBilgisi");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _MaviKartKisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MaviKartKisiBilgisi");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfBilesikKutukBilgileri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "ArrayOfBilesikKutukBilgileri");
    private final static QName _TCKKFotoBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKKFotoBilgisi");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _MaviKartBilgi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MaviKartBilgi");
    private final static QName _BilesikKutukBilgileri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BilesikKutukBilgileri");
    private final static QName _TCKisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKisiBilgisi");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _TCKK_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKK");
    private final static QName _Parametre_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Parametre");
    private final static QName _TCKisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TCKisiTemelBilgisi");
    private final static QName _TCKisiKayitYeriBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TCKisiKayitYeriBilgisi");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BilesikKutukBilgileriSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BilesikKutukBilgileriSonucu");
    private final static QName _YabanciKisiBilgisiIzinBitisTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "IzinBitisTarih");
    private final static QName _YabanciKisiBilgisiHataBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "HataBilgisi");
    private final static QName _YabanciKisiBilgisiGercekKisiKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "GercekKisiKimlikNo");
    private final static QName _YabanciKisiBilgisiBabaKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BabaKimlikNo");
    private final static QName _YabanciKisiBilgisiIzinDuzenlenenIl_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "IzinDuzenlenenIl");
    private final static QName _YabanciKisiBilgisiDogumYerKod_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DogumYerKod");
    private final static QName _YabanciKisiBilgisiIzinBaslangicTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "IzinBaslangicTarih");
    private final static QName _YabanciKisiBilgisiAnneKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "AnneKimlikNo");
    private final static QName _YabanciKisiBilgisiEsKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "EsKimlikNo");
    private final static QName _YabanciKisiBilgisiDogumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DogumTarih");
    private final static QName _YabanciKisiBilgisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DurumBilgisi");
    private final static QName _YabanciKisiBilgisiKazanilanTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KazanilanTCKimlikNo");
    private final static QName _YabanciKisiBilgisiBitisTarihiBelirsizOlmaNeden_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BitisTarihiBelirsizOlmaNeden");
    private final static QName _YabanciKisiBilgisiUyruk_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Uyruk");
    private final static QName _YabanciKisiBilgisiKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KimlikNo");
    private final static QName _YabanciKisiBilgisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TemelBilgisi");
    private final static QName _YabanciKisiBilgisiOlumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "OlumTarih");
    private final static QName _YabanciKisiBilgisiIzinNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "IzinNo");
    private final static QName _YabanciKisiBilgisiKaynakBirim_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KaynakBirim");
    private final static QName _TCCuzdanBilgisiVerildigiIlce_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "VerildigiIlce");
    private final static QName _TCCuzdanBilgisiDogumYer_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DogumYer");
    private final static QName _TCCuzdanBilgisiVerilmeTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "VerilmeTarih");
    private final static QName _TCCuzdanBilgisiNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "No");
    private final static QName _TCCuzdanBilgisiAd_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Ad");
    private final static QName _TCCuzdanBilgisiTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKimlikNo");
    private final static QName _TCCuzdanBilgisiBabaAd_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BabaAd");
    private final static QName _TCCuzdanBilgisiSoyad_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Soyad");
    private final static QName _TCCuzdanBilgisiCuzdanVerilmeNeden_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "CuzdanVerilmeNeden");
    private final static QName _TCCuzdanBilgisiCuzdanKayitNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "CuzdanKayitNo");
    private final static QName _TCCuzdanBilgisiAnneAd_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "AnneAd");
    private final static QName _TCCuzdanBilgisiSeri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Seri");
    private final static QName _TCKKFotoBilgisiFotograf_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Fotograf");
    private final static QName _TCKisiTemelBilgisiBabaAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BabaAd");
    private final static QName _TCKisiTemelBilgisiSoyad_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Soyad");
    private final static QName _TCKisiTemelBilgisiCinsiyet_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Cinsiyet");
    private final static QName _TCKisiTemelBilgisiAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ad");
    private final static QName _TCKisiTemelBilgisiDogumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DogumTarih");
    private final static QName _TCKisiTemelBilgisiAnneAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AnneAd");
    private final static QName _TCKisiTemelBilgisiDogumYer_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DogumYer");
    private final static QName _TCKKSonGecerlilikTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "SonGecerlilikTarih");
    private final static QName _TCKKVerenMakam_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "VerenMakam");
    private final static QName _TCKKCinsiyet_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Cinsiyet");
    private final static QName _TCKKKanGrubu_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KanGrubu");
    private final static QName _TCKKSeriNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "SeriNo");
    private final static QName _MaviKartBilgiVerilisNeden_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "VerilisNeden");
    private final static QName _MaviKartBilgiBirim_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Birim");
    private final static QName _MaviKartBilgiKartKayitNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KartKayitNo");
    private final static QName _MaviKartBilgiOncekiSoyad_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "OncekiSoyad");
    private final static QName _MaviKartBilgiMedeniHal_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MedeniHal");
    private final static QName _TCVatandasiKisiKutukleriTCKKFotografBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKKFotografBilgisi");
    private final static QName _TCVatandasiKisiKutukleriNufusCuzdaniBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "NufusCuzdaniBilgisi");
    private final static QName _TCVatandasiKisiKutukleriKisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KisiBilgisi");
    private final static QName _TCVatandasiKisiKutukleriTCKKBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "TCKKBilgisi");
    private final static QName _TCVatandasiKisiKutukleriGeciciKimlikBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "GeciciKimlikBilgisi");
    private final static QName _TCKisiKayitYeriBilgisiIlce_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ilce");
    private final static QName _TCKisiKayitYeriBilgisiBireySiraNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BireySiraNo");
    private final static QName _TCKisiKayitYeriBilgisiIl_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Il");
    private final static QName _TCKisiKayitYeriBilgisiCilt_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Cilt");
    private final static QName _TCKisiKayitYeriBilgisiAileSiraNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AileSiraNo");
    private final static QName _SorgulaKriterListesi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "kriterListesi");
    private final static QName _TCKisiDurumBilgisiDurum_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Durum");
    private final static QName _TCKisiDurumBilgisiMedeniHal_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "MedeniHal");
    private final static QName _TCKisiDurumBilgisiOlumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "OlumTarih");
    private final static QName _TCKisiDurumBilgisiDin_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Din");
    private final static QName _ParametreAciklama_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Aciklama");
    private final static QName _ParametreKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Kod");
    private final static QName _SorgulaResponseSorgulaResult_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "SorgulaResult");
    private final static QName _BilesikKutukBilgileriMaviKartliKisiKutukleri_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MaviKartliKisiKutukleri");
    private final static QName _MaviKartKisiBilgisiEsTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "EsTCKimlikNo");
    private final static QName _MaviKartKisiBilgisiBabaTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BabaTCKimlikNo");
    private final static QName _MaviKartKisiBilgisiUlke_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "Ulke");
    private final static QName _MaviKartKisiBilgisiAnneTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "AnneTCKimlikNo");
    private final static QName _BilesikKutukBilgileriSonucuSorguSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "SorguSonucu");
    private final static QName _TCGeciciKimlikBilgisiDuzenleyenIlce_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DuzenleyenIlce");
    private final static QName _TCGeciciKimlikBilgisiDuzenlenmeTarih_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "DuzenlenmeTarih");
    private final static QName _TCGeciciKimlikBilgisiBelgeNo_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BelgeNo");
    private final static QName _MaviKartKisiKutukleriMaviKartBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "MaviKartBilgisi");
    private final static QName _TarihBilgisiGun_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Gun");
    private final static QName _TarihBilgisiYil_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Yil");
    private final static QName _TarihBilgisiAy_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ay");
    private final static QName _TCKisiBilgisiAnneUstSoyBulunamadi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "AnneUstSoyBulunamadi");
    private final static QName _TCKisiBilgisiKayitYeriBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "KayitYeriBilgisi");
    private final static QName _TCKisiBilgisiBabaUstSoyBulunamadi_QNAME = new QName("http://kps.nvi.gov.tr/2017/08/01", "BabaUstSoyBulunamadi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.kps.bilesikkutuk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TarihBilgisi }
     * 
     */
    public TarihBilgisi createTarihBilgisi() {
        return new TarihBilgisi();
    }

    /**
     * Create an instance of {@link MaviKartKisiTemelBilgisi }
     * 
     */
    public MaviKartKisiTemelBilgisi createMaviKartKisiTemelBilgisi() {
        return new MaviKartKisiTemelBilgisi();
    }

    /**
     * Create an instance of {@link MaviKartKisiDurumBilgisi }
     * 
     */
    public MaviKartKisiDurumBilgisi createMaviKartKisiDurumBilgisi() {
        return new MaviKartKisiDurumBilgisi();
    }

    /**
     * Create an instance of {@link YabanciKisiTemelBilgisi }
     * 
     */
    public YabanciKisiTemelBilgisi createYabanciKisiTemelBilgisi() {
        return new YabanciKisiTemelBilgisi();
    }

    /**
     * Create an instance of {@link TCKisiKayitYeriBilgisi }
     * 
     */
    public TCKisiKayitYeriBilgisi createTCKisiKayitYeriBilgisi() {
        return new TCKisiKayitYeriBilgisi();
    }

    /**
     * Create an instance of {@link TCKisiTemelBilgisi }
     * 
     */
    public TCKisiTemelBilgisi createTCKisiTemelBilgisi() {
        return new TCKisiTemelBilgisi();
    }

    /**
     * Create an instance of {@link YabanciKisiDurumBilgisi }
     * 
     */
    public YabanciKisiDurumBilgisi createYabanciKisiDurumBilgisi() {
        return new YabanciKisiDurumBilgisi();
    }

    /**
     * Create an instance of {@link Parametre }
     * 
     */
    public Parametre createParametre() {
        return new Parametre();
    }

    /**
     * Create an instance of {@link TCKisiDurumBilgisi }
     * 
     */
    public TCKisiDurumBilgisi createTCKisiDurumBilgisi() {
        return new TCKisiDurumBilgisi();
    }

    /**
     * Create an instance of {@link ArrayOfBilesikKutukBilgileri }
     * 
     */
    public ArrayOfBilesikKutukBilgileri createArrayOfBilesikKutukBilgileri() {
        return new ArrayOfBilesikKutukBilgileri();
    }

    /**
     * Create an instance of {@link TCGeciciKimlikBilgisi }
     * 
     */
    public TCGeciciKimlikBilgisi createTCGeciciKimlikBilgisi() {
        return new TCGeciciKimlikBilgisi();
    }

    /**
     * Create an instance of {@link TCKKFotoBilgisi }
     * 
     */
    public TCKKFotoBilgisi createTCKKFotoBilgisi() {
        return new TCKKFotoBilgisi();
    }

    /**
     * Create an instance of {@link MaviKartBilgi }
     * 
     */
    public MaviKartBilgi createMaviKartBilgi() {
        return new MaviKartBilgi();
    }

    /**
     * Create an instance of {@link BilesikKutukBilgileri }
     * 
     */
    public BilesikKutukBilgileri createBilesikKutukBilgileri() {
        return new BilesikKutukBilgileri();
    }

    /**
     * Create an instance of {@link TCKisiBilgisi }
     * 
     */
    public TCKisiBilgisi createTCKisiBilgisi() {
        return new TCKisiBilgisi();
    }

    /**
     * Create an instance of {@link YabanciKisiKutukleri }
     * 
     */
    public YabanciKisiKutukleri createYabanciKisiKutukleri() {
        return new YabanciKisiKutukleri();
    }

    /**
     * Create an instance of {@link TCCuzdanBilgisi }
     * 
     */
    public TCCuzdanBilgisi createTCCuzdanBilgisi() {
        return new TCCuzdanBilgisi();
    }

    /**
     * Create an instance of {@link TCKK }
     * 
     */
    public TCKK createTCKK() {
        return new TCKK();
    }

    /**
     * Create an instance of {@link BilesikKutukBilgileriSonucu }
     * 
     */
    public BilesikKutukBilgileriSonucu createBilesikKutukBilgileriSonucu() {
        return new BilesikKutukBilgileriSonucu();
    }

    /**
     * Create an instance of {@link MaviKartKisiKutukleri }
     * 
     */
    public MaviKartKisiKutukleri createMaviKartKisiKutukleri() {
        return new MaviKartKisiKutukleri();
    }

    /**
     * Create an instance of {@link MaviKartKisiBilgisi }
     * 
     */
    public MaviKartKisiBilgisi createMaviKartKisiBilgisi() {
        return new MaviKartKisiBilgisi();
    }

    /**
     * Create an instance of {@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }
     * 
     */
    public ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri createArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri() {
        return new ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri();
    }

    /**
     * Create an instance of {@link SorgulaResponse }
     * 
     */
    public SorgulaResponse createSorgulaResponse() {
        return new SorgulaResponse();
    }

    /**
     * Create an instance of {@link YabanciKisiBilgisi }
     * 
     */
    public YabanciKisiBilgisi createYabanciKisiBilgisi() {
        return new YabanciKisiBilgisi();
    }

    /**
     * Create an instance of {@link BilesikKutukSorgulaKimlikNoSorguKriteri }
     * 
     */
    public BilesikKutukSorgulaKimlikNoSorguKriteri createBilesikKutukSorgulaKimlikNoSorguKriteri() {
        return new BilesikKutukSorgulaKimlikNoSorguKriteri();
    }

    /**
     * Create an instance of {@link Sorgula }
     * 
     */
    public Sorgula createSorgula() {
        return new Sorgula();
    }

    /**
     * Create an instance of {@link TCVatandasiKisiKutukleri }
     * 
     */
    public TCVatandasiKisiKutukleri createTCVatandasiKisiKutukleri() {
        return new TCVatandasiKisiKutukleri();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "YabanciKisiDurumBilgisi")
    public JAXBElement<YabanciKisiDurumBilgisi> createYabanciKisiDurumBilgisi(YabanciKisiDurumBilgisi value) {
        return new JAXBElement<YabanciKisiDurumBilgisi>(_YabanciKisiDurumBilgisi_QNAME, YabanciKisiDurumBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri")
    public JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> createArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri(ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri value) {
        return new JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri>(_ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri_QNAME, ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "YabanciKisiBilgisi")
    public JAXBElement<YabanciKisiBilgisi> createYabanciKisiBilgisi(YabanciKisiBilgisi value) {
        return new JAXBElement<YabanciKisiBilgisi>(_YabanciKisiBilgisi_QNAME, YabanciKisiBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BilesikKutukSorgulaKimlikNoSorguKriteri")
    public JAXBElement<BilesikKutukSorgulaKimlikNoSorguKriteri> createBilesikKutukSorgulaKimlikNoSorguKriteri(BilesikKutukSorgulaKimlikNoSorguKriteri value) {
        return new JAXBElement<BilesikKutukSorgulaKimlikNoSorguKriteri>(_BilesikKutukSorgulaKimlikNoSorguKriteri_QNAME, BilesikKutukSorgulaKimlikNoSorguKriteri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCVatandasiKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCVatandasiKisiKutukleri")
    public JAXBElement<TCVatandasiKisiKutukleri> createTCVatandasiKisiKutukleri(TCVatandasiKisiKutukleri value) {
        return new JAXBElement<TCVatandasiKisiKutukleri>(_TCVatandasiKisiKutukleri_QNAME, TCVatandasiKisiKutukleri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MaviKartKisiDurumBilgisi")
    public JAXBElement<MaviKartKisiDurumBilgisi> createMaviKartKisiDurumBilgisi(MaviKartKisiDurumBilgisi value) {
        return new JAXBElement<MaviKartKisiDurumBilgisi>(_MaviKartKisiDurumBilgisi_QNAME, MaviKartKisiDurumBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MaviKartKisiTemelBilgisi")
    public JAXBElement<MaviKartKisiTemelBilgisi> createMaviKartKisiTemelBilgisi(MaviKartKisiTemelBilgisi value) {
        return new JAXBElement<MaviKartKisiTemelBilgisi>(_MaviKartKisiTemelBilgisi_QNAME, MaviKartKisiTemelBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCGeciciKimlikBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCGeciciKimlikBilgisi")
    public JAXBElement<TCGeciciKimlikBilgisi> createTCGeciciKimlikBilgisi(TCGeciciKimlikBilgisi value) {
        return new JAXBElement<TCGeciciKimlikBilgisi>(_TCGeciciKimlikBilgisi_QNAME, TCGeciciKimlikBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "YabanciKisiKutukleri")
    public JAXBElement<YabanciKisiKutukleri> createYabanciKisiKutukleri(YabanciKisiKutukleri value) {
        return new JAXBElement<YabanciKisiKutukleri>(_YabanciKisiKutukleri_QNAME, YabanciKisiKutukleri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCCuzdanBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCCuzdanBilgisi")
    public JAXBElement<TCCuzdanBilgisi> createTCCuzdanBilgisi(TCCuzdanBilgisi value) {
        return new JAXBElement<TCCuzdanBilgisi>(_TCCuzdanBilgisi_QNAME, TCCuzdanBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "YabanciKisiTemelBilgisi")
    public JAXBElement<YabanciKisiTemelBilgisi> createYabanciKisiTemelBilgisi(YabanciKisiTemelBilgisi value) {
        return new JAXBElement<YabanciKisiTemelBilgisi>(_YabanciKisiTemelBilgisi_QNAME, YabanciKisiTemelBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MaviKartKisiKutukleri")
    public JAXBElement<MaviKartKisiKutukleri> createMaviKartKisiKutukleri(MaviKartKisiKutukleri value) {
        return new JAXBElement<MaviKartKisiKutukleri>(_MaviKartKisiKutukleri_QNAME, MaviKartKisiKutukleri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TarihBilgisi")
    public JAXBElement<TarihBilgisi> createTarihBilgisi(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TarihBilgisi_QNAME, TarihBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TCKisiDurumBilgisi")
    public JAXBElement<TCKisiDurumBilgisi> createTCKisiDurumBilgisi(TCKisiDurumBilgisi value) {
        return new JAXBElement<TCKisiDurumBilgisi>(_TCKisiDurumBilgisi_QNAME, TCKisiDurumBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MaviKartKisiBilgisi")
    public JAXBElement<MaviKartKisiBilgisi> createMaviKartKisiBilgisi(MaviKartKisiBilgisi value) {
        return new JAXBElement<MaviKartKisiBilgisi>(_MaviKartKisiBilgisi_QNAME, MaviKartKisiBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukBilgileri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "ArrayOfBilesikKutukBilgileri")
    public JAXBElement<ArrayOfBilesikKutukBilgileri> createArrayOfBilesikKutukBilgileri(ArrayOfBilesikKutukBilgileri value) {
        return new JAXBElement<ArrayOfBilesikKutukBilgileri>(_ArrayOfBilesikKutukBilgileri_QNAME, ArrayOfBilesikKutukBilgileri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKKFotoBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKKFotoBilgisi")
    public JAXBElement<TCKKFotoBilgisi> createTCKKFotoBilgisi(TCKKFotoBilgisi value) {
        return new JAXBElement<TCKKFotoBilgisi>(_TCKKFotoBilgisi_QNAME, TCKKFotoBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartBilgi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MaviKartBilgi")
    public JAXBElement<MaviKartBilgi> createMaviKartBilgi(MaviKartBilgi value) {
        return new JAXBElement<MaviKartBilgi>(_MaviKartBilgi_QNAME, MaviKartBilgi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilesikKutukBilgileri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BilesikKutukBilgileri")
    public JAXBElement<BilesikKutukBilgileri> createBilesikKutukBilgileri(BilesikKutukBilgileri value) {
        return new JAXBElement<BilesikKutukBilgileri>(_BilesikKutukBilgileri_QNAME, BilesikKutukBilgileri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKisiBilgisi")
    public JAXBElement<TCKisiBilgisi> createTCKisiBilgisi(TCKisiBilgisi value) {
        return new JAXBElement<TCKisiBilgisi>(_TCKisiBilgisi_QNAME, TCKisiBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKK")
    public JAXBElement<TCKK> createTCKK(TCKK value) {
        return new JAXBElement<TCKK>(_TCKK_QNAME, TCKK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Parametre")
    public JAXBElement<Parametre> createParametre(Parametre value) {
        return new JAXBElement<Parametre>(_Parametre_QNAME, Parametre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TCKisiTemelBilgisi")
    public JAXBElement<TCKisiTemelBilgisi> createTCKisiTemelBilgisi(TCKisiTemelBilgisi value) {
        return new JAXBElement<TCKisiTemelBilgisi>(_TCKisiTemelBilgisi_QNAME, TCKisiTemelBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiKayitYeriBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TCKisiKayitYeriBilgisi")
    public JAXBElement<TCKisiKayitYeriBilgisi> createTCKisiKayitYeriBilgisi(TCKisiKayitYeriBilgisi value) {
        return new JAXBElement<TCKisiKayitYeriBilgisi>(_TCKisiKayitYeriBilgisi_QNAME, TCKisiKayitYeriBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BilesikKutukBilgileriSonucu")
    public JAXBElement<BilesikKutukBilgileriSonucu> createBilesikKutukBilgileriSonucu(BilesikKutukBilgileriSonucu value) {
        return new JAXBElement<BilesikKutukBilgileriSonucu>(_BilesikKutukBilgileriSonucu_QNAME, BilesikKutukBilgileriSonucu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "IzinBitisTarih", scope = YabanciKisiBilgisi.class)
    public JAXBElement<XMLGregorianCalendar> createYabanciKisiBilgisiIzinBitisTarih(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YabanciKisiBilgisiIzinBitisTarih_QNAME, XMLGregorianCalendar.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "GercekKisiKimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiGercekKisiKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiGercekKisiKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaKimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiBabaKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiBabaKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "IzinDuzenlenenIl", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiBilgisiIzinDuzenlenenIl(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiIzinDuzenlenenIl_QNAME, Parametre.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYerKod", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Integer> createYabanciKisiBilgisiDogumYerKod(Integer value) {
        return new JAXBElement<Integer>(_YabanciKisiBilgisiDogumYerKod_QNAME, Integer.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "IzinBaslangicTarih", scope = YabanciKisiBilgisi.class)
    public JAXBElement<XMLGregorianCalendar> createYabanciKisiBilgisiIzinBaslangicTarih(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YabanciKisiBilgisiIzinBaslangicTarih_QNAME, XMLGregorianCalendar.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneKimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiAnneKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiAnneKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "EsKimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiEsKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiEsKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumTarih", scope = YabanciKisiBilgisi.class)
    public JAXBElement<TarihBilgisi> createYabanciKisiBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiDogumTarih_QNAME, TarihBilgisi.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DurumBilgisi", scope = YabanciKisiBilgisi.class)
    public JAXBElement<YabanciKisiDurumBilgisi> createYabanciKisiBilgisiDurumBilgisi(YabanciKisiDurumBilgisi value) {
        return new JAXBElement<YabanciKisiDurumBilgisi>(_YabanciKisiBilgisiDurumBilgisi_QNAME, YabanciKisiDurumBilgisi.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KazanilanTCKimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiKazanilanTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKazanilanTCKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BitisTarihiBelirsizOlmaNeden", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiBilgisiBitisTarihiBelirsizOlmaNeden(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiBitisTarihiBelirsizOlmaNeden_QNAME, Parametre.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Uyruk", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiBilgisiUyruk(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiUyruk_QNAME, Parametre.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KimlikNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Long> createYabanciKisiBilgisiKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKimlikNo_QNAME, Long.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TemelBilgisi", scope = YabanciKisiBilgisi.class)
    public JAXBElement<YabanciKisiTemelBilgisi> createYabanciKisiBilgisiTemelBilgisi(YabanciKisiTemelBilgisi value) {
        return new JAXBElement<YabanciKisiTemelBilgisi>(_YabanciKisiBilgisiTemelBilgisi_QNAME, YabanciKisiTemelBilgisi.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "OlumTarih", scope = YabanciKisiBilgisi.class)
    public JAXBElement<TarihBilgisi> createYabanciKisiBilgisiOlumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiOlumTarih_QNAME, TarihBilgisi.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "IzinNo", scope = YabanciKisiBilgisi.class)
    public JAXBElement<String> createYabanciKisiBilgisiIzinNo(String value) {
        return new JAXBElement<String>(_YabanciKisiBilgisiIzinNo_QNAME, String.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KaynakBirim", scope = YabanciKisiBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiBilgisiKaynakBirim(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiKaynakBirim_QNAME, Parametre.class, YabanciKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Parametre> createTCCuzdanBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "VerildigiIlce", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Parametre> createTCCuzdanBilgisiVerildigiIlce(Parametre value) {
        return new JAXBElement<Parametre>(_TCCuzdanBilgisiVerildigiIlce_QNAME, Parametre.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYer", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiDogumYer(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiDogumYer_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "VerilmeTarih", scope = TCCuzdanBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCCuzdanBilgisiVerilmeTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCCuzdanBilgisiVerilmeTarih_QNAME, TarihBilgisi.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumTarih", scope = TCCuzdanBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCCuzdanBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiDogumTarih_QNAME, TarihBilgisi.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "No", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Integer> createTCCuzdanBilgisiNo(Integer value) {
        return new JAXBElement<Integer>(_TCCuzdanBilgisiNo_QNAME, Integer.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Ad", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAd_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKimlikNo", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Long> createTCCuzdanBilgisiTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiTCKimlikNo_QNAME, Long.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaAd", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiBabaAd_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Soyad", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiSoyad(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSoyad_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "CuzdanVerilmeNeden", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Parametre> createTCCuzdanBilgisiCuzdanVerilmeNeden(Parametre value) {
        return new JAXBElement<Parametre>(_TCCuzdanBilgisiCuzdanVerilmeNeden_QNAME, Parametre.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "CuzdanKayitNo", scope = TCCuzdanBilgisi.class)
    public JAXBElement<Long> createTCCuzdanBilgisiCuzdanKayitNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiCuzdanKayitNo_QNAME, Long.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneAd", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAnneAd_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Seri", scope = TCCuzdanBilgisi.class)
    public JAXBElement<String> createTCCuzdanBilgisiSeri(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSeri_QNAME, String.class, TCCuzdanBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Fotograf", scope = TCKKFotoBilgisi.class)
    public JAXBElement<byte[]> createTCKKFotoBilgisiFotograf(byte[] value) {
        return new JAXBElement<byte[]>(_TCKKFotoBilgisiFotograf_QNAME, byte[].class, TCKKFotoBilgisi.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCKKFotoBilgisi.class)
    public JAXBElement<Parametre> createTCKKFotoBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCKKFotoBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKimlikNo", scope = TCKKFotoBilgisi.class)
    public JAXBElement<Long> createTCKKFotoBilgisiTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiTCKimlikNo_QNAME, Long.class, TCKKFotoBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BabaAd", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<String> createTCKisiTemelBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiBabaAd_QNAME, String.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Soyad", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<String> createTCKisiTemelBilgisiSoyad(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiSoyad_QNAME, String.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cinsiyet", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<Parametre> createTCKisiTemelBilgisiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiTemelBilgisiCinsiyet_QNAME, Parametre.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<String> createTCKisiTemelBilgisiAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAd_QNAME, String.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumTarih", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCKisiTemelBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKisiTemelBilgisiDogumTarih_QNAME, TarihBilgisi.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AnneAd", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<String> createTCKisiTemelBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAnneAd_QNAME, String.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumYer", scope = TCKisiTemelBilgisi.class)
    public JAXBElement<String> createTCKisiTemelBilgisiDogumYer(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiDogumYer_QNAME, String.class, TCKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "SonGecerlilikTarih", scope = TCKK.class)
    public JAXBElement<TarihBilgisi> createTCKKSonGecerlilikTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKKSonGecerlilikTarih_QNAME, TarihBilgisi.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "VerenMakam", scope = TCKK.class)
    public JAXBElement<String> createTCKKVerenMakam(String value) {
        return new JAXBElement<String>(_TCKKVerenMakam_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Cinsiyet", scope = TCKK.class)
    public JAXBElement<Parametre> createTCKKCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKKCinsiyet_QNAME, Parametre.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KanGrubu", scope = TCKK.class)
    public JAXBElement<Parametre> createTCKKKanGrubu(Parametre value) {
        return new JAXBElement<Parametre>(_TCKKKanGrubu_QNAME, Parametre.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Ad", scope = TCKK.class)
    public JAXBElement<String> createTCKKAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAd_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCKK.class)
    public JAXBElement<Parametre> createTCKKHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKimlikNo", scope = TCKK.class)
    public JAXBElement<Long> createTCKKTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiTCKimlikNo_QNAME, Long.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaAd", scope = TCKK.class)
    public JAXBElement<String> createTCKKBabaAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiBabaAd_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Soyad", scope = TCKK.class)
    public JAXBElement<String> createTCKKSoyad(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSoyad_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneAd", scope = TCKK.class)
    public JAXBElement<String> createTCKKAnneAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAnneAd_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "SeriNo", scope = TCKK.class)
    public JAXBElement<String> createTCKKSeriNo(String value) {
        return new JAXBElement<String>(_TCKKSeriNo_QNAME, String.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumTarih", scope = TCKK.class)
    public JAXBElement<TarihBilgisi> createTCKKDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiDogumTarih_QNAME, TarihBilgisi.class, TCKK.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BabaAd", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<String> createYabanciKisiTemelBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiBabaAd_QNAME, String.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Soyad", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<String> createYabanciKisiTemelBilgisiSoyad(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiSoyad_QNAME, String.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cinsiyet", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiTemelBilgisiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiTemelBilgisiCinsiyet_QNAME, Parametre.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<String> createYabanciKisiTemelBilgisiAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAd_QNAME, String.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AnneAd", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<String> createYabanciKisiTemelBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAnneAd_QNAME, String.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumYer", scope = YabanciKisiTemelBilgisi.class)
    public JAXBElement<String> createYabanciKisiTemelBilgisiDogumYer(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiDogumYer_QNAME, String.class, YabanciKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Cinsiyet", scope = MaviKartBilgi.class)
    public JAXBElement<Parametre> createMaviKartBilgiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKKCinsiyet_QNAME, Parametre.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = MaviKartBilgi.class)
    public JAXBElement<Parametre> createMaviKartBilgiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "VerilisNeden", scope = MaviKartBilgi.class)
    public JAXBElement<Parametre> createMaviKartBilgiVerilisNeden(Parametre value) {
        return new JAXBElement<Parametre>(_MaviKartBilgiVerilisNeden_QNAME, Parametre.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYer", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiDogumYer(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiDogumYer_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYerKod", scope = MaviKartBilgi.class)
    public JAXBElement<Integer> createMaviKartBilgiDogumYerKod(Integer value) {
        return new JAXBElement<Integer>(_YabanciKisiBilgisiDogumYerKod_QNAME, Integer.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Birim", scope = MaviKartBilgi.class)
    public JAXBElement<Integer> createMaviKartBilgiBirim(Integer value) {
        return new JAXBElement<Integer>(_MaviKartBilgiBirim_QNAME, Integer.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KartKayitNo", scope = MaviKartBilgi.class)
    public JAXBElement<Long> createMaviKartBilgiKartKayitNo(Long value) {
        return new JAXBElement<Long>(_MaviKartBilgiKartKayitNo_QNAME, Long.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "OncekiSoyad", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiOncekiSoyad(String value) {
        return new JAXBElement<String>(_MaviKartBilgiOncekiSoyad_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "VerilmeTarih", scope = MaviKartBilgi.class)
    public JAXBElement<TarihBilgisi> createMaviKartBilgiVerilmeTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCCuzdanBilgisiVerilmeTarih_QNAME, TarihBilgisi.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumTarih", scope = MaviKartBilgi.class)
    public JAXBElement<TarihBilgisi> createMaviKartBilgiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiDogumTarih_QNAME, TarihBilgisi.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "No", scope = MaviKartBilgi.class)
    public JAXBElement<Integer> createMaviKartBilgiNo(Integer value) {
        return new JAXBElement<Integer>(_TCCuzdanBilgisiNo_QNAME, Integer.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Uyruk", scope = MaviKartBilgi.class)
    public JAXBElement<Parametre> createMaviKartBilgiUyruk(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiUyruk_QNAME, Parametre.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Ad", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAd_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaAd", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiBabaAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiBabaAd_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Soyad", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiSoyad(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSoyad_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KimlikNo", scope = MaviKartBilgi.class)
    public JAXBElement<Long> createMaviKartBilgiKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKimlikNo_QNAME, Long.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneAd", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiAnneAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAnneAd_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MedeniHal", scope = MaviKartBilgi.class)
    public JAXBElement<Parametre> createMaviKartBilgiMedeniHal(Parametre value) {
        return new JAXBElement<Parametre>(_MaviKartBilgiMedeniHal_QNAME, Parametre.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Seri", scope = MaviKartBilgi.class)
    public JAXBElement<String> createMaviKartBilgiSeri(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSeri_QNAME, String.class, MaviKartBilgi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<Parametre> createTCVatandasiKisiKutukleriHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKKFotoBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKKFotografBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<TCKKFotoBilgisi> createTCVatandasiKisiKutukleriTCKKFotografBilgisi(TCKKFotoBilgisi value) {
        return new JAXBElement<TCKKFotoBilgisi>(_TCVatandasiKisiKutukleriTCKKFotografBilgisi_QNAME, TCKKFotoBilgisi.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCCuzdanBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "NufusCuzdaniBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<TCCuzdanBilgisi> createTCVatandasiKisiKutukleriNufusCuzdaniBilgisi(TCCuzdanBilgisi value) {
        return new JAXBElement<TCCuzdanBilgisi>(_TCVatandasiKisiKutukleriNufusCuzdaniBilgisi_QNAME, TCCuzdanBilgisi.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KisiBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<TCKisiBilgisi> createTCVatandasiKisiKutukleriKisiBilgisi(TCKisiBilgisi value) {
        return new JAXBElement<TCKisiBilgisi>(_TCVatandasiKisiKutukleriKisiBilgisi_QNAME, TCKisiBilgisi.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKKBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<TCKK> createTCVatandasiKisiKutukleriTCKKBilgisi(TCKK value) {
        return new JAXBElement<TCKK>(_TCVatandasiKisiKutukleriTCKKBilgisi_QNAME, TCKK.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCGeciciKimlikBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "GeciciKimlikBilgisi", scope = TCVatandasiKisiKutukleri.class)
    public JAXBElement<TCGeciciKimlikBilgisi> createTCVatandasiKisiKutukleriGeciciKimlikBilgisi(TCGeciciKimlikBilgisi value) {
        return new JAXBElement<TCGeciciKimlikBilgisi>(_TCVatandasiKisiKutukleriGeciciKimlikBilgisi_QNAME, TCGeciciKimlikBilgisi.class, TCVatandasiKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ilce", scope = TCKisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createTCKisiKayitYeriBilgisiIlce(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiKayitYeriBilgisiIlce_QNAME, Parametre.class, TCKisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BireySiraNo", scope = TCKisiKayitYeriBilgisi.class)
    public JAXBElement<Integer> createTCKisiKayitYeriBilgisiBireySiraNo(Integer value) {
        return new JAXBElement<Integer>(_TCKisiKayitYeriBilgisiBireySiraNo_QNAME, Integer.class, TCKisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Il", scope = TCKisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createTCKisiKayitYeriBilgisiIl(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiKayitYeriBilgisiIl_QNAME, Parametre.class, TCKisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cilt", scope = TCKisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createTCKisiKayitYeriBilgisiCilt(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiKayitYeriBilgisiCilt_QNAME, Parametre.class, TCKisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AileSiraNo", scope = TCKisiKayitYeriBilgisi.class)
    public JAXBElement<Integer> createTCKisiKayitYeriBilgisiAileSiraNo(Integer value) {
        return new JAXBElement<Integer>(_TCKisiKayitYeriBilgisiAileSiraNo_QNAME, Integer.class, TCKisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "kriterListesi", scope = Sorgula.class)
    public JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri> createSorgulaKriterListesi(ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri value) {
        return new JAXBElement<ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri>(_SorgulaKriterListesi_QNAME, ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri.class, Sorgula.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Durum", scope = TCKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createTCKisiDurumBilgisiDurum(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiDurum_QNAME, Parametre.class, TCKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MedeniHal", scope = TCKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createTCKisiDurumBilgisiMedeniHal(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiMedeniHal_QNAME, Parametre.class, TCKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "OlumTarih", scope = TCKisiDurumBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCKisiDurumBilgisiOlumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKisiDurumBilgisiOlumTarih_QNAME, TarihBilgisi.class, TCKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Din", scope = TCKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createTCKisiDurumBilgisiDin(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiDin_QNAME, Parametre.class, TCKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Aciklama", scope = Parametre.class)
    public JAXBElement<String> createParametreAciklama(String value) {
        return new JAXBElement<String>(_ParametreAciklama_QNAME, String.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Kod", scope = Parametre.class)
    public JAXBElement<Integer> createParametreKod(Integer value) {
        return new JAXBElement<Integer>(_ParametreKod_QNAME, Integer.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = YabanciKisiKutukleri.class)
    public JAXBElement<Parametre> createYabanciKisiKutukleriHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, YabanciKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KisiBilgisi", scope = YabanciKisiKutukleri.class)
    public JAXBElement<YabanciKisiBilgisi> createYabanciKisiKutukleriKisiBilgisi(YabanciKisiBilgisi value) {
        return new JAXBElement<YabanciKisiBilgisi>(_TCVatandasiKisiKutukleriKisiBilgisi_QNAME, YabanciKisiBilgisi.class, YabanciKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilesikKutukBilgileriSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "SorgulaResult", scope = SorgulaResponse.class)
    public JAXBElement<BilesikKutukBilgileriSonucu> createSorgulaResponseSorgulaResult(BilesikKutukBilgileriSonucu value) {
        return new JAXBElement<BilesikKutukBilgileriSonucu>(_SorgulaResponseSorgulaResult_QNAME, BilesikKutukBilgileriSonucu.class, SorgulaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Durum", scope = YabanciKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiDurumBilgisiDurum(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiDurum_QNAME, Parametre.class, YabanciKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MedeniHal", scope = YabanciKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createYabanciKisiDurumBilgisiMedeniHal(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiMedeniHal_QNAME, Parametre.class, YabanciKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MaviKartliKisiKutukleri", scope = BilesikKutukBilgileri.class)
    public JAXBElement<MaviKartKisiKutukleri> createBilesikKutukBilgileriMaviKartliKisiKutukleri(MaviKartKisiKutukleri value) {
        return new JAXBElement<MaviKartKisiKutukleri>(_BilesikKutukBilgileriMaviKartliKisiKutukleri_QNAME, MaviKartKisiKutukleri.class, BilesikKutukBilgileri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = BilesikKutukBilgileri.class)
    public JAXBElement<Parametre> createBilesikKutukBilgileriHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, BilesikKutukBilgileri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YabanciKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "YabanciKisiKutukleri", scope = BilesikKutukBilgileri.class)
    public JAXBElement<YabanciKisiKutukleri> createBilesikKutukBilgileriYabanciKisiKutukleri(YabanciKisiKutukleri value) {
        return new JAXBElement<YabanciKisiKutukleri>(_YabanciKisiKutukleri_QNAME, YabanciKisiKutukleri.class, BilesikKutukBilgileri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KimlikNo", scope = BilesikKutukBilgileri.class)
    public JAXBElement<Long> createBilesikKutukBilgileriKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKimlikNo_QNAME, Long.class, BilesikKutukBilgileri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCVatandasiKisiKutukleri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCVatandasiKisiKutukleri", scope = BilesikKutukBilgileri.class)
    public JAXBElement<TCVatandasiKisiKutukleri> createBilesikKutukBilgileriTCVatandasiKisiKutukleri(TCVatandasiKisiKutukleri value) {
        return new JAXBElement<TCVatandasiKisiKutukleri>(_TCVatandasiKisiKutukleri_QNAME, TCVatandasiKisiKutukleri.class, BilesikKutukBilgileri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BabaAd", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<String> createMaviKartKisiTemelBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiBabaAd_QNAME, String.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Soyad", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<String> createMaviKartKisiTemelBilgisiSoyad(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiSoyad_QNAME, String.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cinsiyet", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<Parametre> createMaviKartKisiTemelBilgisiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiTemelBilgisiCinsiyet_QNAME, Parametre.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<String> createMaviKartKisiTemelBilgisiAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAd_QNAME, String.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumTarih", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<TarihBilgisi> createMaviKartKisiTemelBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKisiTemelBilgisiDogumTarih_QNAME, TarihBilgisi.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AnneAd", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<String> createMaviKartKisiTemelBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiAnneAd_QNAME, String.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumYer", scope = MaviKartKisiTemelBilgisi.class)
    public JAXBElement<String> createMaviKartKisiTemelBilgisiDogumYer(String value) {
        return new JAXBElement<String>(_TCKisiTemelBilgisiDogumYer_QNAME, String.class, MaviKartKisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KazanilanTCKimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiKazanilanTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKazanilanTCKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Parametre> createMaviKartKisiBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "EsTCKimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiEsTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiEsTCKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaTCKimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiBabaTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiBabaTCKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "GercekKisiKimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiGercekKisiKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiGercekKisiKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TemelBilgisi", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<MaviKartKisiTemelBilgisi> createMaviKartKisiBilgisiTemelBilgisi(MaviKartKisiTemelBilgisi value) {
        return new JAXBElement<MaviKartKisiTemelBilgisi>(_YabanciKisiBilgisiTemelBilgisi_QNAME, MaviKartKisiTemelBilgisi.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Ulke", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Parametre> createMaviKartKisiBilgisiUlke(Parametre value) {
        return new JAXBElement<Parametre>(_MaviKartKisiBilgisiUlke_QNAME, Parametre.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYerKod", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Integer> createMaviKartKisiBilgisiDogumYerKod(Integer value) {
        return new JAXBElement<Integer>(_YabanciKisiBilgisiDogumYerKod_QNAME, Integer.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneTCKimlikNo", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<Long> createMaviKartKisiBilgisiAnneTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiAnneTCKimlikNo_QNAME, Long.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DurumBilgisi", scope = MaviKartKisiBilgisi.class)
    public JAXBElement<MaviKartKisiDurumBilgisi> createMaviKartKisiBilgisiDurumBilgisi(MaviKartKisiDurumBilgisi value) {
        return new JAXBElement<MaviKartKisiDurumBilgisi>(_YabanciKisiBilgisiDurumBilgisi_QNAME, MaviKartKisiDurumBilgisi.class, MaviKartKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBilesikKutukBilgileri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "SorguSonucu", scope = BilesikKutukBilgileriSonucu.class)
    public JAXBElement<ArrayOfBilesikKutukBilgileri> createBilesikKutukBilgileriSonucuSorguSonucu(ArrayOfBilesikKutukBilgileri value) {
        return new JAXBElement<ArrayOfBilesikKutukBilgileri>(_BilesikKutukBilgileriSonucuSorguSonucu_QNAME, ArrayOfBilesikKutukBilgileri.class, BilesikKutukBilgileriSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = BilesikKutukBilgileriSonucu.class)
    public JAXBElement<Parametre> createBilesikKutukBilgileriSonucuHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, BilesikKutukBilgileriSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Cinsiyet", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<Parametre> createTCGeciciKimlikBilgisiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_TCKKCinsiyet_QNAME, Parametre.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DuzenleyenIlce", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<Parametre> createTCGeciciKimlikBilgisiDuzenleyenIlce(Parametre value) {
        return new JAXBElement<Parametre>(_TCGeciciKimlikBilgisiDuzenleyenIlce_QNAME, Parametre.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<Parametre> createTCGeciciKimlikBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DuzenlenmeTarih", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCGeciciKimlikBilgisiDuzenlenmeTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCGeciciKimlikBilgisiDuzenlenmeTarih_QNAME, TarihBilgisi.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "OncekiSoyad", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiOncekiSoyad(String value) {
        return new JAXBElement<String>(_MaviKartBilgiOncekiSoyad_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BelgeNo", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiBelgeNo(String value) {
        return new JAXBElement<String>(_TCGeciciKimlikBilgisiBelgeNo_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumTarih", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCGeciciKimlikBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_YabanciKisiBilgisiDogumTarih_QNAME, TarihBilgisi.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "SonGecerlilikTarih", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<TarihBilgisi> createTCGeciciKimlikBilgisiSonGecerlilikTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKKSonGecerlilikTarih_QNAME, TarihBilgisi.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KanGrubu", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<Parametre> createTCGeciciKimlikBilgisiKanGrubu(Parametre value) {
        return new JAXBElement<Parametre>(_TCKKKanGrubu_QNAME, Parametre.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Ad", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAd_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKimlikNo", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<Long> createTCGeciciKimlikBilgisiTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiTCKimlikNo_QNAME, Long.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaAd", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiBabaAd_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "Soyad", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiSoyad(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiSoyad_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneAd", scope = TCGeciciKimlikBilgisi.class)
    public JAXBElement<String> createTCGeciciKimlikBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_TCCuzdanBilgisiAnneAd_QNAME, String.class, TCGeciciKimlikBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KimlikNo", scope = BilesikKutukSorgulaKimlikNoSorguKriteri.class)
    public JAXBElement<Long> createBilesikKutukSorgulaKimlikNoSorguKriteriKimlikNo(Long value) {
        return new JAXBElement<Long>(_YabanciKisiBilgisiKimlikNo_QNAME, Long.class, BilesikKutukSorgulaKimlikNoSorguKriteri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = MaviKartKisiKutukleri.class)
    public JAXBElement<Parametre> createMaviKartKisiKutukleriHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, MaviKartKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartBilgi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "MaviKartBilgisi", scope = MaviKartKisiKutukleri.class)
    public JAXBElement<MaviKartBilgi> createMaviKartKisiKutukleriMaviKartBilgisi(MaviKartBilgi value) {
        return new JAXBElement<MaviKartBilgi>(_MaviKartKisiKutukleriMaviKartBilgisi_QNAME, MaviKartBilgi.class, MaviKartKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaviKartKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KisiBilgisi", scope = MaviKartKisiKutukleri.class)
    public JAXBElement<MaviKartKisiBilgisi> createMaviKartKisiKutukleriKisiBilgisi(MaviKartKisiBilgisi value) {
        return new JAXBElement<MaviKartKisiBilgisi>(_TCVatandasiKisiKutukleriKisiBilgisi_QNAME, MaviKartKisiBilgisi.class, MaviKartKisiKutukleri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Gun", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiGun(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiGun_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Yil", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiYil(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiYil_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ay", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiAy(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiAy_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Durum", scope = MaviKartKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createMaviKartKisiDurumBilgisiDurum(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiDurum_QNAME, Parametre.class, MaviKartKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MedeniHal", scope = MaviKartKisiDurumBilgisi.class)
    public JAXBElement<Parametre> createMaviKartKisiDurumBilgisiMedeniHal(Parametre value) {
        return new JAXBElement<Parametre>(_TCKisiDurumBilgisiMedeniHal_QNAME, Parametre.class, MaviKartKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "OlumTarih", scope = MaviKartKisiDurumBilgisi.class)
    public JAXBElement<TarihBilgisi> createMaviKartKisiDurumBilgisiOlumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TCKisiDurumBilgisiOlumTarih_QNAME, TarihBilgisi.class, MaviKartKisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "HataBilgisi", scope = TCKisiBilgisi.class)
    public JAXBElement<Parametre> createTCKisiBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_YabanciKisiBilgisiHataBilgisi_QNAME, Parametre.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TCKimlikNo", scope = TCKisiBilgisi.class)
    public JAXBElement<Long> createTCKisiBilgisiTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_TCCuzdanBilgisiTCKimlikNo_QNAME, Long.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneUstSoyBulunamadi", scope = TCKisiBilgisi.class)
    public JAXBElement<Boolean> createTCKisiBilgisiAnneUstSoyBulunamadi(Boolean value) {
        return new JAXBElement<Boolean>(_TCKisiBilgisiAnneUstSoyBulunamadi_QNAME, Boolean.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "EsTCKimlikNo", scope = TCKisiBilgisi.class)
    public JAXBElement<Long> createTCKisiBilgisiEsTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiEsTCKimlikNo_QNAME, Long.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaTCKimlikNo", scope = TCKisiBilgisi.class)
    public JAXBElement<Long> createTCKisiBilgisiBabaTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiBabaTCKimlikNo_QNAME, Long.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiKayitYeriBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "KayitYeriBilgisi", scope = TCKisiBilgisi.class)
    public JAXBElement<TCKisiKayitYeriBilgisi> createTCKisiBilgisiKayitYeriBilgisi(TCKisiKayitYeriBilgisi value) {
        return new JAXBElement<TCKisiKayitYeriBilgisi>(_TCKisiBilgisiKayitYeriBilgisi_QNAME, TCKisiKayitYeriBilgisi.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "TemelBilgisi", scope = TCKisiBilgisi.class)
    public JAXBElement<TCKisiTemelBilgisi> createTCKisiBilgisiTemelBilgisi(TCKisiTemelBilgisi value) {
        return new JAXBElement<TCKisiTemelBilgisi>(_YabanciKisiBilgisiTemelBilgisi_QNAME, TCKisiTemelBilgisi.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DogumYerKod", scope = TCKisiBilgisi.class)
    public JAXBElement<Integer> createTCKisiBilgisiDogumYerKod(Integer value) {
        return new JAXBElement<Integer>(_YabanciKisiBilgisiDogumYerKod_QNAME, Integer.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "AnneTCKimlikNo", scope = TCKisiBilgisi.class)
    public JAXBElement<Long> createTCKisiBilgisiAnneTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_MaviKartKisiBilgisiAnneTCKimlikNo_QNAME, Long.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "BabaUstSoyBulunamadi", scope = TCKisiBilgisi.class)
    public JAXBElement<Boolean> createTCKisiBilgisiBabaUstSoyBulunamadi(Boolean value) {
        return new JAXBElement<Boolean>(_TCKisiBilgisiBabaUstSoyBulunamadi_QNAME, Boolean.class, TCKisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCKisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2017/08/01", name = "DurumBilgisi", scope = TCKisiBilgisi.class)
    public JAXBElement<TCKisiDurumBilgisi> createTCKisiBilgisiDurumBilgisi(TCKisiDurumBilgisi value) {
        return new JAXBElement<TCKisiDurumBilgisi>(_YabanciKisiBilgisiDurumBilgisi_QNAME, TCKisiDurumBilgisi.class, TCKisiBilgisi.class, value);
    }

}
