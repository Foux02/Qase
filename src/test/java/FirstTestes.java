import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qase.io.DashboardPage;
import qase.io.LoginPage;
import qase.io.WorkspacePage;

import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v95.browser.Browser.close;

public class FirstTestes {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
    }

    @Test
    public void LoginAsRegisteredUser() {
        LoginPage loginPage = open("https://app.qase.io/login", LoginPage.class);
        loginPage.enterLogin("Foux02@rambler.ru");
        loginPage.enterPassword("Tr@velBG209+");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAuthorized();
    }

    @Test
    public void openWorkspace() {
        LoginPage loginPage = open("https://app.qase.io/login", LoginPage.class);
        loginPage.enterLogin("Foux02@rambler.ru");
        loginPage.enterPassword("Tr@velBG209+");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAuthorized();
        WorkspacePage workspacePage = dashboardPage.openMyWorkspace();
        workspacePage.checkWorkspacePage();
    }


    @AfterMethod
    public void tearDown() throws Exception {
        close();
    }
}