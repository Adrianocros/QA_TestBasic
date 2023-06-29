package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;
import org.openqa.selenium.By;

public class ResumoPage extends BasePage {

    public void excluirMovimentacao(){
        clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
    }

    public String mensagemSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

}
