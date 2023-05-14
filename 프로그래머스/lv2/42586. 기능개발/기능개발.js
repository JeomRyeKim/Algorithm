function solution(progresses, speeds) {
    var answer = [];
    let cnt = 0;
    let day = [];
    let count = 1;
    
    // 각각의 작업이 걸리는 일수 계산
    for(let i = 0; i < progresses.length; i++) {
      while((progresses[i] - 100) < 0){
        progresses[i] += speeds[i];
        cnt++;
      }
      day.push(cnt);
      cnt = 0;
    }
    //console.log("1day:",day) // 	day: [ 7, 3, 9 ] day: [ 5, 10, 1, 1, 20, 1 ]
    
    let maxDay = day[0];
    // 작업당 걸리는 배포 일수 계산
    for(let i=1; i<day.length; i++) {
        if(maxDay >= day[i]){
            count++;
        } else {
            maxDay = day[i];
            answer.push(count);
            count = 1;
        }
    }
    answer.push(count);
    return answer;
}