package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacePage {

    @FindBy(xpath = "//a[@title='Settings']/i")
    public SelenideElement projectsHeader;

    public void checkWorkspacePage() {
        projectsHeader.shouldBe(Condition.visible);

    }
}
