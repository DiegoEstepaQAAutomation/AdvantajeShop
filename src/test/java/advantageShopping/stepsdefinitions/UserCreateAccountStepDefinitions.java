package advantageShopping.stepsdefinitions;

import advantageShopping.questions.ValidationUser;
import advantageShopping.tasks.Abrir;
import advantageShopping.tasks.CreateAccount;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import advantageShopping.utils.hooks.SessionVariables;
import java.util.List;
import static jxl.biff.FormatRecord.logger;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserCreateAccountStepDefinitions {

    @Dado("^que usuario quiere registrarse en la pagina de dvantage DEMO$")
    public void queUsuarioQuiereRegistrarseEnLaPaginaDeDvantageDEMO() {
        theActorInTheSpotlight().wasAbleTo(Abrir.app());
        logger.info("Se abre el navegador con la pagina web indicada");
    }

    @Cuando("^ingresa los datos del formulario de registro$")
    public void ingresaLosDatosDelFormularioDeRegistro(List<String> data) {
        theActorInTheSpotlight().attemptsTo(CreateAccount.register(data));
        logger.info("Se llena el formulario de registro, el 'Username' se le agrego un random numerico el cual se almacena en una variable para su respectiva validacion");
    }

    @Entonces("^se valida el usuario registrado$")
    public void seValidaElUsuarioRegistrado() {
        String user = theActorInTheSpotlight().recall(SessionVariables.user.toString());
        theActorInTheSpotlight().should(seeThat(ValidationUser.es(user)));
        logger.info("Se llama la variable donde se almaceno el 'Username' y se valida");
    }
}
