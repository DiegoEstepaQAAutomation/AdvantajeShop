package advantageShopping.interactions;

import advantageShopping.utils.UtiliTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;
import java.util.concurrent.TimeUnit;

public class Wait implements Interaction {
    private final int milisegundos;

    public Wait(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    public static Wait unMomento(int miliseguntos){
        return Tasks.instrumented(Wait.class, miliseguntos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Awaitility.await().forever().pollInterval(milisegundos,
                    TimeUnit.MILLISECONDS).until(UtiliTime.condicionExitosa());
        }catch (Exception e){
            e.getMessage();
        }
    }
}
