package jungsuk.ch07_2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//class EventHandler  extends WindowAdapter{
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//		}
//	
//}


public class Exercise7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}

}
