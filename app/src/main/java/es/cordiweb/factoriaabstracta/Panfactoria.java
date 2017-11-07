package es.cordiweb.factoriaabstracta;

public class  Panfactoria extends AbstractFactory{

    @Override
    Pan getPan(String tipopan) {
        if (tipopan == null) return null;
        if (tipopan == "BAG"){
            return  new Baguette();
        }   else if (tipopan == "ROL") {
            return new Roll();
        }else if (tipopan == "SLI"){
            return new Slice();
        }
        return null;
    }

    @Override
    Relleno getRelleno(String tipoRelleno) {
        return null;
    }
}
