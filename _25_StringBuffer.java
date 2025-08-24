public class _25_StringBuffer
{
      
  public static void main (String args[])
    {
        StringBuffer sb = new StringBuffer("Faisal");  
        // System.out.println(sb.capacity()); // 21 capacity
        System.out.println(sb.length());
        sb.append(" Khan");
        System.out.println(sb);  //Faisal Khan

        sb. deleteCharAt(2);       // Delete 'a' from faisal 
        System.out.println(sb); 

        sb.insert(0, "Java ");  // insert 'Java'
        System.out.println(sb); 

        sb.setLength(30); // add extra length

        sb.ensureCapacity(100); // minimum capacity 100

        String str = sb.toString();  //to convert Stringbuffer data to string 
      System.out.println(str);


          
    }
}