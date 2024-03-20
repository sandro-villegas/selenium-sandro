package steps;
import io.cucumber.java.en.*;
import pages.GridPage;
import org.junit.Assert;
public class GridPageSteps {
   
    GridPage grid = new GridPage();
    @Given("^I NAVIGATE TO THE STATIC TABLE$")
    public void navigateToGrid(){
        grid.navigateToGrid();
    }
 
    @And("^I CAN RETURN THE VALUE I WANTED$")
    public void returnValue(){
        String value = grid.getValueFromGrid(3, 2);
      
        System.out.println("llllllllllllllllllllllllll"+value); 
        Assert.assertEquals("r: 2, c: 1", value);
    }
    
    @Then("I CAN VALIDATE THE VALUE IS DISPLAY")
    public void returnValidate(){
       
            Assert.assertTrue("Exploto Todo",grid.cellStatus());
       
    }

}
