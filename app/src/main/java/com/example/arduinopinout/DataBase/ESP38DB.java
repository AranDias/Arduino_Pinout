package com.example.arduinopinout.DataBase;

public class ESP38DB {

    public String get38Search(String search){
        if      (search.equals("GND")||search.equals("gnd")||search.equals("Aterramento")||search.equals("aterramento")||search.equals("Terra")||search.equals("terra")||search.equals("0V"))   { return getGND();}
        else if (search.equals("Vcc")||search.equals("Vin")||search.equals("vin")||search.equals("Alimentação")||search.equals("alimentação")||search.equals("Fonte")||search.equals("fonte"))  { return getVcc();}
        else if (search.equals("3V3")||search.equals("3v3"))  { return get3V3();}
        else if (search.equals("EN")||search.equals("en")||search.equals("Reset")||search.equals("reset")||search.equals("enable")) {return getEN();}
        else if (search.equals("D36")||search.equals("d36")||search.equals("36")||search.equals("GPIO36")||search.equals("Gpio36")||search.equals("VP")||search.equals("vp")){return get36();}
        else if (search.equals("D39")||search.equals("d39")||search.equals("39")||search.equals("GPIO39")||search.equals("Gpio39")||search.equals("VN")||search.equals("vn")){return get39();}
        else if (search.equals("D34")||search.equals("d34")||search.equals("34")||search.equals("GPIO34")||search.equals("Gpio34")){return get34();}
        else if (search.equals("D35")||search.equals("d35")||search.equals("35")||search.equals("GPIO35")||search.equals("Gpio35")){return get35();}
        else if (search.equals("D32")||search.equals("d32")||search.equals("32")||search.equals("GPIO32")||search.equals("Gpio32")){return get32();}
        else if (search.equals("D33")||search.equals("d33")||search.equals("33")||search.equals("GPIO33")||search.equals("Gpio33")){return get33();}
        else if (search.equals("D25")||search.equals("d25")||search.equals("25")||search.equals("GPIO25")||search.equals("Gpio25")){return get25();}
        else if (search.equals("D26")||search.equals("d26")||search.equals("26")||search.equals("GPIO26")||search.equals("Gpio26")){return get26();}
        else if (search.equals("D27")||search.equals("d27")||search.equals("27")||search.equals("GPIO27")||search.equals("Gpio27")){return get27();}
        else if (search.equals("D14")||search.equals("d14")||search.equals("14")||search.equals("GPIO14")||search.equals("Gpio14")||search.equals("HSPI CLK")){return get14();}
        else if (search.equals("D12")||search.equals("d12")||search.equals("12")||search.equals("GPIO12")||search.equals("Gpio12")||search.equals("HSPI MISO")){return get12();}
        else if (search.equals("D13")||search.equals("d13")||search.equals("13")||search.equals("GPIO13")||search.equals("Gpio13")||search.equals("HSPI MOSI")){return get13();}
        else if (search.equals("D9")||search.equals("d9")||search.equals("9")||search.equals("GPIO9")||search.equals("Gpio9")||search.equals("D09")||search.equals("d09")||search.equals("09")||search.equals("GPIO09")||search.equals("Gpio09")||search.equals("SD2")){return get09();}
        else if (search.equals("D10")||search.equals("d10")||search.equals("10")||search.equals("GPIO10")||search.equals("Gpio10")||search.equals("SD3")){return get10();}
        else if (search.equals("D11")||search.equals("d11")||search.equals("11")||search.equals("GPIO11")||search.equals("Gpio11")||search.equals("CMD")){return get11();}
        else if (search.equals("D23")||search.equals("d23")||search.equals("23")||search.equals("GPIO23")||search.equals("Gpio23")||search.equals("VSI MOSI")){return get23();}
        else if (search.equals("D22")||search.equals("d22")||search.equals("22")||search.equals("GPIO22")||search.equals("Gpio22")||search.equals("SCL")){return get22();}
        else if (search.equals("D1")||search.equals("d1")||search.equals("1")||search.equals("GPIO1")||search.equals("Gpio1")||search.equals("D01")||search.equals("d01")||search.equals("01")||search.equals("GPIO01")||search.equals("TX0")||search.equals("Tx0")){return get01();}
        else if (search.equals("D3")||search.equals("d3")||search.equals("3")||search.equals("GPIO3")||search.equals("Gpio3")||search.equals("D03")||search.equals("d03")||search.equals("03")||search.equals("GPIO03")||search.equals("RX0")||search.equals("Rx0")){return get03();}
        else if (search.equals("D21")||search.equals("d21")||search.equals("21")||search.equals("GPIO21")||search.equals("Gpio21")||search.equals("I2C SDA")){return get21();}
        else if (search.equals("D19")||search.equals("d19")||search.equals("19")||search.equals("GPIO19")||search.equals("Gpio19")||search.equals("VSPI MISO")){return get19();}
        else if (search.equals("D18")||search.equals("d18")||search.equals("18")||search.equals("GPIO18")||search.equals("Gpio18")||search.equals("VSPI CLK")){return get18();}
        else if (search.equals("D5")||search.equals("d5")||search.equals("5")||search.equals("GPIO5")||search.equals("Gpio5")||search.equals("D05")||search.equals("d05")||search.equals("05")||search.equals("GPIO05")||search.equals("Gpio05")||search.equals("VSPI CS0")){return get05();}
        else if (search.equals("D17")||search.equals("d17")||search.equals("17")||search.equals("GPIO17")||search.equals("Gpio17")||search.equals("TX2")||search.equals("Tx2")){return get17();}
        else if (search.equals("D16")||search.equals("d16")||search.equals("16")||search.equals("GPIO16")||search.equals("Gpio16")||search.equals("RX2")||search.equals("Rx2")){return get16();}
        else if (search.equals("D4")||search.equals("d4")||search.equals("4")||search.equals("GPIO4")||search.equals("Gpio4")||search.equals("D04")||search.equals("d04")||search.equals("04")||search.equals("GPIO04")||search.equals("Gpio04")){return get04();}
        else if (search.equals("D0")||search.equals("d0")||search.equals("0")||search.equals("GPIO0")||search.equals("Gpio0")||search.equals("D00")||search.equals("d00")||search.equals("00")||search.equals("GPIO00")||search.equals("Gpio00")){return get00();}
        else if (search.equals("D2")||search.equals("d2")||search.equals("2")||search.equals("GPIO2")||search.equals("Gpio2")||search.equals("D02")||search.equals("d02")||search.equals("02")||search.equals("GPIO02")||search.equals("Gpio02")){return get02();}
        else if (search.equals("D15")||search.equals("d15")||search.equals("15")||search.equals("GPIO15")||search.equals("Gpio15")||search.equals("HSPI CSO")){return get15();}
        else if (search.equals("D8")||search.equals("d8")||search.equals("8")||search.equals("GPIO8")||search.equals("Gpio8")||search.equals("D08")||search.equals("d08")||search.equals("08")||search.equals("GPIO08")||search.equals("Gpio08")||search.equals("SDI")||search.equals("SD1")){return get08();}
        else if (search.equals("D7")||search.equals("d7")||search.equals("7")||search.equals("GPIO7")||search.equals("Gpio7")||search.equals("D07")||search.equals("d07")||search.equals("07")||search.equals("GPIO07")||search.equals("Gpio07")||search.equals("SDO")||search.equals("SD0")){return get07();}
        else if (search.equals("D6")||search.equals("d6")||search.equals("6")||search.equals("GPIO6")||search.equals("Gpio6")||search.equals("D06")||search.equals("d06")||search.equals("06")||search.equals("GPIO06")||search.equals("Gpio06")||search.equals("CLK")||search.equals("SCK")){return get06();}
        else if (search.equals("BOOT")||search.equals("Boot")){return getBOOT();}
        else    { return "Desculpe, não temos informações de sua pesquisa.\n Clique em 'Mostrar Mais' para ver o nome correto da porta ou pesquise novamente em letra MAIÚSCULA"; }
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
    private String getVcc(){
        return "";
    }
    private String get3V3(){
        return "";
    }
    private String getEN(){
        return "";
    }
    private String get36(){
        return "";
    }
    private String get39(){
        return "";
    }
    private String get34(){
        return "";
    }
    private String get35(){
        return "";
    }
    private String get32(){
        return "";
    }
    private String get33(){
        return "";
    }
    private String get25(){
        return "";
    }
    private String get26(){
        return "";
    }
    private String get27(){
        return "";
    }
    private String get14(){
        return "";
    }
    private String get12(){
        return "";
    }
    private String get13(){
        return "";
    }
    private String get09(){
        return "";
    }
    private String get10(){
        return "";
    }
    private String get11(){
        return "";
    }
    private String get23(){
        return "";
    }
    private String get22(){
        return "";
    }
    private String get01(){
        return "";
    }
    private String get03(){
        return "";
    }
    private String get21(){
        return "";
    }
    private String get19(){
        return "";
    }
    private String get18(){
        return "";
    }
    private String get05(){
        return "";
    }
    private String get17(){
        return "";
    }
    private String get16(){
        return "";
    }
    private String get04(){
        return "";
    }
    private String get00(){
        return "";
    }
    private String get02(){
        return "";
    }
    private String get15(){
        return "";
    }
    private String get08(){
        return "";
    }
    private String get07(){
        return "";
    }
    private String get06(){
        return "";
    }
    private String getBOOT(){
        return "";
    }
}

