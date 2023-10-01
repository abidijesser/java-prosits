import java.util.Scanner;
public class ZooManagement {

    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {

        ZooManagement zoo1 = new ZooManagement();
        System.out.println("la Zoo "+zoo1.zooName +" comporte " + zoo1.nbrCages);



        System.out.println("-------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le nombre de cages :");
        int nbrCagessaisie = sc.nextInt();

        ZooManagement zoo2 = new ZooManagement();
        zoo2.nbrCages = nbrCagessaisie;
        //Etape optionelle
        zoo2.zooName = "notMyZoo";
        System.out.println(zoo2.zooName + " comporte " + zoo2.nbrCages);
    }
}