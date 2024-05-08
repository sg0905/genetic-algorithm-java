
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.Random;
class genetic_algorithm{
    
    private static final int pop_size =50;
    private static final int gene_length = 5;
    private static final double max_val= 5.12;
    private static final double mutation =0.1;
    private static final int max_gen=1000;

    private static Random random = new Random();
    private static class Chromosome {
        double gene[];
        double fitness;

        Chromosome(){

        }
    }


    private static double objectiveFunction(double []x)
    {
        double sum=0;
        for(double value :x)
        {
            sum=sum + Math.pow(value,2);
        }
        return sum;
    }
    
    
    
    
    
    public static void main(String args[]){

    }

}