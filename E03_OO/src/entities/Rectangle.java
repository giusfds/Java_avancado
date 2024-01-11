package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        // metodo para calcular a area
        return width * height;
    }

    public double Perimetro(){
        // metodo para calcular o perimetro
        return 2 * (width + height);
    }

    public double Diagonal(){
        // metodo para calcular a diagonal
        return Math.sqrt(width * width + height * height);
    }
}
