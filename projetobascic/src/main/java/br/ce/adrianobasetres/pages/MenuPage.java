package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarTelaInserirConta(){
        clicarLink("Contas");
        clicarLink("Adicionar");
    }

    public void acessarTelaAlterarConta(){
        clicarLink("Contas");
        clicarLink("Listar");
    }

    public void inserirMovimentacao(){
        clicarLink("Criar Movimentação");
    }

    public void acessarResumoMensal(){
        clicarLink("Resumo Mensal");
    }

    public void acessarTelaPrincipal(){
        clicarLink("Home");
    }



}
