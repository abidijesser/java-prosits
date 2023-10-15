package tn.esprit.gestionzoo.entities;

non-sealed public class Penguin extends Terrestrial{

    public float swimmingDepth ;

    public Penguin(String family, String name, int age, boolean isMammal, int nbrLegs, float swimmingDepth){
        super(family, name, age, isMammal, nbrLegs);
        this.swimmingDepth=swimmingDepth;
    }

    @Override
    public  String toString(){
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat= '" +nbrLegs + "'"+
                ", profondeur= '" +swimmingDepth+
                '}';
    }
}
