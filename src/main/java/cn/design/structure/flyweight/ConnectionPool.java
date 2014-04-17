package cn.design.structure.flyweight;

import java.sql.Connection;
import java.util.Vector;

//共享
public class ConnectionPool {
	Vector<Connection> poolVec = new Vector<Connection>();
	public static ConnectionPool instance;
	private String driver = "";
	private String username = "";
	private String password = "";

	private ConnectionPool() {
		if (instance == null) {
			instance = new ConnectionPool();
			for (int i = 0; i < 100; i++) {
				driver = "";// ...
				Connection con = null;
				poolVec.add(con);
			}
		}
	}

	public synchronized void release(Connection con) {
		poolVec.add(con);
	}

	public Connection getConnection() {
		if (poolVec.size() > 0) {
			Connection con = poolVec.get(0);
			poolVec.remove(con);
			return con;
		} else {
			return null;
		}
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
