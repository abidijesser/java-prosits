package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends Exception{

    public InvalidAgeException(){
        super("C'est interdit d'ajouter un a animal ayant un âge négatif");
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
