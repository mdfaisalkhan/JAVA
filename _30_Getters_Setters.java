class Car
{
    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        // The this keyword refers to the current object in a method or constructor.
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
public class _30_Getters_Setters 
{
  
   public static void main(String args[])
   {
       Car obj1 = new Car();

       obj1.setName("BMW");
       obj1.setPrice(1200000);

       System.out.println(obj1.getName()+ " : "+ obj1.getPrice());

       
   }
  

}

