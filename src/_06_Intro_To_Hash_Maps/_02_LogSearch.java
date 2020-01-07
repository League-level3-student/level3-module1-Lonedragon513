package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JFrame f;
	JPanel p;
	JButton add;
	JButton sea;
	JButton view;
	HashMap<Integer, String > data;
	void setup(){
		f = new JFrame();
		p= new JPanel();
		add = new JButton();
		sea  = new JButton();
		view = new JButton();
		
		f.add(p);
		p.add(add);
		p.add(sea);
		p.add(view);
		
		
		add.addActionListener(this);
		sea.addActionListener(this);
		view.addActionListener(this);

		data = new HashMap<Integer,String>();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			String s = JOptionPane.showInputDialog("ID number");
			String ss = JOptionPane.showInputDialog("name");
			data.put(Integer.parseInt(s),ss);
		}
		
		if(e.getSource().equals(sea)) {
			String get = JOptionPane.showInputDialog("ID number");
			System.out.println(data.get(Integer.parseInt(get))); 
			
			for (Integer integer : keySet) {
			
		}\
			
		Set<Integer> keySet = data.keySet();	
		
		
		}
		
		if(e.getSource().equals(view)) {
			for (int i = 0; i < data.size(); i++) {
				System.out.println("ID:" + ""+ "  Name: " + data.get(null)); 
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
