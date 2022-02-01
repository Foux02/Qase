package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DefectsPokemon {

    @FindBy(xpath = "//div[@class='d-flex']/h1[.='Defects']")
    public SelenideElement defectsPokemonProject;

    @FindBy(xpath = "//a[@href='/defect/POKEMON/create']")
    public SelenideElement createDefectLink;

    @FindBy(linkText = "Defect75")
    public SelenideElement nameNewDefect;

    @FindBy(xpath = "//button[.='Delete']")
    public SelenideElement deleteBtn;


    public void checkDefectsPokemon () {

        defectsPokemonProject.shouldBe(Condition.visible);
    }

    public CreateDefect openCreateNewDefect() {
        createDefectLink.click();
        return page (CreateDefect.class);
    }

    public void checkCreateNewDefect (String defectName) {

        nameNewDefect.shouldBe(Condition.text(defectName));
    }

    public void setDeleteDefect (String getCardName) {
        Selenide.$(By.xpath("//td/div[.="+getCardName+"]/../following-sibling::div[5]/a[@href='#']")).click();
        deleteBtn.click();
    }

    public void checkDeleteDefect() {

        nameNewDefect.shouldNotBe(Condition.visible);
    }
}
