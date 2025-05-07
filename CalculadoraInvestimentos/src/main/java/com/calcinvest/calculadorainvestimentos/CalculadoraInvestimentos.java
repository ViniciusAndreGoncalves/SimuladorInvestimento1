package com.calcinvest.calculadorainvestimentos;

import javax.swing.JOptionPane;

public class CalculadoraInvestimentos {

    public static void main(String[] args) {        

        JOptionPane.showMessageDialog(null, "NÃO É UMA RECOMENDAÇÃO DE INVESTIMENTOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        
        RendaFixa rfx = new RendaFixa();

        String valorStr = JOptionPane.showInputDialog("Insira o valor a ser investido","1000");
        double valor = Double.parseDouble(valorStr);
        rfx.setValorInvestido(valor);

        JOptionPane.showMessageDialog(null, rfx.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);


        RendaVariavel rv = new RendaVariavel();
        rv.setValorInvestido(valor);

        JOptionPane.showMessageDialog(null, rv.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);


        RendaVariavelUSA rvUSA = new RendaVariavelUSA();
        rvUSA.setValorInvestido(valor);

        JOptionPane.showMessageDialog(null, rvUSA.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);
    

        Bitcoin btc = new Bitcoin();
        btc.setValorInvestido(valor);

        JOptionPane.showMessageDialog(null, btc.mostrarInvestimento(), "INFORMAÇÕES DO INVESTIMENTO", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "NÃO É UMA RECOMENDAÇÃO DE INVESTIMENTOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
    }
}
