package valid;

public class ValidAdmin
{
	public static boolean valid(String user, String pwd)
	{
		if(user.length() >= 4 && user.length() <= 20 && pwd.length() >= 8 && pwd.length() <= 50)
			return true;
		else
			return false;
	}

}
