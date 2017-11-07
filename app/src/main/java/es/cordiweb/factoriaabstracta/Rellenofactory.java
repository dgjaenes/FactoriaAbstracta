package es.cordiweb.factoriaabstracta;

/**
 * Created by DAVID on 07/11/2017.
 */

public class Rellenofactory extends AbstractFactory {
    @Override
    Pan getPan(String tipopan) {
        return null;
    }

    @Override
    Relleno getRelleno(String tipoRelleno) {
        if (tipoRelleno == null) return null;
            if (tipoRelleno == "CHE"){
            return  new Chesse();
        }   else if (tipoRelleno == "TOM") {
            return new Tomato();
        }else if (tipoRelleno == "HAM"){
            return new Ham();
        }
        return null;
    }
}
