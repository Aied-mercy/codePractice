package 面向对象_03_;

public class circleCylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为："+volume);

        double area = cy.findArea();
        System.out.println("底面圆的面积："+area);
    }
}
