public class Cat extends Animal{
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
        Cat c=new Cat();
        c.setTovush("meow meow");
        System.out.println(c.getTovush());
    }
    public void get_Name(){
        Cat c=new Cat();
        c.setName("Tom");
        System.out.println(c.getName());
    }
}
