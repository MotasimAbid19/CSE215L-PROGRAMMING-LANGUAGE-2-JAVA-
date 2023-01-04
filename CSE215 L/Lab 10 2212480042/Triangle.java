
public class Triangle {
    private int s1, s2, s3;

    public Triangle() {
        this.s1 = 1;
        this.s2 = 1;
        this.s3 = 1;
    }

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public double getArea(){
        double s = s1+s2+s3 ;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    public double getPerimeter(){
        return s1+s2+s3 ;
    }
    
}
