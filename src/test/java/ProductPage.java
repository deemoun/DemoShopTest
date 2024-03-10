import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private final SelenideElement firstItemAddToCartButton = $("#add-to-cart-sauce-labs-backpack");

    public void addBackPackToCart() {
        firstItemAddToCartButton.click();
    }

    public void goToCart() {
        $("#shopping_cart_container").click();
    }
}
