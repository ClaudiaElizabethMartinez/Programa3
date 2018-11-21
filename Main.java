package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	    public static Cubo cubo;
	    public static double aux;
	    public static void main(String[] args){

	        Scanner scanner = new Scanner(System.in);
	        

	        init ();


	        loop ();


	        scanner.nextLine();


	    }


	    private static void loop(){

	        int  opt =get_menu();

	        while(opt != 5)
	        {
	            aux = calculate(opt ,cubo);

	            System.out.println("El valor es " +aux+ "\n");

	            opt = get_menu ();
	        }



	        init ();
	        loop ();
	    }


	    private static void init(){
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el valor de un lado:\t");
	        try{
	            double lado  = Double.parseDouble( scanner.nextLine());
	            cubo = new Cubo(lado);
	        }
	        catch (NumberFormatException nfe){
	            System.out.println ("El valor debe de ser un entero");
	            init ();
	        }



	    }


	    public static double calculate( int opt, Cubo cubo){

	        double result = 0;
	        switch (opt){
	            case 1: result =cubo.calcularPerimetro(true); 
	            break;
	            case 2: result = cubo.calcularArea();
	            break;
	            case 3: result = cubo.calcularVolumen();
	            break;
	            case 4: result = cubo.calcularPerimetro(false);
	            break;
	            case 5: init();
	            break;
	            case 6: System.out.println ("Haz salido de la aplicacion");
	            System.exit (0);
	            break;

	        }
	        return result;
	    }

	    public static int get_menu(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.print ("Elige una opcion : \n");
	        System.out.print ("1.- Perímetro cuadrado \n");
	        System.out.print ("2.- Calcular área\n");
	        System.out.print ("3.- Calcular Volúmen\n");
	        System.out.print ("4.- Calcular Perímetro cubo\n");
	        System.out.print ("5.- Reinicio \n");
	        System.out.print ("6.- Salir del programa \n");

	        int opt  = Integer.parseInt( scanner.nextLine());
	        return opt;
	    }

}