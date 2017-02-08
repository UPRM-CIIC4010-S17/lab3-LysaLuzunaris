import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Lysa");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(200, 200);
		myFrame.setSize(200, 200);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		 GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	        int width = gd.getDisplayMode().getWidth();
	        int height = gd.getDisplayMode().getHeight();
	        int JFrameWidth = 200;
	        int JFrameHeight = 200;
	        myFrame.setLocation((width/2)-JFrameWidth/2, (height/2)-JFrameHeight/2);
	        myFrame.setSize(JFrameWidth, JFrameHeight);


	}
}