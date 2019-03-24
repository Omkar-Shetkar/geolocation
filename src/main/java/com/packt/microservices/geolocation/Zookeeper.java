package com.packt.microservices.geolocation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Zookeeper {

	private String host;
	private int port;

	public Zookeeper(String host, int port) {
		this.host = host;
		this.port = port;
	}

	private String getIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			System.err.println(
					"Error while fetching IP address of the host. Using localhost for now. Error: " + e.getMessage());
			e.printStackTrace();
			return "localhost";
		}
	}

	private int getPort() {
		try {
			return Integer.valueOf(System.getenv("GEOLOCATION_SERVER_PORT"));
		} catch (Exception e) {
			System.err.println("Error while fetcing port. Using default port 8080. Error: " + e.getMessage());
			e.printStackTrace();
			return 8080;
		}
	}

	public void register() {

	}
}
