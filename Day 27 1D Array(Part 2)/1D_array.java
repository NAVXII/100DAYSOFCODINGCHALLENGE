import java.util.*;

            public class Solution {
            
                public static boolean canWin(int leap, int[] game) {
                
                int[] directions = new int[]{1,-1,leap};
            
                LinkedList<Integer> arr = new LinkedList<>();
                arr.add(0);
            
                int i = 0;
                while(!arr.isEmpty()) {                
                    game[i] = 1;
                    i = arr.poll();
                    for(int d = 0; d < directions.length; d++) {
                        int c = i + directions[d];                
                        if(c >= game.length) return true;
                        if(c >= 0 && game[c]==0) {
                            arr.add(c);
                        }              
                    }            
                }
            
                return false;
            }
            
            
                public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    int q = scan.nextInt();
                    while (q-- > 0) {
                        int n = scan.nextInt();
                        int leap = scan.nextInt();
                        
                        int[] game = new int[n];
                        for (int i = 0; i < n; i++) {
                            game[i] = scan.nextInt();
                        }
            
                        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
                    }
                    scan.close();
                }
            }
