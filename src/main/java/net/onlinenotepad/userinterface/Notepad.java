package net.onlinenotepad.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Notepad {
    public static final Target BUTTONJOIN = Target.the("TextoEnrriquecido").locatedBy("//div[@id=\"v-pills-tab\"]/button[@id='richtextnote-tab']");
    public static final Target BUTTONNEGRITA = Target.the("TextoEnrriquecido").locatedBy("(//button[@class=\"ck ck-button ck-on\"])[1]");
    public static final Target TEXT = Target.the("Texto").locatedBy("//div[@id=\"editor\"]");
    public static final Target LIST = Target.the("Texto").locatedBy("//input[@id=\"my-list\"]");
    public static final Target ADDLIST = Target.the("Texto").locatedBy("//button[@id=\"addnewlist\"]");
    public static final Target OPTIONLIST = Target.the("Texto").locatedBy("(//button[@id=\"tasklist-tab\"])[1]");

    public static final Target DELETE = Target.the("Texto").locatedBy("//img[@class=\"me-2 remove_list_item\"]");
    public static final Target SEARCH = Target.the("Prueba").locatedBy("//span[@style=\"width:95%;word-break:break-word\"]");
}
