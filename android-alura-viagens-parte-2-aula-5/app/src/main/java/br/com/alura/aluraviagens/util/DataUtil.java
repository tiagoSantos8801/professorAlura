package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";//MOdo de exibicao

    @NonNull
    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();//Data de hoje
        Calendar dataVolta = Calendar.getInstance();//Data de hoje
        dataVolta.add(Calendar.DATE, dias);//Data de hj em dias, mais os dias de viajem

        //Formatacao de como mostrar a data
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);//Classe de formatacao de data
        String dataFormatadaIda = formatoBrasileiro.format(dataIda.getTime());//Pega as datas no formato pedido de argumento
        String dataFormatadaVolta = formatoBrasileiro.format(dataVolta.getTime());
        return dataFormatadaIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);//Datas formatadas juntamente com o ano
    }

}
