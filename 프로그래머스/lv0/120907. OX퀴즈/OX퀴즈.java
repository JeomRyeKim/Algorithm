class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] qArr = quiz[i].split(" ");
            int[] q = { Integer.valueOf(qArr[0]), Integer.valueOf(qArr[2]), Integer.valueOf(qArr[4])};
            
            if(qArr[1].equals("+")) 
                answer[i] = q[0]+q[1] == q[2] ? "O" : "X";
            else if(qArr[1].equals("-")) 
                answer[i] = q[0]-q[1] == q[2] ? "O" : "X"; 
        }
        return answer;
    }
}