package tommy.spring.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionManager {
	private String drvierClass;
	private String url;
	private String username;
	private String password;
	public Connection getConnection() {
		try {
			Class.forName(drvierClass);
			return DriverManager.getConnection(url, username, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void setDrvierClass(String drvierClass) {
		this.drvierClass = drvierClass;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "JDBCConnectionManager [drvierClass=" + drvierClass + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
