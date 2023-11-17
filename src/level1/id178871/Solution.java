package level1.id178871;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> rank = new HashMap<>();
        List<String> ps = new ArrayList<>(Arrays.asList(players));
        int l = players.length;
        for(int i = 0; i<l;i++){
            rank.put(players[i],i);
        }
        for(String calling:callings){
            int oldRank = rank.get(calling);
            int newRank = oldRank-1;
            ps.remove(oldRank);
            ps.add(newRank,calling);
            rank.replace(calling,newRank);
            rank.replace(ps.get(oldRank),oldRank);
        }
        return ps.toArray(new String[0]);
    }
}
