package com.falkenbeast.inchconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtext;
    Button calcb;
    TextView rest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviewmeth1();
        calcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inchesstring = Integer.parseInt(edtext.getText().toString());
                if (inchesstring == 0) {
                    Toast.makeText(MainActivity.this, "please enter the value", Toast.LENGTH_SHORT).show();
                } else {
                    double rs = calcheight(inchesstring);

                    displayres(rs);
                }

            }
        });


    }

    private void displayres(double rs) {
        DecimalFormat mf = new DecimalFormat("0.00");
        String resstt = mf.format(rs);
        rest.setText(resstt + " meters");
    }

    private double calcheight(int inchesstring) {
        int intinch = inchesstring;
        return intinch * 0.0254;

    }

    private void findviewmeth1() {
        edtext = findViewById(R.id.edinch);
        calcb = findViewById(R.id.calb);
        rest = findViewById(R.id.rest);
    }


}