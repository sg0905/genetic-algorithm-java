
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.Random;
class genetic_algorithm{
    
    private static final int pop_size =50;
    private static final int chromosome_length = 10;
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
        int population [][]= initializePopulation();
        int generation = 0;

        while (generation < max_gen)
        {
            int [][] newPopulation= new int [pop_size][chromosome_length];
            for(int i =0; i< pop_size; i++){
                int parent1[]= tournamentSelection(population);
                int parent2 []= tournamentSelection(population);
                int offspring[]= crossover(parent1, parent2);
                mutate (offspring);
                newPopulation =offspring;
            }
            population=newPopulation;
            generation++;
            System.out.println("Generation "+ generation+ " Fitness: "+ getFitness(population));
        }
    }
    private static int [][] initializePopulation(){
        int [][] population=new int [pop_size][chromosome_length];
        Random rand =new Random();
        for(int i=0;i<pop_size;i++){
            for(int j=0;j<chromosome_length;j++)
            {
                population[i][j]= rand.nextInt(2);
            }
        }
        return population;
    }

}