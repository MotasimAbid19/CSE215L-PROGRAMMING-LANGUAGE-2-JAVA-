public class PrivateInheriTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        PrivateInheriTeacher t1 = new PrivateInheriTeacher() ;
        t1.setName("Abid");
        t1.setAge(22);
        t1.setQualification("BSc in CSE");
        t1.displayInfo();
        System.out.println();
        System.out.println();

        PrivateInheriTeacher t2 = new PrivateInheriTeacher();
        t2.setName("Asifuzzam");
        t2.setAge(32);
        t2.setQualification("PhD in CSE");
        t2.displayInfo();
    }
}
