import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        
        
        System.out.println("Welcome to game... type right left up down to move x");
        String[][] gameb = { {"O","O","O","O"}, {"O","O","O","O"}, {"O","O","O","O"}, {"O","O","O","O"}};
        
        int random1 = (int)(Math.random()*4);
        int random2 = (int)(Math.random()*4); //These two lines will create random numbers, 0 through 4 for the postion of the asterisks
        
        //System.out.println(random1 + " " + random2); this line of code was used to detect problems we had in the code regarding postion of the asterisks
        
        int x = 0;
        int y = 0;
        
        gameb[y][x]="x";//postion of the player sprite
        gameb[random1][random2]="*";//postion of the goal
        
        int wins = random1 + random2;
        int coor = x + y;// These two coordinates were used for the while loop that went through all the players actions
        
        if (wins == 0){
            random1 = 1;
            random2 = 1;
        }//This will change the postion of the asterisks if its at 0,0
        
        printit(gameb);
        
        
        while(y != random1 || x != random2){
            System.out.println("imput your direction:");
            String direct = kin.nextLine();
            
            if(direct.equals("down")){
                gameb[y][x] = "O";
                y = y + 1;
                gameb[y][x] = "x";
            }
            if(direct.equals("up")){
                gameb[y][x] = "O";
                y = y - 1;
                gameb[y][x] = "x";
            }
            if(direct.equals("right")){
                gameb[y][x] = "O";
                x = x + 1;
                gameb[y][x] = "x";
            }
            if(direct.equals("left")){
                gameb[y][x] = "O";
                x = x - 1;
                gameb[y][x] = "x";
            }
            
            printit(gameb);
            
            
            
        }
        if (x == random2 && y== random1){
            System.out.print("You won");}
    }
    public static void printit(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int in = 0; in < arr[0].length; in++){
                System.out.print(arr[i][in] + " ");
            }
            System.out.println();
        }
    }
}
