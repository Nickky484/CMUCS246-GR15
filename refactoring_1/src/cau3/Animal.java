package cau3;

class Animal {
    String name;
    int height;
    int weight;
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meowing...");
    }
}
