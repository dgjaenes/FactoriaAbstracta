package es.cordiweb.factoriaabstracta;

public class Roll implements Pan{

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public String calories() {
        return " : 168 kcal";
    }
}
