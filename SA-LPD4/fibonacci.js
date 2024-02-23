const solicitarNumero = () => {
    while (true) {
        const input = prompt("Ingresa el número para calcular su serie de Fibonacci");
        if (!isNaN(parseInt(input))) {
            return parseInt(input);
        }
        alert(`Error, ${input} no es un número válido`);
    }
};

const calcularFibonacci = (numero) => {
    const serieFibonacci = [0, 1];
    for (let i = 2; i < numero; i++) {
        serieFibonacci.push(serieFibonacci[i - 1] + serieFibonacci[i - 2]);
    }
    return serieFibonacci;
};

const mensaje = (numero, serieFibonacci) => {
    const serie = serieFibonacci.join(", ");
    console.log(serie);
    return `La serie de Fibonacci de ${numero} es ${serie}`;
};

const imprimirMensaje = (mensajes) => {
    const contenido = mensajes.split("\n").map(mensaje => `<p>${mensaje}</p>`).join("");
    document.getElementById("msg").innerHTML = contenido;
};

const main = () => {
    const numero = solicitarNumero();
    const serieFibonacci = calcularFibonacci(numero);
    const msj = mensaje(numero, serieFibonacci);
    imprimirMensaje(msj);
};

main();
