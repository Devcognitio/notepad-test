package net.onlinenotepad.tasks;

import net.onlinenotepad.userinterface.Notepad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Escenario2  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Notepad.OPTIONLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("Prueba").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("Hola").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("2Prueba").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("2Hola").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("3Prueba").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.LIST),
                Enter.theValue("Prueba").into(Notepad.LIST),
                Click.on(Notepad.ADDLIST),
                Click.on(Notepad.DELETE),
                Click.on(Notepad.DELETE),
                Click.on(Notepad.DELETE),
                Click.on(Notepad.DELETE)



        );
    }
    public static Escenario2 on(){return new Escenario2();}
}
