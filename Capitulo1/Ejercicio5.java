package Capitulo1;
public class Ejercicio5 {
    public static void main(String[] args){

    String RED = "\033[0;31m"; 
     String GREEN = "\033[0;32m";   
     String YELLOW = "\033[0;33m";  
     String BLUE = "\033[0;34m";    
     String PURPLE = "\033[0;35m";  
     String CYAN = "\033[0;36m";  

        System.out.println("\n Lunes\tMartes\tMiérc\tJueves.\tViernes");
        System.out.println(" ======\t=======\t======\t=======\t=======");
        System.out.println(RED + "PROGRA" + CYAN + "\tSIS" + PURPLE +"\tENTDE" + RED + "\tPROGRA" + BLUE + "\tFOL");
        System.out.println(RED + "PROGRA" + CYAN + "\tSIS" + PURPLE + "\tENTDE" + RED + "\tPROGRA" + BLUE + "\tFOL");
        System.out.println(GREEN + "LYM" + CYAN + "\tSIS" + RED + "\tPROG" + GREEN + "\tLYM" + BLUE + "\tFOL");
        System.out.println(GREEN + "LYM" + RED + "\tPROGRA" + RED + "\tPROG" + GREEN + "\tLYM"+ CYAN + "\tSIS");
        System.out.println(YELLOW + "BBDD" + RED + "\tPROGRA" + YELLOW + "\tBBDD" + YELLOW + "\tBBDD" + CYAN + "\tSIS");
        System.out.println(YELLOW + "BBDD" + PURPLE + "\tENTDE" + YELLOW + "\tBBDD" + YELLOW + "\tBBDD" + CYAN + "\tSIS"); 
        }
}
