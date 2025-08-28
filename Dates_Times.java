import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_Times {
    public static void main(String[] args){

        //Theme: Dates and Times

        //How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//
//        LocalDateTime datetime = LocalDateTime.now();
//        System.out.println(datetime);
//
//        Instant instant = Instant.now();
//        System.out.println(instant);

        //custom format

//        LocalDateTime datetime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
//        String newDateTime = datetime.format(formatter);
//        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2025,8,27,9,3,0);
        LocalDateTime date2 = LocalDateTime.of(2025,9,22,9,0,0);

        if(date1.isBefore(date2)){
            System.out.println(date1 + "is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + "is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + "is equal to " + date2);
        }
    }
}
