package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    @FindBy(xpath = "//div[@class='nav-bottom-item nav-bottom-user']")
    public SelenideElement profileLink;

    @FindBy(xpath = "//a[@href='https://app.qase.io/workspace']")
    public SelenideElement myProjectsLink;

    public void checkUserAuthorized() {
        profileLink.shouldBe(Condition.visible);
    }

    public WorkspacePage openMyWorkspace() {
        myProjectsLink.click();
        return Selenide.page(WorkspacePage.class);

    }

}


