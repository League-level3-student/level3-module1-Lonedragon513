package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{ArrayList<Song> song = new ArrayList<Song>();
	public _06_IPodShuffle() { 
		// 1. Use the Song class the play the demo.mp3 file.
				
		Song one = new Song ("Spooky Scary Skeletons.mp3");
		Song two = new Song ("jeopardy.wav");
		Song three = new Song ("homer-woohoo.wav");
		Song four = new Song ("homer-doh.wav");
		Song five = new Song ("hi.mp3");
		Song six = new Song ("correct.wav");
		song.add(one);
		song.add(two);
		song.add(three);
		song.add(four);
		song.add(five);
		song.add(six);
		
			JFrame f = new JFrame();
		JButton b = new JButton("Surprise Me!");
		f.add(b);
		f.pack();
		b.addActionListener(this);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

		
	}
	
	
		
		
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int ran = new Random().nextInt(5);
		song.get(ran).play();
		
	}
}