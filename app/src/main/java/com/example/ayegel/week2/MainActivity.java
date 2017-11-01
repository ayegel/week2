package com.example.ayegel.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText3);
        Log.d("demo", "onCreate: ");

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("demo", "onClick: " + editText.getText().toString());
                try{
                    double to_inches= Double.parseDouble(editText.getText().toString()) * 39.3701;
                    Log.d("demo", "onClick: " + to_inches);
                    TextView textView = (TextView) findViewById(R.id.editText2);
                    textView.setText(String.valueOf(to_inches));
                }catch (NumberFormatException ex){
                    Toast.makeText(MainActivity.this, "Error !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editText = findViewById(R.id.editText3);
        Log.d("demo", "onCreate: ");

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                Log.d("demo", "onClick: " + editText.getText().toString());
                double to_feet= Double.parseDouble(editText.getText().toString()) * 3.28;
                Log.d("demo", "onClick: " + to_feet);
                TextView textView = (TextView) findViewById(R.id.editText2);
                textView.setText(String.valueOf(to_feet));
                }catch (NumberFormatException ex){
                    Toast.makeText(MainActivity.this, "Error !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editText = findViewById(R.id.editText3);
        Log.d("demo", "onCreate: ");

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                Log.d("demo", "onClick: " + editText.getText().toString());
                double to_miles= Double.parseDouble(editText.getText().toString()) * 0.0006;
                Log.d("demo", "onClick: " + to_miles);
                TextView textView = (TextView) findViewById(R.id.editText2);
                textView.setText(String.valueOf(to_miles));
                }catch (NumberFormatException ex){
                    Toast.makeText(MainActivity.this, "Error !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editText = findViewById(R.id.editText3);
        Log.d("demo", "onCreate: ");

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView edittext2result = (TextView) findViewById(R.id.editText2);
                edittext2result.setText(String.valueOf(""));
                TextView edittext3result = (TextView) findViewById(R.id.editText3);
                edittext3result.setText(String.valueOf(""));
            }
        });
    }
}