package com.example.dhdollareuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText from;
    EditText montant;
    EditText res;
    Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert=findViewById(R.id.convert);
        from=findViewById(R.id.from);
        montant=findViewById(R.id.montant);
        res=findViewById(R.id.to2);
        convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                if(from.getText().equals("Dirham")){
                double dollar=Integer.parseInt(montant.getText().toString())*0.097;
                    double euro=Integer.parseInt(montant.getText().toString())*0.091;
                from.setText(dollar+"$ "+ euro +"euro");
                } else if (from.getText().equals("Dollar")) {
                    double euro=Integer.parseInt(montant.getText().toString())*0.94;
                    double dirham=Integer.parseInt(montant.getText().toString())*10.34;
                    res.setText(euro+"euro "+ dirham +"DH");
                }else{
                    double dollar=Integer.parseInt(montant.getText().toString())*1.06;
                    double dirham=Integer.parseInt(montant.getText().toString())*11.01;
                    res.setText(dollar+"euro "+ dirham +"DH");
                }
            }
        });

        }
}