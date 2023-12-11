public class Triangle extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double sideC;

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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    double p;
    @Override
    public void area() {
        Triangle f=new Triangle();
        f.setSideA(10);
        f.setSideB(9);
        f.setSideC(11);
        p=(f.getSideA()+f.getSideB()+f.getSideC())/2;
        System.out.println("S="+Math.sqrt(p*(p-f.getSideA())*(p-f.getSideB())*(p-f.getSideC())));
    }
    @Override
    public void perimeter() {
        Triangle f=new Triangle();
        f.setSideA(10);
        f.setSideB(9);
        f.setSideC(11);
        p=(f.getSideA()+f.getSideB()+f.getSideC())/2;
        System.out.println("P="+2*p);

    }
}
