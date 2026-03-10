package FinalProject.AutomationProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AutomationProjectWebsite {
	WebDriver driver=new ChromeDriver();
	Actions act=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	

	@Test(description="This part contains the Research_Advisory_Council ",enabled=true,priority=1)
	  public void Research_Advisory_Council() throws Exception {
		//js.executeScript("window.scrollBy(0,400)");
		  Thread.sleep(1000);
		 
		  //About Research Advisory Council
		  WebElement About_Research_Advisory_Council=driver.findElement(By.xpath("//span[normalize-space()='About Research Advisory Council']"));
		  act.click(About_Research_Advisory_Council).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  driver.findElement(By.xpath("//span[contains(text(),'Doctor of Philosophy (PhD) Awardees of St.Thomas C')]")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='BOTANY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='BOTANY']")).click();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,200);");
	      
	      driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//span[@class='fusion-toggle-heading'][normalize-space()='COMMERCE']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@class='fusion-toggle-heading'][normalize-space()='COMMERCE']")).click();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,200);");
	      
	      driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//span[normalize-space()='ENGLISH']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='ENGLISH']")).click();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,200);");
	      
	      driver.findElement(By.xpath("//span[normalize-space()='MATHEMATICS']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='MATHEMATICS']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//span[normalize-space()='STATISTICS']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='STATISTICS']")).click();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,200);");
	      
	      driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY']")).click();
	      Thread.sleep(1000);
	
		  
		  
		  driver.navigate().back();
		  
		  js.executeScript("window.scrollBy(0,600);");
		  js.executeScript("window.scrollBy(0,600);");
		  
		  WebElement UniversityOfCalicut=driver.findElement(By.xpath("//a[normalize-space()='Directorate of Research, University of Calicut']"));
			act.click(UniversityOfCalicut).perform();
			//driver.navigate().back();
			String UniversityOfCalicutParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+UniversityOfCalicutParent);
				
			Set<String> UniversityOfCalicutAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+UniversityOfCalicutAllWindow);
				
			String yy="";
				
			for(String temp2:UniversityOfCalicutAllWindow) {
					System.out.println("all windows :"+temp2);
					driver.switchTo().window(temp2);
					
					if(!temp2.equals(UniversityOfCalicutParent)) {
						yy=driver.getTitle();
						System.out.println("The page title is :"+yy);
					}
					if(yy.equals("Home")) {
						driver.close();
						
						
					}
			  }
			driver.switchTo().window(UniversityOfCalicutParent);
		  driver.navigate().back();
		
		
	}
	@Test(description="This part contains the Research_Advisory_Council_Members",enabled=true,priority=2)
	  public void Research_Advisory_Council_Members() throws Exception {
		 //Research Advisory Council Members
		  WebElement Research_Advisory_Council_Members=driver.findElement(By.xpath("//span[normalize-space()='Research Advisory Council Members']"));
		  act.click(Research_Advisory_Council_Members).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_Centres",enabled=true,priority=3)
	  public void Research_Centres() throws Exception {
		//Research_Centres
		  WebElement Research_Centres=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Centres']"));
		  act.click(Research_Centres).perform();
		  Thread.sleep(1000);

		  
		  WebElement DEPARTMENT_OF_ENGLIS=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF ENGLIS']"));
			act.click(DEPARTMENT_OF_ENGLIS).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_ENGLISParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_ENGLISParent);
				
			Set<String> DEPARTMENT_OF_ENGLISAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_ENGLISAllWindow);
				
			String y1="";
				
			for(String temp3:DEPARTMENT_OF_ENGLISAllWindow) {
					System.out.println("all windows :"+temp3);
					driver.switchTo().window(temp3);
					
					if(!temp3.equals(DEPARTMENT_OF_ENGLISParent)) {
						y1=driver.getTitle();
						System.out.println("The page title is :"+y1);
					}
					if(y1.equals("English - St Thomas College (Autonomous)")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_ENGLISParent);
			
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(1000);
			
			WebElement DEPARTMENT_OF_ZOOLOGY=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF ZOOLOGY']"));
			act.click(DEPARTMENT_OF_ZOOLOGY).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_ZOOLOGYParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_ZOOLOGYParent);
				
			Set<String> DEPARTMENT_OF_ZOOLOGYAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_ZOOLOGYAllWindow);
				
			String y2="";
				
			for(String temp4:DEPARTMENT_OF_ZOOLOGYAllWindow) {
					System.out.println("all windows :"+temp4);
					driver.switchTo().window(temp4);
					
					if(!temp4.equals(DEPARTMENT_OF_ZOOLOGYParent)) {
						y2=driver.getTitle();
						System.out.println("The page title is :"+y2);
					}
					if(y2.equals("Deparment of Zoology | St. Thomas College Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_ZOOLOGYParent);
			
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(1000);
			
			WebElement DEPARTMENT_OF_CHEMISTRY=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF CHEMISTRY']"));
			act.click(DEPARTMENT_OF_CHEMISTRY).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_CHEMISTRYParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_CHEMISTRYParent);
				
			Set<String> DEPARTMENT_OF_CHEMISTRYAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_CHEMISTRYAllWindow);
				
			String y3="";
				
			for(String temp5:DEPARTMENT_OF_CHEMISTRYAllWindow) {
					System.out.println("all windows :"+temp5);
					driver.switchTo().window(temp5);
					
					if(!temp5.equals(DEPARTMENT_OF_CHEMISTRYParent)) {
						y3=driver.getTitle();
						System.out.println("The page title is :"+y3);
					}
					if(y3.equals("Department of Chemistry | St. Thomas College (Autonomous) College")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_CHEMISTRYParent);
			
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(1000);
			
			
			WebElement DEPARTMENT_OF_STATISTICS=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF STATISTICS']"));
			act.click(DEPARTMENT_OF_STATISTICS).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_STATISTICSParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_STATISTICSParent);
				
			Set<String> DEPARTMENT_OF_STATISTICSAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_STATISTICSAllWindow);
				
			String y4="";
				
			for(String temp6:DEPARTMENT_OF_STATISTICSAllWindow) {
					System.out.println("all windows :"+temp6);
					driver.switchTo().window(temp6);
					
					if(!temp6.equals(DEPARTMENT_OF_STATISTICSParent)) {
						y4=driver.getTitle();
						System.out.println("The page title is :"+y4);
					}
					if(y4.equals("Department of Statistics | St. Thomas College Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_STATISTICSParent);
			

			
			WebElement DEPARTMENT_OF_COMMERCE=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF COMMERCE']"));
			act.click(DEPARTMENT_OF_COMMERCE).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_COMMERCEParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_COMMERCEParent);
				
			Set<String> DEPARTMENT_OF_COMMERCEAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_COMMERCEAllWindow);
				
			String y5="";
				
			for(String temp7:DEPARTMENT_OF_COMMERCEAllWindow) {
					System.out.println("all windows :"+temp7);
					driver.switchTo().window(temp7);
					
					if(!temp7.equals(DEPARTMENT_OF_COMMERCEParent)) {
						y5=driver.getTitle();
						System.out.println("The page title is :"+y5);
					}
					if(y5.equals("Commerce - St Thomas College (Autonomous)")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_COMMERCEParent);
			
			
			
			WebElement DEPARTMENT_OF_ECONOMICS=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF ECONOMICS']"));
			act.click(DEPARTMENT_OF_ECONOMICS).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_ECONOMICSParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_ECONOMICSParent);
				
			Set<String> DEPARTMENT_OF_ECONOMICSAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_ECONOMICSAllWindow);
				
			String y6="";
				
			for(String temp8:DEPARTMENT_OF_ECONOMICSAllWindow) {
					System.out.println("all windows :"+temp8);
					driver.switchTo().window(temp8);
					
					if(!temp8.equals(DEPARTMENT_OF_ECONOMICSParent)) {
						y6=driver.getTitle();
						System.out.println("The page title is :"+y6);
					}
					if(y6.equals("Economics Department St. Thomas College Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_ECONOMICSParent);
			
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(1000);
			
			
			/*
			WebElement DEPARTMENT_OF_BOTANY=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF BOTANY']"));
			act.click(DEPARTMENT_OF_BOTANY).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_BOTANYParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_BOTANYParent);
				
			Set<String> DEPARTMENT_OF_BOTANYAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_BOTANYAllWindow);
				
			String y7="";
				
			for(String temp9:DEPARTMENT_OF_BOTANYAllWindow) {
					System.out.println("all windows :"+temp9);
					driver.switchTo().window(temp9);
					
					if(!temp9.equals(DEPARTMENT_OF_BOTANYParent)) {
						y7=driver.getTitle();
						System.out.println("The page title is :"+y7);
					}
					if(y7.equals("Department of Botany | St. Thomas College (Autonomous) Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_BOTANYParent);*/
			
			
			
			
			WebElement DEPARTMENT_OF_MATHEMATICS=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF MATHEMATICS']"));
			act.click(DEPARTMENT_OF_MATHEMATICS).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_MATHEMATICSParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_MATHEMATICSParent);
				
			Set<String> DEPARTMENT_OF_MATHEMATICSAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_MATHEMATICSAllWindow);
				
			String y8="";
				
			for(String temp10:DEPARTMENT_OF_MATHEMATICSAllWindow) {
					System.out.println("all windows :"+temp10);
					driver.switchTo().window(temp10);
					
					if(!temp10.equals(DEPARTMENT_OF_MATHEMATICSParent)) {
						y8=driver.getTitle();
						System.out.println("The page title is :"+y8);
					}
					if(y8.equals("Department of Mathematics | St. Thomas College Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_MATHEMATICSParent);
			
			
			
			WebElement DEPARTMENT_OF_PHYSICS=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF PHYSICS']"));
			act.click(DEPARTMENT_OF_PHYSICS).perform();
			//driver.navigate().back();
			String DEPARTMENT_OF_PHYSICSParent=driver.getWindowHandle();
			System.out.println("Parent Window :"+DEPARTMENT_OF_PHYSICSParent);
				
			Set<String> DEPARTMENT_OF_PHYSICSAllWindow=driver.getWindowHandles();
			System.out.println("All windows :"+DEPARTMENT_OF_PHYSICSAllWindow);
				
			String y9="";
				
			for(String temp11:DEPARTMENT_OF_PHYSICSAllWindow) {
					System.out.println("all windows :"+temp11);
					driver.switchTo().window(temp11);
					
					if(!temp11.equals(DEPARTMENT_OF_PHYSICSParent)) {
						y9=driver.getTitle();
						System.out.println("The page title is :"+y9);
					}
					if(y9.equals("Department of Physics | St. Thomas College Thrissur")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(DEPARTMENT_OF_PHYSICSParent);
			
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(1000);
			
			
			WebElement DEPARTMENT_OF_COMPUTER_SCIENCE=driver.findElement(By.xpath("//a[normalize-space()='DEPARTMENT OF COMPUTER SCIENCE']"));
			act.click(DEPARTMENT_OF_COMPUTER_SCIENCE).perform();
			Thread.sleep(1000);
			driver.navigate().back();
			js.executeScript("window.scrollBy(0,600);");
			
		
			
			
			driver.findElement(By.xpath("//span[normalize-space()='ENGLISH RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ENGLISH RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='COMMERCE RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='COMMERCE RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='STATISTICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='STATISTICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='MATHEMATICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='MATHEMATICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='BOTANY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='BOTANY RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='PHYSICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='PHYSICS RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='COMPUTER SCIENCE RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='COMPUTER SCIENCE RESEARCH GUIDES']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='ENGLISH RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ENGLISH RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='CHEMISTRY RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ZOOLOGY RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='COMMERCE RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='COMMERCE RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//span[normalize-space()='STATISTICS RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='STATISTICS RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='ECONOMICS RESEARCH SCHOLARS']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			
			driver.findElement(By.xpath("(//span[normalize-space()='MATHEMATICS RESEARCH SCHOLARS'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[normalize-space()='MATHEMATICS RESEARCH SCHOLARS'])[1]")).click();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[8]/div[1]/h4[1]/a[1]/span[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[8]/div[1]/h4[1]/a[1]/span[2]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[9]/div[1]/h4[1]/a[1]/span[1]/i[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[9]/div[1]/h4[1]/a[1]/span[1]/i[1]")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			driver.findElement(By.xpath("//body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[10]/div[1]/h4[1]/a[1]/span[1]/i[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[10]/div[1]/h4[1]/a[1]/span[1]/i[1]")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			
			
			driver.findElement(By.xpath("//span[normalize-space()='TITLE OF THESIS']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='TITLE OF THESIS']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200);");
			js.executeScript("window.scrollBy(0,200);");
			WebElement DATA_CAPTURING=driver.findElement(By.xpath("//span[normalize-space()='DATA CAPTURING LINK FOR RESEARCH SCHOLARS']"));
			act.click(DATA_CAPTURING).perform();
			Thread.sleep(1000);
			driver.navigate().back();
		
			
			
		  driver.navigate().back();
	}
	@Test(description="This part contains the PhD_Regulations_and_UO",enabled=true,priority=4)
	  public void PhD_Regulations_and_UO() throws Exception {
		
		WebElement phd1=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		  
		   act.moveToElement(phd1).click().perform();
		
		  //university grant commission
		  WebElement university1 = driver.findElement(By.xpath("//a[contains(text(),'University Grants Commission (Minimum Standards an')]"));
		//  act.moveToElement(university1).perform();
		  act.moveToElement(university1).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		 
		  //phd regulation 2023 
		  WebElement university2= driver.findElement(By.xpath("//a[normalize-space()='PhD Regulations 2023 with effect from 06.02.2024']"));
		 // act.moveToElement(university2).perform();
		 act.moveToElement(university2).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		  //university regulations 2
		  WebElement university3=driver.findElement(By.xpath("//li[2]//strong[1]//a[1]"));
		  act.moveToElement(university3).click().perform();
		  Thread.sleep(3000);
		  String parent=driver.getWindowHandle();
		  System.out.println("parent window:" +parent);
		  //to get all window handle
		  Set<String>allwindows=driver.getWindowHandles();
		  System.out.println("All window"+allwindows);
		  
		  String title="";
		  
		  for(String temp : allwindows)
		  	
		  {
		  	
		  	System.out.println("all windows :" +temp);
		  	driver.switchTo().window(temp);
		  	
		  	if(!temp.equals(parent))
		  	{
		  		title=driver.getTitle();
		  		System.out.println(title);
		  		driver.close();
				break;
		  		
		  	}
		  }
		  driver.switchTo().window(parent);
		  //university regulations3


			 
			  
			 //university regulations 2
			  WebElement university4=driver.findElement(By.xpath("//tbody//tr//td//ul//li//strong//a[contains(text(),'Modalities of Course Work-Decision of Research Cou')]"));
			  act.moveToElement(university4).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
			  
			  String parent1=driver.getWindowHandle();
			  System.out.println("parent window:" +parent1);
			  //to get all window handle
			  Set<String>allwindows1=driver.getWindowHandles();
			  System.out.println("All window"+allwindows1);
			  
			  String title1="";
			  
			  for(String temp1 : allwindows1)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp1);
			  	driver.switchTo().window(temp1);
			  	
			  	if(!temp1.equals(parent1))
			  	{
			  		title1=driver.getTitle();
			  		System.out.println(title1);
			  		driver.close();
					break;
			  		
			  	}
			  }
			  driver.switchTo().window(parent1);
			  //university regulations 3
			 
			  WebElement phd2=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd2).click().perform();
			  WebElement university23=driver.findElement(By.xpath("//tbody/tr[3]/td[1]/ul[1]/li[1]/strong[1]/a[1]"));
			  act.moveToElement(university23).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
			  
			  String parent2=driver.getWindowHandle();
			  System.out.println("parent window:" +parent2);
			  //to get all window handle
			  Set<String>allwindows2=driver.getWindowHandles();
			  System.out.println("All window"+allwindows2);
			  
			  String title2="";
			  
			  for(String temp2 : allwindows2)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp2);
			  	driver.switchTo().window(temp2);
			  	
			  	if(!temp2.equals(parent2))
			  	{
			  		title2=driver.getTitle();
			  		System.out.println(title2);
			  		driver.close();
					break;
				
			  		
			  	}
			  }
		  

	driver.switchTo().window(parent2);


		  //university regulations 4
			  WebElement phd3=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd3).click().perform();
			  WebElement university24=driver.findElement(By.xpath("//tbody/tr[3]/td[1]/ul[1]/li[1]/strong[1]/a[1]"));
			  act.moveToElement(university24).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
			  
			  String parent3=driver.getWindowHandle();
			  System.out.println("parent window:" +parent3);
			  //to get all window handle
			  Set<String>allwindows3=driver.getWindowHandles();
			  System.out.println("All window"+allwindows3);
			  
			  String title3="";
			  
			  for(String temp3 : allwindows3)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp3);
			  	driver.switchTo().window(temp3);
			  	
			  	if(!temp3.equals(parent3))
			  	{
			  		title3=driver.getTitle();
			  		System.out.println(title3);
			  		driver.close();
					break;
			  		
			  	}
			  }
			  driver.switchTo().window(parent3);
			  
		//university regulations 4(frome here they work perfectly)
		  WebElement phd4=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		  act.moveToElement(phd4).click().perform();
		  WebElement university5=driver.findElement(By.xpath("//tbody//tr//td//ul//li//strong//a[contains(text(),'Research Regulations 2016 with Amendments Incorpor')]"));
		  act.moveToElement(university5).click().perform();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  
		  
		  

			 //university regulations 5
			  WebElement phd5=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd5).click().perform();
			  WebElement university6=driver.findElement(By.xpath("//tbody//tr//td//ul//li//strong//a[contains(text(),'Amendment to Clause 2.1 ( Eligibility criteria for')]"));
			  act.moveToElement(university6).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
		  
			//university regulations 6
			 WebElement phd6=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd6).click().perform();
			  WebElement university7=driver.findElement(By.xpath("//a[contains(text(),'U.O implermenting amendment to Clause 2.1 ( Eligib')]"));
			 act.moveToElement(university7).click().perform();
			 Thread.sleep(1000);
			  driver.navigate().back();
			 

			  //university regulations 7
			  WebElement phd7=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd7).click().perform();
			  WebElement university8=driver.findElement(By.xpath("//tbody//tr//td//ul//li//strong//a[contains(text(),'Revised guidelines for the Research supervisors wh')]"));
			  act.moveToElement(university8).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
		    
			  //university regulations 8
			  WebElement phd8=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd8).click().perform();
			  WebElement university9=driver.findElement(By.xpath("//a[contains(text(),'Resolution to provide Part time Ph.D registration ')]"));
			  act.moveToElement(university9).click().perform();
			  Thread.sleep(3000);
			  driver.navigate().back();
			  
			  //university regulations 9
			  WebElement phd9=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd9).click().perform();
			  WebElement university10=driver.findElement(By.xpath("//a[contains(text(),'Amendment to Clause 2.8.2 (granting part time Ph.D')]"));
			  act.moveToElement(university10).click().perform();
			  Thread.sleep(1000);
			  driver.navigate().back();
		 // (from here)
			  //university regulations 10
			  WebElement phd10=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd10).click().perform();
			  WebElement university11=driver.findElement(By.xpath("//ul[2]//li[1]//a[1]"));
			  act.moveToElement(university11).click().perform();
			  Thread.sleep(3000);
			  //driver.navigate().back();
			  
			  String parent4=driver.getWindowHandle();
			  System.out.println("parent window:" +parent4);
			  //to get all window handle
			  Set<String>allwindows4=driver.getWindowHandles();
			  System.out.println("All window"+allwindows4);
			  
			  String title4="";
			  
			  for(String temp4 : allwindows4)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp4);
			  	driver.switchTo().window(temp4);
			  	
			  	if(!temp4.equals(parent4))
			  	{
			  		title4=driver.getTitle();
			  		System.out.println(title4);
			  		driver.close();
					break;
			  		
			  	}
			  }
			  driver.switchTo().window(parent4);
			  //university regulations 11
			  WebElement phd11=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd11).click().perform();
			  WebElement university12=driver.findElement(By.xpath("//ul[2]//li[2]//a[1]"));
			  act.moveToElement(university12).click().perform();
			 Thread.sleep(3000);
			 // driver.navigate().back();
			 String parent5=driver.getWindowHandle();
			  System.out.println("parent window:" +parent5);
			  //to get all window handle
			  Set<String>allwindows5=driver.getWindowHandles();
			  System.out.println("All window"+allwindows5);
			  
			  String title5="";
			  
			  for(String temp5 : allwindows5)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp5);
			  	driver.switchTo().window(temp5);
			  	
			  	if(!temp5.equals(parent5))
			  	{
			  		title5=driver.getTitle();
			  		System.out.println(title5);
			  		driver.close();
					break;
			  		
			  	}
			  }
			  driver.switchTo().window(parent5);

			  //university regulations11
			  WebElement phd12=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
			  act.moveToElement(phd12).click().perform();
			  WebElement university32=driver.findElement(By.xpath("//ul[2]//li[3]//a[1]"));
			  act.moveToElement(university32).click().perform();
			 Thread.sleep(3000);
			  driver.navigate().back();
			  String parent6=driver.getWindowHandle();
			  System.out.println("parent window:" +parent6);
			  //to get all window handle
			  Set<String>allwindows6=driver.getWindowHandles();
			  System.out.println("All window"+allwindows6);
			  
			  String title6="";
			  
			  for(String temp6 : allwindows6)
			  	
			  {
			  	
			  	System.out.println("all windows :" +temp6);
			  	driver.switchTo().window(temp6);
			  	
			  	if(!temp6.equals(parent6))
			  	{
			  		title6=driver.getTitle();
			  		System.out.println(title6);
			  		driver.close();
					break;
			  		
			  	}
			  }
			  driver.switchTo().window(parent6);
			 
		   //13
		  WebElement phd13=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		  act.moveToElement(phd13).click().perform();
		  WebElement rule1=driver.findElement(By.xpath("//ul[2]//li[4]//a[1]"));
		  act.moveToElement(rule1).click().perform();
		  Thread.sleep(1000);
		  String parent7=driver.getWindowHandle();
		  System.out.println("parent window:" +parent7);
		  //to get all window handle
		  Set<String>allwindows7=driver.getWindowHandles();
		  System.out.println("All window"+allwindows7);
		  
		  String title7="";
		  
		  for(String temp7 : allwindows7)
		  	
		  {
		  	
		  	System.out.println("all windows :" +temp7);
		  	driver.switchTo().window(temp7);
		  	
		  	if(!temp7.equals(parent7))
		  	{
		  		title7=driver.getTitle();
		  		System.out.println(title7);
		  		driver.close();
				break;
		  		
		  	}
		  }
		  driver.switchTo().window(parent7);
			  
		      
		      
		      
		  	  //university orders and circulus1
		  WebElement order=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		  act.moveToElement(order).click().perform();
		  WebElement circulus=driver.findElement(By.xpath("//a[contains(text(),'U.O_implermenting_amendment_to_Clause_2.1__Eligibi')]"));
		  act.moveToElement(circulus).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus2
		  //WebElement order1=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		//  act.moveToElement(order1).click().perform();
		  WebElement circulus1=driver.findElement(By.xpath("//ul[3]//li[2]//a[1]"));
		  act.moveToElement(circulus1).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus3
		 // WebElement order3=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		//  act.moveToElement(order3).click().perform();
		  WebElement circulus3=driver.findElement(By.xpath("//ul[3]//li[2]//a[1]"));
		  act.moveToElement(circulus3).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus4
		 // WebElement order4=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		 // act.moveToElement(order4).click().perform();
		  WebElement circulus4=driver.findElement(By.xpath("//a[@href='https://dor.uoc.ac.in/images/UO-Covid-additional-extension-six-months.pdf']"));
		  act.moveToElement(circulus4).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus5
		  //WebElement order5=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		//  act.moveToElement(order5).click().perform();
		  WebElement circulus5=driver.findElement(By.xpath("//a[normalize-space()='Circular- Course Work exemption']"));
		  act.moveToElement(circulus5).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus6
		  WebElement circulus6=driver.findElement(By.xpath("//a[contains(text(),'Amendment to Rules & Regulations 2016 dt 17-01-202')]"));
		  act.moveToElement(circulus6).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus7
		  WebElement circulus7=driver.findElement(By.xpath("//a[contains(text(),'Amendment to Rules & Regulations 2016 dt 12-11-202')]"));
		  act.moveToElement(circulus7).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		 // university orders and circulus8
		  WebElement circulus8=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/ul[4]/li[4]/a[1]"));
		  act.moveToElement(circulus8).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		  // university orders and circulus9
		  WebElement circulus9=driver.findElement(By.xpath("//a[normalize-space()='Circular-Co-guide exemption']"));
		  act.moveToElement(circulus9).click().perform();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		//university orders and circulus10
		 WebElement circulus10=driver.findElement(By.xpath("//a[contains(text(),'UO 2852/2021/Admn dt 05-03-2021- Extension of the ')]"));
		 act.moveToElement(circulus10).click().perform();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		//university orders and circulus11
		WebElement circulus11=driver.findElement(By.xpath("//a[normalize-space()='Circular- Appointment of Co-guide']"));
		act.moveToElement(circulus11).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus12
		WebElement circulus12=driver.findElement(By.xpath("//a[contains(text(),'Circular- Exemption from Course Work and PQE to th')]"));
		act.moveToElement(circulus12).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus13
		WebElement circulus13=driver.findElement(By.xpath("//a[contains(text(),'Circular- Admission to PhD Programme(date of joini')]"));
		act.moveToElement(circulus13).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus14
		WebElement circulus14=driver.findElement(By.xpath("//a[normalize-space()='Circular- Progress Report -Submission']"));
		act.moveToElement(circulus14).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();




		//university orders and circulus15
		WebElement circulus15=driver.findElement(By.xpath("//a[contains(text(),'Circular- Admission to Ph.D. Programme – Procedure')]"));
		act.moveToElement(circulus15).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus16
		WebElement circulus16=driver.findElement(By.xpath("//a[contains(text(),'Circular- Recognition as Research Guide – furnishi')]"));
		act.moveToElement(circulus16).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus17
		WebElement circulus17=driver.findElement(By.xpath("//a[contains(text(),'UO- Conversion of FT scholars to PT on FIP or gues')]"));
		act.moveToElement(circulus17).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus18
		WebElement circulus18=driver.findElement(By.xpath("//a[contains(text(),'UO- extend facility for part time research for lib')]"));
		act.moveToElement(circulus18).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus19
		WebElement circulus19=driver.findElement(By.xpath("//a[contains(text(),'UO- Bio- metric Punching of the Research Scholars ')]"));
		act.moveToElement(circulus19).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus20
		WebElement circulus20=driver.findElement(By.xpath("//a[contains(text(),'UO- Norms for conduct of Ph.D. Open defence, Resea')]"));
		act.moveToElement(circulus20).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus21
		WebElement circulus21=driver.findElement(By.xpath("//a[contains(text(),'UO- Re-registration/Revival of Defunct Ph.D. Regis')]"));
		act.moveToElement(circulus21).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus22
		WebElement circulus22=driver.findElement(By.xpath("//a[contains(text(),'UO- Finalising the specific title of research by t')]"));
		act.moveToElement(circulus22).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();


		//university orders and circulus23
		WebElement circulus23=driver.findElement(By.xpath("//a[contains(text(),'UO- Vice Chancellor’s Nominee to the Research Advi')]"));
		act.moveToElement(circulus23).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus24
		WebElement circulus24=driver.findElement(By.xpath("//a[contains(text(),'UO- Constitution of Research Advisory Committee – ')]"));
		act.moveToElement(circulus24).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();


		//university orders and circulus25
		WebElement circulus25=driver.findElement(By.xpath("//a[contains(text(),'UO- Amendments in Calicut University Research Regu')]"));
		act.moveToElement(circulus25).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();

		//university orders and circulus26
		WebElement circulus26=driver.findElement(By.xpath("//li[contains(text(),'UO- Permission to extend the period of submission ')]"));
		act.moveToElement(circulus26).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();


		//st.thomas1
		  WebElement phd51=driver.findElement(By.xpath("//span[@class='link-text'][contains(text(),'PhD Regulations & UO’s')]"));
		  act.moveToElement(phd51).click().perform();
		WebElement thomas1=driver.findElement(By.xpath("//span[contains(text(),'St.Thomas College, Thrissur Plagiarism Check Polic')]"));
		act.moveToElement(thomas1).click().perform();

		//st.thomas2
		WebElement thomas2=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-3 fusion-button-default-span fusion-button-default-type']"));
		act.moveToElement(thomas2).click().perform();

		//st.thomas3
		WebElement thomas3=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-4 fusion-button-default-span fusion-button-default-type']"));
		act.moveToElement(thomas3).click().perform();
		driver.navigate().back();
		  
	}
	@Test(description="This part contains the Reserch_Regulations",enabled=true,priority=5)
	  public void Reserch_Regulations() throws Exception {
		 //Reserch_Regulations
		  
		  WebElement ResearchRegulations1=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Regulations']"));
		  act.click(ResearchRegulations1).perform();
		  Thread.sleep(1000);
		  
		  WebElement Directorate_of_Research=driver.findElement(By.xpath("//a[normalize-space()='Directorate of Research, University of Calicut']"));
			act.click(Directorate_of_Research).perform();
			//driver.navigate().back();
			String Directorate_of_ResearchParent=driver.getWindowHandle();
		
			Set<String> Directorate_of_ResearchAllWindow=driver.getWindowHandles();

			String yyy1="";
				
			for(String tempss1:Directorate_of_ResearchAllWindow) {
					System.out.println("all windows :"+tempss1);
					driver.switchTo().window(tempss1);
					
					if(!tempss1.equals(Directorate_of_ResearchParent)) {
						yyy1=driver.getTitle();
						System.out.println("The page title is :"+yyy1);
					}
					if(yyy1.equals("Home")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(Directorate_of_ResearchParent);
			
			
			WebElement Circulars=driver.findElement(By.xpath("//a[normalize-space()='Circulars & Orders of University of Calicut']"));
			act.click(Circulars).perform();
			driver.navigate().back();
			
			WebElement PlagarismCheckPolicy2019=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-2 fusion-button-default-span fusion-button-default-type']"));
			PlagarismCheckPolicy2019.sendKeys(Keys.CANCEL);
			Thread.sleep(1000);
			
			WebElement ResearchRegulations=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-3 fusion-button-default-span fusion-button-default-type']"));
			ResearchRegulations.sendKeys(Keys.CANCEL);
			Thread.sleep(1000);
			
			
			js.executeScript("window.scrollBy(0,600);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,800);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,800);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,1000);");
			Thread.sleep(1000);
			
		  driver.navigate().back();
	}
	@Test(description="This part contains the Reserch_Policies",enabled=true,priority=6)
	  public void Reserch_Policies() throws Exception {
		//Reserch_Policies
		  WebElement Research_Policies=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Policies']"));
		  act.click(Research_Policies).perform();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='RESEARCH PROMOTION POLICY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='RESEARCH PROMOTION POLICY']")).click();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  driver.findElement(By.xpath("//span[normalize-space()='PLAGIARISM CHECK POLICY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='PLAGIARISM CHECK POLICY']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='SANTHOME RESEARCH (SEED MONEY) GRANT POLICY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='SANTHOME RESEARCH (SEED MONEY) GRANT POLICY']")).click();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  driver.findElement(By.xpath("//span[normalize-space()='RESEARCH ETHICS POLICY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='RESEARCH ETHICS POLICY']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//span[normalize-space()='CONSULTANCY POLICY']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[normalize-space()='CONSULTANCY POLICY']")).click();
		  Thread.sleep(1000);
		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_Advisory_Committee",enabled=true,priority=7)
	  public void Research_Advisory_Committee() throws Exception {
		 //Research_Advisory_Committee
		  
		  WebElement Research_Advisory_Committee=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Advisory Committee']"));
		  act.click(Research_Advisory_Committee).perform();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,900);");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//a[@id='fusion-tab-motto']//h4[@class='fusion-tab-heading'][normalize-space()='MOTTO']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@id='fusion-tab-vision']//h4[@class='fusion-tab-heading'][normalize-space()='VISION']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@id='fusion-tab-mission']//h4[@class='fusion-tab-heading'][normalize-space()='MISSION']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@id='fusion-tab-corevalues']//h4[@class='fusion-tab-heading'][normalize-space()='CORE VALUES']")).click();
		  Thread.sleep(1000);

		  /*
		  js.executeScript("window.scrollBy(0,700);");
		  Thread.sleep(1000);
		  
		  WebElement STAFF_LOGIN=driver.findElement(By.xpath("//span[normalize-space()='STAFF LOGIN']"));
		  act.click(STAFF_LOGIN).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  WebElement STUDENT_LOGIN=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-6 fusion-button-span-yes fusion-button-default-type']"));
		  act.click(STUDENT_LOGIN).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  WebElement PARENT_LOGIN=driver.findElement(By.xpath("//span[normalize-space()='PARENT LOGIN']"));
		  act.click(PARENT_LOGIN).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  WebElement ALUMINI_LOGIN=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-8 fusion-button-span-yes fusion-button-default-type']"));
		  act.click(ALUMINI_LOGIN).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  WebElement MOODLE_LOGIN=driver.findElement(By.xpath("//span[normalize-space()='MOODLE LOGIN']"));
		  act.click(MOODLE_LOGIN).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Scholarships')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Tenders and Quotations']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Infrastructure']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'College Union')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Youth Empowerment Scheme')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[normalize-space()='ARIIA Report 2021']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Conferences/WSs/Seminars']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Online Learning Resources')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Endowments')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Remedial Coaching')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'ASAP')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[contains(text(),'CBCSS')]")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  
		  
		  driver.findElement(By.xpath("//h2[normalize-space()='EXAMINATIONS']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//div[@class='col content-box-wrapper content-wrapper-background link-area-box link-type-text content-icon-wrapper-yes icon-hover-animation-fade link-area-box-hover']//a[@class='heading-link']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//div[@class='col content-box-wrapper content-wrapper-background link-area-box link-type-text content-icon-wrapper-yes icon-hover-animation-fade link-area-box-hover']//a[@class='heading-link']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//a[@href='https://stthomas.ac.in/physical-education/']//div[@class='icon']//span//i[@class='fontawesome-icon fa-suitcase fas circle-yes']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//h2[normalize-space()='ALUMNI']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//div[@class='col content-box-wrapper content-wrapper-background link-area-box link-type-text content-icon-wrapper-yes icon-hover-animation-fade link-area-box-hover']//a[@class='heading-link']")).click();
		  Thread.sleep(1000);
		  driver.navigate().back();

		  js.executeScript("window.scrollBy(0,900);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  */

		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_Programmes",enabled=true,priority=8)
	  public void Research_Programmes() throws Exception {
		//Research_Programmes
		  WebElement Research_Programmes=driver.findElement(By.xpath("//span[normalize-space()='Research Programmes']"));
		  act.click(Research_Programmes).perform();
		  Thread.sleep(1000);
		  
		  WebElement RPE=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'Research and Publication Ethics (RPE) online Cours')]"));
		  act.moveToElement(RPE).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  WebElement International=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'International Conference at St. Thomas College, Th')]"));
		  act.moveToElement(International).perform();
		  Thread.sleep(1000);
		  WebElement PhD_Open_Defence=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'100th PhD Open Defence: Golden Jubilee of the comm')]"));
		  act.moveToElement(PhD_Open_Defence).perform();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,500);");
		  Thread.sleep(1000);
		  
		  WebElement Invited_Speakers=driver.findElement(By.xpath("//span[normalize-space()='Invited Speakers for various programmes']"));
		  act.click(Invited_Speakers).perform();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_Ethics",enabled=true,priority=9)
	  public void Research_Ethics() throws Exception {
		//Research_Ethics
		  WebElement Research_Ethics=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Ethics']"));
		  act.click(Research_Ethics).perform();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  
		  
		  
		  WebElement Research_Ethics_Policy=driver.findElement(By.xpath("//span[normalize-space()='Research Ethics Policy']"));
			act.click(Research_Ethics_Policy).perform();
			//driver.navigate().back();
			String Research_Ethics_PolicyParent=driver.getWindowHandle();
		
			Set<String> Research_Ethics_PolicyAllWindow=driver.getWindowHandles();

			String yyy2="";
				
			for(String tempss2:Research_Ethics_PolicyAllWindow) {
					System.out.println("all windows :"+tempss2);
					driver.switchTo().window(tempss2);
					
					if(!tempss2.equals(Research_Ethics_PolicyParent)) {
						yyy2=driver.getTitle();
						System.out.println("The page title is :"+yyy2);
					}
					if(yyy2.equals("Research-Ethics-Policy")) {
						driver.close();	
					}
			  }
			driver.switchTo().window(Research_Ethics_PolicyParent);
		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_and_Publication_Ethics_2021",enabled=true,priority=10)
	  public void Research_and_Publication_Ethics_2021() throws Exception {
		WebElement Research_and_Publication_Ethics_2021=driver.findElement(By.xpath("//span[normalize-space()='Research and Publication Ethics 2021']"));
		  act.click(Research_and_Publication_Ethics_2021).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  //driver.findElement(By.xpath("//main[@id='main']")).click();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  
		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_and_Publication_Ethics_2020",enabled=true,priority=11)
	  public void Research_and_Publication_Ethics_2020() throws Exception {
		 //Publication Ethics 2021
		  WebElement Research_and_Publication_Ethics_2020=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research and Publication Ethics 2020']"));
		  act.click(Research_and_Publication_Ethics_2020).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  //driver.findElement(By.xpath("/html[1]/body[1]")).click();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,1000);");
		  Thread.sleep(1000);
		  
		  
		  driver.navigate().back();
		  js.executeScript("window.scrollBy(0,200);");
	}
	@Test(description="This part contains the Consultancy",enabled=true,priority=12)
	  public void Consultancy() throws Exception {
		
		  WebElement Consultancy=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Consultancy']"));
		  act.click(Consultancy).perform();
		  Thread.sleep(1000);

		  
		  WebElement Consultancy_Application_Form=driver.findElement(By.xpath("//a[@class='fusion-button button-flat fusion-button-default-size button-default button-2 fusion-button-default-span fusion-button-default-type']"));
		  act.click(Consultancy_Application_Form).perform();
			//driver.navigate().back();
			String Consultancy_Application_FormParent=driver.getWindowHandle();
		
			Set<String> Consultancy_Application_FormAllWindow=driver.getWindowHandles();

			String yyy3="";
				
			for(String tempss3:Consultancy_Application_FormAllWindow) {
					System.out.println("all windows :"+tempss3);
					driver.switchTo().window(tempss3);
					
					if(!tempss3.equals(Consultancy_Application_FormParent)) {
						yyy3=driver.getTitle();
						System.out.println("The page title is :"+yyy3);
					}
					if(yyy3.equals("Consultancy Request Form")) {
						driver.close();
						
						
						
					}
			  }
			driver.switchTo().window(Consultancy_Application_FormParent);
			
			
			WebElement Consultancy_Policy=driver.findElement(By.xpath("//span[normalize-space()='Consultancy Policy']"));
			  act.click(Consultancy_Policy).perform();
				//driver.navigate().back();
				String Consultancy_PolicyParent=driver.getWindowHandle();
			
				Set<String> Consultancy_PolicyAllWindow=driver.getWindowHandles();

				String y23="";
					
				for(String tempp3:Consultancy_PolicyAllWindow) {
						System.out.println("all windows :"+tempp3);
						driver.switchTo().window(tempp3);
						
						if(!tempp3.equals(Consultancy_PolicyParent)) {
							y23=driver.getTitle();
							System.out.println("The page title is :"+y23);
						}
						if(y23.equals("Consultancy Request Form")) {
							driver.close();
							
							
							
						}
				  }
				driver.switchTo().window(Consultancy_PolicyParent);

		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Collaborative_Research",enabled=true,priority=13)
	  public void Collaborative_Research() throws Exception {
		//Collaborative Research
		  WebElement Collaborative_Research=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Collaborative Research']"));
		  act.click(Collaborative_Research).perform();
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,800);");
		  Thread.sleep(1000);
		  
		  WebElement Sheeba=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Sr. Sheeba']"));
		  act.click(Sheeba).perform();
		  driver.navigate().back();
		  
		  WebElement Kizhakooden=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Mr. Joe Kizhakooden & Ms.Nees Paul']"));
		  act.click(Kizhakooden).perform();
		  driver.navigate().back();
		  
		  WebElement Paul=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Dr Paul Jose']"));
		  act.click(Paul).perform();
		  driver.navigate().back();
		  
		  WebElement Biju=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Dr. C S Biju']"));
		  act.click(Biju).perform();
		  driver.navigate().back();
		  
		  WebElement MoU=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='MoU with Lebanese French University']"));
		  act.click(MoU).perform();
		  driver.navigate().back();
		  
		  WebElement Cambridge=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Collaboration with Cambridge University, UK']"));
		  act.click(Cambridge).perform();
		  driver.navigate().back();
		  
		  js.executeScript("window.scrollBy(0,400);");
		  Thread.sleep(1000);

		  driver.navigate().back();
	}
	@Test(description="This part contains the Research_Projects",enabled=true,priority=14)
	  public void Research_Projects() throws Exception {
		js.executeScript("window.scrollBy(0,200);");
		WebElement Research_Projects=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Research Projects']"));
		  act.click(Research_Projects).perform();
		  Thread.sleep(1000);
		  
		  
		  js.executeScript("window.scrollBy(0,400);");
		  
		  //have to finsih this later
		  WebElement Executive_summery=driver.findElement(By.xpath("//a[contains(text(),'Executive summery and published paper of the work ')]"));
		  Executive_summery.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  
		  WebElement Assessment=driver.findElement(By.xpath("//a[contains(text(),'Assessment of constituents of essential oil in int')]"));
		  Assessment.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement Mapping=driver.findElement(By.xpath("//a[contains(text(),'Assessment and Mapping of riparian forest vegetati')]"));
		  Mapping.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement SOCIAL_CAPITAL_FORMATION=driver.findElement(By.xpath("//a[contains(text(),'‘SOCIAL CAPITAL FORMATION AND ITS IMPACT ON THE PE')]"));
		  SOCIAL_CAPITAL_FORMATION.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement summary=driver.findElement(By.xpath("//a[contains(text(),'Executive summary report of my Minor Research Proj')]"));
		  //summary.sendKeys(Keys.CANCEL);
		  summary.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  
		  WebElement EXECUTIVE=driver.findElement(By.xpath("//a[contains(text(),'EXECUTIVE SUMMARY “A STUDY ON THE EFFECTIVE UTILIZ')]"));
		  //EXECUTIVE.sendKeys(Keys.CANCEL);
		  EXECUTIVE.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement MinorResearchProject=driver.findElement(By.xpath("//a[contains(text(),'Executive summary of Minor Research Project, F.No.')]"));
		  MinorResearchProject.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement Project158=driver.findElement(By.xpath("//a[contains(text(),'Executive summary of my Minor Research Project 158')]"));
		  Project158.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement Ent=driver.findElement(By.xpath("//a[contains(text(),'Executive Summary of Minor Research Project on Ent')]"));
		  Ent.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement FINALREPORT=driver.findElement(By.xpath("//a[contains(text(),'FINAL REPORT OF MINOR RESEARCH PROJECT ON NANOFLUI')]"));
		  //FINALREPORT.sendKeys(Keys.CANCEL);
		  FINALREPORT.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement Radiation=driver.findElement(By.xpath("//a[contains(text(),'Executive Summary of “Radiation properties of meta')]"));
		  Radiation.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement TDresearch=driver.findElement(By.xpath("//a[contains(text(),'Executive summary of the research work done by TD ')]"));
		  //TDresearch.sendKeys(Keys.CANCEL);
		  TDresearch.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement ImageProcessing=driver.findElement(By.xpath("//a[contains(text(),'EXECUTIVE SUMMARY OF MRP REF. NO. MRP/12th PLAN/14')]"));
		  ImageProcessing.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement ECO_CRISIS=driver.findElement(By.xpath("//a[contains(text(),'MRP entitled ” A CASE STUDY ON ECO-CRISIS AND HEAL')]"));
		  //ECO_CRISIS.sendKeys(Keys.CANCEL);
		  ECO_CRISIS.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  
		  WebElement Preparation=driver.findElement(By.xpath("//a[contains(text(),'MRP entitled “Preparation and characterization of ')]"));
		  //Preparation.sendKeys(Keys.CANCEL);
		  Preparation.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  
		  WebElement Taxonomic=driver.findElement(By.xpath("//a[contains(text(),'Executive Summary of MRP(S)-0603/13-14/KLCA019/UGC')]"));
		  Taxonomic.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  //not working
		  WebElement MolecularCharacterization=driver.findElement(By.xpath("//a[contains(text(),'Executive Summary of  MRP(S)-0602/13-14/KLCA019/UG')]"));
		  MolecularCharacterization.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  //not working
		  WebElement Jency_thomas=driver.findElement(By.xpath("//a[@href='http://files/content/Executive_summary_Jency_thomas_.pdf']"));
		  Jency_thomas.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement WORK_DONE_UNDER=driver.findElement(By.xpath("//a[contains(text(),'EXECUTIVE SUMMARY  REPORT OF THE WORK DONE UNDER  ')]"));
		  //WORK_DONE_UNDER.sendKeys(Keys.CANCEL);
		  WORK_DONE_UNDER.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  
		  WebElement SAJESH=driver.findElement(By.xpath("//a[contains(text(),'Executive summary of the research work done by SAJ')]"));
		  //SAJESH.sendKeys(Keys.CANCEL);
		  SAJESH.click();
		  driver.navigate().back();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200);");
		  
		  WebElement UGC_Minor_ResearchProject2016=driver.findElement(By.xpath("//a[contains(text(),'Executive Summary of UGC Minor Research Project 20')]"));
		  UGC_Minor_ResearchProject2016.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement Polymers=driver.findElement(By.xpath("//li[22]//a[1]"));
		  Polymers.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);
		  
		  WebElement FreshWaterCladocera=driver.findElement(By.xpath("//a[contains(text(),'EXECUTIVE SUMMARY WORK DONE ON THE PROJECT of Dr.B')]"));
		  FreshWaterCladocera.sendKeys(Keys.CANCEL);
		  Thread.sleep(1000);

		  js.executeScript("window.scrollBy(0,500);");
		  js.executeScript("window.scrollBy(0,500);");
		  js.executeScript("window.scrollBy(0,500);");
		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Annual_Research_Reports",enabled=true,priority=15)
	  public void Annual_Research_Reports() throws Exception {
		//Annual Research Reports
		  WebElement Annual_Research_Reports=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Annual Research Reports']"));
		  act.click(Annual_Research_Reports).perform();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,400);");
			  //report1
			  WebElement report1=driver.findElement(By.xpath("//span[normalize-space()='Annual Research Report 2022']"));
			  report1.click();
			  report1.sendKeys(Keys.CANCEL);
			  //driver.findElement(By.xpath("//a[@title='Press Esc to close']")).click();
			  Thread.sleep(1000);
			  
		 
			 
			  //report2
			 WebElement report2=driver.findElement(By.xpath("//span[normalize-space()='Annual Research Report 2021']"));
			 report2.sendKeys(Keys.CANCEL);
			  Thread.sleep(1000);
			  
			  
			//report3
			WebElement report3=driver.findElement(By.xpath("//span[normalize-space()='Annual Research Report 2020']"));
			report3.sendKeys(Keys.CANCEL);
			Thread.sleep(1000);
			 
			 
			//report4
			WebElement report4=driver.findElement(By.xpath("//span[normalize-space()='Annual Research Report 2019']"));
			report4.sendKeys(Keys.CANCEL);
			Thread.sleep(1000);
		    
		    
		    
			//report5
			WebElement report5=driver.findElement(By.xpath("//span[normalize-space()='Annual Research Report 2018']"));
			report5.sendKeys(Keys.CANCEL);
			Thread.sleep(1000);
		  
		  driver.navigate().back();
	}
	@Test(description="This part contains the Journals",enabled=true,priority=16)
	  public void Journals() throws Exception {
		WebElement Journals=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Journals']"));
		act.click(Journals).perform();
		Thread.sleep(1000);
	}
	@Test(description="This part contains the RESEARCH_HIGHLIGHTS",enabled=true,priority=17)
	  public void RESEARCH_HIGHLIGHTS() throws Exception {
		WebElement RESEARCH_HIGHLIGHTS=driver.findElement(By.xpath("//span[normalize-space()='RESEARCH HIGHLIGHTS']"));
		act.click(RESEARCH_HIGHLIGHTS).perform();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,500);");
		
		WebElement RESEARCH_ECOSYSTEM=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='RESEARCH ECOSYSTEM']"));
		act.click(RESEARCH_ECOSYSTEM).perform();
		driver.navigate().back();
		
		WebElement Advanced_neural_based_sensitivity_analysis=driver.findElement(By.xpath("//article[@id='blog-2-post-38645']//div[@class='fusion-post-content post-content']//a[contains(text(),'Advanced neural-based sensitivity analysis on nonl')]"));
		act.click(Advanced_neural_based_sensitivity_analysis).perform();
		driver.navigate().back();
		
		WebElement Eco_Chambers=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'Beyond echo chambers: How network homophily and al')]"));
		act.click(Eco_Chambers).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement AntiInflammatory=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'Anti-Inflammatory and Cytotoxic Assessment of Alka')]"));
		act.click(AntiInflammatory).perform();
		driver.navigate().back();
		
		WebElement defect_engineering=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'From phase stabilization to defect engineering: Un')]"));
		act.click(defect_engineering).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement Synthesis=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'Synthesis, Structure and Properties of Nickel Comp')]"));
		act.click(Synthesis).perform();
		driver.navigate().back();
		
		WebElement Discovery=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Discovery by Dr. Thomas V P']"));
		act.click(Discovery).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement Anto=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='Discovery by Dr.Anto P V']"));
		act.click(Anto).perform();
		driver.navigate().back();
		
		WebElement Bookss=driver.findElement(By.xpath("//div[@class='fusion-reading-box-container reading-box-container-1']//a[@class='button fusion-button button-default fusion-button-large button-large button-flat fusion-desktop-button fusion-tagline-button continue fusion-desktop-button-margin continue-right']//span[contains(text(),'Click Here')]"));
		act.click(Bookss).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement JournalPapers=driver.findElement(By.xpath("//div[@class='fusion-reading-box-container reading-box-container-2']//a[@class='button fusion-button button-default fusion-button-large button-large button-flat fusion-desktop-button fusion-tagline-button continue fusion-desktop-button-margin continue-right']//span[contains(text(),'Click Here')]"));
		act.click(JournalPapers).perform();
		driver.navigate().back();
		
		WebElement STAFF_PUBLICATIONS=driver.findElement(By.xpath("//span[normalize-space()='STAFF PUBLICATIONS']"));
		act.click(STAFF_PUBLICATIONS).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement STAFF_PRESENTATIONS=driver.findElement(By.xpath("//span[normalize-space()='STAFF PRESENTATIONS']"));
		act.click(STAFF_PRESENTATIONS).perform();
		driver.navigate().back();
		
		WebElement STAFF_PARTICIPATIONS=driver.findElement(By.xpath("//span[normalize-space()='STAFF PARTICIPATIONS']"));
		act.click(STAFF_PARTICIPATIONS).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement EVENTS=driver.findElement(By.xpath("//span[normalize-space()='EVENTS']"));
		act.click(EVENTS).perform();
		driver.navigate().back();
		
		WebElement STUDENT_PUBLICATIONS=driver.findElement(By.xpath("//span[normalize-space()='STUDENT PUBLICATIONS']"));
		act.click(STUDENT_PUBLICATIONS).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");
		
		WebElement STUDENT_PRESENTATIONS=driver.findElement(By.xpath("//span[normalize-space()='STUDENT PRESENTATIONS']"));
		act.click(STUDENT_PRESENTATIONS).perform();
		driver.navigate().back();
		
		WebElement STUDENT_PARTICIPATIONS=driver.findElement(By.xpath("//span[normalize-space()='STUDENT PARTICIPATIONS']"));
		act.click(STUDENT_PARTICIPATIONS).perform();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400);");

		driver.navigate().back();
	}
	@Test(description="This part contains the Awards_and_Fellowships",enabled=true,priority=18)
	  public void Awards_and_Fellowships() throws Exception {
		WebElement Awards_and_Fellowships=driver.findElement(By.xpath("//span[@class='link-text'][normalize-space()='Awards & Fellowships']"));
		act.click(Awards_and_Fellowships).perform();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollBy(0,500);");
		
		
		driver.navigate().back();
	}
	

	
	
	
  
  @Test(description="This part contains the links of the body section",enabled=true,priority=19)
  public void links() throws Exception {
	  //js.executeScript("window.scrollBy(0,1000)");
	  js.executeScript("window.scrollBy(0,500)");
	  //js.executeScript("window.scrollBy(0,200)");
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Vol.18 (2024)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.17 (2023)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.16 (2022)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.15 (2021)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.14 (2020)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.13 (2019)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.12 (2018)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  js.executeScript("window.scrollBy(0,200)");
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.11 (2017)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.10 (2016)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.09 (2015)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  js.executeScript("window.scrollBy(0,200)");
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.08 (2014)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Vol.07 (2013)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Vol.06 (2012)']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  
	  
  }
  
  @Test(description="This is the footer part of the website",enabled=true,priority=20)
  public void footer() throws Exception {
	js.executeScript("window.scrollBy(0,400)");
	 js.executeScript("window.scrollBy(0,1000)");
	  js.executeScript("window.scrollBy(0,1000)");
	  
	  
	  
	  WebElement library=driver.findElement(By.xpath("//a[contains(text(),'Library')]"));
	  //act.click(library);
	  library.click();
	  Thread.sleep(1000);
	  
	  String parent=driver.getWindowHandle();
	  System.out.println("Parent Window :"+parent);
	  Set<String> allwindow=driver.getWindowHandles();
	  System.out.println("All windows :"+allwindow);
		
	  String x="";
		
	  for(String temp:allwindow) {
			System.out.println("all windows :"+temp);
			driver.switchTo().window(temp);
			
			if(!temp.equals(parent)) {
				x=driver.getTitle();
				System.out.println(x);
			}
			if(x.equals("Department of Library and Information Studies – St Thomas College, Thrissur (Autonomous), Kerala, India")) {
				
				//ABOUT US 
				
				WebElement ABOUT_US=driver.findElement(By.xpath("//a[normalize-space()='About Us']"));
				act.moveToElement(ABOUT_US).perform();
				Thread.sleep(1000);
				
				/*
				WebElement liveSTOM=driver.findElement(By.xpath("//a[normalize-space()='liveSTOM']"));
				act.click(liveSTOM).perform();
				
				Thread.sleep(1000);
				
				act.moveToElement(ABOUT_US).perform();*/
				WebElement CollectionAndStatistics=driver.findElement(By.xpath("//a[normalize-space()='Collection and Statistics']"));
				act.click(CollectionAndStatistics).perform();
				driver.navigate().back();
				Thread.sleep(1000);
				
				WebElement Librarian=driver.findElement(By.xpath("//a[normalize-space()='Librarian']"));
				act.click(Librarian).perform();
				driver.navigate().back();
				Thread.sleep(1000);
				WebElement SupportingStaff=driver.findElement(By.xpath("//a[normalize-space()='Supporting Staff']"));
				act.click(SupportingStaff).perform();
				driver.navigate().back();
				Thread.sleep(1000);
				WebElement LibraryAdvisoryCommittee=driver.findElement(By.xpath("//a[normalize-space()='Library Advisory Committee']"));
				act.click(LibraryAdvisoryCommittee).perform();
				driver.navigate().back();
				
				
				//LIBRARY SERVICES
				WebElement LibraryServices=driver.findElement(By.xpath("//a[normalize-space()='Library Services']"));
				act.moveToElement(LibraryServices).perform();
				Thread.sleep(1000);
				
				WebElement ArticleDeliveryService=driver.findElement(By.xpath("//a[normalize-space()='Article delivery service']"));
				act.click(ArticleDeliveryService).perform();
				driver.navigate().back();
				
				WebElement SimilarityCheckService=driver.findElement(By.xpath("//a[normalize-space()='Similarity check service']"));
				act.click(SimilarityCheckService).perform();
				driver.navigate().back();
				
				WebElement Resources=driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
				act.click(Resources).perform();
				driver.navigate().back();
				
				
				//LIBRARY CATALOGUE
				/*
				WebElement LibraryCatalogue=driver.findElement(By.xpath("//a[normalize-space()='Library Catalogue']"));
				act.click(LibraryCatalogue).perform();
				driver.navigate().back();*/
				
				//QUESTION PAPERS
				WebElement QuestionPapers=driver.findElement(By.xpath("//a[normalize-space()='Question Papers']"));
				act.click(QuestionPapers).perform();
				//driver.navigate().back();
				String QuestionPaperparent=driver.getWindowHandle();
				System.out.println("Parent Window :"+QuestionPaperparent);
					
				Set<String> QuestionPaperallwindow=driver.getWindowHandles();
				System.out.println("All windows :"+QuestionPaperallwindow);
					
				String y="";
					
				for(String temp2:QuestionPaperallwindow) {
						System.out.println("all windows :"+temp2);
						driver.switchTo().window(temp2);
						
						if(!temp2.equals(QuestionPaperparent)) {
							y=driver.getTitle();
							System.out.println("The page title is :"+y);
						}
						if(y.equals("St. Thomas' College (Autonomous) Thrissur Previous Question Papers – Google Drive")) {
							driver.close();
							
							
						}
				  }
				driver.switchTo().window(QuestionPaperparent);
				
				
				//STARC
				WebElement Starc=driver.findElement(By.xpath("//a[normalize-space()='STArc']"));
				act.click(Starc).perform();
				driver.navigate().back();
				
				//DIVISIONS
				WebElement Divisions=driver.findElement(By.xpath("//a[normalize-space()='Divisions']"));
				act.moveToElement(Divisions).perform();
				Thread.sleep(1000);
				
				WebElement PublicationsDivision=driver.findElement(By.xpath("//a[normalize-space()='Publications Division']"));
				act.moveToElement(PublicationsDivision).perform();
				Thread.sleep(1000);
				
				WebElement Jounals=driver.findElement(By.xpath("//a[normalize-space()='Journals']"));
				act.click(Jounals).perform();
				driver.navigate().back();
				
				WebElement ResearchVisibilityLab=driver.findElement(By.xpath("//a[normalize-space()='Research Visibility Lab']"));
				act.click(ResearchVisibilityLab).perform();
				driver.navigate().back();
				
				WebElement infoLITlab=driver.findElement(By.xpath("//a[normalize-space()='infoLIT Lab']"));
				act.click(infoLITlab).perform();
				driver.navigate().back();
				
				//STARC
				WebElement ContactUs=driver.findElement(By.xpath("//a[normalize-space()='Contact us']"));
				act.click(ContactUs).perform();
				driver.navigate().back();
				
				//STARC
				WebElement STARs=driver.findElement(By.xpath("//a[contains(text(),'St Thomas’ Ardent Readers (STARs)')]"));
				act.click(STARs).perform();
				driver.navigate().back();
				
				
				js.executeScript("window.scrollBy(0,500)");
				
				
				driver.close();
				
			}
			
	  }
			
	  driver.switchTo().window(parent);
	  
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Anti-Ragging Cell')]")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,500)");
	  js.executeScript("window.scrollBy(0,500)");
	  js.executeScript("window.scrollBy(0,500)");
	  
	  WebElement RelatedCirculars=driver.findElement(By.xpath("//span[normalize-space()='Related Circulars']"));
		act.click(RelatedCirculars).perform();
		//driver.navigate().back();
		String RelatedCircularsparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+RelatedCircularsparent);
			
		Set<String> RelatedCircularsallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+RelatedCircularsallwindow);
			
		String y21="";
			
		for(String temp21:RelatedCircularsallwindow) {
				System.out.println("all windows :"+temp21);
				driver.switchTo().window(temp21);
				
				if(!temp21.equals(RelatedCircularsparent)) {
					y21=driver.getTitle();
					System.out.println("The page title is :"+y21);
				}
				if(y21.equals("Website Under Maintenance")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(RelatedCircularsparent);
		
		WebElement RegisterComplaint=driver.findElement(By.xpath("//span[normalize-space()='Register Complaint']"));
		act.click(RegisterComplaint).perform();
		//driver.navigate().back();
		String RegisterComplaintparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+RegisterComplaintparent);
			
		Set<String> RegisterComplaintallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+RegisterComplaintallwindow);
			
		String y69="";
			
		for(String temp69:RegisterComplaintallwindow) {
				System.out.println("all windows :"+temp69);
				driver.switchTo().window(temp69);
				
				if(!temp69.equals(RegisterComplaintparent)) {
					y69=driver.getTitle();
					System.out.println("The page title is :"+y69);
				}
				if(y69.equals("Anti Ragging | Ragging in College | Anti Ragging Affidavit")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(RegisterComplaintparent);
	  
	  
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Grievances Redressal Cell')]")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,400)");
	  driver.navigate().back();
	  
	  js.executeScript("window.scrollBy(0,400)");
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Placement Cell')]")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,400)");
	  js.executeScript("window.scrollBy(0,200)");
	  
	  driver.findElement(By.xpath("//div[@id='accordion-367-1']//div[1]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@id='accordion-367-1']//div[1]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  driver.findElement(By.xpath("//div[@class='fusion-layout-column fusion_builder_column fusion-builder-column-8 fusion_builder_column_2_3 2_3 fusion-two-third fusion-column-last fusion-animated']//div[2]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='fusion-layout-column fusion_builder_column fusion-builder-column-8 fusion_builder_column_2_3 2_3 fusion-two-third fusion-column-last fusion-animated']//div[2]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  
	  /*
	  driver.findElement(By.xpath("//div[3]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[3]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  
	  
	  driver.findElement(By.xpath("//div[4]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[4]//div[1]//h4[1]//a[1]//span[1]//i[1]")).click();
	  Thread.sleep(1000);
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2023 -24']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2023 -24']")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2022 -23']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2022 -23']")).click();
	  Thread.sleep(1000);
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2021-22']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2021-22']")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2020-21']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2020-21']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2019-20']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2019-20']")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2018-19']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2018-19']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2017-18']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2017-18']")).click();
	  Thread.sleep(1000);
	  js.executeScript("window.scrollBy(0,200)");
	  
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[12]/div[1]/h4[1]/a[1]/span[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[12]/div[1]/h4[1]/a[1]/span[2]")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2015-16']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[normalize-space()='PLACEMENT 2015-16']")).click();
	  Thread.sleep(1000);
	  
	  js.executeScript("window.scrollBy(0,200)");
	  
	  js.executeScript("window.scrollBy(0,1000)");

	  */
	  
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Parent Teacher Association (PTA)')]")).click();
	  Thread.sleep(1000);
	  
	  js.executeScript("window.scrollBy(0,400)");
	  
	  WebElement General_Body_Meeting=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[normalize-space()='PTA General Body Meeting']"));
	  act.click(General_Body_Meeting).perform();
	  driver.navigate().back();
	  
	  WebElement GeneralBodyMeeting2024=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'PTA General Body Meeting 2024')]"));
	  act.click(GeneralBodyMeeting2024).perform();
	  driver.navigate().back();

	  
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Old Student’s Association (OSA)')]")).click();
	  Thread.sleep(1000);
	  
	  WebElement BloodDonationCamp=driver.findElement(By.xpath("//a[normalize-space()='Blood Donation Camp']"));
	  act.click(BloodDonationCamp).perform();
	  driver.navigate().back();
	  js.executeScript("window.scrollBy(0,300)");
	  
	  WebElement Chitharn=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'പി. ചിത്രൻ നമ്പൂതിരിപ്പാടിന്റെ സ്മരണയ്ക്കായി അനുശോ')]"));
	  act.click(Chitharn).perform();
	  driver.navigate().back();
	  
	  WebElement UAE=driver.findElement(By.xpath("//h2[@class='blog-shortcode-post-title entry-title']//a[contains(text(),'Iftar Kit Distribution, the UAE Chapter of OSA ,St')]"));
	  act.click(UAE).perform();
	  driver.navigate().back();
	  
	  js.executeScript("window.scrollBy(0,400)");
	  js.executeScript("window.scrollBy(0,400)");
	  
	  WebElement Endowments=driver.findElement(By.xpath("//span[@class='fusion-button-text'][normalize-space()='Endowments']"));
		act.click(Endowments).perform();
		//driver.navigate().back();
		String Endowmentsparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+Endowmentsparent);
			
		Set<String> Endowmentsallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+Endowmentsallwindow);
			
		String yx1="";
			
		for(String tempx1:Endowmentsallwindow) {
				System.out.println("all windows :"+tempx1);
				driver.switchTo().window(tempx1);
				
				if(!tempx1.equals(Endowmentsparent)) {
					yx1=driver.getTitle();
					System.out.println("The page title is :"+yx1);
				}
				if(yx1.equals("Endowments by OSA - St Thomas College (Autonomous)")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(Endowmentsparent);
		
		WebElement Santhome=driver.findElement(By.xpath("//span[normalize-space()='Santhome Luminaries-Malayalam']"));
		act.click(Santhome).perform();
		//driver.navigate().back();
		String Santhomeparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+Santhomeparent);
			
		Set<String> Santhomeallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+Santhomeallwindow);
			
		String yx2="";
			
		for(String tempx2:Santhomeallwindow) {
				System.out.println("all windows :"+tempx2);
				driver.switchTo().window(tempx2);
				
				if(!tempx2.equals(Santhomeparent)) {
					yx2=driver.getTitle();
					System.out.println("The page title is :"+yx2);
				}
				if(yx2.equals("Santhome Souv-19-final")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(Santhomeparent);
		
		WebElement SanthomeEnglish=driver.findElement(By.xpath("//span[normalize-space()='Santhome Luminaries-English']"));
		act.click(SanthomeEnglish).perform();
		//driver.navigate().back();
		String SanthomeEnglishparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+SanthomeEnglishparent);
			
		Set<String> SanthomeEnglishallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+SanthomeEnglishallwindow);
			
		String yx3="";
			
		for(String tempx3:SanthomeEnglishallwindow) {
				System.out.println("all windows :"+tempx3);
				driver.switchTo().window(tempx3);
				
				if(!tempx3.equals(SanthomeEnglishparent)) {
					yx3=driver.getTitle();
					System.out.println("The page title is :"+yx3);
				}
				if(yx3.equals("Santhome ENG-Feb-1")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(SanthomeEnglishparent);
		
		WebElement Chronicle=driver.findElement(By.xpath("//span[normalize-space()='OSA Chronicle']"));
		act.click(Chronicle).perform();
		//driver.navigate().back();
		String Chronicleparent=driver.getWindowHandle();
		System.out.println("Parent Window :"+Chronicleparent);
			
		Set<String> Chronicleallwindow=driver.getWindowHandles();
		System.out.println("All windows :"+Chronicleallwindow);
			
		String yx4="";
			
		for(String tempx4:Chronicleallwindow) {
				System.out.println("all windows :"+tempx4);
				driver.switchTo().window(tempx4);
				
				if(!tempx4.equals(Chronicleparent)) {
					yx4=driver.getTitle();
					System.out.println("The page title is :"+yx4);
				}
				if(yx4.equals("OSA Chronicle Final Sep 2022.pmd")) {
					driver.close();
					
					
				}
		  }
		driver.switchTo().window(Chronicleparent);
	  
	  
	  
	  driver.navigate().back();
	  
	  
	  
	
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver.get("https://stthomas.ac.in/journals/");
	  driver.manage().window().maximize();
	  //js.executeScript("window.scrollBy(0,1000)");
	  //js.executeScript("window.scrollBy(0,400)");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

 
