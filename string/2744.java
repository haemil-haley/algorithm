class Main {

    private static String solution2(String example) {
        char[] result = example.toCharArray();
        for (int i = 0; i < example.length(); i++) {
            if ('a' <= result[i] && result[i] <= 'z')
                result[i] = (char)('A' + result[i] - 'a');
            else result[i] = (char)('a' + result[i] - 'A');
        }
        return String.valueOf(result);
    }

    private static String solution1(String example) {
        String result = "";
        String[] splitString = example.split("");
        for (String string : splitString) {
            if(string.toLowerCase().equals(string)) {
                string = string.toUpperCase();
            } else {
                string = string.toLowerCase();
            }
            result += string;
        }
        return  result;
    }

    public static void main(String[] args) {
        String example = "WornAnswer";
        System.out.println(solution2(example));
    }
}
