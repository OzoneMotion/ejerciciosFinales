const secretNumGenerator = () => {
    const SecretNum = Math.floor(Math.random() * 100) + 1;
    return SecretNum;
}

const divResult = document.getElementById('result');
const form = document.getElementById('ingresar-numero');
let listaDeNumeros = [];
const numeroSecreto = secretNumGenerator();

form.addEventListener('submit', (event) => {
    event.preventDefault();
    const input = document.getElementById('numero');
    const esUnNumero = !isNaN(parseInt(input.value));
    let numero = 0;

    if (esUnNumero) {
        numero = parseInt(input.value);
        if (numero >= 1 && numero <= 100) {
            divResult.innerHTML = `<p>El número ingresado es ${numero}</p>`;
            main(numero, numeroSecreto);
            input.value = "";
        } else {
            divResult.innerHTML =
                `<p>Error, ${numero} no está entre 1 y 100</p>`;
            input.value = "";
        }
    } else {
        divResult.innerHTML = `<p>Error, ${input.value} no es un número</p>`;
        input.value = "";
    }
});

const sonNumerosIguales = (numeroSecreto, numeroDelJugador) => {
    return numeroDelJugador === numeroSecreto;
}

const mensajeAdivinanza = (adivinoNumero) => {
    let mensaje = "";
    if (adivinoNumero) {
        mensaje = `Felicidades, adivinaste el número secreto.`;
    } else {
        mensaje = `Ups, el número secreto es incorrecto, vuelve a intentarlo.`;
    }
    return mensaje;
};

const imprimirMensaje = (mensaje, adivinoNumero, listaDeNumeros) => {
    let contenido = "";
    if (adivinoNumero) {
        contenido = `<p>${mensaje}</p><p>Los números ingresados fueron ${listaDeNumeros.join(', ')}</p>`;
    } else {
        contenido = `<p>${mensaje}</p>`;
    }
    document.getElementById('msg').innerHTML = contenido;
}

const main = (numero, numeroSecreto) => {
    let adivinoNumero = sonNumerosIguales(numeroSecreto, numero);
    const msj = mensajeAdivinanza(adivinoNumero);
    listaDeNumeros.push(numero);
    console.log(numeroSecreto);
    imprimirMensaje(msj, adivinoNumero, listaDeNumeros);
}