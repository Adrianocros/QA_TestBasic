package br.ce.adrianobasetres.core;

public class Propriedades {
    public static boolean FECHAR_BROWSER = false;  //Executar em bateria rela deixe como true, pois é mais seguro.

    public static String NOME_CONTA_ALTERADA = "Conta Alterada" + System.nanoTime();

    public static Browsers browser = Browsers.FIREFOX;
    public enum Browsers{
        CHROME,
        FIREFOX
    }
}
