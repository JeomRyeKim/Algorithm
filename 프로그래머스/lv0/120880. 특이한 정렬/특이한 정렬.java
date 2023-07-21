import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = new Integer[numlist.length];

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                if (Math.abs(n1 - n) < Math.abs(n2 - n)) {
                    return -1;
                } else if (Math.abs(n1 - n) > Math.abs(n2 - n)) {
                    return 1;
                } else if(Math.abs(n1 - n) == Math.abs(n2 - n)) {
                    return n1 > n2 ? -1 : 1;
                } else return 0;
            }
        });

        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = arr[i];
        }

        return numlist;
    }
}