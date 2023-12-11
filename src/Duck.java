public class Duck extends Animal{
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
        Duck d=new Duck();
        d.setTovush("quack quack");
        System.out.println(d.getTovush());
    }
    public void get_Name(){
        Duck d=new Duck();
        d.setName("Scrooge");
        System.out.println(d.getName());
    }
}
