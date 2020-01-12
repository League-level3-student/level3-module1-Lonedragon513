package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class HangMan implements KeyListener {
	public static void main(String[] args) {
		HangMan HM = new HangMan();
		HM.setup();
		HM.addWords();

	}

	JFrame f;
	JPanel p;
	JLabel l;
	JLabel lu;
	Stack<String> w = new Stack<String>();

	void setup() {
		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		lu = new JLabel();
		f.add(p);
		p.add(l);
		p.add(lu);
		f.addKeyListener(this);
		f.show();
	}

	int numb;

	void addWords() {
		w = new Stack<String>();
		numb = Integer.parseInt(JOptionPane.showInputDialog("numb"));
		for (int i = 0; i < numb; i++) {
			w.push(new Utilities().readRandomLineFromFile("dictionary.txt"));

		}
		setGame();
	}

	String word;

	void setGame() {
		if (l.getText().equals("U LOST")) {

		} else if (l.getText().equals("U WON")) {

		} else if (w.size() > 0) {
			word = w.pop();
			l.setText("");
			lu.setText("");
			for (int i = 0; i < word.length(); i++) {
				l.setText(l.getText() + "*");
			}
			System.out.println(word);
			p.remove(l);p.remove(lu);
			p.add(l);p.add(lu);
			f.pack();
		} else {
			l.setText("U WON");
			lu.setText("");
			f.pack();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	boolean have;

	@Override
	public void keyPressed(KeyEvent e) {
		if (l.getText().equals("U LOST")) {

		} else if (l.getText().equals("U WON")) {

		} else {
			have = false;
			// TODO Auto-generated method stub
			System.out.println(e.getKeyCode());
			for (int i = 0; i < word.length(); i++) {
				if (e.getKeyChar() == word.charAt(i)) {
					l.setText(l.getText().substring(0, i) + e.getKeyChar() + (l.getText().substring(i + 1)));
					have = true;
				}

			}
			for (int i = 0; i < word.length(); i++) {
				if (Character.toString(l.getText().charAt(i)).equals("*")) {
					break;
				}
				if (i == word.length() - 1) {

					setGame();
				}
			}
			if (have == false) {
				lu.setText(lu.getText() + e.getKeyChar());
				f.pack();
				if (lu.getText().length() > 5) {
					l.setText("U LOST");
					lu.setText("");
					f.pack();
					return;
				}
			}

		}
		if (e.getKeyCode() == 10) {
			l.setText("");
			addWords();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
