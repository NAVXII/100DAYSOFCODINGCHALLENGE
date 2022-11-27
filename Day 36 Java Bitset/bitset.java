import java.io.*;
import java.util.*;

public class Solution {
    private static final String AND = "AND";
    private static final String OR = "OR";
    private static final String XOR = "XOR";
    private static final String FLIP = "FLIP";
    private static final String SET = "SET";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet set1 = new BitSet(n);
        BitSet set2 = new BitSet(n);
        for(int i=0; i<m; i++){
            String op = in.next();
            int operand1 = in.nextInt();
            int operand2 = in.nextInt();
            if(op.equals(AND)){
                if(operand1 == 1){
                    set1.and(set2);
                }
                else{
                    set2.and(set1);
                }
            }
            else if(op.equals(OR)){
                if(operand1 == 1){
                    set1.or(set2);
                }
                else{
                    set2.or(set1);
                }
            }
            else if(op.equals(XOR)){
                if(operand1 == 1){
                    set1.xor(set2);
                }
                else{
                    set2.xor(set1);
                }
            }
            else if(op.equals(FLIP)){
                if(operand1 == 1){
                    set1.flip(operand2);
                }
                else{
                    set2.flip(operand2);
                }
            }
            else if(op.equals(SET)){
                if(operand1 == 1){
                    set1.set(operand2, true);
                }
                else{
                    set2.set(operand2, true);
                }
            }
            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }
    }
}
