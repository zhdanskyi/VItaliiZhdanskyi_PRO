
import java.util.Scanner;

public class EjerciciosT3 {
    private Scanner sc = new Scanner(System.in);

    //Ejercicios if
    public void Ejercicio1() {
        System.out.println("Introduce el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primero es mayor que el segundo.");
        } else if (numero2 > numero1) {

            System.out.println("El primero no es mayor que el segundo.");
        }
    }

    public void Ejercicio2() {
        System.out.println("Introduce el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = sc.nextInt();

        if (numero1 == numero2 + numero3) {
            System.out.println(numero1 + " = " + numero2 + " + " + numero3);
        } else if (numero2 == numero1 + numero3) {
            System.out.println(numero2 + " = " + numero1 + " + " + numero3);
        } else if (numero3 == numero2 + numero1) {
            System.out.println(numero3 + " = " + numero2 + " + " + numero1);
        } else {
            System.out.println("Ninguno es suma de los otros dos.");
        }
    }

    public void Ejercicio3() {
        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();

        boolean multiplo20 = (numero % 20 == 0);

        boolean estaEntre = (numero >= -100 && numero <= 100);

        if (multiplo20 && estaEntre) {
            System.out.println("Es multiplo de 20 y esta entre -100 y 100");
        } else if (multiplo20 && !estaEntre) {
            System.out.println("Es multiplo de 20 y no esta entre 100 y -100");
        } else if (!multiplo20 && estaEntre) {
            System.out.println("No es multiplo de 20 y esta entre 100 y -100");
        } else if (!multiplo20 && !estaEntre) {
            System.out.println("No es multiplo de 20 y no esta entre 100 y -100");
        }
    }

    public void Ejercicio4() {
        System.out.println("Introduce el año: ");
        int anio = sc.nextInt();

        boolean anioBiestro = (anio % 4 == 0);

        if (anioBiestro) {
            System.out.println("Es biestro.");
        } else {
            System.out.println("No es biestro.");
        }
    }
    public void Ejercicio5(){
        System.out.println("Introduce un numero entre 1000 y 9999: ");
        int numero = sc.nextInt();


        if (numero >= 1000 && numero <= 9999) {

            int primerDigito = numero / 1000;
            int segundoDigito = (numero / 100) % 10;
            int tercerDigito = (numero / 10) % 10;
            int cuartoDigito = numero % 10;


            if (primerDigito == cuartoDigito && segundoDigito == tercerDigito) {
                System.out.println("El numero " + numero + " es capicua");
            } else {
                System.out.println("El numero " + numero + " no es capicua");
            }

        } else {
            System.out.println("El numero debe tener 4 digitos (entre 1000 y 9999)");
        }
    }
    public void Ejercicio6(){

            System.out.println("Introduce tres numeros entre -100 y 100:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num1 >= -100 && num1 <= 100 && num2 >= -100 && num2 <= 100 && num3 >= -100 && num3 <= 100) {
                double suma = 0;

                if (num1 != 0) {
                    suma += 1.0 / num1;
                }
                if (num2 != 0) {
                    suma += 1.0 / num2;
                }
                if (num3 != 0) {
                    suma += 1.0 / num3;
                }

                System.out.println("La suma de los inversos es: " + suma);
            } else {
                System.out.println("Alguno de los numeros no esta entre -100 y 100");
            }
    }
    public void Ejercicio7(){

            System.out.println("Introduce un numero de 3 digitos: ");
            int numero = sc.nextInt();

            if (numero < 100 || numero > 999) {
                System.out.println("El numero no tiene 3 digitos");
            } else {

                int centenas = numero / 100;        // Ej: 153 / 100 = 1
                int decenas = (numero / 10) % 10;   // Ej: 153 / 10 = 15, 15 % 10 = 5
                int unidades = numero % 10;         // Ej: 153 % 10 = 3


                int sumaCubos = (centenas * centenas * centenas) +
                        (decenas * decenas * decenas) +
                        (unidades * unidades * unidades);


                if (sumaCubos == numero) {
                    System.out.println("Es un numero Armstrong");
                } else {
                    System.out.println("No es un numero Armstrong");
                }
        }
    }
    public void Ejercicio8(){
        System.out.println("Introduce tres numeros enteros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        if (a > c) {
            a = a + c;
            c = a - c;
            a = a - c;
        }
        if (b > c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }

        System.out.println("Numeros ordenados: " + a + ", " + b + ", " + c);
    }
    public void Ejercicio9(){
        System.out.println("Introduce tu primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce tu segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce tu tercer numero: ");
        int numero3 = sc.nextInt();

        int min = Math.min(numero1, Math.min(numero2, numero3));
        int max= Math.max(numero1, Math.max(numero2, numero3));


        if (max - min == 2){
            System.out.println("son consecutivos");
        }else{
            System.out.println("No son consecutivos");
        }
    }
    public void Ejercicio10(){
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();



        if (numero % 2 == 0){
            numero++;
            System.out.println("El numero es(incremento): "+numero );
        }else{
            numero--;
            System.out.println("El numero es(decremento): "+numero);
        }
        System.out.println("El numero final es: "+numero);
    }
    public void Ejercicio11(){
        System.out.println("Introduce tres numeros enteros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Ordenar ascendentemente (true) o descendentemente (false):");
        boolean ascendente = sc.nextBoolean();

        int primero = Math.min(a, Math.min(b, c));
        int tercero = Math.max(a, Math.max(b, c));
        int segundo = a + b + c - primero - tercero;

        if (ascendente) {
            System.out.println("Ordenados: " + primero + ", " + segundo + ", " + tercero);
        } else {
            System.out.println("Ordenados: " + tercero + ", " + segundo + ", " + primero);
        }
    }
    public void Ejercicio12(){
        System.out.println("Introduce un numero entero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            numero += 2;
        } else if (numero % 3 == 0) {
            numero += 3;
        } else if (numero % 5 == 0) {
            numero += 5;
        } else {
            numero += 1;
        }

        System.out.println("El nuevo valor es: " + numero);
    }
    public void Ejercicio13(){
        System.out.println("Introduce dia, mes y año:");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        boolean fechaCorrecta = true;

        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else if (dia < 1) {
            fechaCorrecta = false;
        } else {
            if (mes == 2) {
                if (dia > 28) fechaCorrecta = false;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 30) fechaCorrecta = false;
            } else {
                if (dia > 31) fechaCorrecta = false;
            }
        }

        if (fechaCorrecta) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
    public void Ejercicio14(){
        System.out.println("Introduce dia, mes y año:");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        dia++;

        if (mes == 2 && dia > 28) {
            dia = 1;
            mes++;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 1;
            mes++;
        } else if (dia > 31) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            ano++;
        }

        System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + ano);

    }























}
