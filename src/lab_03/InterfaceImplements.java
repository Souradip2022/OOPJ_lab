package lab_03;

import javax.crypto.spec.PSource;

interface Animal{
  void show();
  void getSound();
  static void display(){
    System.out.println("Cannot be inherited");
  }
}

class Dog implements Animal{
  @Override
  public void show(){
    System.out.println("Dog");
  }

  @Override
  public void getSound(){
    System.out.println("I make dog sound");
    Animal.display();
  }

}

class Lion implements Animal{
  @Override
  public void show(){
    System.out.println("Lion");
  }

  @Override
  public void getSound(){
    System.out.println("I make Lion sound");
  }
}

public class InterfaceImplements {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.show();
    dog.getSound();
    Animal.display();
  }
}
