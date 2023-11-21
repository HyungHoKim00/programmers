package level1.id72413;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] vec = new int[n+1][n+1];
        for(int i = 0; i<fares.length;i++){
            vec[fares[i][0]][fares[i][1]] = fares[i][2];
            vec[fares[i][1]][fares[i][0]] = fares[i][2];
        }
        for(int i = 1; i<n+1;i++){
            for(int j = i+1; j<n+1; j++){
                if(vec[i][j]==0){
                    vec[i][j] = 200_000_000;
                    vec[j][i] = 200_000_000;
                }
            }
        }
        for(int i = 1; i<n+1;i++){
            for(int j = 1; j<n+1; j++){
                if(i!=j){
                    for(int k = j+1; k<n+1;k++){
                        if(j!=k&&i!=k){
                            int x = vec[j][i]+vec[i][k];
                            if(x<vec[j][k]){
                                vec[j][k] = x;
                                vec[k][j] = x;
                            }
                        }
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(vec[s][a] + vec[s][b]);
        for(int i = 1; i<n+1;i++){
            list.add(vec[s][i] + vec[i][a] + vec[i][b]);
        }
        return Collections.min(list);
    }
}
