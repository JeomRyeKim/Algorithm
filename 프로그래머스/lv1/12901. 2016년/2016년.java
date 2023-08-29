import java.time.*;

class Solution {
    public String solution(int a, int b) {
        int day = LocalDate.of(2016, a, b).getDayOfWeek().getValue();
        
        switch(day) {
            case 1 : return "MON";
            case 2 : return "TUE";
            case 3 : return "WED";
            case 4 : return "THU";
            case 5 : return "FRI";
            case 6 : return "SAT";
            case 7 : return "SUN";
            default: return "";
        } 
    }
}