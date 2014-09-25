package carrera_pits;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class pista extends JFrame
{

	public static void main(String[] arg) 
	{
		pista pista=new pista();
		pista.setVisible(true);
	}

	public static JPanel word;
	
	public pista()
	{
		setSize(550,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		word=new JPanel();
		word.setBackground(Color.DARK_GRAY);
		word.setLayout(null);
		word.setSize(this.getHeight(), this.getWidth());
		setContentPane(word);
		
		rider[] r = new rider[1];
		for(int i=0;i<r.length;i++)
		{
			r[i]=new rider(5, (5*(i*2))+1);
			
		}
		for(int i=0;i<r.length;i++)
		{
			r[i].start();
			
		}
		
	}

	
}
