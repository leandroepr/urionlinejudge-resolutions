var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

const circleArea = (r, pi) => pi * Math.pow(Number.parseFloat(r), 2);
const stdCircleArea = (r) => circleArea(r, 3.14159);
const fixedPoint = (number) => (digits) => Number.parseFloat(number).toFixed(digits);
const fixedPointWithFourDigits = (number) => fixedPoint(number)(4);
const printResult = (a) => console.log(`A=${a}`);

const [r] = lines;
const a = stdCircleArea(r);

printResult(fixedPointWithFourDigits(a));