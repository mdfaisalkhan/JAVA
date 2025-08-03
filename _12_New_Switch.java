class _12_New_Switch
{
    public static void main(String args[])
    {

        //---Nowmal Switch ----
        
        String day = "Monday";

        // switch(day){
        //     case "Saturday" , "Sunday":
        //         System.out.println("5AM");
        //         break;

        //     case "Monday":
        //         System.out.println("7AM");
        //         break;

        //     default:
        //         System.out.println("8AM");

        // }

        // -----NEW SWITCH STATEMENT----

        switch(day){

            case "Saturday","Sunday" -> System.out.println("9AM");
            case "Monday" -> System.out.println("7AM");
            default -> System.out.println("10AM");
        }

        //-- Using switch to return values---

        String result ="";

        switch(day){

            case "Saturday","Sunday" -> result = "9AM";
            case "Monday" ->  result = "8AM";
            default ->  result = "7AM";
        }
        System.out.print("Assign Print -> ");
        System.out.println(result);

        //----using Switch to direct return--

        result = switch(day)
        {
            case "Saturday","Sunday" -> "6AM";
            case "Monday"-> "8AM";
            default -> "7AM";
        };
        System.out.print("Direct Print -> ");
        System.out.println(result);

// if you want switch as a expression but don't want to use arrow
        result = switch(day)
        {
            case "Saturday","Sunday": yield "6AM";
            case "Monday": yield "8AM";
            default : yield "7AM";
        };
        System.out.print("Direct Print -> ");
        System.out.println(result);
    }
}
