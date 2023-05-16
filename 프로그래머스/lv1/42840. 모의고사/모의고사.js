function solution(answers) {
  var answer = [];

  // 수포자 1, 2, 3
  const p1 = [1, 2, 3, 4, 5];
  const p2 = [2, 1, 2, 3, 2, 4, 2, 5];
  const p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  let success = [0, 0, 0]; // 순서대로 p1, p2, p3의 맞힌 개수

  for (let i = 0; i < answers.length; i++) {
    if (p1[i % p1.length] === answers[i]) {
      success[0]++;
    }
    if (p2[i % p2.length] === answers[i]) {
      success[1]++;
    }
    if (p3[i % p3.length] === answers[i]) {
      success[2]++;
    }
  }

  let max = Math.max(...success); // 가장 많이 맞힌 개수

  // 최대값의 인덱스 구하기
  for (let i = 0; i < success.length; i++) {
    if (success[i] === max) {
      answer.push(i + 1);
    }
  }
  return answer;
}