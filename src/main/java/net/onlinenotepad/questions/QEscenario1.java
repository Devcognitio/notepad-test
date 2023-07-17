package net.onlinenotepad.questions;

import net.onlinenotepad.userinterface.Notepad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QEscenario1 implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Notepad.SEARCH).viewedBy(actor).asString();
    }
    public static QEscenario1 in(){return new QEscenario1();}
}
