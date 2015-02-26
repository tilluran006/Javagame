/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/
package javagame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;


 
public class Main extends JFrame{
   
	
    public Thread t = new Thread(jg);
    
	 
	private static final long serialVersionUID = 1L;
	private Image dbImage;			//This creates a double buffer image of the background
	
    private Graphics dbg;			//This creates a double buffer image of the balloon
    
	static Enemy b1= new Enemy((int)(Math.random()*1000)+10,(int)(Math.random()*700)+10);   //The next 4 lines create 5 enemies
   
	static Enemy b2= new Enemy((int)(Math.random()*1000)+10,(int)(Math.random()*700)+10);
	
	
    
	static Enemy b3= new Enemy((int)(Math.random()*1000)+10,(int)(Math.random()*700)+10);
    
	static Enemy b4= new Enemy((int)(Math.random()*1000)+10,(int)(Math.random()*700)+10);
    
	static Enemy b5= new Enemy((int)(Math.random()*1000)+10,(int)(Math.random()*700)+10);
    
	static Enemy coin= new Enemy(500,350);	//This creates the coin we need to collect														
    
    static JavaGame jg = new JavaGame();    //Creating an object of javaGame type
    boolean gameStarted = false;
    Rectangle startButton = new Rectangle(100, 100, 100, 25);
    Rectangle quitButton = new Rectangle(100, 200, 100, 25);
    public Thread ball1 = new Thread(b1);
    public Thread ball2 = new Thread(b2);
    public Thread ball3 = new Thread(b3);
    public Thread ball4 = new Thread(b4);
    public Thread ball5 = new Thread(b5);
    
    public Main(){   //Default constructor for gui window
    	
    	 
        this.setTitle("BALUN");
        this.setSize(1000, 700);
        this.setResizable(false);
        this.setVisible(true);
        this.addMouseMotionListener(jg);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void startGame(){
   
        
        gameStarted = true;
        
        Main main = new Main();
        //Thread ball1 = new Thread(b1);
        //Thread ball2 = new Thread(b2);
        //Thread ball3 = new Thread(b3);
        //Thread ball4 = new Thread(b4);
        //Thread ball5 = new Thread(b5);
        t.start();
        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
        ball5.start();
    	
    }
    
   
    
  
    @Override
    public void paint(Graphics g) { //created a new graphics variable g
        
    	
    	dbImage = createImage(getWidth(), getHeight());//gets the image of the current screen
        
    	dbg = dbImage.getGraphics();//gets the graphics here it is the oval
        try {
            paintComponent(dbg);//paints the oval
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    	g.drawImage(dbImage, 0, 0, this);//draws the screen back   
        
       
        
        
        
    }
    
    @SuppressWarnings("deprecation")
	public void paintComponent(Graphics g) throws IOException{
    	         	   
    	   g.setFont(new Font("Arial", Font.BOLD, 26));
    	   setBackground(Color.BLACK);
    	   g.setColor(Color.RED);
    	   g.drawString("BALUN", 125, 75);
    	   g.setColor(Color.cyan);
    	   g.fillRect(startButton.x, startButton.y, startButton.width, startButton.height);
    	   g.setFont(new Font("Arial", Font.BOLD, 12));
    	   g.setColor(Color.GRAY);
    	   g.drawString("START", startButton.x+20, startButton.y+17);
    	   g.setColor(Color.cyan);
    	   g.fillRect(quitButton.x, quitButton.y, quitButton.width, quitButton.height);
    	   g.setColor(Color.GRAY);
    	   g.drawString("QUIT", quitButton.x+20, quitButton.y+17); 
    	 
              
    	   jg.paintComponent(g);
        
    	   b1.paintComponent(g);
        
    	   b2.paintComponent(g);
        
    	   b3.paintComponent(g);
        
    	   b4.paintComponent(g);
        
    	   b5.paintComponent(g);
        
    	   g.setColor(Color.ORANGE);
        
    	   coin.paintComponent(g);
       
        
    	   if(b1.ball.intersects(jg.r1) || b2.ball.intersects(jg.r1) || b3.ball.intersects(jg.r1) || b4.ball.intersects(jg.r1) || b5.ball.intersects(jg.r1))
            {   
                jg.gameOver();
            }
        
        
    	   if(coin.ball.intersects(jg.r1)){
        	
        	coin.ball.move((int)(Math.random()*900)+80, (int)(Math.random()*600)+80);
        	
        	
			jg.count+=50;
        	
        
        
       }
    	   
    	   if(jg.count>=2500){
    		   jg.gameOver();
    	   }
        repaint();
       
    }   	        
    	      
    
    
    public static void main(String[] args) {
       
        //new Main();
        window window = new window();
        //Threads
        Thread t = new Thread(jg);
        t.start();
        
        
        
        Thread ball1 = new Thread(b1);
        Thread ball2 = new Thread(b2);
        Thread ball3 = new Thread(b3);
        Thread ball4 = new Thread(b4);
        Thread ball5 = new Thread(b5);
        
        ball1.start();
        ball2.start();
        ball3.start();
        ball4.start();
        ball5.start();
    	
    }
    
}
