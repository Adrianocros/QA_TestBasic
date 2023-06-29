package br.ce.adrianobasetres.pages;

import br.ce.adrianobasetres.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static br.ce.adrianobasetres.core.DriverFactory.getDriver;

public class MovimentacaoPage extends BasePage {

    public void setTipo(String tipo){
        selecionarCombo("tipo", tipo);
    }

    public void setDataMovimentacao(String data){
        escrever("data_transacao",data);
    }

    public void setDataTransacao(String data){
        escrever("data_pagamento", data);
    }

    public void setDescricao(String descrcao){
        escrever("descricao",descrcao);
    }

    public void setInteressado(String interessado){
        escrever("interessado", interessado);
    }

    public void  setValor(String valor){
        escrever("valor", valor);
    }


    public void setConta(String conta){
        selecionarCombo("conta",conta);
    }

    public void setStatusPago(){
        clicarRadio("status_pago");
    }

    public void salvar(){
        clicarBotaoPorTexto("Salvar");
    }

    public String mensagemSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public List<String> obterErros(){
      List<WebElement> erros = getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));
      List<String> retorno = new ArrayList<String>();
      for(WebElement erro : erros){
          retorno.add(erro.getText());
      }
      return retorno;
    }


}
