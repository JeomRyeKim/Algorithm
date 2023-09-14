class Solution {
    public boolean isSkill(String skill, String skills) {
        int idx = 0;
        
        for(char s : skills.toCharArray()) {
            if (idx >= skill.length()) break;
            if(skill.contains("" + s)) {
                if(skill.charAt(idx) == s) 
                    idx++;
                else return false;
            }
        }
        
        return true;
    }
    
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skills : skill_trees){
            if(isSkill(skill, skills)) answer++;
        }
        
        return answer;
    }
}