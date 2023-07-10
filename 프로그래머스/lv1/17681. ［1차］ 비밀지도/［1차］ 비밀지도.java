class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {             
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            // toBinaryString로 2진수로 변경
            // |함수를 사용하여 한 쪽이 1이면 1이 출력되고 그 외에는 0을 출력하도록 함
            // String.format는 문자열 형식을 설정하는 메서드임
            // %s는 문자열 형식을 설정하겠다는 의미로 중간에 n의 숫자를 넣었을 때 n보다 문자열의 길이가 짧으면 앞에 공백을 추가함
            answer[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));

            // 0은 ' '공백으로, 1은 벽인 "#"로 한꺼번에 변경 처리
            answer[i] = answer[i].replace('0', ' ').replace('1', '#');
        }
        return answer;
    }
}
