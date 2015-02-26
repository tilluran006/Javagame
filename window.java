package javagame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class window extends JFrame implements ActionListener{
private final JLabel entername;
	
	private final JButton click1;
	private final JButton click2;
	
	
	
	public window(){
		

		Font font = new Font("Arial",Font.BOLD,30);
		setContentPane(new JLabel(new ImageIcon("C:/Users/Personal/Pictures/Backgrounds Wallpapers HD/image.jpg")));
		setLayout(null);
		setSize(1000,700);
		setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ballon!");
		setFont(font);
		setVisible(true);
		entername = new JLabel("Ballon");
		entername.setFont(new Font("Arial", Font.BOLD, 40));
		click1 = new JButton("STARTING IN ");
		click2 = new JButton("INSTRUCTION");
		
		entername.setBounds(330,130,120,40);
		entername.setBackground(Color.blue);
		
		click1.setBounds(270,200,250,50);
		click1.addActionListener(this);
		add(click1);
		click2.setBounds(270,270,250,50);
		click2.addActionListener(this);
		add(click2);
		add(entername);
		
	click1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ev) {
            Main main = new Main();        
            setVisible(false);
        }
});

}



@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}