public class Rectangle extends GeometricFigure{
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void area() {
        Rectangle r=new Rectangle();
         r.setSideA(5);
         r.setSideB(4);
        System.out.println("S="+r.getSideA()*r.getSideB());
    }
    @Override
    public void perimeter() {
        Rectangle r=new Rectangle();
        r.setSideA(5);
        r.setSideB(4);
        System.out.println("P="+2*(r.getSideA()+r.getSideB()));

    }
}
