import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;

    public Pet pet;
    public Human mother;

    public Human father;

    public String[][] schedule;
    public Human(){

    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    public void greetPet(){

        System.out.println("Hello"+pet.nickName);
    }
    public void describePet(){

        System.out.print("Info about Pet "+":"+"I have a"+pet.species+",he is "+pet.age+"years old ,he is");

        if(pet.trickLevel>=50){
            System.out.print(" very sly");
        }else {
            System.out.println(" almost not sly.");
        }


    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother.name +
                ", father=" + father.name +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}