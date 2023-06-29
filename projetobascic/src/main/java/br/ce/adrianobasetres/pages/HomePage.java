package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;


public class HomePage extends BasePage {


    public String obterSaldoConta(String nome){
        return  obterCelula("Conta",nome,"Saldo", "tabelaSaldo").getText();

    }
}
