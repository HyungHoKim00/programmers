package level1.id12946;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int n) {
        List<FromTo> ans = new ArrayList<>();
        hanoi(1,3,n,ans);
        int[][] answer = new int[ans.size()][2];
        for(int i = 0; i<ans.size(); i++){
            answer[i][0] = ans.get(i).from;
            answer[i][1] = ans.get(i).to;
        }
        return answer;
    }

    public void hanoi(int from, int to, int n, List<FromTo> ans){
        int other = 6-(from+to);
        if(n<1){
            return;
        }
        else if(n==2){
            ans.add(new FromTo(from,other));
            ans.add(new FromTo(from,to));
            ans.add(new FromTo(other,to));
        }
        else{
            hanoi(from,other,n-1,ans);
            ans.add(new FromTo(from,to));
            hanoi(other,to,n-1,ans);
        }
    }
}

class FromTo{
    public int from;
    public int to;

    public FromTo(int from, int to) {
        this.from = from;
        this.to = to;
    }
}