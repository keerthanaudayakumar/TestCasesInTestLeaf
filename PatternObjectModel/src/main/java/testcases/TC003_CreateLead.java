package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating Lead in LeafTaps Application";
		testNodes="CreateLeads";
		category="Smoke";
		authors="Bhuvi";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchCreateLeadData")
	public void CreateLead(String uName, String pwd, String vName, String cName,String fName,String lName, String vcName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyCompanyName(vcName);
			
	}

}
