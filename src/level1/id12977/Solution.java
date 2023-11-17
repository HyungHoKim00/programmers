package level1.id12977;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sosus = new ArrayList<>();
        generateSosu(sosus);
        int l = nums.length;
        for(int i = 0; i<l-2; i++){
            for(int j = i+1; j<l-1; j++){
                for(int k = j+1; k<l; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sosus.contains(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private void generateSosu(List<Integer> sosus) {
        sosus.add(2);
        sosus.add(3);
        for(int num = 4; num<2998 ;num++){
            if(isSosu(sosus, num)){
                sosus.add(num);
            }
        }
    }

    public boolean isSosu(List<Integer> sosus, int sum){
        return sosus.stream()
                .filter(sosu -> sosu<Math.sqrt(sum)+1)
                .noneMatch(sosu -> sum % sosu == 0);
    }
}
