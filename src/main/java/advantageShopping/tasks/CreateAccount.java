package advantageShopping.tasks;

import advantageShopping.interactions.Wait;
import advantageShopping.userinterfaces.UserCreateAccount;
import advantageShopping.utils.hooks.SessionVariables;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

import static advantageShopping.userinterfaces.UserCreateAccount.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateAccount implements Task {
    private List<String> data;
    String u = RandomStringUtils.random(5, 49, 57, false, true);

    public CreateAccount(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String us = data.get(0) + u;

        actor.attemptsTo(
                User.into(),
                Enter.theValue(us).into(UserCreateAccount.TXT_USER_NAME),
                Enter.theValue(data.get(1)).into(TXT_EMAIL),
                Enter.theValue(data.get(2)).into(TXT_PASSWORD),
                Enter.theValue(data.get(2)).into(UserCreateAccount.TXT_CONFIRM_PASSWORD),

                Enter.theValue(data.get(3)).into(TXT_FIRST_NAME),
                Enter.theValue(data.get(4)).into(TXT_LAST_NAME),
                Enter.theValue(data.get(5)).into(TXT_PHONE_NUMBER),

                Country.the(data.get(6)),
                Enter.theValue(data.get(7)).into(TXT_CITY),
                Enter.theValue(data.get(8)).into(TXT_ADDRESS),
                Enter.theValue(data.get(9)).into(TXT_STATE),
                Enter.theValue(data.get(10)).into(TXT_POSTAL));

        theActorInTheSpotlight().remember(SessionVariables.user.toString(), us);

        actor.attemptsTo(
                Click.on(CBX_RECEIVE),
                Click.on(CBX_I_AGREE),
                Click.on(BTN_REGISTER),
                Wait.unMomento(4000)
        );
    }

    public static CreateAccount register(List<String> data) {
        return Instrumented.instanceOf(CreateAccount.class).withProperties(data);
    }
}
