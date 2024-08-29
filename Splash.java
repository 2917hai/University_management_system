
package university.management.system.a;
        import javax.swing.*;
        import java.awt.*;

public class Splash {
    public static void main(String s[]){
        Frame f = new Frame("");
        f.setVisible(true);
        int i;
        int x=1;
        for(i=2;i<=800;i+=4,x+=1){
            f.setLocation((565-((i+x)/2) ),400-(i/2));
            f.setSize(i+3*x,i+x/2);

            try{
                Thread.sleep(10);
            }catch(Exception e) { }


        }
    }
}
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(String s){
        super("Umesh yadav");
        setLayout(new FlowLayout());
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/a/Icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel m1 = new JLabel(i3);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(8000);
            this.setVisible(false);
            Login f1 = new Login();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}

