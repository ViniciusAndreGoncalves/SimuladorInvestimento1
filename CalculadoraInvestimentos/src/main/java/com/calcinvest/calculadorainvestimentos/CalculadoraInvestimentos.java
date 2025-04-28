package com.calcinvest.calculadorainvestimentos;

import javax.swing.JOptionPane;

public class CalculadoraInvestimentos {

    public static void main(String[] args) {        

        JOptionPane.showMessageDialog(null, "NÃO É UMA RECOMENDAÇÃO DE INVESTIMENTOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        
        RendaFixa rfx = new RendaFixa();

        String valorStrRFX = JOptionPane.showInputDialog("Insira o valor a ser investido","1000");
        double valorRFX = Double.parseDouble(valorStrRFX);
        rfx.setValorInvestido(valorRFX);

        JOptionPane.showMessageDialog(null, rfx.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);


        RendaVariavel rv = new RendaVariavel();
        
        String valorStrRV = JOptionPane.showInputDialog("Insira o valor a ser investido","1000");
        double valorRV = Double.parseDouble(valorStrRV);
        rv.setValorInvestido(valorRV);

        JOptionPane.showMessageDialog(null, rv.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);


        RendaVariavelUSA rvUSA = new RendaVariavelUSA();

        String valorStrRVUSA = JOptionPane.showInputDialog("Insira o valor a ser investido","1000");
        double valorRVUSA = Double.parseDouble(valorStrRVUSA);
        rvUSA.setValorInvestido(valorRVUSA);

        JOptionPane.showMessageDialog(null, rvUSA.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);
    

        Bitcoin btc = new Bitcoin();

        String valorStrBTC = JOptionPane.showInputDialog("Insira o valor a ser investido","1000");
        double valorBTC = Double.parseDouble(valorStrBTC);
        btc.setValorInvestido(valorBTC);

        JOptionPane.showMessageDialog(null, btc.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "NÃO É UMA RECOMENDAÇÃO DE INVESTIMENTOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
    }
}