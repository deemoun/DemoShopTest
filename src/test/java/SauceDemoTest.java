import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class SauceDemoTest extends BaseTest{
    @Test
    public void testAddItemsToCartAndCheckout() {
        LoginPage loginPage = new LoginPage();
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .addBackPackToCart()
                .goToCart()
                .proceedToCheckout();
    }
}
