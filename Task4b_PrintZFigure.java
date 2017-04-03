
public class Task4b_PrintZFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
        for(int row = 2; row < n; row++) {
            for( int col = 0; col < n - row; col++) {
                System.out.print("  ");
                
                
            }
            System.out.println("* ");
        }
        for(int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }    
            
            
        }
        
        
        
    
    
}
