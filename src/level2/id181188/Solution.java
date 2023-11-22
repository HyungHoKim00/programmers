package level2.id181188;

import java.util.Arrays;

class Solution {
    int answer;
    public int solution(int[][] targets) {
        answer = 1;
        Arrays.sort(targets,(x, y) -> x[0] - y[0] );
        int st = targets[0][0];
        int nd = targets[0][1];
        for(int i = 1; i<targets.length;i++){
            if(targets[i][0]>=st && targets[i][1]<=nd){
                st = targets[i][0];
                nd = targets[i][1];
            }else if(targets[i][0]>=nd){
                st = targets[i][0];
                nd = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}