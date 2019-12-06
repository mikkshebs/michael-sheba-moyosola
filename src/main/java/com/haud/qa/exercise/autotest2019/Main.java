package com.haud.qa.exercise.autotest2019.main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class HeaderMenu {   

  public static void main(String[] args) throws InterruptedException {   
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bilz-\\Desktop\\HAUD MAIN\\chromedriver\\chromedriver.exe");  
        
      //Open Browser
      WebDriver driver = new ChromeDriver();
      Reporter.log("===Browser Session Started===", true);
driver.get("https://haud.com");
driver.manage().window().maximize(); 

//Verify Test

 if(driver.getTitle().contains("HAUD — A2P SMS Monetisation, SS7 Firewall Vendor, Managed Services, SS7 and SMS Protection"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
 Thread.sleep(2000);


//Home Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
       Reporter.log("===HOME MENU TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("Partner with HAUD"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       //Products and Services
       driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       Reporter.log("===PRODUCT AND SERVICES TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("generate revenue"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
       
  }
  
   //Products and Services Sub-Menu A2P SMS Monetisation Solution
       
       
       driver.findElement(By.xpath("//a[contains(text(),'A2P SMS Monetisation Solution')]")).click();
       Reporter.log("===A2P SMS MONETISATION SOLUTION TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("revenue stream"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
   //Products and Services Sub-Menu SS7 and Diameter Firewall Protection
       
       
       driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'SS7 and Diameter Firewall Protection')]")).click();
       Reporter.log("===SS7 AND DIAMETER FIREWALL PROTECTION===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("SS7 vulnerabilities"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
   //Products and Services Sub-Menu Managed Services
       
        driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Managed Services')]")).click();
       Reporter.log("===MANAGED SERVICES===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("protecting network integrity"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
  
  
   //Products and Services Sub-Menu Probe Testing
       
       
       driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Probe Testing')]")).click();
       Reporter.log("===PROBE TESTING TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("Firewall Bypass Detection"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
   //Products and Services Sub-Menu Messaging and Security Consultancy
       
        driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Messaging and Security Consultancy')]")).click();
       Reporter.log("===MESSAGING AND SECURITY CONSULTANCY TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("network protection"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
       //Products and Services Sub-Menu Charge Control
       
       
       driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Charge Control')]")).click();
       Reporter.log("===CHARGE CONTROL TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("delivery status and packet type"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
   //Products and Services Sub-Menu BodyGuard – Personal SMS Firewall
       
        driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'BodyGuard – Personal SMS Firewall')]")).click();
       Reporter.log("===BODYGUARD – PERSONAL SMS FIREWALL TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("anti-spam"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
       //Products and Services Sub-Menu SMS Wholesale Platform
       
       
       driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'SMS Wholesale Platform')]")).click();
       Reporter.log("===SMS WHOLESALE PLATFORM TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("SMS wholesale and retail business"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
   //Products and Services Sub-Menu Voice SIM Farm Detection – SIM Box Fraud Detection
       
        driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Voice SIM Farm Detection – SIM Box Fraud Detection')]")).click();
       Reporter.log("===VOICE SIM FARM DETECTION – SIM BOX FRAUD DETECTION TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("Detection, localisation"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
//Products and Services Sub-Menu Libera — SMS Retail Platform
       
        driver.findElement(By.xpath("//li[@id='menu-item-4792']/span")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Libera — SMS Retail Platform')]")).click();
       Reporter.log("===LIBERA — SMS RETAIL PLATFORM TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("aggregators and MNOs"))
           
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
  }
  
  //Home Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'Knowledge Centre')]")).click();
       Reporter.log("===KNOWLEDGE CENTRE TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("White Papers"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       //About HAUD Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'About HAUD')]")).click();
       Reporter.log("===ABOUT HAUD TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("Headquartered in Malta and with an office in Singapore"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       //Careers Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
       Reporter.log("===CAREERS TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("Frontend Software Developer"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       //Blog Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
       Reporter.log("===BLOG TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("A2P SMS revenue loss: Asian focus"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       //Contact Us Menu Test
       driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
       Reporter.log("===CONTACT US TEST===", true);
       Thread.sleep(2000);
       if(driver.getPageSource().contains("HAUD Systems Limited"))
 {
     System.out.println("PASSED");
 }
 else
      {
          System.out.println("FAILED");
      }
       Reporter.log("===Browser Session Ended===", true);
       driver.close();
  }
}
