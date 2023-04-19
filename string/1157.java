import java.util.*;

class Main {

    private static char solution1(String word) {
        int[] countArray = getAlphabetCount(word.toUpperCase());

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                maxAlphabet = (char)('A'+ i);
            } else if (countArray[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        return maxAlphabet;
    }

    private static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(solution1(word));
    }
}