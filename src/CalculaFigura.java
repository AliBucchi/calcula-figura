import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static java.lang.Math.pow;

public class CalculaFigura {
    public static void main (String[] args) {
        String escolhaFigura;

        double areaQuadrado, areaCirculo, areaTriangulo, areaPoligono;
        double raio, ladoQuadrado, base, altura, numeroLadoPoligono, ladoPoligono;

        String raioStr;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        escolhaFigura = JOptionPane.showInputDialog(null, "1: quadrado, 2: circulo, 3: triangulo, 4: poligono de n lados",
                "Escolha a figura a calcular a área:",
                JOptionPane.QUESTION_MESSAGE);

        switch (escolhaFigura) {
            case "1" -> {
                ladoQuadrado = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Escreva o lado do quadrado (em cm):",
                        "Cálculo da área do quadrado",
                        JOptionPane.QUESTION_MESSAGE));

                areaQuadrado = pow(ladoQuadrado, 2);

                JOptionPane.showMessageDialog(null,
                        "A área do quadrado " + " é de " + df.format(areaQuadrado) + " cm2",
                        "Área do quadrado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            case "2" -> {
                raioStr = JOptionPane.showInputDialog(null,
                        "Escreva o raio do circulo (em cm):",
                        "Cálculo da área do circulo",
                        JOptionPane.QUESTION_MESSAGE);

                raio = Double.parseDouble(raioStr);
                areaCirculo = Math.PI * pow(raio, 2);

                JOptionPane.showMessageDialog(null,
                        "A área do circulo de raio " +
                                df.format(raio) + " é de " +
                                df.format(areaCirculo) + " cm2",
                        "Área do circulo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            case "3" -> {
                base = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Escreva a base do triangulo (em cm):", null ,JOptionPane.QUESTION_MESSAGE));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Escreva a altura do triangulo (em cm)", null, JOptionPane.QUESTION_MESSAGE));

                areaTriangulo = (base * altura) / 2;

                JOptionPane.showMessageDialog(null,
                        "A área do triangulo " + " é de " + df.format(areaTriangulo) + " cm2",
                        "Área do triangulo",
                        JOptionPane.INFORMATION_MESSAGE);

            }
            case "4" -> {
                numeroLadoPoligono = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Escreva o numero de lados do poligono:", null,
                        JOptionPane.QUESTION_MESSAGE));
                ladoPoligono = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Escreva o lado do poligono (em cm):",
                        "Cálculo da área do poligono",
                        JOptionPane.QUESTION_MESSAGE));


                areaPoligono = (numeroLadoPoligono * ladoPoligono);

                JOptionPane.showMessageDialog(null,
                        "A área do poligono " + " é de " + df.format(areaPoligono) + " cm2",
                        "Área do poligono",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}