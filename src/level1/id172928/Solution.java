package level1.id172928;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int y = park.length;
        int x = park[0].length();
        int[] start = new int[2];
        boolean[][] movable = new boolean[x][y];
        for(int i = 0; i<y;i++){
            for(int j = 0; j<x;j++){
                if(park[i].charAt(j) == 'O'){
                    movable[j][i] = true;
                }
                else if(park[i].charAt(j) == 'S'){
                    start[0] = j;
                    start[1] = i;
                    movable[j][i] = true;
                }
                else if(park[i].charAt(j) == 'X'){
                    movable[j][i] = false;
                }
            }
        }
        int siz = routes.length;
        for(int i = 0; i < siz; i++){
            String[] route = routes[i].split(" ");
            int amount = Integer.parseInt(route[1]);
            if(route[0].equals("N")){
                boolean b = false;
                if(start[1]<amount){
                    continue;
                }
                for(int j = start[1]-1;j>=start[1]-amount;j--){
                    if(!movable[start[0]][j]){
                        b = true;
                        continue;
                    }
                }
                if(b){
                    continue;
                }
                start[1] = start[1]-amount;
            }
            else if(route[0].equals("S")){
                boolean b = false;
                if(start[1]+amount>=y){
                    continue;
                }
                for(int j = start[1]+1;j<=start[1]+amount;j++){
                    if(!movable[start[0]][j]){
                        b = true;
                        continue;
                    }
                }
                if(b){
                    continue;
                }
                start[1] = start[1]+amount;
            }
            else if(route[0].equals("W")){
                boolean b = false;
                if(start[0]<amount){
                    continue;
                }
                for(int j = start[0]-1;j>=start[0]-amount;j--){
                    if(!movable[j][start[1]]){
                        b = true;
                        continue;
                    }
                }
                if(b){
                    continue;
                }
                start[0] = start[0]-amount;
            }
            else if(route[0].equals("E")){
                boolean b = false;
                if(start[0]+amount>=x){
                    continue;
                }
                for(int j = start[0]+1;j<=start[0]+amount;j++){
                    if(!movable[j][start[1]]){
                        b = true;
                        continue;
                    }
                }
                if(b){
                    continue;
                }
                start[0] = start[0]+amount;
            }
        }
        int[] answer = new int[2];
        answer[0] = start[1];
        answer[1] = start[0];
        return answer;
    }
}
