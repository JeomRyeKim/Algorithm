import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = LocalDate.of(2016, a, b).getDayOfWeek().getValue();
        
        switch(day) {
            case 1 : answer = "MON"; break;
            case 2 : answer = "TUE"; break;
            case 3 : answer = "WED"; break;
            case 4 : answer = "THU"; break;
            case 5 : answer = "FRI"; break;
            case 6 : answer = "SAT"; break;
            case 7 : answer = "SUN"; break;
        }
        
        return answer;
    }
}