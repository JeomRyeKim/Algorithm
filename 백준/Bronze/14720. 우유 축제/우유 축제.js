const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

const storeNum = input[0];
const storeMlik= input[1].split(" ").map(Number);

let cnt = 0;
let currMilk = -1;

for (let i = 0; i < storeNum; i++) {
  if (i === 0 && storeMlik[i] === 0) {
    cnt++;
    currMilk = storeMlik[i];
  }
  if (currMilk + 1 === storeMlik[i]) {
    cnt++;
    storeMlik[i] === 2 ? (currMilk = -1) : (currMilk = storeMlik[i]);
  }
}
console.log(cnt);