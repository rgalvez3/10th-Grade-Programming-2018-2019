public class RandomArray {
    public static void main(String[] args) {
        
        
        int[] randomarr = new int[20];
        for (int i = 0; i < randomarr.length; i++) {
            randomarr[i]= (int) (Math.random()*100);
            System.out.println(randomarr[i]);
            
        }
    }
}
