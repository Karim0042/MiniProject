import java.util.Arrays;

public class Pet {


        public String species;
        public String nickName;
        public int age;
        public int trickLevel;
        public String[] habits;

        public void eat(){
            System.out.println("I am eating");
        }

        public void respond(){

            System.out.println("Helo owner. I am -"+this.nickName+"."+" I miss you!");
        }

        public void foul(){
            System.out.println("I need to cover it up");
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickName='" + nickName + '\'' +
                    ", age=" + age +
                    ", trickLevel=" + trickLevel +
                    ", habits=" + Arrays.toString(habits) +
                    '}';
        }
    }

