package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement eleCreateLeads;
	
	@And("Click Create Lead")
	public CreateLead clickCreateLeads()
	{
		click(eleCreateLeads);
		return new CreateLead();
	}
	@FindBy (how=How.XPATH, using = "//a[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public FindLeadPage clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeadPage();
	}

	@FindBy (how=How.XPATH, using = "//a[text()='Merge Leads']")
	private WebElement eleMergeLead;
	
	public MergeLeadPage clickMergeLead()
	{
		click(eleMergeLead);
		return new MergeLeadPage();
	}
}
