package advantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserCreateAccount {
    // HOME
    public static Target BTN_USER = Target.the("Icono USER").located(By.id("menuUserLink"));
    public static Target LBL_CREATE_NEW_ACCOUNT = Target.the("Selección CREATE NEW ACCOUNT").locatedBy("//div/div/a[contains(text(),'CREATE NEW ACCOUNT')]");

    // ACCOUNT DETAILS
    public static Target TXT_USER_NAME = Target.the("Campo de texto Username").located(By.name("usernameRegisterPage"));
    public static Target TXT_EMAIL = Target.the("Campo de texto Email").located(By.name("emailRegisterPage"));
    public static Target TXT_PASSWORD = Target.the("Campo de texto Password").located(By.name("passwordRegisterPage"));
    public static Target TXT_CONFIRM_PASSWORD = Target.the("Campo de texto Confirm password").located(By.name("confirm_passwordRegisterPage"));

    // PERSONAL DETAILS
    public static Target TXT_FIRST_NAME = Target.the("Campo de texto First Name").located(By.name("first_nameRegisterPage"));
    public static Target TXT_LAST_NAME = Target.the("Campo de texto Last Name").located(By.name("last_nameRegisterPage"));
    public static Target TXT_PHONE_NUMBER = Target.the("Campo de texto Phone Number").located(By.name("phone_numberRegisterPage"));

    // ADDRESS
    public static Target LBL_COUNTRY = Target.the("Campo de lista Country").located(By.name("countryListboxRegisterPage"));
    public static Target TXT_CITY = Target.the("Campo de texto City").located(By.name("cityRegisterPage"));
    public static Target TXT_ADDRESS = Target.the("Campo de texto Address").located(By.name("addressRegisterPage"));
    public static Target TXT_STATE = Target.the("Campo de texto State/Province/Region").located(By.name("state_/_province_/_regionRegisterPage"));
    public static Target TXT_POSTAL = Target.the("Campo de texto Postal Code").located(By.name("postal_codeRegisterPage"));

    public static Target CBX_RECEIVE = Target.the("Check list Receive").located(By.name("allowOffersPromotion"));
    public static Target CBX_I_AGREE = Target.the("Check list I agree").located(By.name("i_agree"));
    public static Target BTN_REGISTER = Target.the("Botón REGISTER").located(By.id("register_btnundefined"));

    // VALIDACIÓN
    public static Target TXT_VALIDACION_USER = Target.the("Validación Username").locatedBy("//*[@id='menuUserLink']/span");
}
