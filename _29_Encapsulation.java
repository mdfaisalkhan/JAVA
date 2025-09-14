 class Human        // Binding the data with methods
{
    private int age;
    private String name; 

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)       
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
public class _29_Encapsulation
{
   public static void main(String args[])
   {
        Human obj = new Human();  

        obj.setAge(34);
        obj.setName("Faisal");

        System.out.println(obj.getAge()+" : "+ obj.getName());
   }
  

}