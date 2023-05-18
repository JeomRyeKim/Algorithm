class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 0;
        int add = 0;

        for(int n : num_list){
            if(multi == 0) multi = n;
            else multi *= n;
            
            add += n;
        }
        
        answer = multi < add*add ? 1 : 0;
        return answer;
    }
}