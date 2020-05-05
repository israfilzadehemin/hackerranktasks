package app;

public class DayOfTheProgrammer {
  public static void main(String[] args) {
    int source = 1995;

    System.out.println(dayOfProgrammer(source));
  }


  static String isLeapGregorian(int year) {
    String dateInLeap = String.format("12.09.%d", year);
    String dateInCommon = String.format("13.09.%d", year);

    if (year % 400 == 0) return dateInLeap;
    if (year % 4 == 0 && year % 100 != 0)return  dateInLeap;
    return dateInCommon;
  }

  static String isLeapjulian(int year) {
    String dateInLeap = String.format("12.09.%d", year);
    String dateInCommon = String.format("13.09.%d", year);

    if (year % 4 == 0 ) return dateInLeap;
    return dateInCommon;
  }


  static String dayOfProgrammer(int year) {

    if (year >= 1700 && year < 1918) {
      return isLeapjulian(year);
    } else if (year == 1918) {
      return "26.09.1918";

    } else {
      return isLeapGregorian(year);
    }
  }
}

