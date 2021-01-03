public class APCalendar{
  public static void main(String[] args){

  }

  private static boolean isLeapYear(int year){
    return false;
  }

  public static int numberOfLeapYears(int year1, int year2){
    int count = 0;
    for(int i = year1; year1 <= year2; i++){
      if(isLeapYear(i)){
        count++;
      }
    }
    return count;
  }

  private static int firstDayOfYear(int year){
    return 0;
  }

  private static int dayOfYear(int month, int day, int year){
    return 0;
  }

  public static int dayOfWeek(int month, int day, int year){
    int startDay = firstDayOfYear(year);
    int nthDay = dayOfYear(month, day, year);
    return (startDay + nthDay - 1) % 7;
  }
}
