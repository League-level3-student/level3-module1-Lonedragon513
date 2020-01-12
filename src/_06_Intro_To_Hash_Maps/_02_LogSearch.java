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
	JButton re;
	HashMap<Integer, String > data;
	public static void main(String[] args) {
		new _02_LogSearch().               setup();
	}
	void setup(){
		f = new JFrame();
		p= new JPanel();
		add = new JButton("		add");
		sea  = new JButton("	sea");
		view = new JButton("	view");
		re = new JButton("re");
		
		f.add(p);
		p.add(add);
		p.add(sea);
		p.add(view);
		p.add(re);
		
		
		add.addActionListener(this);
		sea.addActionListener(this);
		view.addActionListener(this);
		re.addActionListener(this);

		data = new HashMap<Integer,String>();
		f.setVisible(true);//();
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
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
				String get = JOptionPane.showInputDialog("ID number");int i =Integer.parseInt(get);
			
				/**
			boolean ish= false;
			for (Integer key : data.keySet()) {
				if (i == key) {
					System.out.println(data.get(i)); 
					 ish=true;
					break;
				}
				
		}
			if (ish==false)
					System.out.println("wrong");
		
		
		*/
				if (data.keySet().contains(i)) {
					System.out.println(data.get(i)); 
				}
				else
					System.out.println("wrong");
				
		}
		
		if(e.getSource().equals(view)) {
			for (Integer integer : data.keySet()) {
				JOptionPane.showMessageDialog(null, "ID:" + integer+ "  Name: " + data.get(integer)); 
			
			}
			
		}
		
		if(e.getSource().equals(re)) {
			String get = JOptionPane.showInputDialog("ID number");int i =Integer.parseInt(get);
			data.remove(i);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
