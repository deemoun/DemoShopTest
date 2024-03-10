import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class LoginPage {
    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("#login-button");

    public LoginPage open() {
        Selenide.open("https://www.saucedemo.com");
        return this;
    }

    public ProductPage login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
        return new ProductPage();
    }
}
