package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.HomePage;
import br.ce.adrianobasetres.core.BaseTest;
import br.ce.adrianobasetres.pages.MenuPage;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static br.ce.adrianobasetres.core.Propriedades.NOME_CONTA_ALTERADA;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaldoTest  extends BaseTest {

    HomePage homePage = new HomePage();
    MenuPage menupage = new MenuPage();
    @Test
    public void testaSaldoConta(){
        menupage.acessarTelaPrincipal();
        Assert.assertEquals("3000.00",homePage.obterSaldoConta(NOME_CONTA_ALTERADA));
    }

}
