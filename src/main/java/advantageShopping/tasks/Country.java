package advantageShopping.tasks;

import advantageShopping.interactions.Wait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static advantageShopping.userinterfaces.UserCreateAccount.LBL_COUNTRY;

public class Country implements Task {

    private final String country;

    public Country(String country) {
        this.country = country;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.unMomento(50000),
                Click.on(LBL_COUNTRY),
                SelectFromOptions.byVisibleText(country).from(LBL_COUNTRY)
        );
    }

    public static Country the(String country) {
        return Instrumented.instanceOf(Country.class).withProperties(country);
    }
}
