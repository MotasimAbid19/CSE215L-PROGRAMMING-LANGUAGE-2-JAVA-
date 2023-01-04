import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTImeFormetter {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formateTime = time.format(timeformatter);
        System.out.println("Formate time "+formateTime);
    }
    
}
