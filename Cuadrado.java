package modelo;

public class Cuadrado {
	public double x;

    public  Cuadrado(double lado) {
        this.x =  lado;
    }




    public  double calcularArea(){
        return this.x * this.x;
    }

    public  double calcularPerimetro()
    {
        return this.x *4;
    }
}

