package br.ce.adrianobasetres.core;

public class Propriedades {
    public static boolean FECHAR_BROWSER = true;  //Executar em bateria rela deixe como true, pois é mais seguro.

    public static Browsers browser = Browsers.FIREFOX;
    public enum Browsers{
        CHROME,
        FIREFOX
    }
}
