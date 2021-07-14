package entidades;

import javax.swing.JOptionPane; 

public class contaEstudante extends Conta {

	private double limite = 5000;

	public contaEstudante(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public double getLimite() {
		return limite;
	}
	
	public void emprestimo(double emprestimoJa) {
		if (emprestimoJa<=limite) {
			limite = limite - emprestimoJa;
			this.credito(emprestimoJa);
		} else {
			
			JOptionPane.showMessageDialog(null,"Limite indispon�vel.");

		}
		
	}
	
	
	@Override
	public void telas() {
		double saldoDebito;
		double saldoCredito;
		double emprestimoJa;
		int escolha;
		
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde a sua conta *Estudantil* digite:\n1- D�bito\n2- Cr�dito\n3- Emprestimo J�!\n4- para sair\n\nSaldo Atual: R$"+this.saldo));
			switch(opc) {
			case 1:
				saldoDebito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.debito(saldoDebito);
				break;
			case 2:
				saldoCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.credito(saldoCredito);
				break;
			case 3:
				emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empr�stimo: "));
				this.emprestimo(emprestimoJa);								
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Foi dispon�vel um emprestimo, gostaria de receber?");
				escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite 1. SIM \n 2. N�O"));
				if (escolha == 1) {
					emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empr�stimo: "));
					this.emprestimo(emprestimoJa);
				} else if (escolha == 2 ) {
					JOptionPane.showMessageDialog(null,"Obrigado por escolher o FCBM!  At� a pr�xima.");
				}
				break;
			default: 
				JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
				break;
			}
		}while(opc!=4);
	}

}


