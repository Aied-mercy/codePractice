package 面向对象_01;

public class passObject {
    public static void main(String[] args) {
        Circle c = new Circle();
        passObject test = new passObject();
        test.printAreas(c,5);
    }
    public void printAreas(Circle c,int time)
    {
        System.out.println("Radius\t\tArea");
        for(int i = 1;i<=time;i++)
        {
            c.radius = i;
            double area = c.findArea();
            System.out.println(c.radius + "\t\t\t" + area );
        }
    }



}
