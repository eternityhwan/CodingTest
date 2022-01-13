public class Solution2 {

    class Solution {
        private String result;

        public String solution(int n) {
            String answer = "";
            for (int i = 0; i <=n; i++) {
                
                if (n%2 == 1) {
                    result += "수";
                } else {
                    result += "박";
                }
            }
            return answer;
        }
    }

}

