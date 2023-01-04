public class Lab2 {
    public static void main(String[] args) {
        float radius = 5.5f;
        float perimeter = (float) (2 * radius * Math.PI);
        float area = (float) (radius * radius * Math.PI);

        System.out.printf("The perimeter is %.2f\n", perimeter);

        System.out.printf("The area is %.2f\n", area);
    }
}
