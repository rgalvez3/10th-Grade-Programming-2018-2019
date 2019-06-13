import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        
        
        System.out.println("Welcome to game... type right left up down to move x");
        String[][] gameb = { {"O","O","O","O"}, {"O","O","O","O"}, {"O","O","O","O"}, {"O","O","O","O"}};
        
        int random1 = (int)(Math.random()*4);
        int random2 = (int)(Math.random()*4);
        
        while (random1 == 0 && random2 ==0){
            random1 = (int)(Math.random()*4);
            random2 = (int)(Math.random()*4);
        }
        
        System.out.println(random1 + " " + random2);
        
        int x = 0;
        int y = 0;
        
        gameb[y][x]="x";
        gameb[random1][random2]="*";
        
        for(int row = 0; row < gameb.length; row++){
            for(int col = 0; col < gameb[0].length; col++){
                
                System.out.print(gameb[row][col] + " ");
            }
            System.out.println();
        }
        
        while (x != random2 && y!= random1){
            System.out.println("imput your direction");
            String direct = kin.nextLine();
            
            if(direct=="down");{
                y ++;
                printit(gameb);
            }
            
            if(direct=="up");{
                y --;
                printit(gameb);
            }
            if(direct=="left");{
                x --;
                printit(gameb);
            }
            if(direct=="right");{
                x ++;
                printit(gameb);
            }
        }
        if (x == random2 && y== random1){
            System.out.print("You won");
        }
        
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
