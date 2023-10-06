package com.example.temperatureconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editCelsius, editFahrenheit, editKelvin;
    Button btnConvert, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelsius = findViewById(R.id.editCelsius);
        editFahrenheit = findViewById(R.id.editFahrenheit);
        editKelvin = findViewById(R.id.editKelvin);
        btnConvert = findViewById(R.id.btnConvert);
        btnClear = findViewById(R.id.btnClear);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertTemperature();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearFields();
            }
        });
    }

    private void convertTemperature() {
        String celsiusText = editCelsius.getText().toString();
        String fahrenheitText = editFahrenheit.getText().toString();
        String kelvinText = editKelvin.getText().toString();

        if (!celsiusText.isEmpty()) {
            double celsius = Double.parseDouble(celsiusText);
            double fahrenheit = (celsius * 9/5) + 32;
            double kelvin = celsius + 273.15;

            editFahrenheit.setText(String.format("%.2f", fahrenheit));
            editKelvin.setText(String.format("%.2f", kelvin));
        } else if (!fahrenheitText.isEmpty()) {
            double fahrenheit = Double.parseDouble(fahrenheitText);
            double celsius = (fahrenheit - 32) * 5/9;
            double kelvin = celsius + 273.15;

            editCelsius.setText(String.format("%.2f", celsius));
            editKelvin.setText(String.format("%.2f", kelvin));
        } else if (!kelvinText.isEmpty()) {
            double kelvin = Double.parseDouble(kelvinText);
            double celsius = kelvin - 273.15;
            double fahrenheit = (celsius * 9/5) + 32;

            editCelsius.setText(String.format("%.2f", celsius));
            editFahrenheit.setText(String.format("%.2f", fahrenheit));
        }
    }

    private void clearFields() {
        editCelsius.setText("");
        editFahrenheit.setText("");
        editKelvin.setText("");
    }
}
