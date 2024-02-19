

package pages;

import org.openqa.selenium.WebDriver;

public class PaginaPrincipal extends BasePage {
 
    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnCursos = "//a[normalize-space()='Cursos' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";
    private String fundamentosTestingLink = "//h2[normalize-space()='Fundamentos del Testing']";
    private String fundamentosIntroduccionLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";
    //a[normalize-space()='Elige plan']
    //h2[normalize-space()='Fundamentos del Testing']
    
   public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
 
    }
    
    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    } 


    public void clickCursos(){
        clickElement(elegirUnCursos);
    }
 
    public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }
    
  
  
}