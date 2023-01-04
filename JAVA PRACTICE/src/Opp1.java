public class Opp1 {
    
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Motasim Abid";
        teacher1.gender = "Male";
        teacher1.phone = 6515;

        System.out.println("Name " + teacher1.name);
        System.out.println("gender " + teacher1.gender);
        System.out.println("PHone " + teacher1.phone);

        Teacher teacher2 = new Teacher();
        teacher2.name = "Abida";
        teacher2.gender = "Female";
        teacher2.phone = 4561513;
        teacher2.TeacherInfo();

        Teacher teacher3 = new Teacher();
        teacher3.name = "Tanjina";
        teacher3.gender = "Female";
        teacher3.phone = 315151;
        teacher3.TeacherInfo();

        Teacher teacher4 = new Teacher();
        teacher4.setInfo("Abir", "Male", 4444);
        teacher4.TeacherInfo();

        /* Constructor using....
        Teacher teacher5 = new Teacher("Arif","Male0", 66566);
        teacher5.TeacherInfo();
        */
    }

}
