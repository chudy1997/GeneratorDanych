import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class DateGenerator {
    static Random rand = new Random();
    static int year;
    static int month;
    static int day;

    public static String genereteMSSQLDate(int startYear, int endYear){

        return "'"+randYearBtw(startYear, endYear)+"-"+randMonthBtw(1, 12)+"-"+randDayBtw(1, daysInMonth(month))+"'";
    }
    public static String genereteMSSQLDateBefore(String date){
        int daysToSubs = rand.nextInt(365);
        return addDaystoDate(date, (-daysToSubs));
    }

    private static String randYearBtw(int FirstYear, int LastYear){
        year = rand.nextInt(LastYear - (FirstYear - 1))+ FirstYear;
        return Integer.toString(year);
    }

    private static String randMonthBtw(int FirstMonth, int LastMonth){
        month = rand.nextInt(LastMonth - (FirstMonth - 1))+ FirstMonth;
        if(month < 10){
            return "0"+Integer.toString(month);
        }
        else{
            return Integer.toString(month);
        }
    }
    private static String randDayBtw(int FirstDay, int LastDay){
        day = rand.nextInt(LastDay - (FirstDay - 1))+ FirstDay;
        if(day < 10){
            return "0"+Integer.toString(day);
        }
        else{
            return Integer.toString(day);
        }
    }
    private String randNumberBeetween(int firstVal, int lastVal){

        int tmpRand = rand.nextInt(lastVal - (firstVal - 1))+ firstVal;
        if(lastVal==12)
            month = tmpRand;
        if(lastVal >= 10 && tmpRand < 10)
            return "0"+Integer.toString(tmpRand);
        else
            return Integer.toString(tmpRand);
    }

    public static int daysInMonth(int month){
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    return 29;
                else
                    return 28;
            default:
                return -1;

        }
    }

    //dodawanie dat
    public static String addDaystoDate(String Date, int daysToAdd){
        //int year;
        //int month;
        //int day;
        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(new Character[]{'0','1','2','3','4','5','6','7','8','9'}));
        year = 1000*digits.indexOf(Date.charAt(1))+100*digits.indexOf(Date.charAt(2))+10*digits.indexOf(Date.charAt(3))+digits.indexOf(Date.charAt(4));
        month = 10*digits.indexOf(Date.charAt(6))+digits.indexOf(Date.charAt(7));
        day = 10*digits.indexOf(Date.charAt(9))+digits.indexOf(Date.charAt(10));
        if(daysToAdd>=0){
            for(int i = daysToAdd; i>0; i--){
                if(day == daysInMonth(month)){
                    if(month == 12){
                        day = 1;
                        month = 1;
                        year++;
                    }
                    else{
                        day = 1;
                        month ++;
                    }
                }
                else
                    day++;
            }
        }else{
            for(int i = daysToAdd; i<0; i++){
                if(day == 1){
                    if(month == 1){
                        day = 31;
                        month = 12;
                        year--;
                    }
                    else{
                        month --;
                        day = daysInMonth(month);

                    }
                }
                else
                    day--;
            }
        }

        String monthS;
        String dayS;
        if(month < 10){
            monthS = "0"+Integer.toString(month);
        }
        else{
            monthS = Integer.toString(month);
        }
        if(day < 10){
            dayS = "0"+Integer.toString(day);
        }
        else{
            dayS = Integer.toString(day);
        }
        return "'"+Integer.toString(year)+"-"+monthS+"-"+dayS+"'";
    }

    public int dateDiff(String startDate, String endDate){
        int dateDiff = 0;
        String startDate2 = startDate;
        while(!startDate2.equals(endDate)){
            dateDiff++;
            startDate2 = addDaystoDate(startDate2, 1);
        }
        //System.out.println("dateDiff = "+dateDiff);
        return dateDiff;
    }

}