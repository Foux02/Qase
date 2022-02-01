import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qase.io.*;
import qase.io.util.CardData;
import qase.io.util.UserData;

import static com.codeborne.selenide.Selenide.*;


public class FirstTestes {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
    }



    @Test
    public void openCreateDefect() {
        UserData openWeb = new UserData("Foux02@rambler.ru","Tr@velBG209+");
        CardData create = new CardData("Defect75","Not Text", "6");
        LoginPage loginPage = open("https://app.qase.io/login", LoginPage.class);
        loginPage.enterLogin(openWeb.getUserName());
        loginPage.enterPassword(openWeb.getUserPassword());
        ProjectsPage projectsPage = loginPage.clickLoginBtn();
        projectsPage.checkUserAuthorized();
        PokemonPage pokemonPage = projectsPage.openProjectPokemon();
        pokemonPage.checkPokemonPage();
        DefectsPokemon defectsPokemon = pokemonPage.openDefectsPokemonPage();
        defectsPokemon.checkDefectsPokemon();
        CreateDefect createDefect = defectsPokemon.openCreateNewDefect();
        createDefect.checkCreateDefect();
        createDefect.addCreateNewDefect(create.getCardName(), create.getCardDiscription(), create.getPriorityNumber());
        defectsPokemon.checkCreateNewDefect(create.getCardName());
        defectsPokemon.setDeleteDefect(create.getCardName());
        defectsPokemon.checkDeleteDefect();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        closeWindow();
    }


}