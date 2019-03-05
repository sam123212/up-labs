
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Main extends Applet {

	private static final long serialVersionUID = 1L;
	private static  int X = 600, Y = 600;
	private static int a = 200;
	
	public void init() {
		setSize(X, Y);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.translate(300, 300);
		g2.drawLine(-300, 0, 300, 0);
        g2.drawLine(0, 300, 0, -300);
		g2.setStroke(new Str(2f));
		g2.draw(new Graph(a));
	}
}


