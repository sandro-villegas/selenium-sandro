package pages.Gridpage;

import java.util.NoSuchElementException;

import org.gradle.api.tasks.SourceTask;

import pages.BasePage;

public class EmailPage extends BasePage{
  String emailinput = "//input[@id='email']"; 
  //String inputpassword = "//input[@type='password']";
  String inputpass = "//input[@id='pass']";
 // String nestpassword = "//button[@aria-label='Siguiente']";
  String btnFacebook = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]";
    public EmailPage(){
        super(driver);
    }
  

    // agregar try catch
    public void Enter_to_EMAIL(){
      try {
          navigateTo("https://www.facebook.com/");
      } catch (Exception e) {
          System.out.println("Ocurrió un error al navegar a la página de Facebook: " + e.getMessage());
          // Aquí puedes agregar código adicional para manejar el error, como registrar el error en un archivo de registro o enviar una notificación por correo electrónico al equipo de desarrollo.
      }
  }
  public void Enter_click_btn(){
    clickElement(btnFacebook);
  }
  public void enter_email_counter(String criteria){
    write(emailinput, criteria);
  }
  public void enter_password(String criteria2){
    write(inputpass,criteria2);
  }
  /*
  public void Enter_click_btn_pass(){
    clickElement(nestpassword);
  }*/
}
