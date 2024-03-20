package pages.Google;


import pages.BasePage;

public class GooglePage extends BasePage{
    private String searchParh = "//input[@title='Buscar con Google']";
    private String searchTextField = "//textarea[@title='Buscar']";
    private String firsResultado ="";
    public GooglePage(){
        super(driver);
    }
    public void navigateToggogle(){
         navigateTo("https:www.google.com");
    } 
    public void clickGoogleSearch(){
        clickElement(searchParh);
    }
    public void enterSearchCritiria(String criteria){
        write(searchTextField, criteria);
    }
    
   
    /* 
    public void enterSearchCriteria(String criteria){
        write(searchParh, criteria);
    }*/
    
   public String firsResult(){
    return textFromElemnt(firsResultado);
   }
 
}
