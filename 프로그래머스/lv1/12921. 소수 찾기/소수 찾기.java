class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        // n까지 모든 수 대입하여 배열 생성
        for(int i=0; i<=n; i++) arr[i] = i;
        
        // 1은 소수가 아니기에 0으로 변경
        arr[1] = 0;
        
        for(int i=2; i<=n; i++) {
            if(arr[i] == 0) continue;
            
            // 에라토스테네스의 체를 통해 배수의 수는 소수가 아니라고 정의했기 때문에 소수가 아니면 0으로 변경
            for(int j=i*2; j<=n; j+=i) arr[j] = 0;
        }
        
        // 소수가 아닌 0들을 제외한 소수들 개수만큼 answer++
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) answer++;
        }
        
        return answer;
    }
}