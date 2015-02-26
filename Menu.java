package javagame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {

    Rectangle startButton = new Rectangle(100, 100, 100, 25);
    Rectangle quitButton = new Rectangle(100, 200, 100, 25);
    
	public void render(Graphics g){
		
		
		
		g.setFont(new Font("Arial", Font.BOLD, 26));
 	   
 	   	g.setColor(Color.RED);
 	   	g.drawString("BALUN", 125, 75);
 	   
 	  	Graphics2D g2d = (Graphics2D) g;
 	   
 	   
 	  	g.setColor(Color.cyan);
 	   //g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
 	   g.setFont(new Font("Arial", Font.BOLD, 12));
 	   g.setColor(Color.GRAY);
 	   g2d.draw(startButton);
 	   g.drawString("START", startButton.x+20, startButton.y+17);
 	   g2d.draw(quitButton);
 	   g.setColor(Color.GRAY);
 	   //g.drawString("QUIT", quitButton.x+20, quitButton.y+17);
 	  // g.fillRect(quitButton.x, quitButton.y, quitButton.width, quitButton.height);
 	   g.setColor(Color.GRAY);
 	   g.drawString("QUIT", quitButton.x+20, quitButton.y+17);
 	   
		
		
		
	}
}
