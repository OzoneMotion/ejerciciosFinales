// Crear un programa en Javascript que realice lo siguiente:
// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.
// Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
// Entradas: 
// 4, 4, 2.
// Salida:
// 4, 4, 2.
// 2, 4, 4
// Pruébalo con las combinaciones de números que se te ocurran

let firstNum = parseInt(window.prompt("Ingrese su primer numero"))
let secondNum = parseInt(window.prompt("Ingrese su segundo numero"))
let thirdNum = parseInt(window.prompt("Ingrese su tercer numero"))

let majorNum, middleNum, minorNum;

if (firstNum > secondNum && firstNum > thirdNum) {
    majorNum = firstNum;
    if (secondNum > thirdNum) {
        middleNum = secondNum;
        minorNum = thirdNum;
    } else {
        middleNum = thirdNum;
        minorNum = secondNum;
    }
} else if (secondNum > firstNum && secondNum > thirdNum) {
    majorNum = secondNum;
    if (firstNum > thirdNum) {
        middleNum = firstNum;
        minorNum = thirdNum;
    } else {
        middleNum = thirdNum;
        minorNum = firstNum;
    }
} else {
    majorNum = thirdNum;
    if (firstNum > secondNum) {
        middleNum = firstNum;
        minorNum = secondNum;
    } else {
        middleNum = secondNum;
        minorNum = firstNum;
    }
}

console.log(`Los números ordenados de mayor a menor son: ${majorNum}, ${middleNum} y ${minorNum}`)
console.log(`Los números ordenados de menor a mayor son:  ${minorNum}, ${middleNum} y ${majorNum}`)