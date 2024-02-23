// Crear un programa en Javascript que realice lo siguiente:
// Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
// Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
// Debe imprimir ambos resultados por consola o por el DOM.
// Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.

let celsius = parseFloat(window.prompt(("Ingrese la temperatura en grados Celsius")));
let fahrenheit, kelvin

function celsiusToFahrenheit(celsius) {
    fahrenheit = (1.8 * celsius) + 32
    return fahrenheit
}

function celsiusToKelvin(celsius) {
    kelvin = celsius + 273.15
    return kelvin
}

console.log(`°F = ${celsiusToFahrenheit(celsius)}`)
console.log(`K = ${celsiusToKelvin(celsius)}`)