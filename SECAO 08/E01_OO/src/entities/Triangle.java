package entities;

public class Triangle {
    public double A;
    public double B;
    public double C;

    public double area() {
        double p = (A +  B + C) / 2.0;
        double resultado = Math.sqrt(p * (p - A) * (p - B) * (p - C));
        return resultado;
    }
}
