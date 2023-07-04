class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] a = A.split("");
        String[] b = B.split("");
        int idx = a.length -1;
        
        for(int i = 0; i < a.length; i++) {
            if(A.equals(B)) {
                break;
            }
            
            A = A.substring(0, A.length() -1);
            A = a[idx--] + A;
            answer += 1;
            if(i == a.length-1 && !A.equals(B)) {
                answer = -1;
            }
        }      

        return answer;
    }
}