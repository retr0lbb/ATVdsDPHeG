package AtvDsGuilherme_e_henrique;
import javax.swing.JOptionPane;

public class Exercicios04{
		public static void main(String args[]) {
			String aux;
			float largura, area, altura;
			try {
				aux = javax.swing.JOptionPane.showInputDialog("Entre com a altura: ");
				altura = Float.parseFloat(aux);
				aux = JOptionPane.showInputDialog("Entre com o largura: ");
				largura = Float.parseFloat(aux);
				area = largura * altura;
				JOptionPane.showMessageDialog( null, "sua area � "+area+"/M�");
			} catch (NumberFormatException erro) {
				javax.swing.JOptionPane.showMessageDialog( null, "Houve erro na convers�o, digite apenas caracteres num�ricos!" + erro.toString());
			}
			System.exit(0);
		}
	}

