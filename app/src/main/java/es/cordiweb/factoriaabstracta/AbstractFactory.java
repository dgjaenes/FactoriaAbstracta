package es.cordiweb.factoriaabstracta;

/**
 * Created by DAVID on 07/11/2017.
 */

public abstract class AbstractFactory {
    abstract Pan getPan(String tipopan);
    abstract Relleno getRelleno (String tipoRelleno);

}
