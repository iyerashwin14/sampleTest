package gov.healthit.chpl.aqa.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Class ChplApiPage definition.
 */
public class ChplApiPage {

	private static WebElement element = null;
	 /**
     * Returns element holding main content.
     * @param driver WebDriver
     * @return element holding main content
     */
	public static WebElement mainContent(final WebDriver driver) {
        element = driver.findElement(By.id("main-content"));
        return element;
    }
	  
    /**
     * Returns element holding page title.
     * @param driver WebDriver
     * @return element holding page title
     */
 //   public static WebElement title(final WebDriver driver) {
   //     element = driver.findElement(By.xpath("//h1[contains(text(),'CHPL API')]"));
     //   System.out.println("Element in the title: "+element);
       // return element;
   // }
    
    /**
     * Returns element holding contents of product-controller.
     * @param driver WebDriver
     * @return element holding contents of product-controller
     */
    public static WebElement productController(final WebDriver driver, int i) {
 
    	element = driver.findElements(By.xpath("//span[@class='description pull-right ng-binding']")).get(i);
    	//System.out.println("Element in productController: "+element);   	
       return element;
    }
    
    /**
     * Returns element holding contents of scheduler-controller.
     * @param driver WebDriver
     * @return element holding contents of scheduler-controller
     */
    public static WebElement schedulerController(final WebDriver driver, int i) {
    	 
    	element = driver.findElements(By.xpath("//span[@class='description pull-right ng-binding']")).get(i);
    	//System.out.println("Element in productController: "+element);   	
       return element;  
    }
    
    /**
     * Returns element holding contents of collections-controller.
     * @param driver WebDriver
     * @return element holding contents of collections-controller
     */
    public static WebElement collectionsController(final WebDriver driver, int i) {
    	 
    	element = driver.findElements(By.xpath("//span[@class='description pull-right ng-binding']")).get(i);
    	//System.out.println("Element in productController: "+element);   	
       return element;  
    }

    public static WebElement ApiKeyController(final WebDriver driver, int i) {
   	 
    	element = driver.findElements(By.xpath("//span[@class='description pull-right ng-binding']")).get(i);
    	//System.out.println("Element in productController: "+element);   	
       return element;  
    }
    
    public static WebElement StatusController(final WebDriver driver, int i) {
   	 
    	element = driver.findElements(By.xpath("//span[@class='description pull-right ng-binding']")).get(i);
    	//System.out.println("Element in productController: "+element);   	
       return element;  
    }
    


}





