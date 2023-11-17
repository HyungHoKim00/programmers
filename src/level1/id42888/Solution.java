package level1.id42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        List<String[]> inout = new ArrayList<>();
        for(String r:record){
            String[] sarr = r.split(" ");
            if(sarr[0].equals("Enter")){
                user.put(sarr[1],sarr[2]);
                inout.add(new String[]{sarr[1], "님이 들어왔습니다."});
            }
            if(sarr[0].equals("Leave")){
                inout.add(new String[]{sarr[1], "님이 나갔습니다."});
            }
            if(sarr[0].equals("Change")){
                user.put(sarr[1],sarr[2]);
            }
        }
        List<String> ansList = new ArrayList<>();
        inout.forEach(arr -> ansList.add(user.get(arr[0]) + arr[1]));
        return ansList.toArray(new String[0]);
    }
}
