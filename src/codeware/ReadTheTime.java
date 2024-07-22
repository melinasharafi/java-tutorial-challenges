package codeware;


public class ReadTheTime {


    public static String solve(String time) {
        StringBuilder timeInText = new StringBuilder();
        String[] data = time.split(":");
        int hour = Integer.parseInt(data[0]);
        int minute = Integer.parseInt(data[1]);

        if (minute == 0) {
            if (hour <= 12) {
                timeInText.append(convertNumberToWord(hour));
            } else {
                hour = hour - 12;
                timeInText.append(convertNumberToWord(hour));
            }
            timeInText.append(" o'clock");
        }

        else {
            if (minute > 30) {
                minute = minute - 30;
                timeInText.append(convertNumberToWord(minute)).append(" past ");
            } else {
                timeInText.append(convertNumberToWord(minute)).append(" to ");
            }

            if (hour <= 12) {
                timeInText.append(convertNumberToWord(hour));
            } else {
                hour = hour - 12;
                timeInText.append(convertNumberToWord(hour));
            }
        }


        return timeInText.toString();
    }

    public static String convertNumberToWord(int number) {
        switch (number) {
            case 0:
                return "midnight";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 21:
                return "twenty one";
            case 22:
                return "twenty two";
            case 23:
                return "twenty three";
            case 24:
                return "twenty four";
            case 25:
                return "twenty five";
            case 26:
                return "twenty six";
            case 27:
                return "twenty seven";
            case 28:
                return "twenty eight";
            case 29:
                return "twenty nine";
            case 30:
                return "half";
        }
        return null;
    }
}
