import javax.swing.JOptionPane;

public class TesteSobrecarga {

    public static void main(String[] args) {
        double n1,n2,n3,maior;
        // testando o primeiro método
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        ExemplosSobrecarga e1 = new ExemplosSobrecarga();
        maior = e1.calculaNumeroMaior(n1, n2);
        JOptionPane.showMessageDialog(null,"Maior número digitado: " + maior);

        // testando o segundo método
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

        ExemplosSobrecarga e2 = new ExemplosSobrecarga();
        maior = e2.calculaNumeroMaior(n1, n2, n3);
        JOptionPane.showMessageDialog(null,"Maior número digitado: " + maior);
    }
}
