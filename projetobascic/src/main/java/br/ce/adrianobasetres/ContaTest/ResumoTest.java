package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.MenuPage;
import br.ce.adrianobasetres.pages.ResumoPage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static br.ce.adrianobasetres.core.DriverFactory.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private ResumoPage resumoPage = new ResumoPage();

   // @Test
    public void test1_ExluirMovimentacao(){
        menuPage.acessarResumoMensal();
        resumoPage.excluirMovimentacao();

        Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.mensagemSucesso());
    }

    @Test //(expected = NoSuchElementException.class) Gera falso positivo, caso tenha varias linhas ele passa
    public void test2_ResumoMensal(){
        menuPage.acessarResumoMensal();
        Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());

        //verifica as exeção no escopo correto porem busca o elemento depois captura a exeção gera delay
//        try {
//            getDriver().findElement(By.xpath("//*[@id='tabelaSaldo']/tbody/tr"));
//            Assert.fail();
//        }catch (NoSuchElementException e){
//        }

        //Forma que não trabalha com a exeção, melhora a performance e faz a busca diretamente na logica.
      List<WebElement> elementosEncontrados =
              getDriver().findElements(By.xpath("//*[@id='tabelaSaldo']/tbody/tr"));
      Assert.assertEquals(0,elementosEncontrados.size());
    }
}
