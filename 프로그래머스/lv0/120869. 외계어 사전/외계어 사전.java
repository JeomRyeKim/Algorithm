class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String d : dic) {
            for(int i = 0; i < spell.length; i++) {
                if(d.contains(spell[i])){
                    d = d.replaceFirst(spell[i], "0");
                }
            }
            
            if(d.equals("0".repeat(spell.length))) answer = 1;      
        }
        return answer;
    }
}