import java.util.Random;

class HourGenerator {
    static String generateHour(int start,int stop){
        Random random = new Random();
        int hour=random.nextInt(stop-start)+start;
        String hours=hour>=10 ? Integer.toString(hour) : '0'+Integer.toString(hour);
        int minute=random.nextInt(12)*5;
        String minutes=minute>=10 ? Integer.toString(minute) : '0'+Integer.toString(minute);

        return "\"'"+hours+":"+minutes+":00"+"'\"";
    }

    static String[] generateStartAndEndHours(){
        int i = (new Random()).nextInt(10)+7,j=(new Random()).nextInt(2)+i+3;
        return new String[]{generateHour(i,j),generateHour(j,j+2)};
    }
}
