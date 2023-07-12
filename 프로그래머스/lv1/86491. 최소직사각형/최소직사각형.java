class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            // 가로의 길이가 무조건 세로 길이보다 길도록 자리 이동
            if(sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            // 가로와 세로의 최대 길이 찾기
            if(sizes[i][0] > wMax) wMax = sizes[i][0];
            if(sizes[i][1] > hMax) hMax = sizes[i][1];
        }
        /*
        for(int i = 0; i < sizes.length; i++) {
            System.out.println(sizes[i][0] + " " + sizes[i][1]);
        }
        */
        //System.out.println(wMax + " " + hMax);
        
        return wMax * hMax;
    }
}