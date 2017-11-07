package es.cordiweb.factoriaabstracta;

public class Baguette implements Pan{

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return " : 250 kcal";
    }
}
