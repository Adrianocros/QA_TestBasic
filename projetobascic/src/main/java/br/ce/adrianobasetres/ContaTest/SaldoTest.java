package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.HomePage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class SaldoTest  extends BaseTest {

    HomePage homePage = new HomePage();
    @Test
    public void testaSaldoConta(){
        String saldo = homePage.obterSaldoConta("Adriano Bianchi");
        Assert.assertEquals("6000.00",homePage.obterSaldoConta("Adriano Bianchi"));
        System.out.println("Saldo em conta corrente é R$ " +saldo);
    }

}
