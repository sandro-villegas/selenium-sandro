package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Gridpage.EmailPage;


public class EmailSteps {
     EmailPage email = new EmailPage();
     @Given("I go to the email page")
      public void I_go_to_the_email_page(){
        email.Enter_to_EMAIL();
    }
    @And("llenar el input con tu correo")
    public void click_go_to_input_email(){
      email.enter_email_counter("zony123rbd@gmail.com");
    }
    @And("you enter password")
    public void your_entre_password(){
      email.enter_password("rbdpool123456");
    }
    @And("click in buton next")
    public void click_button_next(){
      email.Enter_click_btn();
    }
    /* 
    @And("click in button nextpass")
    public void click_go_to_input_nestpass(){
      email.Enter_click_btn_pass();
    }*/
}
