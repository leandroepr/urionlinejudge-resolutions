var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

const [a, b] = lines;
const sum = (a, b) => Number.parseInt(a) + Number.parseInt(b);
const printResult = (soma) => console.log(`SOMA = ${soma}`);

const soma = sum(a, b);
printResult(soma);
