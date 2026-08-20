function sumar(a, b) {
    return a + b;
}

function restar(a, b) {
    return a - b;
}

function multiplicar(a, b) {
    return a * b;
}

function dividir(a, b) {
    if (b === 0) {
        return "No se puede dividir entre cero";
    }

    return a / b;
}

function potencia(a, b) {
    return Math.pow(a, b);
}

function calcular(a, b) {
    return {
        suma: sumar(a, b),
        resta: restar(a, b),
        multiplicacion: multiplicar(a, b),
        division: dividir(a, b),
        potencia: potencia(a, b)
    };
}

// Pasar los valores 10 y 5 a la función calcular
var resultado = calcular(, );

//Desplegar el resultado de los cálculos en la consola
console.log("Suma: " + );
console.log("Resta: " + );
console.log("Multiplicación: " + );
console.log("División: " + );
console.log("Potencia: " + );