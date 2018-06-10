package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
public ViewLead()
{
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.ID, using = "viewLead_companyName_sp")
private WebElement eleVerifyCompanyName;

public ViewLead verifyCompanyName(String data) {
	verifyPartialText(eleVerifyCompanyName, data) ;
	return this;	
}

public ViewLead verifyTitlePageForEditLead(String data) {
	verifyTitle(data);
    return this;
}
@FindBy(how=How.LINK_TEXT, using = "Edit")
private WebElement eleEditButton;
public CRMPage clickEdit () {
	click(eleEditButton);
	return new CRMPage();
}

@FindBy(how=How.ID,using="viewLead_companyName_sp")
private WebElement eleVerifyCompanyNameForEditLead;

public ViewLead verifyCompanyNameForEditLead(String data) {
verifyPartialText(eleVerifyCompanyNameForEditLead, data);
	return this;		
}

@FindBy(how=How.XPATH, using = "//a[text()='Find Leads']")
private WebElement eleFindLead;

public FindLeadPage clickFindLeadForMergeLead ()
{
	click(eleFindLead);
	return new FindLeadPage();
}

@FindBy(how=How.XPATH, using = "//a[text()='Delete']")
private WebElement eleDelete;

public MyLeads clickDeleteForDeleteLead ()
{
	click(eleDelete);
	return new MyLeads();
}

@FindBy(how=How.XPATH, using = "//a[text()='Duplicate Lead']")
private WebElement eleDuplicate;

public DuplicateLead clickDuplicateForDuplicateLead ()
{
	click(eleDuplicate);
	return new DuplicateLead();
}

@FindBy(how=How.ID, using = "viewLead_firstName_sp")
private WebElement eleFirstName;

public ViewLead verifyNameForDuplicate()
{
	String dupName = getText(eleFirstName);
	if(dupName.equalsIgnoreCase(name))
	{
		System.out.println("both name same");
	}
	return this;
}

@Then("verify create lead is created successfully")
public ViewLead verifyCreateLead()
{
	System.out.println("Created successfully");
	return this;
}
}