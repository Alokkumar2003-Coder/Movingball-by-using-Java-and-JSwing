import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JFrame;

class Example2 extends JFrame
{
    public Example2()
    {
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        MyAnimation1 panel = new MyAnimation1(780,560);
        panel.setBackground(Color.BLACK);
        add(panel);

    }
}
class MyAnimation1 extends JPanel
{
    int x = 0;
    int y = 0;
    int ballwidth = 50;
    int ballheight = 50;
    int stepsize = 10;
    int max_x,max_y;
    int speedx = 10;
    int speedy = 10;

    
    MyAnimation1(int w , int h)
    {
        this.max_x = w-ballwidth;
        this.max_y = h-ballheight;

    }
    @Override
    public  void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x,y,ballwidth,ballheight);

        if(x>max_x || x<0 )
            speedx=-speedx;
        if(y>max_y || y<0 )
            speedy=-speedy;

        x=x+speedx;
        y=y+speedy;

        try
        {
        Thread.sleep(20);
        }
        catch(Exception e)
        {

        }

        repaint();

    }
}
public class MyAnmPrt2
{
    public static void main(String[] args) 
    {
        new Example2().setVisible(true);

    }
    
}
