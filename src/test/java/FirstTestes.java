import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qase.io.*;
import qase.io.util.CardData;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;


public class FirstTestes {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
    }



    @Test
    public void openCreateDefect() {
        CardData create = new CardData("Defect35", "Not Text");
        LoginPage loginPage = open("https://app.qase.io/login", LoginPage.class);
        loginPage.enterLogin("Foux02@rambler.ru");
        loginPage.enterPassword("Tr@velBG209+");
        ProjectsPage projectsPage = loginPage.clickLoginBtn();
        projectsPage.checkUserAuthorized();
        PokemonPage pokemonPage = projectsPage.openProjectPokemon();
        pokemonPage.checkPokemonPage();
        DefectsPokemon defectsPokemon = pokemonPage.openDefectsPokemonPage();
        defectsPokemon.checkDefectsPokemon();
        CreateDefect createDefect = defectsPokemon.openCreateNewDefect();
        createDefect.checkCreateDefect();
        createDefect.addCreateNewDefect(create.getCardName(), create.getCardDiscription());
        createDefect.checkCreateNewDefect(create.getCardName());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        closeWindow();
    }


}