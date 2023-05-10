import java.time.LocalDate;

public class CompareTwoDate {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 07, 9);
        LocalDate endDate = LocalDate.of(2022, 07, 15);

        LocalDate Currentdate = startDate.plusDays(1);
        while (Currentdate.isBefore(endDate)) {
            System.out.println(Currentdate);
            Currentdate = Currentdate.plusDays(1);
        }
    }
}