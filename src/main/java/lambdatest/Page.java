package lambdatest;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    WebDriver driver;

 //   By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    WebElement loginLink=null;
    
    String path="";
    
    
/*
    public  Page(String xpath){

     //   this.driver = driver;
        path=xpath;
        
  // loginLink =driver.findElement(By.xpath(xpath));
   
        
        

    }
  */  
    
    
    
    
    
    public static void click(String path)
    {
         path=path;
    	
    	Lambdatest.driver.findElement(By.xpath(path)).click();
    	
    	//loginLink.click();
    	
    	
    }
    public static void enterdata(String data)
    {
    	
  //  	loginLink.sendKeys(data);
    	
    	
    	
    	
    }
    

    //Get the User name from Home Page

    /*
        public String getHomePageDashboardUserName(){

   //      return    driver.findElement(homePageUserName).getText();

        }

}*/
}
    