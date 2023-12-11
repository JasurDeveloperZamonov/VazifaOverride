public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    double p;
    @Override
    public void area() {
        Trapezium f=new Trapezium();
        f.setSideA(5);
        f.setSideB(10);
        f.setHigh(8);
        double s;
        s=((f.getSideA()+f.getSideB())/2)*f.getHigh();
        System.out.println("S="+s);
    }
    @Override
    public void perimeter() {

        System.out.println("Peremetirni hisoblash uchun trapetsiya malumotlari kam!");

    }
}
