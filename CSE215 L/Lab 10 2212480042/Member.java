
public class Member {
    private int age ;
    private String name  ;
    private int hourly_rate ;
    private int total_hours ;
    public Member() {
        this.age = 18;
        this.name = "Abid";
        this.hourly_rate = 900;
        this.total_hours = 60;
    }

    public Member(int age, String name, int hourly_rate, int total_hours) {
        this.age = age;
        this.name = name;
        this.hourly_rate = hourly_rate;
        this.total_hours = total_hours;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public int getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(int total_hours) {
        this.total_hours = total_hours;
    }
    public double getBasicSalary(){
        return (this.getHourly_rate()*this.getTotal_hours());
        
    }
    
    public double getBonusSalary(){
        if(this.getAge()>30)
            return ((0.1)*this.getBasicSalary());
        return 0 ;
    }
    
    
}
