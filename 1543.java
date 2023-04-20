import java.util.Scanner;

class Main {

    private static int solution1(String document, String word) {
        int result = 0;
        while(document.length() > 0) {
            int startIndex = document.indexOf(word);
            int wordLength = word.length();
            document = document.substring(startIndex + wordLength);

            if (startIndex >= 0) {
                result++;
            }
        }
        return result;
    }

    private static int solution2(String document, String word) {
        int result = 0;
        int startIndex = 0;
        while(document.length() > 0) {
            int findIndex = document.indexOf(word, startIndex);
            if (findIndex < 0) { break; }
            result ++;
            startIndex = findIndex + word.length();
        }
        return result;
    }

    private static int solution3(String document, String word) {
        int wordLength = word.length();
        int originalDocLength = document.length();
        String replacedDoc = document.replace(word, "");

        int replacedDocLength = replacedDoc.length();
        return ( originalDocLength - replacedDocLength ) /wordLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        System.out.println(solution1(document, word));
    }
}