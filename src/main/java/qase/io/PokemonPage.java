package qase.io;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class PokemonPage {

    @FindBy(xpath = "//div[2]/p[.='Pokemon']")
    public SelenideElement pokemonProject;

    @FindBy(xpath = "//a[@id='menu-link-test-defects']/span[@class='submenu-item-text']")
    public SelenideElement defectsPokemonLink;

    public void checkPokemonPage () {
        pokemonProject.shouldBe(Condition.visible);
    }

    public DefectsPokemon openDefectsPokemonPage() {
        defectsPokemonLink.click();
        return page (DefectsPokemon.class);
    }
}
