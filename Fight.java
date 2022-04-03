package 面向对象_01;

public class Fight {
    public static void main(String[] args) {
        tank tank1,tank2;
        tank1=new tank();
        tank2=new tank();
        tank1.setBulletAmount(200);
        tank1.setBulletAmount(100);
        System.out.println("tank1的炮弹数量："+tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量："+tank2.getBulletAmount());
        tank1.speedUp(200);
        tank2.speedUp(300);
        System.out.println("tank1目前的速度："+tank1.getSpeed());
        System.out.println("tank2目前的速度："+tank2.getSpeed());
        tank1.speedDown(20);
        tank2.speedDown(50);
        System.out.println("tank1目前的速度："+tank1.getSpeed());
        System.out.println("tank2目前的速度："+tank2.getSpeed());
        System.out.println("tank1开火：");tank1.fire();
        System.out.println("tank2开火：");tank2.fire();
        System.out.println("tank1的炮弹数量："+tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量："+tank2.getBulletAmount());
        }
    }




