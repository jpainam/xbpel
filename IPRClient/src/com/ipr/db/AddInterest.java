package com.ipr.db;

import javax.swing.JOptionPane;

public class AddInterest {
	IPRConnect iprservice = null;
	public AddInterest(){
		IPRConnectImplService service = new IPRConnectImplService();
		iprservice = service.getIPRConnectImplPort();
		/*boolean val = iprservice.updateAccount("UPDATE account SET INTEREST = '5000' WHERE ACCID = '1'");
		if(val)
			JOptionPane.showMessageDialog(null, "Update " + val);
		else
			JOptionPane.showMessageDialog(null, "Error updating");*/
	}
	public boolean execute(){
		return iprservice.updateAccount("UPDATE account SET INTEREST = '2000' WHERE ACCID = '1'");
	
	}
	/*public static void main(String[] args){
		new AddInterest();
	}*/
}
