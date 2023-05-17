function solution(sizes) {
  var answer = 0;

  let w = 0;
  let h = 0;
  let maxw = 0;
  let maxh = 0;

  let squares = [];

  for (let i = 0; i < sizes.length; i++) {
    w = sizes[i][0];
    h = sizes[i][1];

    if (w < h) {
      squares.push([h, w]);
    } else {
      squares.push([w, h]);
    }
    if (maxw <= squares[i][0]) maxw = squares[i][0];
    if (maxh <= squares[i][1]) maxh = squares[i][1];
  }

  answer = maxw * maxh;

  return answer;
}