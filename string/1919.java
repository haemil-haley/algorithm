import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    private static int solution1(String word1, String word2) {
        List<Character> characters = new ArrayList<Character>();
        for(int i=0;i<word1.length();i++){
            characters.add(word1.charAt(i));
        }

        int result = 0;
        for(int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            if (characters.contains(c)) {
                characters.remove((Character) c);
            } else {
                result++;
            }
        }

        return result + characters.size();
    }

    private static int solution2(String word1, String word2) {
        int[] countA = getAlphabetCount(word1);
        int[] countB = getAlphabetCount(word2);

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(countA[i] - countB[i]);
            /*if (countA[i] > countB[i]) {
                answer += countA[i] - countB[i];
            } else if (countA[i] < countB[i]) {
                answer += countB[i] - countA[i];
            }*/
        }
        return answer;
    }

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        System.out.println(solution2(word1, word2));
    }
}