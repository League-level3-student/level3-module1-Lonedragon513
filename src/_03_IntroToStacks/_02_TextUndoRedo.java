package _03_IntroToStacks;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame ;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	public static void main(String[] args) {
		new _02_TextUndoRedo().setup();
	}
	JFrame f;
	JPanel p;
	JLabel l;
	Stack<String> text;
	void setup () {
		f = new JFrame();
		p = new JPanel();
		l=new JLabel();
		f.add(p);
		p.add(l);
		f.addKeyListener(this);
		f.show();
		
		text = new Stack<String>();
		
		Font font = new Font("Tamil MN", Font.BOLD, 9);
		
		l.setFont(font);
		
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==10) {
		if (text.size()!= 0) {
			l.setText(l.getText()+text.pop());
		}
		}
		else if (e.getKeyCode()==8) {
			if(l.getText().length()!=0) {
			text.push(Character.toString(l.getText().charAt(l.getText().length()-1)));
			
			l.setText(""+ l.getText().substring(0,l.getText().length()-1));
			}
		}
		else {
			String s=Character.toString(e.getKeyChar());
			
			l.setText(l.getText()+ s);
			text = new Stack<String>();
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
