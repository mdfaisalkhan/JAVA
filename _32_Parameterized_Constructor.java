class Student
{
    int rollNo;
    String name;

    public Student(String n, int r)   // Parameterized Constructor
    {
        this.rollNo = r;
        this.name = n;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class _32_Parameterized_Constructor {
    public static void main(String args[])
    {
        Student s1 = new Student("Faisal",1);
        s1.setName("Ajay");
        s1.setRollNo(1);

        Student s2 = new Student("Dilkash",4);
        // s2.setName("Bharat");
        // s2.setRollNo(2);
        
        System.out.println(s1.getName()+" : "+s1.getRollNo());
        System.out.println(s2.getName()+" : "+s2.getRollNo());
        
    }
}
