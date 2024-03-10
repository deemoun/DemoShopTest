import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private final SelenideElement firstItemAddToCartButton = $("#add-to-cart-sauce-labs-backpack");

    public ProductPage addBackPackToCart() {
        firstItemAddToCartButton.click();
        return this;
    }

    public CartPage goToCart() {
        $("#shopping_cart_container").click();
        return new CartPage();
    }
}
