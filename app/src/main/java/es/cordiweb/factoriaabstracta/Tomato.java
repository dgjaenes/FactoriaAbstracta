package es.cordiweb.factoriaabstracta;

public class Tomato implements Relleno{

    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return " : 20 kcal";
    }
}
