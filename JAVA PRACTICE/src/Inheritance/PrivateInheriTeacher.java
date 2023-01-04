public class PrivateInheriTeacher extends PrivateInheriPerson{
    private String qualification ;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void displayInfo(){
        System.out.println("Name="+getName());
        System.out.println("Age="+getAge());
        System.out.println("Qualification="+getQualification());
    }
    
    
}
