import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class SauceDemoTest extends BaseTest {
    @Test
    public void testAddItemsToCartAndCheckout() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        CheckoutPage checkoutPage = new CheckoutPage();

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        productPage.addBackPackToCart();
        productPage.goToCart();

        cartPage.proceedToCheckout();

        checkoutPage.enterFirstName("Ivan");
        checkoutPage.enterLastName("Testov");
        checkoutPage.enterZipCode("12345");
    }
}
