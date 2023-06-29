package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.core.BaseTest;
import br.ce.adrianobasetres.pages.ContasPage;
import br.ce.adrianobasetres.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class RemoverMovimentacaoContaTest extends BaseTest {
    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void testExcluirContaComMovimentatacao(){
        menuPage.acessarTelaAlterarConta();
        contasPage.clicarExcluirConta("Adriano Bianchi C");
        Assert.assertEquals("Conta em uso na movimentações",contasPage.mensagemContaComMovimentacao());
    }

}
