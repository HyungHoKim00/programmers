package level1.id178871;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = solution.solution(players,callings);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
