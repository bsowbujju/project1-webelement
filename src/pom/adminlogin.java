package pom;

public class adminlogin {

	@FindBy(id="username")
	private WebElement unname;
	
	@FindBy(id="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login'])
	private WebElement login;
	
	public adminlogin(WebDriver driver)
	{
		pagefactory.initelements(driver this)
	}

	public void setname(String s1)
	{
		uname.sendkeys(s1);
	}
	public void setpwd(String s1)
	{
		pwd.sendkeys(s1)
	}

public void click()
{
	login.click();

}
}
