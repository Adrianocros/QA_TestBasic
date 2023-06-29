package br.ce.adrianobasetres.ContaTest;

import br.ce.adrianobasetres.pages.MenuPage;
import br.ce.adrianobasetres.pages.MovimentacaoPage;
import br.ce.adrianobasetres.utils.DataUtils;
import br.ce.adrianobasetres.core.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static br.ce.adrianobasetres.core.Propriedades.NOME_CONTA_ALTERADA;
import static br.ce.adrianobasetres.utils.DataUtils.obtarDataFuturaFormatada;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {
    MenuPage menuPage = new MenuPage();

    private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();

    @Test
    public void test1_InserirMovimentacao(){
        menuPage.inserirMovimentacao();
        movimentacaoPage.setTipo("Receita");
        movimentacaoPage.setDataMovimentacao(obtarDataFuturaFormatada(new Date()));
        movimentacaoPage.setDataTransacao(obtarDataFuturaFormatada(new Date()));
        movimentacaoPage.setDescricao("Pagamento refetente a venda de hoje");
        movimentacaoPage.setInteressado("Adriano Cros");
        movimentacaoPage.setValor("3000");
        movimentacaoPage.setConta(NOME_CONTA_ALTERADA);
        movimentacaoPage.setStatusPago();
        movimentacaoPage.salvar();

        Assert.assertEquals("Movimentação adicionada com sucesso!",movimentacaoPage.mensagemSucesso());
    }

    @Test
    public void test2_CamposObrigatorios(){
        menuPage.inserirMovimentacao();
        movimentacaoPage.salvar();
        List<String> erros = movimentacaoPage.obterErros();
        //Assert.assertEquals("Data da Movimentação é obrigatório",erros.get(0)); Caso altere a ordem o sistem quebra
        //Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório")); Não importa com a ordem e sim com a menasgem

        Assert.assertTrue(erros.containsAll(Arrays.asList(
               "Data da Movimentação é obrigatório","Data do pagamento é obrigatório",
                "Descrição é obrigatório","Interessado é obrigatório","Valor é obrigatório",
                "Valor deve ser um número" )));
        Assert.assertEquals(6,erros.size());
    }

    @Test
    public void test3_MovimentacaoDataFutura(){
        menuPage.inserirMovimentacao();
        movimentacaoPage.setTipo("Receita");

        Date dataFuturda = DataUtils.obterDataFuturda(55);//Informe a qtd de dias furutos

        movimentacaoPage.setDataMovimentacao(obtarDataFuturaFormatada(dataFuturda));
        movimentacaoPage.setDataTransacao(obtarDataFuturaFormatada(dataFuturda));
        //movimentacaoPage.setDataMovimentacao("28/06/2023");
        //movimentacaoPage.setDataTransacao("28/06/2023");
        movimentacaoPage.setDescricao("Pagamento refetente a venda de hoje");
        movimentacaoPage.setInteressado("Adriano Cros");
        movimentacaoPage.setValor("3000");
        movimentacaoPage.setConta(NOME_CONTA_ALTERADA);
        movimentacaoPage.setStatusPago();
        movimentacaoPage.salvar();

        List<String> erros = movimentacaoPage.obterErros();
        Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual" ));
        Assert.assertEquals(1,erros.size());

    }


}
