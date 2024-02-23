let num = parseFloat(window.prompt(("Ingresa un número para calcular su factorial")));

function factorial(num) {
    if (num === 0) {
        return 1;
    } else {
        return num * factorial(num - 1);
    }
}

console.log(`El factorial de ${num} es ${factorial(num)}`);