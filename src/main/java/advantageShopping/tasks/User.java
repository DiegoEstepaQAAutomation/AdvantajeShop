package advantageShopping.tasks;

import advantageShopping.interactions.Wait;
import advantageShopping.userinterfaces.UserCreateAccount;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static advantageShopping.userinterfaces.UserCreateAccount.BTN_USER;

public class User implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.unMomento(4000),
                Click.on(BTN_USER),
                Wait.unMomento(1000),
                Click.on(UserCreateAccount.LBL_CREATE_NEW_ACCOUNT)
        );
    }

    public static User into() {
        return Instrumented.instanceOf(User.class).withProperties();
    }
}
