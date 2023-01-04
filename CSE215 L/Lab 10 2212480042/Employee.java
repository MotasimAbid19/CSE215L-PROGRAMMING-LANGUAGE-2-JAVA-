

public class Employee extends Member {
    private String specialization ;
    private String department ;

    public Employee() {
        
    }

   
    public Employee(int age, String name, int hourly_rate, int total_hours ,String s , String d ) {
        super(age, name, hourly_rate, total_hours);
        this.specialization = s ;
        this.department  = d ;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String Basic(){
        return "Basic Salary = "+super.getBasicSalary() ;
    }
    public String Bonus(){
        return "Bonus ="+super.getBonusSalary() ;
    }
    
    
}
