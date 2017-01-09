package testpackage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		  System.setProperty("webdriver.chrome.driver", "/Users/dragos/Downloads/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  WebDriverWait wait = new WebDriverWait(driver, 100);
		  driver.get("http://lennart.forkbomb.eu:5001/");
		  WebElement email = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input"));
		  WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input"));
		  WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/button"));
		  email.sendKeys("nistor.vlad.lucian@gmail.com");
		  password.sendKeys("testing1234");
		  login.click();
		  WebElement machine = driver.findElement(By.xpath("/html/body/div[2]/div[1]/a"));
		  machine.click();
		  WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		  WebElement host = driver.findElement(By.xpath("//*[@id=\"hostname\"]"));
		  WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		  WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		  WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div/form/button/span"));
		  
		  name.sendKeys("Dragos Machine");
		  host.sendKeys("Arena");
		  username.sendKeys("carcotashu");
		  pass.sendKeys("Dinamo48");
		  pass2.sendKeys("Dinamo48");
		  save.click();
		  Thread.sleep(2000);
		  WebElement view = driver.findElement(By.xpath("//table//td[text()=\"Dragos Machine\"]/..//span[@class=\"glyphicon glyphicon-tasks\"]"));
		  view.click();
		  WebElement task = driver.findElement(By.xpath("//div[@class=\"container body-content\"]//span[@class=\"glyphicon glyphicon-plus-sign\"]"));
		  task.click();
		  Thread.sleep(5000);
		  WebElement task1 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		  WebElement saveTask = driver.findElement(By.xpath("/html/body/div[2]/div/form/button"));
		  task1.sendKeys("Task1");
		  saveTask.click();
		  Thread.sleep(5000);
		  WebElement task2 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		  task.click();
		  task2.sendKeys("Task2");
		  saveTask.click();
		  
		  
		  
}
}
