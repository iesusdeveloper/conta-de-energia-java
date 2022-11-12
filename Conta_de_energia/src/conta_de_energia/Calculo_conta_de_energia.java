package conta_de_energia;

import javax.swing.JOptionPane;

public class Calculo_conta_de_energia {

	
	
	public static void main(String [] args) {
		
		double leituraAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite a Leitura Atual no contador de energia:"));
		double leituraAnterior = Double.parseDouble(JOptionPane.showInputDialog("Digite a Leitura Anterior presente na conta de energia:"));
		double valorKWH = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do kwh presente na conta de energia:"));
		double valorBandeira = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da bandeira tarifária:"));
		
		double calculo = ((leituraAtual - leituraAnterior) * valorKWH) + (valorBandeira *(leituraAtual - leituraAnterior));
		
		JOptionPane.showMessageDialog(null, "O valor aproximado da sua próxima conta de energia, será de: R$" + calculo);
		
		
	}
}
