public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Eric";
        h.surname = "Wick";
        h.father.name= "John";
        h.mother.name="Jane";
        h.pet = new Pet();
        h.pet.nickName="Hac";
        h.pet.trickLevel =56;

        System.out.println(h.toString());
        System.out.println(h.mother.toString());
        System.out.println(h.father.toString());
        System.out.println(h.pet.toString());




    }
}
