import com.yann.designpattern.prototype.Apple;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Hello!");
        new Main().prototype();
    }

    private void prototype() {
        Apple apple = new Apple("烟台苹果", "大", "山东烟台");
        Apple apple1 = null;
        try {
            apple1 = (Apple) apple.clone();
            apple1.setSize("小");
            System.out.println("我有两个" + apple.getName() + "一个" + apple.getSize() + "一个" + apple1.getSize());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
