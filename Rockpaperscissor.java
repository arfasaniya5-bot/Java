import java.util.Scanner;
 class Rockpaperscissor {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your move: ");
        int human=sc.nextInt();
        switch(human){
            case 1 -> System.out.println("you have choosen rock now");
            case 2 -> System.out.println("you have choosen paper now");
            case 3 -> System.out.println("you have choosen scissor now");
            default-> System.out.println("you are move is invalid");
        }
        int max=3;
        int min=1;
        int x=(int)(Math.random()*(max-min+1)+min);
        switch(x){
            case 1 -> System.out.println("computer have choosen rock now");
            case 2 -> System.out.println("computer have choosen paper now");
            case 3 -> System.out.println("computer have choosen scissor now");
        }
        if(human==x){
            System.out.println("match tie");
        }
        else if((human==1 && x==2) || (human==2 && x==3) || (human==3 && x==1)){
            System.out.println("Computer wins");
            System.out.println("human lost");

        }
        else if((human==2 && x==1) || (human==3 && x==2) || (human==1 && x==3)){
            System.out.println("Human wins");
            System.out.println("Computer lost");
        }
        else{
            System.out.println("Invalid move,choose the correct move");
        }
    }

}
     
    

