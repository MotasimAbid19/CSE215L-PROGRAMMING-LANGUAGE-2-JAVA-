

public abstract class GeometricObject {
    private String colour;
    private boolean filler;
    private java.util.Date datecreated;

    protected GeometricObject() {
        datecreated = new java.util.Date();
    }

    protected GeometricObject(String colour, boolean filler) {
        this.colour = colour;
        this.filler = filler;
        
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public java.util.Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(java.util.Date datecreated) {
        this.datecreated = datecreated;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}
