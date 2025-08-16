class Computer
{
    public void PlayMusic()
    {
        System.out.println("Music Playing.......");
    }
    public String getMyPen(int cost)
    {
        if(cost >=10)
            return "pen";
        
        return "Nothing";
    }
}

public class _17_Method
{
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMyPen(10);
        System.out.println(str);

    }
}