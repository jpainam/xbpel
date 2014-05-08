package com.ipr.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TestIPR {
	/**
	 * Randomly choice which activity to start with
	 */
	protected static Random rnd = new Random();
	/**
	 * List of activities to be interleaved, their references
	 */
	protected List<Integer> references = null;
	/**
	 * List of activities executed out of the references list
	 */
	protected List<Integer> executed = null;
	
	public TestIPR(){
		this.references = new ArrayList<>();
		this.executed = new ArrayList<>();
	}
	/**
	 * Randomly get the next activity to be executed.
	 * Since we executed two activities, we need one call to {@link com.ipr.db.TestIPR#getRandomInt(int, int)}
	 * @param low min value, for this example low = 0
	 * @param high max value, for this example high = 2
	 * @return return the next int, choosen randomly betwenn 0 and 1 (The max value being excluded)
	 */
	public static int getRandomInt(int low, int high){
		return low + (Math.abs(rnd.nextInt()) % (high - low));
	}
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestIPR ipr = new TestIPR();
		int index = TestIPR.getRandomInt(0, 2);
		System.out.println("value of index = " + index);
		/* Add the activities to be interleaved in the references list */
		ipr.references.add(0); // 0 = AddInterest
		ipr.references.add(1); // 1 = ChargeCredit
		long start = 0, end = 0;
		while(true){
			if(ipr.references.isEmpty())
				break;
			if(index == 0){
				AddInterest addinterest = new AddInterest();
				start = System.currentTimeMillis();
				if(addinterest.execute()){
					end = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "Add Interest " + (end - start));
					System.out.println("Add Interest " + (end - start));
				}else
					System.out.println("Error running AddInterest");
				/* remove this reference from the references list */
				ipr.references.remove((Integer)0);
				/* add this reference into the list of activity executed */
				ipr.executed.add((Integer)0);
				index = 1;
			}else{
				ChargeCredit ccrd = new ChargeCredit();
				start = System.currentTimeMillis();
				if(ccrd.execute()){
					end = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "ChargeCredit " + (end - start));
					System.out.println("ChargeCredit " + (end - start));
				}else
					System.out.println("Error running AddInterest");
				ipr.references.remove((Integer)1);
				ipr.executed.add((Integer)1);
				index = 0;
			}
		}
	}
	
}
