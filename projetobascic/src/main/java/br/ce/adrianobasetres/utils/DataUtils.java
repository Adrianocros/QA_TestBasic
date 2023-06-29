package br.ce.adrianobasetres.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

    /**Classe para trabalhar com data atual ou futura +1 futura | -1 ontem**/
    public  static Date obterDataFuturda(int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        return calendar.getTime();
    }

    public static String obtarDataFuturaFormatada(Date data){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(data);
    }
}
