# Temperature Conversion App

A simple Android app that allows users to convert temperature between Celsius, Fahrenheit, and Kelvin.

## Features

- Convert temperatures between Celsius, Fahrenheit, and Kelvin.
- Real-time conversion as the user enters data.
- Clear button to reset all input fields.
- Intuitive user interface with interactive input fields.
- Prevents concurrent input in multiple fields for accurate conversions.

## Usage

- Open the app on your Android device.
- You will see three input fields: Celsius, Fahrenheit, and Kelvin, and two buttons: Convert and Clear.
- Enter a temperature in one of the input fields (e.g., Celsius).
- The app will instantly display the equivalent temperatures in the other two fields (Fahrenheit and Kelvin).
- You can switch between the input fields and enter data in any of them.
- The other two input fields will automatically disable while one field has data to prevent incorrect entries.

## Conversion Logic

The app uses the following conversion formulas:

- Celsius to Fahrenheit: `F = (C * 9/5) + 32`
- Celsius to Kelvin: `K = C + 273.15`
- Fahrenheit to Celsius: `C = (F - 32) * 5/9`
- Fahrenheit to Kelvin: `K = (F - 32) * 5/9 + 273.15`
- Kelvin to Celsius: `C = K - 273.15`
- Kelvin to Fahrenheit: `F = (K - 273.15) * 9/5 + 32`

## Acknowledgments

- This app is created as a simple example for educational purposes.
- Feel free to use, modify, and distribute it as needed.
