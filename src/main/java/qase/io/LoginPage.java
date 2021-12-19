package qase.io;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    @FindBy (id = "inputEmail")
    public SelenideElement login;
    @FindBy (id = "inputPassword")
    public SelenideElement password;
    @FindBy (id = "btnLogin")
    public SelenideElement logiBtn;

    public void enterLogin(String userLogin) {
        login.click();
        login.clear();
        login.sendKeys(userLogin);
    }
    public void enterPassword(String userPassword) {
        password.click();
        password.clear();
        password.sendKeys(userPassword);
    }
    public ProjectsPage clickLoginBtn() {
        logiBtn.click();
        return page(ProjectsPage.class);
    }
}
