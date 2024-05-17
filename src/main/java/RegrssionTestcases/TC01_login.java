package RegrssionTestcases;

import AllPages.LoginPPP;

public class TC01_login extends LoginPPP
{

	public static void main(String[] args) 
	{
		BroserLaunch();
		Enter_Email("Manoj@gmail.com");
		Enter_password("password");
		LoginIn();

	}

}
