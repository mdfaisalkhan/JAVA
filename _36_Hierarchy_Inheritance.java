class Animal 
{
    public void eat()
    {
        System.out.println("This Anime eat food");
    }
}
class Dog extends Animal
{     
    public void barks(){
        System.out.println("Dog is barking....");
    }
}
class Cat extends Animal {
    public void meow()
    {
        System.out.println("Cat is meowing....");
    }
}
class Bird extends Animal
{
    public void flying()
    {
        System.out.println("Bird is Flying....");
    }
}
public class _36_Hierarchy_Inheritance
{
    public static void main (String arg[])
    {
         Dog myDog = new Dog();
         Cat myCat = new Cat();
         Bird myBird  = new Bird();

         myDog.eat();
         myCat.eat();
         myBird.eat();

         myDog.barks();
         myCat.meow();
         myBird.flying();

    }
}
