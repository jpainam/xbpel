package com.ipr.db;

public class ChargeCredit {
	IPRConnect iprservice = null;
	public ChargeCredit(){
		IPRConnectImplService service = new IPRConnectImplService();
		iprservice = service.getIPRConnectImplPort();
	}
	public boolean execute(){
		return iprservice.updateAccount("UPDATE account SET CREDITCARD = '5000' WHERE ACCID = '1'");
	}
}
