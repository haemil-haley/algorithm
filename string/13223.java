import java.util.Scanner;

class Main {

    private static String solution1(String now, String alarm) {
        String[] nowUnit = now.split(":");
        int nowHour = Integer.parseInt(nowUnit[0]);
        int nowMinute = Integer.parseInt(nowUnit[1]);
        int nowSecond = Integer.parseInt(nowUnit[2]);

        String[] alarmUnit = now.split(":");
        int alarmHour = Integer.parseInt(alarmUnit[0]);
        int alarmMinute = Integer.parseInt(alarmUnit[1]);
        int alarmSecond = Integer.parseInt(alarmUnit[2]);

        // 모든 단위를 초로 변경 (작은 단위로 몰아주기)
        int nowSecondAmount = (nowHour * 3600) + (nowMinute * 60) + nowSecond;
        int alarmSecondAmount = (alarmHour * 3600) + (alarmMinute * 60) + alarmSecond;

        int needSecondAmount = alarmSecondAmount - nowSecondAmount;
        if(needSecondAmount <= 0) {  // 음수면 하루 더해준다.
            needSecondAmount += 24 * 3600;
        }

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        return String.format("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String now = sc.next();
        String alarm = sc.next();

        System.out.println(solution1(now, alarm));
    }
}