package com.example.arduinopinout.DataBase;

public class ESP38DB {

    public String get38Search(String search){
        if      (search.equals("GND")||search.equals("gnd")||search.equals("Aterramento")||search.equals("aterramento")||search.equals("Terra")||search.equals("terra")||search.equals("0V"))   { return getGND();}
        else if (search.equals("Vcc")||search.equals("Vin")||search.equals("vin")||search.equals("Alimentação")||search.equals("alimentação")||search.equals("Fonte")||search.equals("fonte"))  { return getGND();}

        else    { return "Desculpe, não temos informações de sua pesquisa"; }
    }

    private String getGND() {
        return "GND: OK\n" +
                "Conversor Analógico - Digital: NÃO\n" +
                "Conversor Digital - Analógico: NÃO\n" +
                "Canal de Saída PWM: NÃO\n" +
                "General Porpose Input/Output de detecção capacitiva: NÃO\n" +
                "Relógio de Tempo Real: NÃO\n" +
                "Receptor ou transmissor Universal assíncrono: NÃO\n" +
                "Funções:\n" +
                "Circuito inter-integrado para Dados: NÃO\n" +
                "Serial Protocolo de Interface Periférica: NÃO\n" +
                "Touch (Variação da tensão) NÃO\n" +
                "Terra: SIM\n";
    }
}
