
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("The time right now "+time);
        LocalDateTime DT = LocalDateTime.now();
        System.out.println("Local time date now "+DT);
    }
    
}
