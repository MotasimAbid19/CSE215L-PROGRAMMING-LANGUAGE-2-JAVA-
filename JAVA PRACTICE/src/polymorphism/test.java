

public class test {
    public static void main(String[] args) {
        Shape s = new Shape() ;
        Triangle t = new Triangle(10, 20);
        Rectangle r = new Rectangle(10,20 );
        System.out.println(s.area());
        System.out.println(t.area());
        System.out.println(r.area());

        Shape s1 = new Shape() ;
        Shape s2 = new Triangle(10, 20);
        Shape s3 = new Rectangle(10,20 );
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

        Shape S[] = new Shape[3];
        S[0]= new Shape() ;
        S[1] = new Triangle(10, 20);
        S[2] = new Rectangle(10,20 );
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i].area());
        }

    }
    
}
