package tn.esprit.gestionzoo.entities;

public class Animal {
    
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
    
    public Animal(String family, String name, int age, boolean isMammal){
        if(age > 0){
            this.family=family;
            this.name=name;
            this.age=age;
            this.isMammal=isMammal;
        }

        else{
            System.out.println("Un animal ne peut pas avoir un âge négatif.");
        }
    }

    public String getName() {

        return name;
    }

    public String getFamily(){

        return family;
    }

    public int getAge(){

        return age;
    }

    public boolean getIsMammal(){

        return isMammal;
    }

    public void setAge(int age) {
        if(age >0)
        this.age = age;
    }

    public void setFamily(String family) {

        this.family = family;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void isMammal( boolean isMammal) {

        this.isMammal= isMammal;
    }

    @Override
    public String toString() {
        return "Animal { " +
                "family=' " + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
