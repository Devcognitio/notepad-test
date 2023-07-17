package net.onlinenotepad.tasks;

import net.onlinenotepad.userinterface.Notepad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Escenario1 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Notepad.BUTTONJOIN),

                Click.on(Notepad.TEXT),
                Enter.theValue("PPrueba").into(Notepad.TEXT)


        );

    }

    public static Escenario1 on(){return new Escenario1();}
}
