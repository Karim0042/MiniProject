public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Eric";
        h.surname = "Wick";
        h.schedule = new String[][]{{"Monday","Sunday"},{"Walking with pet","Work","Training"}};
        h.father=new Human();
//        Human h2 = new Human("Nicat","asda",2,2,new Pet(),new Human(),new Human(),new String[][]{});
        h.father.name= "John";
        h.mother=new Human();
        h.mother.name="Jane";
        h.pet = new Pet();
        h.pet.nickName="Hac";
        h.pet.trickLevel =56;

        h.describePet();
        h.greetPet();
        h.pet.eat();
        h.pet.respond();
        h.pet.foul();



    }
}
