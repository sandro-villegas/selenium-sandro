package pages; 
//import java.awt.Desktop.Action;
// Importaciones necesarias
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BasePage {
    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus
     * subclases
     */
    private static Actions action;
    protected static WebDriver driver;
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando
     * el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
    /*
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el
     * driver del navegador
     */
    static {
        WebDriverManager.chromedriver().setup();
 
        // Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }
 
    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
 
    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }
 
    //Método estático para cerrar la instancia del driver. 
    public static void closeBrowser() {
        driver.quit();
    }
 
    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        element.click();
    }
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
 
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByValue(value);
    }
 
    public void selectFromDropdownByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
 
        dropdown.selectByIndex(index);
    }
 
    public int dropdownSize(String locator){
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
 
        return dropdownOptions.size();
    }
     public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(Find(locator));
 
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions) {
            values.add(option.getText());
        }
        return values;
    }
    public void hoverOverElemnt(String locator){
        action.moveToElement(Find(locator));
    }
    public void dobleClick(String locator){
        action.doubleClick(Find(locator));

    }
    public void rigthClick(String locator){
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator , int row ,int column ){
        String cellIned = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        return Find(cellIned).getText();
    }

    public void setValueOntable(String locator,int row,int column , String stringTosend){
        String celltofill = locator+"/table/tbody/tr/["+row+"]/td["+column+"]";
        Find(celltofill).sendKeys(stringTosend);
    }
    /* 
  // iframe 
    public void switchToiFrame(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }
  // iframe
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
    //Stop Alert
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

        */  
    public String textFromElemnt(String locator){
        return Find(locator).getText();
    }
    public  boolean elementEnable(String locator){
      return Find(locator).isEnabled();

    }
    public boolean elementIsDisplay(String locator){
        return Find(locator).isDisplayed();
    }
    public boolean elementIsSelect(String locator){
        return Find(locator).isSelected();
    }
    
}