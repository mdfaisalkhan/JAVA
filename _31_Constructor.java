
class Person
{
    int age;
    String name;

    public Person()  //Constructor 
    {
        name = "Ravi";
        age = 43;

    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age =age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

}
public class _31_Constructor 
{
    public static void main(String args[])
    {
        Person p1 = new Person();
        // p1.setAge(23);
        // p1.setName("Sonu");

        System.out.println(p1.getAge()+" : "+p1.getName());
    }
}
