package kps.test;

import kps.handler.NviStsHandler;
import kps.model.BilesikKutukModel;
import services.kps.bilesikkutuk.*;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class BilesikKutukTest {

    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactory();

        ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri kriterListesi = factory.createArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri();


        BilesikKutukSorgulaKimlikNoSorguKriteri kriter = factory.createBilesikKutukSorgulaKimlikNoSorguKriteri();
        kriter.setKimlikNo(factory.createBilesikKutukBilgileriKimlikNo(46522904754l));

        kriterListesi.getBilesikKutukSorgulaKimlikNoSorguKriteri().add(kriter);

        BilesikKutukSorgulaKimlikNoServis_Service service = new BilesikKutukSorgulaKimlikNoServis_Service();

        final NviStsHandler kpsHandler = new NviStsHandler();

        service.setHandlerResolver(new HandlerResolver() {
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(kpsHandler);
                return handlerList;
            }
        });
        BilesikKutukSorgulaKimlikNoServis servis = service.getCustomBindingBilesikKutukSorgulaKimlikNoServis(new javax.xml.ws.soap.AddressingFeature());


        BilesikKutukBilgileriSonucu sonuc = servis.sorgula(kriterListesi);

        Parametre parametre= sonuc.getHataBilgisi().getValue();

        if(parametre!=null)
        {
            System.out.println(parametre.getAciklama().getValue());
        }
        else{
           List<BilesikKutukBilgileri> lstBilgi= sonuc.getSorguSonucu().getValue().getBilesikKutukBilgileri();
            for (BilesikKutukBilgileri kutukBilgisi:lstBilgi){
                BilesikKutukModel model= (BilesikKutukModel)(Object) kutukBilgisi;
                System.out.println(model.toString());
            }

        }

    }

}
