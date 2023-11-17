package level1.id12909;

public class Solution {
    boolean solution(String s) {
        int isZero = 0;

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                isZero++;
            }else{
                isZero--;
            }
            if(isZero<0){
                return false;
            }
        }

        return isZero==0;
    }
}
