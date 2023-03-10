public class Test {
    
    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        CircleWithPrivateDataFields[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] cir = new CircleWithPrivateDataFields[5];

        for (int i = 0; i < cir.length; i++) {
            int a =(int) (8+Math.random()*(8-1+1));
            cir[i] = new CircleWithPrivateDataFields(Math.random() * a);
        }

        // Return Circle array
        return cir;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(
            CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("-----------------------------------------------");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is",
                sum(circleArray));
    }

    public static double sum(CircleWithPrivateDataFields[] circleArray) {
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }
}