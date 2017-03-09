package com.example.adson.calculadoragasolina;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextGasolina;
    private EditText editTextAlcool;
    private TextView textViewResult;


    private View.OnClickListener linstner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double alcool = Double.parseDouble(editTextAlcool.getText().toString());
            double gasolina = Double.parseDouble(editTextGasolina.getText().toString());

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;

            String text;

            if(alcool < gasolina*0.7){
                text = "Vale a pena abastecer com alcool";
            }else{
                text = "Vale a pena abastecer com gasolina";
            }

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlcool = (EditText) findViewById(R.id.editTextAlcool);
        editTextGasolina = (EditText) findViewById(R.id.editTextGasolina);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(linstner);
    }
}
