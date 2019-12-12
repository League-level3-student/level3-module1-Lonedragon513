package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class HangMan implements KeyListener{
	public static void main(String[] args) {
		new HangMan().setup();
		new HangMan().addWords();
		
	}
	JFrame f;
	JPanel p;
	JLabel l;
	Stack<String> w = new Stack<String>();
	void setup() {
		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		f.add(p);
		p.add(l);
		f.addKeyListener(this);
	}
	
	void addWords () {
		int numb = Integer.parseInt(JOptionPane.showInputDialog("numb"));
		for (int i = 0; i < numb; i++) {
			w.push(new Utilities().readRandomLineFromFile("dictionary.txt"));
		
		}
			}
	String word;
	void setGame() {
			word = w.pop();
			for (int i = 0; i < word.length(); i++) {
				l.setText(l.getText()+"*");
			}
		}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		for (int i = 0; i < word.length(); i++) {
			if (e.getKeyChar()==word.charAt(i)) {
				
			}
		}
		
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
