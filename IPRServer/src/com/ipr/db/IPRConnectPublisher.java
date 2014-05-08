package com.ipr.db;

import javax.xml.ws.Endpoint;

public class IPRConnectPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9093/ws/ipr", new IPRConnectImpl());
	}

}
