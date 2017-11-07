package es.cordiweb.factoriaabstracta;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txt = (TextView) findViewById(R.id.tw1);

        AbstractFactory fabricorelleno = GeneradordeFactory.getFactory("REL");
        Relleno relleno = fabricorelleno.getRelleno("CHE");


        AbstractFactory fabricopan = GeneradordeFactory.getFactory("PAN");
        Pan pan = fabricopan.getPan("BAG");

        txt.setText(relleno.name()+" "+ relleno.calories()+"\n"
        +pan.name()+" "+ pan.calories());


    }
}
