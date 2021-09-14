package lambdatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import java.util.ArrayList;

//import com.google.common.collect.Table.Cell;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lambdatest {
    String username = "gaya_9";
    String accesskey = "NuZ8889EhQ2vYXuHMrhqVE46pYQsROrfVsPNosAP1IWXpfugdV";
    String firstcolumn="";
    StringBuffer errorBuffer = new StringBuffer();      
    WebElement webElement1 =null;
    boolean onceexecuted=false;
    
    static boolean impvalidation=false;
   
    
    String username1 ="gayatri.ramasubramanian";
    
    		String accesskey2= "HVCmNN8anGYzu9F47VVzs7YdlnNB4i4KJYnBvXh8aetzPMCuAB";
    		//WebDriver driver = new FirefoxDriver();
    		
  //  static RemoteWebDriver driver1,driver2 = null;
 //   String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
    
    WebDriverWait wait = null;
    
    WebElement element = null;
    
    String parent="";
    Page page=null;
    
    boolean imp=false;
    
    String data="";
    
    String subparent="";
    
    String linkortext="";
    String dragorno="";
    
    boolean dataornot=true;
    DataFormatter formatter =null;
    
    
    String clicklnk="";
    
    WebElement webElement =null;
    
    
    
    static File file =  null;
    

    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream =null;
    

    //creating workbook instance that refers to .xls file
    XSSFWorkbook wb=null;
    static int i=0;
    int j=0;
    static int i1=0;
    

    //creating a Sheet object
    XSSFSheet sheet=null;
    

static  WebDriver driver =null;
	  
    
    
    DesiredCapabilities capabilities,capabilities1=null;
    
    public static void main(String[] args) {
    	System.out.println("Hiii");
    	
       // new Lambdatest().test();
    }
    
    
    @BeforeTest
    @Parameters({"browser"})

   public  void  beforetest(Method method,@Optional("x")  String browser)
   {
    	
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayatri3009\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
  
   driver = new ChromeDriver();
    	  
//if you want to get the class name in before method

//IF you want to get the method name in the before method
    	/*
  String methodName = method.getName() ;
  
  System.out.println("m"+methodName);
  

  if(methodName.equals("Test1"))
	  
  {
	  
	
	  
	     capabilities = new DesiredCapabilities();
    
	    capabilities.setCapability("browserName","chrome");
       capabilities.setCapability("version", "86.0");
    //   capabilities.setCapability("platform", "macOS Mojave"); 
    capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one.
        capabilities.setCapability("build", "LambdaTestSampleApp1");
        
        capabilities.setCapability("name", "LambdaTestJavaSampleNEW");
        	    
	    
	    
    //  capabilities.setCapability("version", "70.0");

         // 
	  
         
         try {
             driver1 = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
         } catch (MalformedURLException e) {
             System.out.println("Invalid grid URL");
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
         
  }
  
  if(methodName.equals("Test2"))
	  
  {
	  
	  
	  capabilities1 = new DesiredCapabilities();
	 
	  /*
	    DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities.setCapability("browserName", "chrome");
         capabilities.setCapability("version", "70.0");
      capabilities.setCapability("platform", "mac"); // 
	  
      // capabilities.setCapability("version", "70.0");
//      capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one.
        capabilities.setCapability("build", "LambdaTestSampleApp1");
        
        capabilities.setCapability("name", "LambdaTestJavaSampleNEW");
           */
	  /*
	  System.out.println("Invalid grid URL");
      capabilities1.setCapability("browserName","MicrosoftEdge");
      System.out.println("Invalid grid URL");
      capabilities1.setCapability("version", "87.0");
      System.out.println("Invalid grid URL");
      capabilities.setCapability("platform", "macOS Sierra"); 
      System.out.println("Invalid grid URL");
      capabilities1.setCapability("build", "LambdaTestSampleAppie");
      System.out.println("Invalid grid URL");
      capabilities1.setCapability("name", "LambdaTestJavaSampleieNEW");
      System.out.println("Invalid grid URL");
	  
     // driver2=driver1;
      
      
        try {
            driver2 = new RemoteWebDriver(new URL("https://" + username1 + ":" + accesskey2 + gridURL), capabilities1);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
  }
  
  
  
  
  */
  
  }
  
//this will return you   exampleTest   
    

    
    
    
    
    
    
    
    public void readfile() throws IOException, InterruptedException {
        //Create an object of File class to open xlsx file
         file =    new File("C:\\Users\\Gayatri3009\\Documents\\testdata_intern.xlsx");
boolean flag2=false;

        //Create an object of FileInputStream class to read excel file
 inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
      wb=new XSSFWorkbook(inputStream);

        //creating a Sheet object
       sheet=wb.getSheet("STUDENT_DATA");
        
      // i1=;
       
       i1=0;
       
       
        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        //iterate over all the row to print the data present in each cell.
        for( i1=0;i1<=rowCount;i1++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(i1).getLastCellNum();
            
            //iterate over each cell to print its value
            System.out.println("Row"+ i1+" data is :");
   
            
            Thread.sleep(2000);
            
            driver.get("https://minorityprogrammers.com/");
            
            for(j=0;j<cellcount;j++)
            {
            	
            	//Thread.sleep(6000);
            	
                if(j==0)
                {
                	firstcolumn=sheet.getRow(i1).getCell(j).getStringCellValue();
                	
                	if((!sheet.getRow(i1).getCell(j).getStringCellValue().trim().equals("MINORITY PROGRAMMERS ASSOCIATION")))
                	{
                		flag2=true;
                		
                	}
                	
                	
                	
                }	/*
                	if((driver.findElements(By.xpath(firstcolumn)).size() != 0) && (!sheet.getRow(i).getCell(j).getStringCellValue().equals("MINORITY PROGRAMMERS ASSOCIATION")))
                	    {
                		System.out.println("Element is Present");
                		
                        if(j==0)
                        {
                        	firstcolumn=sheet.getRow(i).getCell(j).getStringCellValue();
                        	
                        	if(driver.findElements(By.xpath(firstcolumn)).size() != 0)
                        	    {
                        		System.out.println("Element is Present");
                        		
                        		
                        	*/	
                        	    if((j==1) && (flag2))
                                {
                             	   if( sheet.getRow(i1).getCell(j)!=null)
                             	   {
                             	   
                             	 parent =  sheet.getRow(i1).getCell(j).getStringCellValue();
                             	   }
                   
                             	 System.out.println(""+parent+i);
                             	parent=parent.trim();
                             	/*
                             	
                             	 if(onceexecuted==false)
                             	 {
                             	 */
                             	 
                                	 if((parent != "") && (!parent.equals("Parent")))
                             	 {
                             		
                                     int h = readfile(parent);
                                     h=h-1;
                                     
                                     System.out.println("The mand"+h);
                                     
                                     
                                	 	 
                               		 Thread.sleep(3000);

                               		 
                               		 
                               	    if( sheet.getRow(i1).getCell(j+8)!=null )
                               	    {
                               	    	

                                   	    if( sheet.getRow(i1).getCell(j+8).getStringCellValue().equals("Yes") && (!sheet.getRow(i1).getCell(j+8).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j+8).getStringCellValue())))
                               	    	
                                   	    {
                                   	    	
                                   	     {   if(i1!=i)
                                   		 {
                                   		 getcellValue(h);
                                   		 
                                  
                                 		 
                                 	/* }*/
                                    	 
                                 	 }
                                    } 	 
                                   	    
                                   }
                                   	   
                               	    }
                                   	if( sheet.getRow(i1-1).getCell(j+8) !=null)
                                   	{
                                   		
                                   		

                                   	    if(  (!sheet.getRow(i1-1).getCell(j+8).getStringCellValue().equals("Yes")) )
                               	    	
                                   	    {
                                   	    	
                                   	     {   if(i1!=i)
                                   		 {
                                   		 getcellValue(h);
                                   		 
                                  
                                 		 
                                 	/* }*/
                                    	 
                                 	 }
                                    } 	 
                                   	}
                                   	}
                                   	    
                                   	if(sheet.getRow(i1).getCell(j+8)!=null)
                                   	{
                                   	    if( sheet.getRow(i1).getCell(j+8).getStringCellValue().equals("No"))
                               	    	
                                   	    {
                                   	    	
                                   	     {   if(i1!=i)
                                   		 {
                                   		 getcellValue(h);
                                   		 
                                  
                                 		 
                                 	/* }*/
                                    	 
                                 	 }
                                    } 	 
                                   	    
                                   }
                                   	    	
                                   }
                                   	    
                             	 }
                                }
                        	    
                                	 /*
                                	 else
                                	 {
                                		 
                                		*/ 
                                	     if((j==2) && (flag2) && (i1!=i) &&  (sheet.getRow(i1).getCell(j+7).getStringCellValue().equals("No")    ||(!sheet.getRow(i1).getCell(j-2).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j-2).getStringCellValue()))))
                                      {
                                   	   
                                	    	 
                                	    	 
                                	    	 
                                     	   if( sheet.getRow(i1).getCell(j)!=null)
                                     	   {
                                     	   
                                     		 	 dragorno =  sheet.getRow(i1).getCell(j).getStringCellValue();
                                     	   }
                                  
                                   	JavascriptExecutor js = (JavascriptExecutor) driver;
                                   	
                                   	 
                                   	 
                                   	 if(dragorno.equals("yes"))
                                   	 {
                                   		 Page.click(firstcolumn);
                                 		 
                                   		 
                                   		
                                   		 
                                   		 
                                   		 
                                   	//	 js.executeScript("arguments[0].scrollIntoView();", page.loginLink);
                                   		
                                   	 }
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 
                                   	 }
                                	     
                                	     
                                	     
                                	  if((j==3) && (flag2==true) && (i1!=i)&& (sheet.getRow(i1).getCell(j+6).getStringCellValue().equals("No") ||   (!sheet.getRow(i1).getCell(j-3).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j-3).getStringCellValue()))))
                                   {
                                	   if( sheet.getRow(i1).getCell(j)!=null)
                                	   {
                                	 data =  sheet.getRow(i1).getCell(j).getStringCellValue();
                                	
                                	
                                	   }
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 }
                             	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	     
                                	  if((j==4) && (flag2==true) && (i1!=i) && (sheet.getRow(i1).getCell(j+5).getStringCellValue().equals("No") || (!sheet.getRow(i1).getCell(j-4).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j-4).getStringCellValue()))))
                                      {
                                   
                                	   
                                		  
                            		    if( sheet.getRow(i1).getCell(j) != null)
                            		  {
                            	   
                            	 linkortext =   sheet.getRow(i1).getCell(j).getStringCellValue();
                            	 System.out.println( linkortext);
                            		  }
                            	
                            	 
                            	 
                            	 if(linkortext.equals("link"))
                            	 {
                            		 
                                  /*
                              		ChromeOptions options = new ChromeOptions();
                              		options.addArguments("--headless", "--window-size=1920,1200");
                              		 driver = new ChromeDriver(options);
                             	  */

                            		 WebDriverWait wait = new WebDriverWait(driver, 10);
                            		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstcolumn))); 
                            		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
                            		 	//WebDriverWait wait = new WebDriverWait(driver, 10);
                                 		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstcolumn))).click();
                               		 
                                 		
                            		 
                            	//	 driver.findElement(By.xpath(firstcolumn)).click();
                            		 

                            		 
                            		 /*
                            		try {
                            			
                               		 
                                		List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

                                		for (WebElement webElement1 : month_list) {

                                		System.out.println("The text"+webElement1.getText());
                            			
                            			
                            			
                            			if(webElement1.getText().equals("Close"))
                                		{
                                			
                                			webElement1.click();
                                			
                                		}
                            			
                            			
                            			
                            		
                            		}
                            		}
                            		
                            		
                            		catch(org.openqa.selenium.StaleElementReferenceException ex)
                            		{

                            			
                            			
                            		//	if(webElement1.getText().equals("Close"))
                                	//	{
                            				

                                   		 wait = new WebDriverWait(driver, 10);
                                   		  element = wait.until(ExpectedConditions.elementToBeClickable(By.name("Close"))); 
                                   		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
                                		//	webElement1.click();
                                			
                                		//}
                            			
                            		}
                                	 
                                	 */
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 }
                                	  
                                	  
                                	  
                                	  
                            	 }
                            	 
                            	 if((j==5) && (flag2==true) && (i1!=i) && (sheet.getRow(i1).getCell(j+4).getStringCellValue().equals("No")   || (!sheet.getRow(i1).getCell(j-5).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j-5).getStringCellValue()))))
                                 
                            	 {
                            		
                            		  
                             		  if(sheet.getRow(i1).getCell(j)!=null)
                             		  {
                             	    if( sheet.getRow(i1).getCell(j).equals("Yes"))
                             	    {
                            		 
                            		 
                            		List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

                            		
                           		 WebDriverWait wait = new WebDriverWait(driver, 10);
                        		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button"))); 
                        		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
                            		
                            		
                            		/*
                            		
                            		
                          		for (WebElement webElement : month_list) {

                          		System.out.println("The text"+webElement.getText());
                          		try {
                          			
                          			
                          			
                          			
                          			
                          			if(webElement.getText().equals("Close"))
                              		{
                              			
                              			webElement.click();
                              			
                              		}
                          			
                          			
                          			
                          		
                          		}
                          		catch(org.openqa.selenium.StaleElementReferenceException ex)
                          		{

                          			
                          			
                          			if(webElement.getText().equals("Close"))
                              		{
                              			
                              			webElement.click();
                              			
                              		}
                          			
                          		}
                          		
                          	

                          		}
                          		 
                          		 */
                          		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
                          		
                          		 
                          		/* 
                          		 
                          		String MainWindow=driver.getWindowHandle();
                          		
                          		System.out.println(MainWindow);
                          		
                          		
                         		
                                 // To handle all new opened window.				
                                     Set<String> s1=driver.getWindowHandles();		
                                 Iterator<String> i1=s1.iterator();		
                                 		
                                 while(i1.hasNext())			
                                 {	
                                 	
                              		System.out.println("In child");
                              		
                              		
                              		
                                     String ChildWindow=i1.next();
                                     
                                     System.out.println(ChildWindow);

                                     driver.switchTo().window(ChildWindow);	 
                                     //break;
                                   
                                     System.out.println("Window Title : " + driver.getTitle().toString());
                                     if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                     {    
                                     	
                                     	
                                     	System.out.println("in child window");
                                     	
                                          
                                             // Switching to Child window
                                     	
                                             driver.switchTo().window(ChildWindow);	   
                                             /*
                                             driver.findElement(By.name("emailid"))
                                             .sendKeys("gaurav.3n@gmail.com");                			
                                             */
                                 //            driver.findElement(By.name("Close")).click();			
                                                          
                                     
                         			// Closing the Child Window.
                                                 //driver.close();		
                                     }		
                                 		
                          		
                             	//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                          		/*
                          		 /*
                          	
                          		*/
                          		
                          		/*
                           		ChromeOptions options = new ChromeOptions();
                           		options.addArguments("--headless", "--window-size=1920,1200");
                           		 driver = new ChromeDriver(options);
                           		 */
                          		  
                           		//clickAndFindPopup(driver);
                          		
                          		 System.out.println("here is error");
                          		 
                        	 
                             		  }
                             		  
                             		  
                            	 }
                              }
                          
                          
                          
                          
                          
                          
                          
                          
                          
                       	     
                       	  if((j==6) && (flag2==true) && (i1!=i) && (sheet.getRow(i1).getCell(j+3).getStringCellValue().equals("No") ||(!sheet.getRow(i1).getCell(j-6).getStringCellValue().equals(sheet.getRow(i1-1).getCell(j-6).getStringCellValue()))))
                          
                          {
                       		  
                       		  
                       	//	ChromeOptions options = new ChromeOptions();
                       	//	options.addArguments("--headless", "--window-size=1920,1200");
                       	//	 driver = new ChromeDriver(options);
                       /*		  
                       		ChromeOptions options = new ChromeOptions();
                       		options.addArguments("--headless");
                       		driver = new ChromeDriver(options);
                       		
                       		
                       		
                       		
                       		
                       		
                       		
                       		

                       		
                       		  
                       	///	clickAndFindPopup(driver);
                       		  
                       		  /*
                      	      if (!popupHandle.equals("")) {
                      	          String currentHandle = driver.getWindowHandle();
                      	          driver.switchTo().window(popupHandle);
                      	          driver.close();
                      	          driver.switchTo().window(currentHandle);
                      	      }
                      	      */
                       		  
                       		  
                       		  
                       		  /*
                          		String parentWindowHandler = driver.getWindowHandle(); 
                          		String subWindowHandler = null;

                          		Set<String> handles = driver.getWindowHandles(); // get all window handles
                          		Iterator<String> iterator = handles.iterator();

                          		subWindowHandler = iterator.next();

                          		driver.switchTo().window(subWindowHandler); // switch to popup window
                 */
                          		// Now you are in the popup window, perform necessary actions here

                          	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
                      	
                       		  List<WebElement> l= new LinkedList<WebElement>();
                       		  
                       		  
                       	//	clickAndFindPopup(driver);
                       		  /*
                       		String MainWindow=driver.getWindowHandle();		
                     		
                             // To handle all new opened window.				
                                 Set<String> s1=driver.getWindowHandles();		
                             Iterator<String> i1=s1.iterator();		
                             		
                             while(i1.hasNext())			
                             {		
                                 String ChildWindow=i1.next();		
                                 		
                                 if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                 {    
                                 	
                                 	
                                 	System.out.println("in child window");
                                 	
                                      
                                         // Switching to Child window
                                 	/*
                                         driver.switchTo().window(ChildWindow);	                                                                                                           
                                         driver.findElement(By.name("emailid"))
                                         .sendKeys("gaurav.3n@gmail.com");                			
                                         */
                             //            driver.findElement(By.name("Close")).click();			
                                 /*                     
                                 	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                     			// Closing the Child Window.
                                             driver.close();		
                                 }		
                             }		
                       		  
                       		  
                       		  
                       		  
                       		  */
                       		  
                       		  
                       		  
                       		  
                       		  
                       		
                      // 		driver.switchTo().window(parentWindowHandler); 
                         	
                       		  
                       		  
                       		  
                        		  
                      		  System.out.println("Validating if data in the page is right or wrong"+j);
                      	
                      		 // Thread.sleep(6000);
                      		  
                      		  if( sheet.getRow(i1).getCell(j) != null)
                      		  {
                      		
                       	 l= driver.findElements(By.xpath("//*[contains(text(), '" + sheet.getRow(i1).getCell(j) + "')]"));
                       	 
                       	  /*'" + text + "'
                          JavascriptExecutor js 
                          = (JavascriptExecutor)driver;
                 	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
                 	        
                       	 
                        driver.navigate().back();
                           */
                       	 
                       	 
                       	 
                       	 
                       	 
                      		  }
                       	      // verify list size

                      	      if ( l.size() > 0){
                         	    	 // Assert.assertEquals("true", "");
                         	    	  
                         	    	  dataornot=true;
                         	    	  
                         	    	  
                         	    	  
                         	    	  
                         	      } 
                       	      
                       	      
                       	      
                       	      
                       	      
                       	      else {
                       	    	  
                       	    	  dataornot=false;
                       	    	  
                       	    	  
                       	       //  System.out.println("Text: " + t + " is not present. ");
                       	      }

                        	  
                              try{        
                            	  Assert.assertTrue(dataornot,"The content is not there");          
                              }catch(AssertionError e){           
                                  errorBuffer.append(e.getMessage() + "\n");      
                              }       

                            		 
                            		 
                            		 
                            		 
                            		 
                            		 
                            		 
                            		 
                            		 
                            		 
                            	 }
                            	 
                            	 
                            	 
                             }
                            	 
                            	 List<WebElement> l= new LinkedList<WebElement>();
                                	  
                                	  
                             /*	     
                             	  if(j==6)
                                {
                             	   
                             		  
                             		  
                             		  
                               		  
                                     	//	ChromeOptions options = new ChromeOptions();
                                     	//	options.addArguments("--headless", "--window-size=1920,1200");
                                     	//	 driver = new ChromeDriver(options);
                                     /*		  
                                     		ChromeOptions options = new ChromeOptions();
                                     		options.addArguments("--headless");
                                     		driver = new ChromeDriver(options);
                                     		
                                     		
                                     		
                                     		
                                     		
                                     		
                                     		
                                     		
                      
                                     		
                                     		  
                                     	///	clickAndFindPopup(driver);
                                     		  
                                     		  /*
                                    	      if (!popupHandle.equals("")) {
                                    	          String currentHandle = driver.getWindowHandle();
                                    	          driver.switchTo().window(popupHandle);
                                    	          driver.close();
                                    	          driver.switchTo().window(currentHandle);
                                    	      }
                                    	      */
                                     		  
                                     		  
                                     		  
                                     		  /*
                                        		String parentWindowHandler = driver.getWindowHandle(); 
                                        		String subWindowHandler = null;

                                        		Set<String> handles = driver.getWindowHandles(); // get all window handles
                                        		Iterator<String> iterator = handles.iterator();

                                        		subWindowHandler = iterator.next();

                                        		driver.switchTo().window(subWindowHandler); // switch to popup window
                 */
                                        		// Now you are in the popup window, perform necessary actions here

                                        	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
                                    	//l= new LinkedList<WebElement>();
                                     		  
                                     		  
                                     	//	clickAndFindPopup(driver);
                                     		  /*
                                     		String MainWindow=driver.getWindowHandle();		
                                   		
                                           // To handle all new opened window.				
                                               Set<String> s1=driver.getWindowHandles();		
                                           Iterator<String> i1=s1.iterator();		
                                           		
                                           while(i1.hasNext())			
                                           {		
                                               String ChildWindow=i1.next();		
                                               		
                                               if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                               {    
                                               	
                                               	
                                               	System.out.println("in child window");
                                               	
                                                    
                                                       // Switching to Child window
                                               	/*
                                                       driver.switchTo().window(ChildWindow);	                                                                                                           
                                                       driver.findElement(By.name("emailid"))
                                                       .sendKeys("gaurav.3n@gmail.com");                			
                                                       */
                                           //            driver.findElement(By.name("Close")).click();			
                                               /*                     
                                               	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                                   			// Closing the Child Window.
                                                           driver.close();		
                                               }		
                                           }		
                                     		  
                                     		  
                                     		  
                                     		  
                                     		  */
                                     		  
                                     		  
                                     		  
                                     		  
                                     		  
                                     		
                                    // 		driver.switchTo().window(parentWindowHandler); 
                                       	
                                     		  
                                     		  
                                     		  
                                      		  
                               //     		  System.out.println("Validating if data in the page is right or wrong"+j);
                                    	
                                    		 // Thread.sleep(6000);
                                 //   		  
                                   // 		  if( sheet.getRow(i).getCell(j) != null)
                                    //		  {
                                     		
                                     //	 l= driver.findElements(By.xpath("//*[contains(text(),  'Invest directly into minority innovations')]"));
                                     	 
                                     	  /*
                                        JavascriptExecutor js 
                                        = (JavascriptExecutor)driver;
                            	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
                            	        
                                     	 
                                      driver.navigate().back();
                                         */
                                     	 
                                     	 
                                     	 
                                     	 
                                     	 
                                    		//  }
                                     	      // verify list size
                         
                                    	      //if ( l.size() > 0){
                                       	    	 // Assert.assertEquals("true", "");
                                       	    	  
                                       	    	//  dataornot=true;
                                       	    	  
                                       	    	  
                                       	    	  
                                       	    	  
                                       	    //  } 
                                     	      
                                     	      
                                     	      
                                     	      
                                     	      
                                     	     // else {
                                     	    	  
                                     	    	  dataornot=false;
                                     	    	  
                                     	    	  
                                     	       //  System.out.println("Text: " + t + " is not present. ");
                                     	      //}

                                    	  System.out.println(  dataornot);
                                    	  
                                    	  
                                    	  
                                    	  
                                          try{        
                                        	  Assert.assertTrue(dataornot,"The content is not there");          
                                          }catch(AssertionError e){           
                                              errorBuffer.append(e.getMessage() + "\n");      
                                          }
        }

                                     	 //     Assert.assertTrue(dataornot,"The content is not there");
                                     	 
                                     	      
                                           //}
                                     	  
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		
                         		//}
                	//}
                	
                	
                	/*
                	else{
                         		System.out.println("Element is Absent");
                         		}
                      */   	
                         	
                         	
                         	
                         	
                         	
                         	
                         
                	
                	/*
                        if(j==1)
                        {
                     	   if( sheet.getRow(i).getCell(j)!=null)
                     	   {
                     	   
                     	 parent =  sheet.getRow(i).getCell(j).getStringCellValue();
                     	   }
           
                     	 System.out.println(""+parent+i);
                     	parent=parent.trim();
                     	
                     	 
                     	 
                        	 if((parent != "") && (!parent.equals("Parent")))
                     	 {
                     		
                        		 readfile(parent);
                        		 
                        		 
                     		 
                     		 
                     	 }
                        	 
                        	 /*
                        	 else
                        	 {
                        		 
                        		*/ 
  
                	/*if(j==2)
                              {
                           	   
                        	    	 
                        	    	 
                        	    	 
                             	   if( sheet.getRow(i).getCell(j)!=null)
                             	   {
                             	   
                             		 	 dragorno =  sheet.getRow(i).getCell(j).getStringCellValue();
                             	   }
                          
                           	JavascriptExecutor js = (JavascriptExecutor) driver;
                           	
                           	 
                           	 
                           	 if(dragorno.equals("yes"))
                           	 {
                           		 Page.click(firstcolumn);
                         		 
                           		 
                           		
                           		 
                           		 
                           		 
                           	//	 js.executeScript("arguments[0].scrollIntoView();", page.loginLink);
                           		
                           	 }
                           	 
                           	 
                           	 
                           	 
                           	 
                           	 
                           	 
                           	 
                           	 
                           	 }
                        	     
                        	     
                        	     
                        	  if(j==3)
                           {
                        	   if( sheet.getRow(i).getCell(j)!=null)
                        	   {
                        	 data =  sheet.getRow(i).getCell(j).getStringCellValue();
                        	
                        	
                        	   }
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 }
                     	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	     
                        	  if(j==4)
                           {
                        	   
                        		  
                    		    if( sheet.getRow(i).getCell(j) != null)
                    		  {
                    	   
                    	 linkortext =   sheet.getRow(i).getCell(j).getStringCellValue();
                    	 System.out.println( linkortext);
                    		  }
                    	
                    	 
                    	 
                    	 if(linkortext.equals("link"))
                    	 {
                    		 
                          /*
                      		ChromeOptions options = new ChromeOptions();
                      		options.addArguments("--headless", "--window-size=1920,1200");
                      		 driver = new ChromeDriver(options);
                     	  */

                    		/* 
                    		 
                    		 driver.findElement(By.xpath(firstcolumn)).click();
                    		 
                    		 
                    		List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

                    		for (WebElement webElement : month_list) {

                    		System.out.println("The text"+webElement.getText());
                    		try {
                    			
                    			
                    			
                    			
                    			
                    			if(webElement.getText().equals("Close"))
                        		{
                        			
                        			webElement.click();
                        			
                        		}
                    			
                    			
                    			
                    		
                    		}
                    		catch(org.openqa.selenium.StaleElementReferenceException ex)
                    		{

                    			
                    			
                    			if(webElement.getText().equals("Close"))
                        		{
                        			
                        			webElement.click();
                        			
                        		}
                    			
                    		}
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 }
                        	  
                        	  
                        	  
                        	  
                    	 }
                    	 
                    	 if(j==5)
                    	 {
                    		 
                    		 
                    		List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

                  		for (WebElement webElement : month_list) {

                  		System.out.println("The text"+webElement.getText());
                  		try {
                  			
                  			
                  			
                  			
                  			
                  			if(webElement.getText().equals("Close"))
                      		{
                      			
                      			webElement.click();
                      			
                      		}
                  			
                  			
                  			
                  		
                  		}
                  		catch(org.openqa.selenium.StaleElementReferenceException ex)
                  		{

                  			
                  			
                  			if(webElement.getText().equals("Close"))
                      		{
                      			
                      			webElement.click();
                      			
                      		}
                  			
                  		}
                  		
                  	

                  		}
                  		 
                  		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
                  		
                  		 
                  		/* 
                  		 
                  		String MainWindow=driver.getWindowHandle();
                  		
                  		System.out.println(MainWindow);
                  		
                  		
                 		
                         // To handle all new opened window.				
                             Set<String> s1=driver.getWindowHandles();		
                         Iterator<String> i1=s1.iterator();		
                         		
                         while(i1.hasNext())			
                         {	
                         	
                      		System.out.println("In child");
                      		
                      		
                      		
                             String ChildWindow=i1.next();
                             
                             System.out.println(ChildWindow);

                             driver.switchTo().window(ChildWindow);	 
                             //break;
                           
                             System.out.println("Window Title : " + driver.getTitle().toString());
                             if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                             {    
                             	
                             	
                             	System.out.println("in child window");
                             	
                                  
                                     // Switching to Child window
                             	
                                     driver.switchTo().window(ChildWindow);	   
                                     /*
                                     driver.findElement(By.name("emailid"))
                                     .sendKeys("gaurav.3n@gmail.com");                			
                                     */
                         //            driver.findElement(By.name("Close")).click();			
                                                  
                             
                 			// Closing the Child Window.
                                         //driver.close();		
                             //}		
                    //     }		
                  		
                     	//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                  		/*
                  		 /*
                  	
                  		*/
                  		
                  		/*
                   		ChromeOptions options = new ChromeOptions();
                   		options.addArguments("--headless", "--window-size=1920,1200");
                   		 driver = new ChromeDriver(options);
                   		 */
                  		  
                   		//clickAndFindPopup(driver);
                  		/*
                  		 System.out.println("here is error");
                  		 
                	 
                	      
                      }
                  
                  
                  
                  
                  
                  
                  
                  
                  
               	     
               	  if((j==6))
                  {
               		  
               		  
               	//	ChromeOptions options = new ChromeOptions();
               	//	options.addArguments("--headless", "--window-size=1920,1200");
               	//	 driver = new ChromeDriver(options);
               /*		  
               		ChromeOptions options = new ChromeOptions();
               		options.addArguments("--headless");
               		driver = new ChromeDriver(options);
               		
               		
               		
               		
               		
               		
               		
               		

               		
               		  
               	///	clickAndFindPopup(driver);
               		  
               		  /*
              	      if (!popupHandle.equals("")) {
              	          String currentHandle = driver.getWindowHandle();
              	          driver.switchTo().window(popupHandle);
              	          driver.close();
              	          driver.switchTo().window(currentHandle);
              	      }
              	      */
               		  
               		  
               		  
               		  /*
                  		String parentWindowHandler = driver.getWindowHandle(); 
                  		String subWindowHandler = null;

                  		Set<String> handles = driver.getWindowHandles(); // get all window handles
                  		Iterator<String> iterator = handles.iterator();

                  		subWindowHandler = iterator.next();

                  		driver.switchTo().window(subWindowHandler); // switch to popup window
         */
                  		// Now you are in the popup window, perform necessary actions here

                  	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
              	
//               		  List<WebElement> l= new LinkedList<WebElement>();
               		  
               		  
               	//	clickAndFindPopup(driver);
               		  /*
               		String MainWindow=driver.getWindowHandle();		
             		
                     // To handle all new opened window.				
                         Set<String> s1=driver.getWindowHandles();		
                     Iterator<String> i1=s1.iterator();		
                     		
                     while(i1.hasNext())			
                     {		
                         String ChildWindow=i1.next();		
                         		
                         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                         {    
                         	
                         	
                         	System.out.println("in child window");
                         	
                              
                                 // Switching to Child window
                         	/*
                                 driver.switchTo().window(ChildWindow);	                                                                                                           
                                 driver.findElement(By.name("emailid"))
                                 .sendKeys("gaurav.3n@gmail.com");                			
                                 */
                     //            driver.findElement(By.name("Close")).click();			
                         /*                     
                         	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
             			// Closing the Child Window.
                                     driver.close();		
                         }		
                     }		
               		  
               		  
               		  
               		  
               		  */
               		  
               		  
               		  
               		  
               		  
               		
              // 		driver.switchTo().window(parentWindowHandler); 
                 	
               		  
               		  
               		  /*
                		  
              		  System.out.println("Validating if data in the page is right or wrong"+j);
              	
              		 // Thread.sleep(6000);
              		  
              		  if( sheet.getRow(i).getCell(j) != null)
              		  {
               		
               	 l= driver.findElements(By.xpath("//*[contains(text(),  'Invest directly into minority innovations')]"));
               	 
               	  /*
                  JavascriptExecutor js 
                  = (JavascriptExecutor)driver;
         	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
         	        
               	 
                driver.navigate().back();
                   */
               	 
               	 
               	 
               	 
               	 
              		 // }
               	      // verify list size

        /*
              	      if ( l.size() > 0){
                 	    	 // Assert.assertEquals("true", "");
                 	    	  
                 	    	  dataornot=true;
                 	    	  
                 	    	  
                 	    	  
                 	    	  
                 	      } 
               	      
               	      
               	      
               	      
               	      
               	      else {
               	    	  
               	    	  dataornot=false;
               	    	  
               	    	  
               	       //  System.out.println("Text: " + t + " is not present. ");
               	      }

              	  System.out.println(  dataornot);
               	      Assert.assertTrue(dataornot,"The content is not there");
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    		 
                    	 }
                    	 
                    	 
                    	 
                     }
                    	 
                    	 List<WebElement> l= new LinkedList<WebElement>();
                        	  
                        	  
                     	     
                     	  if(j==6)
                        {
                     	   
                     		  
                     		  
                     		  
                       		  
                             	//	ChromeOptions options = new ChromeOptions();
                             	//	options.addArguments("--headless", "--window-size=1920,1200");
                             	//	 driver = new ChromeDriver(options);
                             /*		  
                             		ChromeOptions options = new ChromeOptions();
                             		options.addArguments("--headless");
                             		driver = new ChromeDriver(options);
                             		
                             		
                             		
                             		
                             		
                             		
                             		
                             		
              
                             		
                             		  
                             	///	clickAndFindPopup(driver);
                             		  
                             		  /*
                            	      if (!popupHandle.equals("")) {
                            	          String currentHandle = driver.getWindowHandle();
                            	          driver.switchTo().window(popupHandle);
                            	          driver.close();
                            	          driver.switchTo().window(currentHandle);
                            	      }
                            	      */
                             		  
                             		  
                             		  
                             		  /*
                                		String parentWindowHandler = driver.getWindowHandle(); 
                                		String subWindowHandler = null;

                                		Set<String> handles = driver.getWindowHandles(); // get all window handles
                                		Iterator<String> iterator = handles.iterator();

                                		subWindowHandler = iterator.next();

                                		driver.switchTo().window(subWindowHandler); // switch to popup window
         */
                                		// Now you are in the popup window, perform necessary actions here

                                	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
          //                  	l= new LinkedList<WebElement>();
                             		  
                             		  
                             	//	clickAndFindPopup(driver);
                             		  /*
                             		String MainWindow=driver.getWindowHandle();		
                           		
                                   // To handle all new opened window.				
                                       Set<String> s1=driver.getWindowHandles();		
                                   Iterator<String> i1=s1.iterator();		
                                   		
                                   while(i1.hasNext())			
                                   {		
                                       String ChildWindow=i1.next();		
                                       		
                                       if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                       {    
                                       	
                                       	
                                       	System.out.println("in child window");
                                       	
                                            
                                               // Switching to Child window
                                       	/*
                                               driver.switchTo().window(ChildWindow);	                                                                                                           
                                               driver.findElement(By.name("emailid"))
                                               .sendKeys("gaurav.3n@gmail.com");                			
                                               */
                                   //            driver.findElement(By.name("Close")).click();			
                                       /*                     
                                       	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                           			// Closing the Child Window.
                                                   driver.close();		
                                       }		
                                   }		
                             		  
                             		  
                             		  
                             		  
                             		  */
                             		  
                             		  
                             		  
                             		  
                             		  
                             		
                            // 		driver.switchTo().window(parentWindowHandler); 
                               	
                             		  
                             		  
            /*                 		  
                              		  
                            		  System.out.println("Validating if data in the page is right or wrong"+j);
                            	
                            		 // Thread.sleep(6000);
                            		  
                            		  if( sheet.getRow(i).getCell(j) != null)
                            		  {
                             		
                             	 l= driver.findElements(By.xpath("//*[contains(text(),  'Invest directly into minority innovations')]"));
                             	 
                             	  /*
                                JavascriptExecutor js 
                                = (JavascriptExecutor)driver;
                    	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
                    	        
                             	 
                              driver.navigate().back();
                                 */
                             	 
                             	 
                             	 
                             	 
                             	 
              //              		  }
                             	      // verify list size
                /* 
                            	      if ( l.size() > 0){
                               	    	 // Assert.assertEquals("true", "");
                               	    	  
                               	    	  dataornot=true;
                               	    	  
                               	    	  
                               	    	  
                               	    	  
                               	      } 
                             	      
                             	      
                             	      
                             	      
                             	      
                             	      else {
                             	    	  
                             	    	  dataornot=false;
                             	    	  
                             	    	  
                             	       //  System.out.println("Text: " + t + " is not present. ");
                             	      }

                            	  System.out.println(  dataornot);
                             	      Assert.assertTrue(dataornot,"The content is not there");
                             	 
                             	      
                                   }
                             	  
                        		
                        		
                                */      		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		
                        		/*
                        		else{
                        		System.out.println("Element is Absent");
                        		
                        		Test3(parent);
                        		
                        		
                        		 
                        		}
                        	*/
                        	
        	
                        	
                        	
                        	
                        	
                        
                   
                      		 
                      		 
                      		 
                      		 
                      		 
                      //	break;
                      	
                      		 
                      		 
                      		 

                      	 
            	 
            	 
            	 
               	  
               	  
            	     
               	     
               	     
               	     
               	     
        //}
               	     
                  	 
          //           }
               		 
               		 
               		 
             /*  		 
               		 
               	 }
            	 
            	*/   
            	   
            	   
            	   
            	   
 /*           	   
            	   
}

            	
    //        	System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
}

            System.out.println("");
        }
        
    
    
    
    
   */ 
    
    
    public int readfile(String parent) throws IOException, InterruptedException {
    	
    	  // int i =0;
    	
    	int totalRows;
    	
    	i=0;
    	
    
    	    //XSSFRow row = ws.getRow(rNum);
    	   //XSSFCell cell = row.getCell(i);
    	    
    	
    
    	
    	//Create an object of File class to open xlsx file
        //File file =    new File("E:\\TestData\\TestData.xls");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        DataFormatter formatter = new DataFormatter();
        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("STUDENT_DATA");
        
        
    	boolean flag1,flag2 = false;
    	
    	
    	// XSSFSheet sheet=wb.getSheet("STUDENT_DATA");
    	 // formatter = new DataFormatter();
    	int k=0 ;int b=0;
    	
    	myLabelName:
            for (Row row : sheet) {
            	
            	i++;
            	
            	
            	totalRows=sheet.getLastRowNum()+1;
            	
               b=row.getRowNum();

             
             
             k=0;
             
            	
                for (Cell cell : row) {
                	
                	
                	
                	
                	
                	
                	
                	
                   // String value = cellToString(cell);
        	        if (cell.getStringCellValue().trim().equals(parent)){
        	          //   System.out.println(i);

        	             System.out.println("Inside obvious"+parent);
        	             
                	            return i;
        	            
        	             
        	           //  break;
        	        }   	
                	
                	
                	/*
                	
                      k=  cell.getColumnIndex();
                			
                			
                  //	Thread.sleep(6000);
                  	
                	
                if(row.getRowNum()!=i)
                {
                	if(cell.getColumnIndex()==0)
                	{
                		
                		
                		
               /* 		
                    if (cell.getStringCellValue().contains(parent))
                    
                    {
                    	
                    	System.out.println("In the important");
                    	
                     	imp=true;
                    	
          //          	 k = row.getLastCellNum();
                    	
                          k=0;
                             
                       /*   	
                    	 if(row.getRowNum()!=b)
                    	 {
                      	 if(parent != "")
                    	 {
                    		
                       		 readfile(parent);
                       		 
                    		 
                    		 
                    	 }
                    	 }
                    	 */
                    //}
                      /*    
                    	  	if(cell.getColumnIndex()==0)
                	{
                    firstcolumn=cell.getStringCellValue();
                    System.out.println("The first column is "+firstcolumn);
                    
                      	 flag1=true;
                      	 
                      	 
                	}
                      	*/ 
                      	 
                      	 
                      	 
                      	 
                      	 
                      	 
                      	 
                      	 
                      	 
                    	 /*
                    	 
                    }
               
                	}
                     
                	}
                	k++;
                	
                	/*
                       	 else
                       	 {
                       	 */
                       		 
                       		/* 
                       	    if((k==1))
                            {
                       	    	System.out.println("In first");
                       	    	
                         	   
                       	     if( sheet.getRow(b).getCell(k) != null)
                       	     {
                         	 parent =  sheet.getRow(b).getCell(k).getStringCellValue();
                       	     }
               
                       	 	 if(row.getRowNum()!=b)
                        	 {
                            	 if(parent != "")
                         	 {
                            			flag2=true;
                                       	
                            		 readfile(parent);
                            		 
                            
                        		if(flag2==true)
                        		{
                    
                        		}
                        		 
                            	
                         		 
                         	 }   	
                            	 
                            	 
                            	 
                            	 
                          //   flag2=true;
                             
                            	 
                        	 }

                        	 if(parent == "")
                            	 {
                            		 
                            		  k++;

                            		  
                             	     if((k==2) && (imp==true))
                                   {
                                	   
                             	    	 System.out.println("here is error");
                             	    	 
                             	    	    if( sheet.getRow(b).getCell(k) != null)
                             	    	  {
                                	 dragorno =  sheet.getRow(b).getCell(k).getStringCellValue();
                             	    	  }
                              	 
                                	JavascriptExecutor js = (JavascriptExecutor) driver;
                                	
                                	 
                                	 
                                	 if(dragorno.equals("yes"))
                                	 {
                                	//	 Page.click(firstcolumn);
                                		 
                                		 
                                		
                                		 
                                		 
                                		 
                                		 js.executeScript("arguments[0].scrollIntoView();", page.loginLink);
                                		
                                	 }
                                	 
                                	 if(dragorno.equals(""))
                                	 {
                                	
                                			
                                		
                                		 
                                		// Page.click(firstcolumn);
                                		 
                                		 
                                	
                                		
                                	 }
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 
                                	 }
                             	     
                             k++;
                             
                             	     
                             	  if((k==3))
                                {
                             		  System.out.println("here is error");
                             		    if( sheet.getRow(b).getCell(k) != null)
                             		  {
                             	 data =  sheet.getRow(b).getCell(k).getStringCellValue();
                              	 
                             		  }
                             	
                       
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 }
                          	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             	     
                             k++;
                             
                             	     
                             	     
                             	     
                             	     
                             	  if((k==4) && (imp==true))
                                {
                             		  
                             			 System.out.println("here is error");
                             		  
                             		    if( sheet.getRow(b).getCell(k) != null)
                             		  {
                             	   
                             	 linkortext =   sheet.getRow(b).getCell(k).getStringCellValue();
                             	 System.out.println( linkortext);
                             		  }
                             	
                             	 
                             	 
                             	 if(linkortext.equals("link"))
                             	 {
                             		 
                                   /*
                               		ChromeOptions options = new ChromeOptions();
                               		options.addArguments("--headless", "--window-size=1920,1200");
                               		 driver = new ChromeDriver(options);
                              	  */
     
                             		 
                             		 
                             //		 driver.findElement(By.xpath(firstcolumn)).click();
                             		 
                             		 
      
                             		// Page.click(firstcolumn);
                            		  
                             		 
                             	 
                             		 
                             		
                             		 
                            //   }
                             /*	 
                             	 if(linkortext.equals("text"))
                             	 {
                             		 
                             		 page.enterdata(data);
                             		 
                             	 
                             		 
                             		
                             		 
                               }
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 
                             	 }
                             	  
                             	  
                             	  
                             
                       	    
                       	    
                       	    
                       	    
                       	    
                       	    
                       	    
                       	    
                       	    
                             k++;
                             
                             
                             
                             
                             
                          	  if((k==5) && (imp==true))
                              {
                           		  
                          		  
                          	    if( sheet.getRow(b).getCell(k).equals("Yes"))
                          	    {
                           		  
                             		List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

                             		for (WebElement webElement : month_list) {

                             		System.out.println("The text"+webElement.getText());
                             		try {
                             			
                             			
                             			
                             			
                             			
                             			if(webElement.getText().equals("Close"))
                                 		{
                                 			
                                 			webElement.click();
                                 			
                                 		}
                             			
                             			
                             			
                             		
                             		}
                             		catch(org.openqa.selenium.StaleElementReferenceException ex)
                             		{
			
                             			
                             			
                             			if(webElement.getText().equals("Close"))
                                 		{
                                 			
                                 			webElement.click();
                                 			
                                 		}
                             			
                             		}
                             		
                             	

                             		}
                             		 
                             		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
                             		
                             		 
                             		/* 
                             		 
                             		String MainWindow=driver.getWindowHandle();
                             		
                             		System.out.println(MainWindow);
                             		
                             		
                            		
                                    // To handle all new opened window.				
                                        Set<String> s1=driver.getWindowHandles();		
                                    Iterator<String> i1=s1.iterator();		
                                    		
                                    while(i1.hasNext())			
                                    {	
                                    	
                                 		System.out.println("In child");
                                 		
                                 		
                                 		
                                        String ChildWindow=i1.next();
                                        
                                        System.out.println(ChildWindow);

                                        driver.switchTo().window(ChildWindow);	 
                                        //break;
                                      
                                        System.out.println("Window Title : " + driver.getTitle().toString());
                                        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                        {    
                                        	
                                        	
                                        	System.out.println("in child window");
                                        	
                                             
                                                // Switching to Child window
                                        	
                                                driver.switchTo().window(ChildWindow);	   
                                                /*
                                                driver.findElement(By.name("emailid"))
                                                .sendKeys("gaurav.3n@gmail.com");                			
                                                */
                                    //            driver.findElement(By.name("Close")).click();			
                                                             
                                        
                            			// Closing the Child Window.
                                                    //driver.close();		
                                        }
                          	    
                            
                          	            
                                    }		
                             		
                                	//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                             		/*
                             		 /*
                             	
                             		*/
                             		
                             		/*
                              		ChromeOptions options = new ChromeOptions();
                              		options.addArguments("--headless", "--window-size=1920,1200");
                              		 driver = new ChromeDriver(options);
                              		 */
                             		  
                              		//clickAndFindPopup(driver);
                             		
                             	//	 System.out.println("here is error");
                            	 //}
                             		 
                           	 
                           	      
                                 //}
                             
                             
                             
                             
                             
                             
                             /*
                 
                          	  
                          	  k++;
                          	  
                            		 
                           	  if((k==6) && (imp==true))
                              {
                           		  
                           		  
                           	//	ChromeOptions options = new ChromeOptions();
                           	//	options.addArguments("--headless", "--window-size=1920,1200");
                           	//	 driver = new ChromeDriver(options);
                           /*		  
                           		ChromeOptions options = new ChromeOptions();
                           		options.addArguments("--headless");
                           		driver = new ChromeDriver(options);
                           		
                           		
                           		
                           		
                           		
                           		
                           		
                           		
            
                           		
                           		  
                           	///	clickAndFindPopup(driver);
                           		  
                           		  /*
                          	      if (!popupHandle.equals("")) {
                          	          String currentHandle = driver.getWindowHandle();
                          	          driver.switchTo().window(popupHandle);
                          	          driver.close();
                          	          driver.switchTo().window(currentHandle);
                          	      }
                          	      */
                           		  
                           		  
                           		  
                           		  /*
                              		String parentWindowHandler = driver.getWindowHandle(); 
                              		String subWindowHandler = null;

                              		Set<String> handles = driver.getWindowHandles(); // get all window handles
                              		Iterator<String> iterator = handles.iterator();

                              		subWindowHandler = iterator.next();

                              		driver.switchTo().window(subWindowHandler); // switch to popup window
 */
                              		// Now you are in the popup window, perform necessary actions here

                              	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
                          	
                           		//  List<WebElement> l= new LinkedList<WebElement>();
                           		  
                           		  
                           	//	clickAndFindPopup(driver);
                           		  /*
                           		String MainWindow=driver.getWindowHandle();		
                         		
                                 // To handle all new opened window.				
                                     Set<String> s1=driver.getWindowHandles();		
                                 Iterator<String> i1=s1.iterator();		
                                 		
                                 while(i1.hasNext())			
                                 {		
                                     String ChildWindow=i1.next();		
                                     		
                                     if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                                     {    
                                     	
                                     	
                                     	System.out.println("in child window");
                                     	
                                          
                                             // Switching to Child window
                                     	/*
                                             driver.switchTo().window(ChildWindow);	                                                                                                           
                                             driver.findElement(By.name("emailid"))
                                             .sendKeys("gaurav.3n@gmail.com");                			
                                             */
                                 //            driver.findElement(By.name("Close")).click();			
                                     /*                     
                                     	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                         			// Closing the Child Window.
                                                 driver.close();		
                                     }		
                                 }		
                           		  
                           		  
                           		  
                           		  
                           		  */
                           		  
                           		  
                           		  
                           		  
                           		  
                           		
                          // 		driver.switchTo().window(parentWindowHandler); 
                             	
                           		  
                           		  /*
                           		  
                            		  
                          		  System.out.println("Validating if data in the page is right or wrong"+k);
                          	
                          		 // Thread.sleep(6000);
                          		  
                          		  if( sheet.getRow(b).getCell(k) != null)
                          		  {
                           		
                           	 l= driver.findElements(By.xpath("//*[contains(text(),  'Invest directly into minority innovations')]"));
                           	 
                           	  /*
                              JavascriptExecutor js 
                              = (JavascriptExecutor)driver;
                  	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
                  	        
                           	 
                            driver.navigate().back();
                               */
                           	 
                           	 
                           	 
                           	 
                           	 
                          		  //}
                           	      // verify list size
               /*
                          	      if ( l.size() > 0){
                             	    	 // Assert.assertEquals("true", "");
                             	    	  
                             	    	  dataornot=true;
                             	    	  
                             	    	  
                             	    	  
                             	    	  
                             	      } 
                           	      
                 */          	      
                           	      
                   /*        	      
                           	      
                           	      else {
                           	    	  
                           	    	  dataornot=false;
                           	    	  
                           	    	  
                           	       //  System.out.println("Text: " + t + " is not present. ");
                           	      }

                          	  System.out.println(  dataornot);
                          	  
                          	  
                              try{        
                            	  Assert.assertTrue(dataornot,"The content is not there");          
                              }catch(AssertionError e){           
                                  errorBuffer.append(e.getMessage() + "\n");      
                              }       

                        /*

                              if(errorBuffer.length() > 0){
                                  throw new AssertionError(errorBuffer.toString()); 
                              }
                              */

                              /*
                              if((flag2==true) && (imp==true))

                            	  {break myLabelName;
                            	  
                            	  }
                        	   
                           	 */
                           	      
                     //            }
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	  
                           	          		 
                            		 
                            	
                            		 
                            		 
                            		 
                            	 
                            	 
                            	
                       // 	 }
                            
                       	    
                       	    
                       	    
                       	 	 /*
                            	 else
                            	 {
                            		 
                            	*/	 
                       	            
                         	  
                         	  
                         	  
                         	  
                         return 1;
                         
                         	 
                            }
            
           
            
            
            
                         	 
                       	 
                            	  
                        
                    
                	
                	
                        
                            	 
                            	 
                   /*         	 
                      }
                     */       	     
                       		
                /*
                	}  		 
                  */
                

    
            
    
                       		 
                       		 
                       		 
                       		 
            
            
                       		 
                       		 
                       	 
                    	
                    	
                    	
                    	
                 
                    
                       	    
                       	 
                
                    
                       	 
                      	 
                      	 
                    
                      	 
        
        
        
            
                       	 
                      	 
    
        
        
        
                    
                    
        
        
        
        

    
    
    
   
    public void Test3(String parent) throws IOException, InterruptedException
    {
    	
    	 readfile(parent);
		 
    	
    	
    }
    	
    
    
    
    
    
    
    @Test
    public void Test1() throws IOException, InterruptedException
    {
    	readfile();
    	

    	
    	
        // To Setup driver
    	/*
    	System.out.println("in test1");
    	
    //    setUp();
        
              //Change it to production page
            driver1.get("https://www.lambdatest.com/");
            wait = new WebDriverWait(driver1, 10);
            element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*")));
            
            
           // webElement = driver1.findElementByXPath("/html/body/div[2]/section[8]/div/div[2]/div/a");
            
            
            
            webElement =  driver1.findElementByCssSelector("a[href='https://www.lambdatest.com/integrations']");
            
            
            
            
            ((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView();", webElement);
            String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
            
      //      test2();
            
            
            
            
          
       System.out.println("Count the no. of opened windows: "+driver1.getWindowHandles().size());
         
       driver1.get("https://www.lambdatest.com/blog");
       
   //    driver1.findElement(By.partialLinkText("Community")).click();
       
       
       
       
       
       /*
       WebElement myelement = driver1.findElement(By.linkText("Community"));
       JavascriptExecutor jse2 = (JavascriptExecutor)driver1;
       jse2.executeScript("arguments[0].scrollIntoView()", myelement); 
       myelement.click();
       */
       /*
       WebElement ele = driver1.findElement(By.linkText("Community"));
       JavascriptExecutor executor = (JavascriptExecutor)driver1;
       executor.executeScript("arguments[0].click();", ele);
       
       
       
       
      /* var element = element(by.linkText('webdriverjs'));
       browser.executeScript("arguments[0].click()",element);
       */
       /*
       WebDriverWait wait2 = new WebDriverWait(driver1, 10);
       wait2.until(ExpectedConditions.elementToBeClickable(By.linkText("Community")));
       
       driver1.findElement(By.linkText("Community")).click();
       
       */
       /*
       
       String actualGooglePageTitlte=driver1.getCurrentUrl();
       
       
       Assert.assertTrue(actualGooglePageTitlte.equalsIgnoreCase("https://community.lambdatest.com/" 
    		   ),"Page url not matched or Problem in loading url page"); 
       
       
      
         */
    
         
         
         
         
         
        
        
    }
    public void getcellValue(int testRowNo1) throws InterruptedException
    {
    	int k=0;
    	
    	String firstcolumn = null,dataval="",parent=null,linkortext="",dragorno="";
    	
    	
    	
    	try{
      //  File file =    new File("E:\\TestData\\TestData.xls");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        DataFormatter formatter = new DataFormatter();
        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("STUDENT_DATA");
        
        
      //  int totalRows = sheet.getLastRowNum();
        Row row = null;
      String  cellValue  = sheet.getRow(testRowNo1).getCell(k).getStringCellValue();
      
      
      
	  	if(sheet.getRow(testRowNo1).getCell(k).getColumnIndex()==0)
{
firstcolumn=sheet.getRow(testRowNo1).getCell(k).getStringCellValue();
System.out.println("The first column is "+firstcolumn);

//	 flag1=true;
	 
	 
}
	  	
	  	k++;
    	
    	/*
           	 else
           	 {
           	 */
           		 
           		 
           	    if((k==1))
                {
           	    	System.out.println("In first");
           	    	
             	   System.out.println("The row point of att"+testRowNo1);
             	   
           	     if(sheet.getRow(testRowNo1).getCell(k) != null)
           	     {
             	 parent =  sheet.getRow(testRowNo1).getCell(k).getStringCellValue().trim();
             	 
           	     }
           	     
           	 
           	     
           	     System.out.println("The value of parent"+parent);
           	     
   
     //      	 	 if(row.getRowNum()!=testRowNo)
       //     	 {
           	 		 
                	 if((parent != "") && (parent !=null))
             	 {
                		

                         int h = readfile(parent);
                         h=h-1;
                         
                         System.out.println("The mand"+h);
                         
                         
                    	 	 
                   		 Thread.sleep(3000);

                   		 
                   		 
                   	    if( sheet.getRow(testRowNo1).getCell(k+8)!=null )
                   	    {
                   	    	

                       	    if( sheet.getRow(testRowNo1).getCell(k+8).getStringCellValue().equals("Yes") && (!sheet.getRow(testRowNo1).getCell(k+8).getStringCellValue().equals(sheet.getRow(testRowNo1-1).getCell(j+8).getStringCellValue())))
                   	    	
                       	    {
                       	    	
                       	     {   if(testRowNo1!=i)
                       		 {
                       		 getcellValue(h);
                       		 
                      
                     		 
                     	/* }*/
                        	 
                     	 }
                        } 	 
                       	    
                       }
                       	   
                   	    }
                       	if( sheet.getRow(testRowNo1-1).getCell(k+8) !=null)
                       	{
                       		
                       		

                       	    if(  (!sheet.getRow(testRowNo1-1).getCell(k+8).getStringCellValue().equals("Yes")) )
                   	    	
                       	    {
                       	    	
                       	     {   if(testRowNo1!=i)
                       		 {
                       		 getcellValue(h);
                       		 
                      
                     		 
                     	/* }*/
                        	 
                     	 }
                        } 	 
                       	}
                       	}
                       	    
                       	if(sheet.getRow(testRowNo1).getCell(k+8)!=null)
                       	{
                       	    if( sheet.getRow(testRowNo1).getCell(k+8).getStringCellValue().equals("No"))
                   	    	
                       	    {
                       	    	
                       	     {   if(testRowNo1!=i)
                       		 {
                       		 getcellValue(h);
                       		 
                      
                     		 
                     	/* }*/
                        	 
                     	 }
                        } 	 
                       	    
                       }
                       	    	
                       }
                       	    
                 	 
                		 
                		 
                		 
                		 
                		 
                		 
                		 
                		 //	flag2=true;
                           	
                		// readfile(parent);
                			
                   //  	int h = readfile(parent);
                     		 
                     	
            //         	System.out.println("The mandatory"+h);
                     	
                		 
                	//	 getcellValue(h);
                		 
                		 
                /*
            		if(flag2==true)
            		{
        
            		}
            		*/
            		 
                	
             		 
             	 }   	
                	 
                	 
                	 
                	 
              //   flag2=true;
                 
                	 
         //   	 }

            	 if(parent == null)
                	 {
            		 
            		 impvalidation=true;
            		 
                		 
                		  k++;

                		  
                 	     if((k==2))
                       {
                    	   
                 	    	 System.out.println("here is error");
                 	    	 
                 	    	    if( sheet.getRow(testRowNo1).getCell(k) != null)
                 	    	  {
                    	 dragorno = sheet.getRow(testRowNo1).getCell(k).getStringCellValue();
                 	    	  }
                  	 
                    	JavascriptExecutor js = (JavascriptExecutor) driver;
                    	
                    	 
                    	 
                    	 if(dragorno.equals("yes"))
                    	 {
                    	//	 Page.click(firstcolumn);
                    		 
                    		 
                    		
                    		 
                    		 
                    		 
                    		 js.executeScript("arguments[0].scrollIntoView();", page.loginLink);
                    		
                    	 }
                    	 
                    	 if(dragorno.equals(""))
                    	 {
                    	
                    			
                    		
                    		 
                    		// Page.click(firstcolumn);
                    		 
                    		 
                    	
                    		
                    	 }
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 
                    	 }
                 	     
                 k++;
                 
                 	     
                 	  if((k==3))
                    {
                 		  System.out.println("here is error");
                 		    if(sheet.getRow(testRowNo1).getCell(k) != null)
                 		  {
                 	 data =  sheet.getRow(testRowNo1).getCell(k).getStringCellValue();
                  	 
                 		  }
                 	
           
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 }
              	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 	     
                 k++;
                 
                 	     
                 	     
                 	     
                 	     
                 	  if((k==4))
                    {
                 		  
                 			 System.out.println("here is error");
                 		  
                 		    if(sheet.getRow(testRowNo1).getCell(k) != null)
                 		  {
                 	   
                 	 linkortext =  sheet.getRow(testRowNo1).getCell(k).getStringCellValue();
                 	 
                 	 System.out.println( linkortext);
                 		  }
                 	
                 	 
                 	 
                 	 if(linkortext.equals("link"))
                 	 {
                 		 
                       /*
                   		ChromeOptions options = new ChromeOptions();
                   		options.addArguments("--headless", "--window-size=1920,1200");
                   		 driver = new ChromeDriver(options);
                  	  */
                   	  	WebDriverWait wait = new WebDriverWait(driver, 10);
                 		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(firstcolumn))).click();
                 		

                 		 
                 		 
                 		// driver.findElement(By.xpath(firstcolumn)).click();
                 		 
                 		 

                 		// Page.click(firstcolumn);
                		  
                 		 
                 	 
                 		 
                 		
                 		 
                   }
                 	 
                 	 if(linkortext.equals("text"))
                 	 {
                 		 
                 		 page.enterdata(data);
                 		 
                 	 
                 		 
                 		
                 		 
                   }
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 
                 	 }
                 	  
                 	  
                 	  
                 
           	    
           	    
           	    
           	    
           	    
           	    
           	    
           	    
           	    
                 k++;
                 
                 
                 
                 
                 
              	  if((k==5))
                  {
               		  
              		  if(sheet.getRow(testRowNo1).getCell(k)!=null)
              		  {
              	    if( sheet.getRow(testRowNo1).getCell(k).equals("Yes"))
              	    {
               		  
                 		//List<WebElement> month_list= driver.findElements(By.xpath(("//div[@class='xl:tw-w-10/12 xl:tw-mr-16 dropdown-coming tw-mr-48 tw-fixed tw-mt-28 sm:tw-mr-8 sm:tw-w-10/12 tw-bg-gray-900 tw-bg-opacity-70 tw-flex tw-flex-col tw-justify-center']")));

              	  	WebDriverWait wait = new WebDriverWait(driver, 10);
             		wait.until(ExpectedConditions.elementToBeClickable(By.name("Close"))).click();
             		
                 	/*	
                 		WebDriverWait wait = new WebDriverWait(driver, 10);
                 		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission']"))).click();
                 		*/
                 		//new WebDriverWait(, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();
                 		
                 		/*
                 		
                 		for (WebElement webElement : month_list) {

                 		System.out.println("The text"+webElement.getText());
                 		try {
                 			
                 			
                 			
                 			
                 			
                 			if(webElement.getText().equals("Close"))
                     		{
                     			
                     			webElement.click();
                     			
                     		}
                 			
                 			
                 			
                 		
                 		}
                 		catch(org.openqa.selenium.StaleElementReferenceException ex)
                 		{

                 			
                 			
                 			if(webElement.getText().equals("Close"))
                     		{
                     			
                     			webElement.click();
                     			
                     		}
                 			
                 		}
                 		
                 	

                 		}
                 		*/
                 		 
                 		//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
                 		
                 		 
                 		/* 
                 		 
                 		String MainWindow=driver.getWindowHandle();
                 		
                 		System.out.println(MainWindow);
                 		
                 		
                		
                        // To handle all new opened window.				
                            Set<String> s1=driver.getWindowHandles();		
                        Iterator<String> i1=s1.iterator();		
                        		
                        while(i1.hasNext())			
                        {	
                        	
                     		System.out.println("In child");
                     		
                     		
                     		
                            String ChildWindow=i1.next();
                            
                            System.out.println(ChildWindow);

                            driver.switchTo().window(ChildWindow);	 
                            //break;
                          
                            System.out.println("Window Title : " + driver.getTitle().toString());
                            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                            {    
                            	
                            	
                            	System.out.println("in child window");
                            	
                                 
                                    // Switching to Child window
                            	
                                    driver.switchTo().window(ChildWindow);	   
                                    /*
                                    driver.findElement(By.name("emailid"))
                                    .sendKeys("gaurav.3n@gmail.com");                			
                                    */
                        //            driver.findElement(By.name("Close")).click();			
                                                 
                            
                			// Closing the Child Window.
                                        //driver.close();		
                            }
              	    
                
              	            
                        }		
                 		
                    	//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
                 		/*
                 		 /*
                 	
                 		*/
                 		
                 		/*
                  		ChromeOptions options = new ChromeOptions();
                  		options.addArguments("--headless", "--window-size=1920,1200");
                  		 driver = new ChromeDriver(options);
                  		 */
                 		  
                  		//clickAndFindPopup(driver);
                 		
                 		 System.out.println("here is error");
                	 }
                 		 
               	 
                	 }
            	 
                     }
                 
                 
                 
                 
                 
                 
                 
     
              	  
              	  k++;
              	  
                		 
               	  if((k==6))
                  {
               		  
               		  
               	//	ChromeOptions options = new ChromeOptions();
               	//	options.addArguments("--headless", "--window-size=1920,1200");
               	//	 driver = new ChromeDriver(options);
               /*		  
               		ChromeOptions options = new ChromeOptions();
               		options.addArguments("--headless");
               		driver = new ChromeDriver(options);
               		
               		
               		
               		
               		
               		
               		
               		

               		
               		  
               	///	clickAndFindPopup(driver);
               		  
               		  /*
              	      if (!popupHandle.equals("")) {
              	          String currentHandle = driver.getWindowHandle();
              	          driver.switchTo().window(popupHandle);
              	          driver.close();
              	          driver.switchTo().window(currentHandle);
              	      }
              	      */
               		  
               		  
               		  
               		  /*
                  		String parentWindowHandler = driver.getWindowHandle(); 
                  		String subWindowHandler = null;

                  		Set<String> handles = driver.getWindowHandles(); // get all window handles
                  		Iterator<String> iterator = handles.iterator();

                  		subWindowHandler = iterator.next();

                  		driver.switchTo().window(subWindowHandler); // switch to popup window
*/
                  		// Now you are in the popup window, perform necessary actions here

                  	//	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
              	
               		  List<WebElement> l= new LinkedList<WebElement>();
               		  
               		  
               	//	clickAndFindPopup(driver);
               		  /*
               		String MainWindow=driver.getWindowHandle();		
             		
                     // To handle all new opened window.				
                         Set<String> s1=driver.getWindowHandles();		
                     Iterator<String> i1=s1.iterator();		
                     		
                     while(i1.hasNext())			
                     {		
                         String ChildWindow=i1.next();		
                         		
                         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                         {    
                         	
                         	
                         	System.out.println("in child window");
                         	
                              
                                 // Switching to Child window
                         	/*
                                 driver.switchTo().window(ChildWindow);	                                                                                                           
                                 driver.findElement(By.name("emailid"))
                                 .sendKeys("gaurav.3n@gmail.com");                			
                                 */
                     //            driver.findElement(By.name("Close")).click();			
                         /*                     
                         	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
             			// Closing the Child Window.
                                     driver.close();		
                         }		
                     }		
               		  
               		  
               		  
               		  
               		  */
               		  
               		  
               		  
               		  
               		  
               		
              // 		driver.switchTo().window(parentWindowHandler); 
                 	
               		  
               		  
               		  
                		  
              		  System.out.println("Validating if data in the page is right or wrong"+k);
              	
              		 // Thread.sleep(6000);
              		  
              		  if( sheet.getRow(testRowNo1).getCell(k) != null)
              		  {
               		
               	 l= driver.findElements(By.xpath("//*[contains(text(),  '" +sheet.getRow(testRowNo1).getCell(k).getStringCellValue()+"')]"));
               	 
               	  /*
                  JavascriptExecutor js 
                  = (JavascriptExecutor)driver;
      	        js.executeScript("arguments[0].setAttribute('target','_self')",l);
      	        
               	 
                driver.navigate().back();
                   */
               	 
               	 
               	 
               	 
               	 
              		  }
               	      // verify list size
   
              	      if ( l.size() > 0){
                 	    	 // Assert.assertEquals("true", "");
                 	    	  
                 	    	  dataornot=true;
                 	    	  
                 	    	  
                 	    	  
                 	    	  
                 	      } 
               	      
               	      
               	      
               	      
               	      
               	      else {
               	    	  
               	    	  dataornot=false;
               	    	  
               	    	  
               	       //  System.out.println("Text: " + t + " is not present. ");
               	      }

              	  System.out.println(  dataornot);
              	  
              	  
                  try{        
                	  Assert.assertTrue(dataornot,"The content is not there");          
                  }catch(AssertionError e){           
                      errorBuffer.append(e.getMessage() + "\n");      
                  }       

            /*

                  if(errorBuffer.length() > 0){
                      throw new AssertionError(errorBuffer.toString()); 
                  }
                  */

                  /*
                  if((flag2==true) && (imp==true))

                	  {break myLabelName;
                	  
                	  }
            	   
               	 */
               	      
                     }
	  	
	  	
    
    	}
    	
      catch (IOException e)
      {
          e.printStackTrace();
      }finally
      {
          try
          {
        	  inputStream.close();
          } catch (IOException e)
          {
              e.printStackTrace();
          }
      }
        

       // return cellValue;
    }


    
    
    
    
    
    
    @Test
    public void Test2()
    
    {
    	/*
    	System.out.println("In test2");
    	
    	driver2.get("https://www.lambdatest.com/");
    	
    	
        wait = new WebDriverWait(driver2, 10);
        
        
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*")));
        
        
        webElement = driver2.findElementByXPath("/html/body/div[2]/section[8]/div/div[2]/div/a");
        ((JavascriptExecutor)driver2).executeScript("arguments[0].scrollIntoView();", webElement);
        String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	
    	
    	
    	
        // open the link in new tab, Keys.Chord string passed to sendKeys
        webElement.sendKeys(clicklnk);
        
        
        Set<String>s=driver2.getWindowHandles();

     // Now iterate using Iterator
     Iterator<String> I1= s.iterator();

     while(I1.hasNext())
     {

     String child_window=I1.next();


   

     System.out.println(child_window);

//     driver.close();
     }
     String currentURL  = driver2.getCurrentUrl();

     
     for(String winHandle : driver2.getWindowHandles()){
    	    driver2.switchTo().window(winHandle);
    	}
     
     
     
     System.out.println(currentURL );
     
   
     WebElement webElement1 = driver2.findElement(By.xpath("//*[@id=\"codeless_row\"]/div[1]/div/h2"));
     
     
     ((JavascriptExecutor)driver2).executeScript("arguments[0].scrollIntoView();", webElement1);
        
        
     driver2.findElement(By.xpath("//*[@id=\"codeless_row\"]/div[2]/div[4]/div/a")).click();
     
     
     String actualGooglePageTitlte=driver2.getTitle();
     //System.out.println("Google page title" + actualGooglePageTitlte);   
     //Verify expected page title and actual page title is same  
   Assert.assertTrue(actualGooglePageTitlte.equalsIgnoreCase("TestingWhiz Integration | LambdaTest" 
),"Page title not matched or Problem in loading url page"); 
     
     driver2.switchTo().parentFrame().close();
     tearDown();
     
     */
    }
    
    
    
    
    
    
    
    
    
    
    private void setUp() {
    	/*
        DesiredCapabilities capabilities = new DesiredCapabilities();
//      capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "70.0");
//      capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one.
        capabilities.setCapability("build", "LambdaTestSampleApp1");
        
        capabilities.setCapability("name", "LambdaTestJavaSampleNEW");
        */

    }
    private void tearDown() {
    	/*
        if (driver1 != null) {
            ((JavascriptExecutor) driver1).executeScript("lambda-status=" + status);
            driver1.quit(); //really important statement for preventing your test execution from a timeout.
        }
        
        if (driver2 != null) {
            ((JavascriptExecutor) driver2).executeScript("lambda-status=" + status);
            driver2.quit(); //really important statement for preventing your test execution from a timeout.
        }
        */
    }
    
    
    
    public void clickAndFindPopup(WebDriver driver) {
        // Get the original list of handles to evaluate if a popup
        // needs to be handled.
    
    
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[3]/div[2]/button")).click();
    	/*
 Set<String> existingHandles = driver.getWindowHandles();

        //Click Search button  -- This will cause the pop-up
     //   driver.findElement(locator).click();
       // Thread.sleep(1000);

        Set<String> windowHandles =  driver.getWindowHandles();
        List<String> list = new ArrayList<String>(windowHandles);
        windowHandles.removeAll(existingHandles);

        if (windowHandles.size() > 0) {
            return list.get(0);
        }
        */
    	/*
    	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
    	String subWindowHandler = null;

    	Set<String> handles = driver.getWindowHandles(); // get all window handles
    	Iterator<String> iterator = handles.iterator();
    	while (iterator.hasNext()){
    	    subWindowHandler = iterator.next();
    	}
    	driver.switchTo().window(subWindowHandler); // switch to popup window

    	// Now you are in the popup window, perform necessary actions here

    	driver.switchTo().window(parentWindowHandler);  // switch back to parent window
*/
      // return 1;
       
    }
    
    
    
    
    
}