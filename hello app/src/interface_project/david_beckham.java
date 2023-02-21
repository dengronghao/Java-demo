package interface_project;

public class david_beckham implements footballer,law {
    @Override
    public void shoot() {
        System.out.println("圆月弯刀");
    }

    @Override
    public void cross() {
        System.out.println("精准制导");
    }

    @Override
    public void show() {
        System.out.println("you must follow the laws");
    }
}
