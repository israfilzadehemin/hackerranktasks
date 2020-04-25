package app;

public class TimeConversion {
  public static void main(String[] args) {

    String source = "12:45:54PM";
    System.out.println(timeConversion(source));
  }

  static String timeConversion(String s) {
    StringBuilder newTime = new StringBuilder();

    if (s.contains("PM")) {
      String hour = String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12);
      if (hour.equals("24")) hour="12";
      newTime.append(hour).append(s.substring(2, s.length()));
    }

    if (s.contains("AM")) {
      String hour = s.substring(0, 2);
      if (hour.equals("12")) hour="00";
      newTime.append(hour).append(s.substring(2, s.length()));
    }

    String newTimeString = newTime.toString();
    return newTimeString.replaceAll("PM", "").replaceAll("AM", "");
  }
}
