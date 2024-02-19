
package pages;



public class PaginaFundamentosTesting  extends BasePage {
   
    private String fundamentosIntroduccionLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public PaginaFundamentosTesting() {
    super(driver);
}

    public void clickIntroducionTestingLink() {
        clickElement(fundamentosIntroduccionLink);
    }
    
}
