package com.login.script;

import java.io.FileReader;
import java.util.Properties;

import com.login.base.Base;
/**
 * @author PremSai Manthani
 * @purpose this class performs the execution 
 *
 */

public class Login {
	public Properties property;
	String url = "http://localhost:8080/LoginApp/login.jsp";

	public void loginScript() {

		Base loginObject = new Base();
		loginObject.basicSetup("url");
		
	}

}
