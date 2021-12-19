package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class CreateDefect {

    @FindBy(xpath = "//div[@id='react-app']/div[@class='app']/div//h1")
    public SelenideElement createNewDefect;

    @FindBy(id = "title")
    public SelenideElement defectTitle;

    @FindBy(xpath = "//div[@id='undefinedGroup']/div/div/div/div[2]/div/div[2]/div/div")
    public SelenideElement actualResult;

    @FindBy(xpath = "//div[@id='severityGroup']/div/div/div[2]/div")
    public SelenideElement severity;

    @FindBy(xpath = "//div[@id='react-select-3-option-2']")
    public SelenideElement severityCritical;

    @FindBy(xpath = "//div[@id='react-app']/div/div/div/div/form/div[5]/div/div/div/div[2]/div")
    public SelenideElement assignee;

    @FindBy(xpath = "//div[@id='react-select-4-option-1']")
    public SelenideElement assigneeProf;

    @FindBy(xpath = "//button[.='Create defect']")
    public SelenideElement saveDefectBtn;

    @FindBy(className = "defect-title")
    public SelenideElement nameNewDefect;


    public void checkCreateDefect () {

        createNewDefect.shouldBe(Condition.visible);
    }

    public void setSeverityCritical() {
        severity.click();
        severityCritical.click();
    }

    public void setAssigneeProf() {
        assignee.click();
        assigneeProf.click();
    }

    public void addCreateNewDefect (String defectName, String resultText) {
        defectTitle.click();
        defectTitle.sendKeys(defectName);
        actualResult.click();
        actualResult.sendKeys(resultText);
        setSeverityCritical();
        setAssigneeProf();
        saveDefectBtn.click();
    }
    public void checkCreateNewDefect (String defectName) {
        nameNewDefect.shouldBe(Condition.text(defectName));
    }
}
