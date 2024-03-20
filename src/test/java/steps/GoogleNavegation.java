package steps;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Google.GooglePage;

public class GoogleNavegation {
    GooglePage google = new GooglePage();
    @Given("Entro a la Pagina de google")
    public void Entro_a_la_Pagina_de_google(){
        google.navigateToggogle();
    }
    
    @When("ingreso enter a search critiria")
    public void ingreso_Dog_en_el_campo_de_búsqueda(){
        google.enterSearchCritiria("Google");
    }
    @And("click en search button")
    public void click_en_search_button(){
        google.clickGoogleSearch();
    }
    @Then("the results match the criteria")
    public void validar_resultador_match_the_criteria(){
        Assert.assertEquals("texto que esperamos", google.firsResult());
    }
}
