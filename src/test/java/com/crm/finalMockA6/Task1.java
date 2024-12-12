package com.crm.finalMockA6;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClassDWSPage;
import Com.Crm.Pom.TaskOneData;
import Com.Crm.fileutility.ReadDataFromExcelDWS;
@Listeners(Com.Crm.Listeners.DWSPageExtentReport.class)
public class Task1 extends BaseClassDWSPage
{
	public static ReadDataFromExcelDWS edfs;
	@Test
	public void giftCard() throws InterruptedException ,IOException
	{
	edfs=new ReadDataFromExcelDWS();
		String recname=edfs.exceldata("Sheet1",1,0);
		String recmail=edfs.exceldata("Sheet1",1,1);
		String yourname=edfs.exceldata("Sheet1",1,2);
		String youremail=edfs.exceldata("Sheet1",1,3);
		String msg=edfs.exceldata("Sheet1",1,4);
		String qty=edfs.exceldata("Sheet1",1,5);
		TaskOneData td=new  TaskOneData(driver);
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		td.giftLink().click();
		Thread.sleep(2000);
		td.recName().sendKeys(recname);
		Thread.sleep(1000);
		td.recEmail().sendKeys(recmail);
		Thread.sleep(1000);
		td.yourName().clear();
		td.yourName().sendKeys(yourname);
		Thread.sleep(1000);
		td.yourEmail().clear();
		td.yourEmail().sendKeys(youremail);
		Thread.sleep(1000);
		td.message().sendKeys(msg);
		Thread.sleep(1000);
		td.qty().clear();
		td.qty().sendKeys("5");
		Thread.sleep(1000);
		td.addToCart().click();
		Thread.sleep(2000);
		td.shoppingCart().click();
		String value="$25 Virtual Gift Card";
		

	String val=td.products().getText();
	System.out.println(val);
	assertTrue(val.contains(value));

	}

}
