import org.example.data.browser.WebDriverBrowser;
import org.example.data.user.ApiUserClient;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import static org.example.data.browser.WebDriverBrowser.BASE_URL;



public class DataTest {
    public String name = "Maksim";
    public String email = "tryggolav@gmail.com";
    public String password = "qwerty";
    public String invalidPassword = "123";


    public WebDriver driver;
    public ApiUserClient apiUserClient = new ApiUserClient();

    @Before
    public void setUp() {
        driver = WebDriverBrowser.browserDriverSetUp();
        driver.get(BASE_URL);
    }

    @After
    public void teardown() {
        driver.quit();
        apiUserClient.deleteUser(email, password);
    }
}
