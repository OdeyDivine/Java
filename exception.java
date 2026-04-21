public class exception{
    public static void main(String[] args){
        String name = "Odey";
        int x;
        try{
             x = Integer.parseInt(name);
            System.out.println("The name is an Integer ");
        }
        catch(NumberFormatException e){
            System.out.println("That is not a number");
        }

    }
}