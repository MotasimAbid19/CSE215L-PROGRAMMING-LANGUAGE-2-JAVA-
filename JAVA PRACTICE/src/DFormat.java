import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DFormat {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat CDate = new SimpleDateFormat("dd/MM/YYYY");
        String CD = CDate.format(date);
        System.out.println("Current date format "+CD);
    }
    
}
