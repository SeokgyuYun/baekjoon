public class Main {
    public static void main(String[] args) {
        int[] pays = {1000, 2000, 3000, 4000, 5000};
        String[] infos = {"M", "F", "M", "M", "F"};
        System.out.println(solution(pays, infos, "M"));

    }

    public static int solution(int[] pays, String[] infos, String target) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < pays.length; i++) {
            if (target == "M") {
                if (infos[i] == "M") {
                    answer += pays[i];
                    cnt++;
                }
            }
            else {
                if (infos[i] == "F") {
                    answer += pays[i];
                    cnt++;
                }
            }
        }
        if (cnt != 0) answer /= cnt;

        return answer;
    }
}
