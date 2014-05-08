package com.ipr.db;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IPRConnect {
	@WebMethod public boolean updateAccount(String query);
}
