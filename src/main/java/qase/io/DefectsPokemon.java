package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class DefectsPokemon {

    @FindBy(xpath = "//div[@class='d-flex']/h1[.='Defects']")
    public SelenideElement defectsPokemonProject;

    @FindBy(xpath = "//a[@href='/defect/POKEMON/create']")
    public SelenideElement createDefectLink;

    public void checkDefectsPokemon () {
        defectsPokemonProject.shouldBe(Condition.visible);
    }

    public CreateDefect openCreateNewDefect() {
        createDefectLink.click();
        return page (CreateDefect.class);
    }
}
