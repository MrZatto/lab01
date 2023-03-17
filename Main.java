import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Zadanie 1: ");
        zad1();

        System.out.println("Zadanie 2: ");
        zad2();

        System.out.println("Zadanie 3: ");

        System.out.print("Podaj liczbe: ");
        int liczba = input.nextInt();
        System.out.println("Czy liczba " + liczba + " jest parzysta?");
        System.out.println(parzystosc(liczba));

        System.out.println("Zadanie 4: ");

        System.out.print("Podaj liczbę: ");
        int liczba1= input.nextInt();
        System.out.println("Czy liczba " + liczba1 + " jest podzielna przez 3 i 5 ?");
        System.out.println(podzielnosc(liczba1));

        System.out.println("Zadanie 5");

        System.out.print("Podaj liczbę: ");
        int liczba2= input.nextInt();
        System.out.println("Liczba " +liczba2 + " podniesiona do ^3 to : " + potega(liczba2));

        System.out.println("Zadanie 6 ");

        System.out.print("Poda liczbę: ");
        double liczba3 = input.nextDouble();
        System.out.println("Pierwiastek kwadratowy tej liczby to: " +pierwiastek(liczba3));

        System.out.println("Zadanie 7 ");

        System.out.print("Podaj 1. bok ");
        double a1 = input.nextDouble();

        System.out.print("Podaj 2. bok ");
        double b1 = input.nextDouble();

        System.out.print("Podaj 3. bok ");
        double c1 = input.nextDouble();

        System.out.print("Czy z boków " + a1 +" " + b1 + " " + c1 + " mozna stworzyc trojkat? \n");
        System.out.println(trojkat(a1,b1,c1));
    }
    public static void zad1() {

        Scanner input1 = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie= input1.nextLine();
        System.out.print("Podaj swój wiek: ");
        int wiek = input1.nextInt();
        System.out.println("Imie: " + imie + "\nWiek: " + wiek);
    }
    public static void zad2() {
        Scanner input2 = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = input2.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = input2.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica : " + (a - b));
        System.out.println("Iloczyn : " + (a * b));
    }
    public static boolean parzystosc(int liczba) {
        return (liczba % 2 == 0);
    }
    public static boolean podzielnosc(int liczba1){
        return (liczba1 % 3 == 0 && liczba1 % 5 == 0);
    }
    public static int potega(int liczba2){
        return (int) Math.pow(liczba2,3);
    }
    public static double pierwiastek(double liczba3){
        return Math.sqrt(liczba3);
    }
    public static boolean trojkat(double a1, double b1, double c1){
        double max, a2,b2;
        if (a1 > b1) {
            if (a1 > c1) {
                a2=b1; b2 =c1; max = a1;
            } else {
                a2 = a1; b2 = b1; max = c1;
            }
        } else {
            if (b1 > c1) {
                a2 = a1; b2 = c1; max = b1;
            } else {
                a2 = a1; b2 = b1; max = c1;
            }
        }
        return (Math.pow(a2,2) + Math.pow(b2,2) == Math.pow(max,2));
    }


}