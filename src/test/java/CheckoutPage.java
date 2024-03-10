import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private SelenideElement firstNameInput = $("#first-name");
    private SelenideElement lastNameInput = $("#last-name");
    private SelenideElement zipCodeInput = $("#postal-code");
    private SelenideElement continueButton = $("#continue");
    private SelenideElement finishButton = $("#finish");

    public CheckoutPage enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public CheckoutPage enterZipCode(String zipCode) {
        zipCodeInput.setValue(zipCode);
        return this;
    }

    public CheckoutPage continueToNextStep() {
        continueButton.click();
        return this;
    }

    public CheckoutPage finishCheckout() {
        finishButton.click();
        return this;
    }
}
