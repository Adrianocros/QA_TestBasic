package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.MenuPage;
import br.ce.adrianobasetres.pages.ResumoPage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static br.ce.adrianobasetres.core.DriverFactory.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private ResumoPage resumoPage = new ResumoPage();

    @Test
    public void test1_ExluirMovimentacao(){
        menuPage.acessarResumoMensal();
        resumoPage.excluirMovimentacao();

        Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.mensagemSucesso());
    }

    @Test
    public void test2_ResumoMensal(){
        menuPage.acessarResumoMensal();
        Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
    }
}
