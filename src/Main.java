import java.awt.Component;

import javax.swing.JOptionPane;

public class Main {
	
	static String entrada;
	static int p = 0;
	static String mensagemFinal;
	
	public static void main(String[] args) {		
		entrada = JOptionPane.showInputDialog("Digite um numero");		
		if(entrada.charAt(p) == '0') {
			p++;
			q1();
		}
		else
			rejeita();			
	}

	private static void rejeita() {
		JOptionPane.showMessageDialog(null, "discagem incorreta", "Rejeitado", JOptionPane.ERROR_MESSAGE);
	}

	private static void q1() {
		char charAtual = entrada.charAt(p);
		if(charAtual == '0') {
			p++;
			q2();			
		}
		else if(charAtual == '1') {
			mensagemFinal = "região parisiense";
			p++;
			q7();
		}
		else if(charAtual == '2') {
			mensagemFinal = "noroeste da França e dependências no Oceano Índico";
			p++;
			q7();			
		}
		else if(charAtual == '3') {
			mensagemFinal = "nordeste da França";
			p++;
			q7();
		}
		else if(charAtual == '4') {
			mensagemFinal = "sudeste da França";
			p++;
			q7();
		}
		else if(charAtual == '5') {
			mensagemFinal = "sudoeste da França ou dependências no Atlântico";
			p++;
			q7();			
		}
		else if(charAtual == '6') {
			mensagemFinal = "telefonia móvel";
			p++;
			q7();
		}
		else if(charAtual == '7') {
			mensagemFinal = "telefones celulares e aparelhos M2M";
			p++;
			q7();
		}
		else if(charAtual == '8') {
			mensagemFinal = "chamadas gratuitas ou de custo compartilhado";
			p++;
			q7();			
		}
		else if(charAtual == '9') {			
			mensagemFinal = "não geográfico(voice over IP)";
			p++;
		}
		else
			rejeita();
	}

	private static void q2() {
		char charAtual = entrada.charAt(p);
		if(charAtual == '1') {
			p++;
			q3();			
		}
		else if(charAtual == '2') {
			p++;
			q8();			
		}
		else
			rejeita();
		
	}

	private static void q8() {
		if(entrada.charAt(p) == '1') {
			p++;
			q4();
		}
	}

	private static void q3() {
		if(entrada.charAt(p) == '5') {
			p++;
			q4();			
		}
		else
			rejeita();
	}

	private static void q4() {
		if(entrada.charAt(p) == '3') {
			p++;
			q5();			
		}
		else
			rejeita();
	}

	private static void q5() {
		if(entrada.charAt(p) == '3') {
			mensagemFinal = "chamada do Brasil para ";
			p++;
			q6();
		}
		else
			rejeita();
	}

	private static void q6() {
		char charAtual = entrada.charAt(p);
		if(charAtual == '1') {
			mensagemFinal += "região parisiense";
			p++;
			q7();
		}else if(charAtual == '2') {
			mensagemFinal += "noroeste da França e dependências no Oceano Índico";
			p++;
			q7();			
		}
		else if(charAtual == '3') {
			mensagemFinal += "nordeste da França";
			p++;
			q7();
		}
		else if(charAtual == '4') {
			mensagemFinal += "sudeste da França";
			p++;
			q7();
		}
		else if(charAtual == '5') {
			mensagemFinal += "sudoeste da França ou dependências no Atlântico";
			p++;
			q7();			
		}
		else if(charAtual == '6') {
			mensagemFinal += "telefonia móvel";
			p++;
			q7();
		}
		else if(charAtual == '7') {
			mensagemFinal += "telefones celulares e aparelhos M2M";
			p++;
			q7();
		}
		else if(charAtual == '8') {
			mensagemFinal += "chamadas gratuitas ou de custo compartilhado";
			p++;
			q7();			
		}
		else if(charAtual == '9') {			
			mensagemFinal += "não geográfico(voice over IP)";
			p++;
		}
		else
			rejeita();
	}

	private static void q7() {
		if(entrada.length() - p == 8)
			JOptionPane.showMessageDialog(null, mensagemFinal, "Aceito", JOptionPane.INFORMATION_MESSAGE);
		else
			rejeita();
	}
}
