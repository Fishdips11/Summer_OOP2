package jun11.Activity_1;

public class Student extends AbstractMethods {
    private String name;
    private int num;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getNum() {
        return num;
    }
    @Override
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public void display() {
        for(int i = 0; i < getNum(); i++) {
            System.out.println(getName());
        }
    }

}
