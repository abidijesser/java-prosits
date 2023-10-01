import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {

        System.out.println("Soyez les bienvenus !!");
        System.out.println("0: Gérant");
        System.out.println("1: Client");

        Scanner scanner = new Scanner(System.in);

        int choixUtilisateur= scanner.nextInt();


        if (choixUtilisateur==0)
        {
            System.out.println("choisir une action a faire:");
            System.out.println("0: Ajouter un article");
            System.out.println("1: Modifier un article");
            System.out.println("2: Consulter les articles");
            System.out.println("3: Supprimer un article");

            int choix= scanner.nextInt();
            if(choix==0){
                System.out.println("aasba lik");
            }
            else if(choix==1){
                System.out.println("yeddek fyh");
            }
            else if(choix==2){
                System.out.println("aasba marra okhra");
            }
            else if(choix==3){
                System.out.println("yeddek fyh zeda");
            }
            else
                System.out.println("cette action n'est pas autorisée");

        }
        else if (choixUtilisateur==1)
        {
            System.out.println("Bonjour cher/chère client(e)");
        }
        else
            System.out.println("Cette action n’est pas autorisée");
    }
}