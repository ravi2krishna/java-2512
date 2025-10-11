package fourteen_polymorphism;

public class Animal {

    public void sound(){
        System.out.println("Animal Making Sound");
    }

}

class Cat extends Animal {

    @Override
    public void sound(){
        System.out.println("Cat Sounds Meow");
    }

}

class Dog extends Animal {

    @Override
    public void sound(){
        System.out.println("Dog Sounds Bow");
    }

}

class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

    dog.sound();
    cat.sound();
        
    }

}
