package class_extends;

public class circle {
    private double r;
    public String name="Բ��";

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return 3.14*r*r;
    }
}
