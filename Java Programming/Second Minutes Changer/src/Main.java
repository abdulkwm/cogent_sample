public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,32));
        System.out.println(getDurationString(3945L));
    }
    public static String getDurationString(long minutes, long seconds){
        if ((minutes < 0 ) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String hoursString = minutes + " h";
        if (hours < 10){
            hoursString = " 0" + hoursString;
        }
        String minutesString = remainingMinutes + " m";
        if (remainingMinutes < 10 ){
            minutesString = " 0" + minutesString;
        }

        return hours + " h " + remainingMinutes + " m " + seconds + " s";
    }
    private static String getDurationString (long seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSecond = seconds % 60;
        return getDurationString(minutes,remainingSecond);
    }
}
