public class test {
    public static void main(String[] args) {
        intanceOfAnimal a = new intanceOfAnimal();
        intanceOfPerson p = new intanceOfPerson();
        intanceofTeacher t = new intanceofTeacher();

        System.out.println(a instanceof intanceOfAnimal);
        System.out.println(p instanceof intanceOfPerson);
        System.out.println(t instanceof intanceofTeacher);
        System.out.println(a instanceof intanceofTeacher);
        System.out.println(t instanceof intanceOfAnimal);
    }
    
}
