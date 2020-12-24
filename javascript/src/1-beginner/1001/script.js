var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

const [a, b] = lines

const sum = (a) => (b) => parseInt(a) + parseInt(b)
const x = sum(a)(b)

console.log(`X = ${x}`)