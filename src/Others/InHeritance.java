package Others;

public class InHeritance {
    public static void main(String[] args) {
        Shiba shiba = new Shiba();
        shiba.canWalk();
        shiba.canBark();
        shiba.isJapanese();
    }
}
class Animals{
    public void canWalk(){
        System.out.println("Animals Can Walk");
    }
}
class Dog extends Animals{

    public void canBark(){
        System.out.println("Dogs can Bark");
    }
}
class Shiba extends Dog{
    public void isJapanese(){
        System.out.println("Shiba Is Japanese");
    }
}

class Cat extends Animals{
}
