package level3.id64062;

class Solution {
    public int solution(int[] stones, int k) {
        int m = searchMax(k-1,k,stones);
        int answer = m;
        for(int i = k;i<stones.length;i++) {
            if(stones[i]>=m){
                m = stones[i];
            } else if(stones[i-k] == m){
                m = searchMax(i,k,stones);
                answer = Math.min(answer,m);
            }
        }
        return answer;
    }
    int searchMax(int i, int k, int[] stones){
        int max = 0;
        for(int x = i-k+1;x<=i;x++){
            max = Math.max(max,stones[x]);
        }
        return max;
    }
}