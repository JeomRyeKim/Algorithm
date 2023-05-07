//basic setting
var fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';

//split setting (what you want) (Must be "trim()")
// input 유형 별로 split(공백 or 줄바꿈) 뒤에 붙이시면 됩니다.!!
var input = fs.readFileSync(filePath).toString().trim()

//cording here
let t = Number(input);
let a = 0;
let b = 0;
let c = 0;

if (t >= 300) {
  a = Math.floor(t / 300);
  t = t % 300;
}

if (t >= 60 && t < 300) {
  b = Math.floor(t / 60);
  t = t % 60;
}

if (t >= 10 && t < 60) {
  c = Math.floor(t / 10);
  t = t % 10;
}

if (t !== 0) {
  console.log(-1);
} else {
  console.log(`${a} ${b} ${c}`);
}




