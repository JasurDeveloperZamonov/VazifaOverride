public class Dog extends Animal{
    private String tovush;
    private String name;

    public String getTovush() {
        return tovush;
    }

    public void setTovush(String tovush) {
        this.tovush = tovush;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound(){
       Dog d=new Dog();
       d.setTovush("bow bow");
        System.out.println(d.getTovush());
    }
    public void get_Name(){
        Dog d=new Dog();
        d.setName("Xatiko");
        System.out.println(d.getName());
    }
}
