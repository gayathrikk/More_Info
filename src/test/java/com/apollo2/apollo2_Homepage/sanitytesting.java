package com.apollo2.apollo2_Homepage;

import static org.junit.Assert.assertArrayEquals;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sanitytesting {

private RemoteWebDriver driver;
	
	@BeforeTest
	
	public void setup() throws MalformedURLException
	{
		  DesiredCapabilities dc = DesiredCapabilities.chrome();
	        URL url = new URL("http://172.12.20.99:4443/wd/hub");
	        driver = new RemoteWebDriver(url, dc);
	       
	}

    @Test(priority=1)
    public void testSanity() throws InterruptedException {
    	driver.get("https://apollo2.humanbrain.in/viewer/annotation/portal");
        driver.manage().window().maximize();
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
    	 driver.switchTo().frame(0);
        
    }
    @Test(priority=2)

   public void homepagecontent()
   		{
	   
	   String heading1="Sudha Gopalakrishnan Brain Centre";
	   WebElement text1=driver.findElement(By.xpath("//h1[@class='head']"));
	   String Heading1 =text1.getText();
	   System.out.println("Head1:"+Heading1);
	   Assert.assertEquals(Heading1, heading1, "Heading1 are not equal");
	   
	   String heading2="Indian Institute of Technology Madras";
	   WebElement text2=driver.findElement(By.xpath("(//h1[@class='head']//following::h5)[1]"));
	   String Heading2 =text2.getText();
	   System.out.println("Head2:"+Heading2);
	   Assert.assertEquals(Heading2, heading2, "Heading2 are not equal");
	   
	   String heading3="Brain Research through Advanced Integrated Neuroanatomy (BRAIN)";
	   WebElement text3=driver.findElement(By.xpath("//h1[@class='Brain-title']"));
	   String Heading3 =text3.getText();
	   System.out.println("Head3:"+Heading3);
	   Assert.assertEquals(Heading3, heading3, "Heading3 are not equal");
	   
	   String paragraph1="The home of brain research generating globally sought after data and technology solutions.";
	   WebElement text4=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[1]"));
	   String Paragraph1=text4.getText();
	   System.out.println("Paragraph 1:"+Paragraph1);
	   Assert.assertEquals(Paragraph1, paragraph1, "Paragraph 1 are not equal");
	   
	   String heading4="About";
	   WebElement text5=driver.findElement(By.xpath("//h2[text()=' About ']"));
	   String Heading4 =text5.getText();
	   System.out.println("Head4:"+Heading4);
	   Assert.assertEquals(Heading4, heading4, "Heading4 are not equal");
	   
	   String paragraph2="The Sudha Gopalakrishnan Brain Centre (SGBC) at the Indian Institute of Technology Madras (IIT Madras) is a multidisciplinary research and development centre focused on brain research. The centre has been set up as a unique amalgamation of diverse disciplines from Medicine, Neuroscience, Engineering, where the brain research is through advanced integrated neuroanatomy with the interface between neuroscience and engineering.";
	   WebElement text6=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[2]"));
	   String Paragraph2=text6.getText();
	   System.out.println("Paragraph 2:"+Paragraph2);
	   Assert.assertEquals(Paragraph2, paragraph2, "Paragraph 2 are not equal");
	   
	   String paragraph3="SGBC has developed a high throughput computational and experimental pipeline to study cellular architecture, connectivity and molecular architecture in human brains through multiresolution, multimodal imaging, from cellular resolution histology to structural MRI... This effort is supported by the Office of the Principal Scientific Advisor, Government of India along with contributions from Mr. Kris Gopalakrishnan, Co-founder, Infosys and Distinguished Alumnus of IITM.";
	   WebElement text7=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[3]"));
	   String Paragraph3=text7.getText();
	   System.out.println("Paragraph 3:"+Paragraph3);
	   Assert.assertEquals(Paragraph3, paragraph3, "Paragraph 3 are not equal");
	   
	   String paragraph4="The integrated histology-imaging-compute pipeline at IIT Madras generates petabyte sized image data volumes, from postmortem brains, neurotypical and disease conditions. The centre leverages expertise across-IITM, national, and international collaborations for results that would have significant impact on medicine, science and engineering.";
	   WebElement text8=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[4]"));
	   String Paragraph4=text8.getText();
	   System.out.println("Paragraph 4:"+Paragraph4);
	   Assert.assertEquals(Paragraph4, paragraph4, "Paragraph 4 are not equal");
	   
	   String heading5="Brain Research through Advanced Integrated Neuroanatomy";
	   WebElement text9=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::h5)[1]"));
	   String Heading5 =text9.getText();
	   System.out.println("Head5:"+Heading5);
	   Assert.assertEquals(Heading5, heading5, "Heading5 are not equal");
	   
	   String paragraph5="Whole human brain neuro mapping at cellular resolution.";
	   WebElement text10=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[5]"));
	   String Paragraph5=text10.getText();
	   System.out.println("Paragraph 5:"+Paragraph5);
	   Assert.assertEquals(Paragraph5, paragraph5, "Paragraph 5 are not equal");
	   
	   String heading6="ADDRESS";
	   WebElement text11=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::h5)[2]"));
	   String Heading6 =text11.getText();
	   System.out.println("Head6:"+Heading6);
	   Assert.assertEquals(Heading6, heading6, "Heading6 are not equal");
	   
	   String paragraph6="Sudha Gopalakrishnan BRAIN Centre\n"
	   		+ "Stilt floor, NAC-1 Building\n"
	   		+ "IIT Madras, Chennai - 600036, India\n"
	   		+ "Email: contact@humanbrainiitm.in\n"
	   		+ "Phone: +91-44-2257-8892";
	   WebElement text12=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[6]"));
	   String Paragraph6=text12.getText();
	   System.out.println("Paragraph 6:"+Paragraph6);
	   Assert.assertEquals(Paragraph6, paragraph6, "Paragraph 6 are not equal");
	   
	   String paragraph7="© All Rights Reserved. Designed by HTML Codex";
		   WebElement text13=driver.findElement(By.xpath("(//h1[@class='Brain-title']//following::p)[7]"));
		   String Paragraph7=text13.getText();
		   System.out.println("Paragraph 7:"+Paragraph7);
		   Assert.assertEquals(Paragraph7, paragraph7, "Paragraph 7 are not equal");
		   
		   System.out.println("Homepage  content validation is done");
   }
    @Test(priority=3)

    public void homepagePeople() throws InterruptedException {

		  driver.findElement(By.xpath("(//a[text()='PEOPLE'])[1]")).click();
		  
		  driver.findElement(By.xpath("//button[text()='Chair Professors']")).click();
		  scroll();
		 
		  driver.findElement(By.xpath("//button[text()='Faculty']")).click();
		  scroll();
		  
		  driver.findElement(By.xpath("//button[text()='Collaborators']")).click();
		  scroll();
		  
		  driver.findElement(By.xpath("//button[text()='Researchers']")).click();
		  scroll();
		 
		  driver.findElement(By.xpath("//button[text()='Software Team']")).click();
		  scroll();
		  
		  driver.findElement(By.xpath("//button[text()='Analytics Team']")).click();
		  scroll();
		 
		  driver.findElement(By.xpath("//button[text()='Engineering Team']")).click();
		  scroll();
	
		  driver.findElement(By.xpath("//button[text()='Optics & Imaging Team']")).click();
		  scroll();
		  
		  driver.findElement(By.xpath("//button[text()='Wet Lab Team']")).click();
		  scroll();
		  
		  driver.findElement(By.xpath("//button[text()='Internship']")).click();
		  scroll();
		  
		  System.out.println("Homepage people validation is done");

    }
    @Test(priority=4)
    public void homepagehighlights() throws InterruptedException
    {
    	 driver.findElement(By.xpath("(//a[text()='HIGHLIGHTS'])[1]")).click();
    	 driver.findElement(By.xpath("//button[@class='tablinks active']")).click();
		  scroll();
		 driver.findElement(By.xpath("//button[text()='Computational']")).click();
		  scroll();
		 driver.findElement(By.xpath("//button[text()='Technology']")).click();
		  scroll();
		 driver.findElement(By.xpath("//button[text()='R&D Publications']")).click();
		  scroll(); 
		  
		  System.out.println("Homepage Highlights validation is done");
    	 
    	 
    }

//    private void Homepageproject() throws InterruptedException {
//    	  driver.findElement(By.xpath("(//a[text()='PROJECT'])[1]")).click();
//    	  driver.findElement(By.xpath("//a[@data-target='#HDviewer']")).click();
//    	  Thread.sleep(9000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//    	  Thread.sleep(2000);
//    	  driver.findElement(By.xpath("//a[@data-target='#atlascreator']")).click();
//    	  Thread.sleep(7000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
//    	  Thread.sleep(2000);
//    	  driver.findElement(By.xpath("//a[@data-target='#cellannotation']")).click();
//    	  Thread.sleep(9000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
//    	  Thread.sleep(2000);
//    	  driver.findElement(By.xpath("//a[@data-target='#visualizer']")).click();
//    	  Thread.sleep(5000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
//    	  Thread.sleep(2000);
//    	  scroll();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//a[@data-target='#registration']")).click();
//    	  Thread.sleep(7000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
//    	  Thread.sleep(2000);
//    	  driver.findElement(By.xpath("//a[@data-target='#seriesviewer']")).click();
//    	  Thread.sleep(6000);
//    	  driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
//    	  Thread.sleep(2000);
//		  
//		  	  
//    }
    @Test(priority=5)
    public void Dataportal() throws InterruptedException{
    
    driver.findElement(By.xpath("((//a[text()='NEWS & EVENTS'])//preceding::a[1])[1]")).click();
    Thread.sleep(2000);
    windowhandle();
    System.out.println("Homepage Dataportal validation is done ");
    }
    @Test(priority=6)

    public void Homenewsandevents() throws InterruptedException {
    	  driver.findElement(By.xpath("(//a[text()='NEWS & EVENTS'])[1]")).click();
    	  scroll();
		  Thread.sleep(2000);
		  
		  System.out.println("Homepage News and Events validation is done ");
    }
    @Test(priority=7)

    public void Homecareer()  throws InterruptedException {
    	 driver.findElement(By.xpath("(//a[text()='CAREER'])[1]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[1]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[2]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[3]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[4]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[5]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
    	 driver.findElement(By.xpath("(//a[text()='Apply'])[6]")).click();
    	 Thread.sleep(3000);
    	 windowhandle();
		  //Homepage.scroll();
		  Thread.sleep(2000);
		  
		  System.out.println("Homepage career validation is done ");
		  
    }
    @Test(priority=8)
    
    public void homegallery() throws InterruptedException
    {
    	driver.findElement(By.xpath("(//a[text()='GALLERY'])[1]")).click();
  	  scroll();
		  Thread.sleep(2000);
		  
		  System.out.println("Homepage Gallery validation is done");
    }
    @Test(priority=9)

    public void Homecontacts() throws InterruptedException  {

		 driver.findElement(By.xpath("(//a[text()='CONTACTS'])[1]")).click();
		 scroll();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("(//input[@name='Name'])[1]")).sendKeys("software");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@name='Name'])[2]")).sendKeys("Team");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("softwareteam@htic.iitm.ac.in");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='PhoneNumber']")).sendKeys("9516765121");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@id='MultiLine-arialabel']")).sendKeys("Testing purpose" );
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@value='submit'])[1]")).click();
		 Thread.sleep(2000);
		 WebElement submitmessage=driver.findElement(By.xpath("//span[@class='alignCenter infoCont thankyouMsgText']"));
		 String Sumbitmessage=submitmessage.getText();
		 System.out.println("Submitted message is = "+Sumbitmessage);
		 System.out.println("Homepage contacts validation is done ");
		  
		  
    }
    
    private void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    private void scrollToTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }
    private void scroll() throws InterruptedException
    {
    	Thread.sleep(2000);
    	scrollToBottom(driver);
        Thread.sleep(2000);
        scrollToTop(driver);
        Thread.sleep(2000);
    }
    private void windowhandle()  throws InterruptedException 
    {
    	String parentWindowHandle = driver.getWindowHandle();
   	    Set<String> windowHandles = driver.getWindowHandles();
           for (String windowHandle : windowHandles) {
   	    driver.switchTo().window(windowHandle);
   	    
   	    }
           Thread.sleep(2000);
           driver.close();
           Thread.sleep(2000);
           driver.switchTo().window(parentWindowHandle);
          driver.switchTo().frame(0);
    }

    @AfterClass
    public void close() {
        
            driver.quit();
        
    }
}