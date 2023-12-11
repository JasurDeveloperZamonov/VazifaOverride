public class Main {
    public static void main(String[] args) {
        GeometricFigure a=new Triangle();
        a.area();
        a.perimeter();
        System.out.println();
        GeometricFigure t=new Trapezium();
        t.area();
        t.perimeter();
        System.out.println();
        GeometricFigure r=new Rectangle();
        r.area();
        r.perimeter();
        ///************ Vazifa B *************///

        Animal d=new Dog();
        System.out.println();
        System.out.println("Dog");
        d.get_Name();
        d.sound();

        Animal b=new Duck();
        System.out.println();
        System.out.println("Duck");
        b.get_Name();
        b.sound();

        Animal c=new Cat();
        System.out.println();
        System.out.println("Cat");
        c.get_Name();
        c.sound();
    }
}