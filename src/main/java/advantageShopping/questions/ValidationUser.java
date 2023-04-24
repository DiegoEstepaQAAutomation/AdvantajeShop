package advantageShopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static advantageShopping.userinterfaces.UserCreateAccount.*;

public class ValidationUser implements Question<String> {
    private String user;

    public ValidationUser(String user) {
        this.user = user;
    }

    public static ValidationUser es(String user) {
        return new ValidationUser(user);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_VALIDACION_USER).viewedBy(actor).asString();
    }
}
