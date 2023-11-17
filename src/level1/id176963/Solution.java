package level1.id176963;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> map = new HashMap<>();
        int pl = photo.length;
        int[] answer = new int[pl];
        for(int i = 0; i<yearning.length;i++){
            map.put(name[i],yearning[i]);
        }
        for(int i = 0; i<pl; i++){
            int pil = photo[i].length;
            for(int j = 0; j<pil; j++){
                String key = photo[i][j];
                if(map.containsKey(key)){
                    answer[i] += map.get(key);
                }
            }
        }
        return answer;
    }
}