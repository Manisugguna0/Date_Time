import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
  public LocalDate addDaysToCurrentDate(int days) 
  {
    LocalDate currentDate = LocalDate.now();  
    return currentDate.plusDays(days);
  }
  
  public LocalDate getFirstDayOfMonth(LocalDate date) {  
    return date.withDayOfMonth(1);
  }
  public static void main(String[] args) {
    LocalDateExp dateExp = new LocalDateExp();
    LocalDate newDate = dateExp.addDaysToCurrentDate(10);  
    System.out.println("New Date after adding 10 days: " + newDate);
    LocalDate firstDayOfMonth = dateExp.getFirstDayOfMonth(LocalDate.of(2024, 8, 26));  
    System.out.println("First Day of Month: " + firstDayOfMonth);
  }
}
