package ResourceFiles;

import Pojo.getTokenSer;

public class TestDataBuild {

	public getTokenSer login(String email, String pass) {
		
		getTokenSer token = new getTokenSer();
		token.setuserEmail(email);
		token.setUserPassword(pass);
		return token;
	}
}
