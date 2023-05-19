class Solution {
    public int solution(String myString, String pat) {
        String[] strArr = myString.split("");
        String str = "";
        
        for(String s : strArr) {
            if(s.equals("A")) {
                str += "B";
            } else {
                str += "A";
            }
        }
        
        int answer = str.indexOf(pat) != -1 ? 1 : 0;
        
        return answer;
    }
}