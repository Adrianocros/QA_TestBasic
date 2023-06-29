package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;
import org.openqa.selenium.By;


public class ContasPage extends BasePage {

    public void setNome(String nome){
        escrever("nome", nome);
    }



    public void salvarConta(){
        clicarBotaoPorTexto("Salvar");
    }

    public String mensagemSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public void clicarAlterarConta(String string) {
        obterCelula("Conta",string,"Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']"))
                .click();
    }

    public String mensagemContaMesmoNome(){
        return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
    }

    public String mensagemContaComMovimentacao(){
        return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
    }


    public void clicarExcluirConta(String string) {
        obterCelula("Conta",string,"Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']"))
                .click();
    }

}
