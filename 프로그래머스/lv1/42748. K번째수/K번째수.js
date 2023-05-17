function solution(array, commands) {
  var answer = [];
  let arr = [];
  let i = 0;
  let j = 0;
  let k = 0;

  for (let a = 0; a < commands.length; a++) {
    i = commands[a][0] - 1;
    j = commands[a][1] - 1;
    k = commands[a][2] - 1;
    arr = array.slice(i, j + 1).sort((a, b) => a - b);
    answer.push(arr[k]);
    arr = [];
  }

  return answer;
}