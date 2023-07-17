package net.onlinenotepad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.onlinenotepad.questions.QEscenario1;
import net.onlinenotepad.tasks.Escenario1;
import net.onlinenotepad.tasks.Escenario2;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


public class stepDefs {

    @Managed
    private WebDriver myDirver;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Esteban");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDirver));
    }


    @Given("el usuario inicia la pagina")
    public void elUsuarioIniciaLaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }
    @When("el usuario selecciona la opcion de nota enriquecida y ingresa el texto Prueba")
    public void elUsuarioSeleccionaLaOpcionDeNotaEnriquecidaYIngresaElTextoPrueba() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Escenario1.on());
    }
    @Then("el usuario deberia visualizar (.*)")
    public void elUsuarioDeberiaVisualizarPrueba(String Location) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QEscenario1.in(), Matchers.containsString(Location)));

    }
    @When("^el usuario selecciona la opcion de lista y agrega (\\d+) notas$")
    public void elUsuarioSeleccionaLaOpcionDeListaYAgregaNotas(int arg1) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Escenario2.on());
    }


}
