package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.HomePage;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaldoTest  extends BaseTest {

    HomePage homePage = new HomePage();
    @Test
    public void testaSaldoConta(){
        Assert.assertEquals("3000.00",homePage.obterSaldoConta("Adriano Bianchi C"));
    }

}
