package calculoscirculo;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            this.raio = 1;
        }
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public void exibirResultados() {
        System.out.println("Per�metro do c�rculo: " + calcularPerimetro());
        System.out.println("�rea do c�rculo: " + calcularArea());
        System.out.println("Di�metro do c�rculo: " + calcularDiametro());
    }

}
