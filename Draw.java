import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

	public Player player;

	private BufferedImage backgroundImage;

	Monster monster1;
	Monster monster2;
	Monster monster3;	
	Monster monster4;	
	Monster monster5;

	public Draw(){
		monster1 = new Monster(100, 200);
		monster2 = new Monster(300, 200);
		monster3 = new Monster(400, 300);
		monster4 = new Monster(100, 400);
		monster5 = new Monster(500, 100);

		player = new Player(-10, 520, this);

		try{
			backgroundImage = ImageIO.read(getClass().getResource("background.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}


	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);
		

		g.drawImage(monster1.image, monster1.xPos, monster1.yPos, this);
		g.drawImage(monster2.image, monster2.xPos, monster2.yPos, this);
		g.drawImage(monster3.image, monster3.xPos, monster3.yPos, this);
		g.drawImage(monster4.image, monster4.xPos, monster4.yPos, this);
		g.drawImage(monster5.image, monster5.xPos, monster5.yPos, this);
		g.drawImage(player.image, player.x, player.y, this);
	}
}