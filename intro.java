public class intro{
    public static void main(String[] args){
       System.out.println("Hello world");

        //Variables and Datatypes
       String name = "Divine";
       int num = 5;
       double twice = 6.9;
       char first_initial = 'D';
       boolean isHome = false;

       System.out.println(name);
       System.out.println(num);
       System.out.println(twice);
       System.out.println(first_initial);
       System.out.println(isHome);

       //Conditionals

       if(name.equals("Divine")){
        System.out.println("Welcome buddy to our community");
       }else{
        System.out.println("You are not recognised here");
       }

       if (num > 10){
        System.out.println("You are eligble to enter the venue");
       }else{
        System.out.println("Please step aside for safety reasons");
       }

       //Looping
       
       //while loop
       while (num < 10){
        System.out.println(num);
        num++;
       }

       //for loop
       for(int i = 0; i <= 20; i++){
        System.out.println(i);
       }

       //do_while loop

       int x = 1;
       do{
        System.out.println(x);
        x++;
       }while(x<=10);
    }
}