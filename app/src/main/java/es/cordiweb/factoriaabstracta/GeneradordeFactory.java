package es.cordiweb.factoriaabstracta;

/**
 * Created by DAVID on 07/11/2017.
 */

public class GeneradordeFactory {

    public static AbstractFactory getFactory(String tipofactory){
        if (tipofactory == null)
            return null;
        if (tipofactory == "PAN") {
            return new Panfactoria();
        } else if (tipofactory == "REL"){
            return new Rellenofactory();
        }
        return  null;
    }

}
