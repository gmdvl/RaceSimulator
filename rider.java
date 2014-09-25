package carrera_pits;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class rider  extends Thread {//
	
	private JPanel word= pista.word;
	private JPanel jp=new JPanel();
	public rider(int x,int y)
	{
		word.add(jp);
		jp.setSize(5, 5);jp.setLocation(x, y);
		jp.setBackground(Color.orange);
		
		
	}

	Random random=new Random();
	public int place;
	public int laps;
	public int lapsbygom;
	
	
	
	public void move()
	{
		int topY=20;
		if(jp.getX()<100&&(jp.getY()<=5))
			jp.setLocation(jp.getX()+5, jp.getY());
		else if(jp.getX()>5 && jp.getY() >=topY)
			jp.setLocation(jp.getX()-5, jp.getY());
		if(jp.getX()==100&&jp.getY()<topY)
			jp.setLocation(jp.getX(), jp.getY()+5);
		else if(jp.getX()==5&&jp.getY()>5)
			jp.setLocation(jp.getX(), jp.getY()-5);/*&&jp.getY()<topY*/
		if(jp.getX()==5&&jp.getY()==1)
			laps++;
	}
	
	public void run()
	{
		Timer timer=new Timer();
		TimerTask timert=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				move();
				if(jp.getX()==50)
				{
					try { sleep(10000);	} //pausa el thread
	   	      		catch (InterruptedException e) {
	   	      			// TODO Auto-generated catch block
	   	      			e.printStackTrace();
	   	      		}

				}
			}
		};
		timer.schedule(timert, 0,50);
	}
		
}
