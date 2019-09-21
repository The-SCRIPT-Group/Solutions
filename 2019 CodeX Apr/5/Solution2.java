import java.util.Scanner;

public class Solution2 {
    
    //function to check if a phrase exists as key
    public static boolean exists(String phrase, String [][] d){
        for(int i=0; i<d.length; i++){
            if(d[i][0].equals(phrase)){
                return true;
            }
        }
        return false;
    }
    
    //function to find the translation of a phrase from dictionary
    public static String translate(String phrase, String [][] d){
        for(int i=0; i<d.length; i++){
            if(d[i][0].equals(phrase)){
                return (d[i][1]);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   //number of entries in the dictionary
        sc.nextLine();  //just to make sure we don't take "\n" during dictionary input

        String[][] d = new String[n][2];    //dictionary
        String[] line;   //temp variable for taking input
        
        for(int i=0; i<n; i++){
            line = sc.nextLine().split(":");
            //split function will basically split the string into two parts, around the given expression.
            //here given expression is ":", so the two split strings will be what came before the ":" (key) and
            //what came after the ":" (value)
            
            d[i][0] = line[0];  //key
            d[i][1] = line[1];  //value
        }
        
        String[] phrase = sc.nextLine().split(" ");    //to store the phrase we have to translate
        
        //if the entire phrase exists as key in dictionary
        if(exists((phrase[0]+" "+phrase[1]+" "+phrase[2]), d)){
            System.out.print(translate((phrase[0]+" "+phrase[1]+" "+phrase[2]), d));
        }

        //if the first two words and the third words exist as key in dictionary
        else if(exists((phrase[0]+" "+phrase[1]), d)){
            System.out.print(translate((phrase[0]+" "+phrase[1]), d) + " " + translate(phrase[2], d));
        }
        
        //if the first word and the last two words exist as key in dictionary
        else if(exists(phrase[1]+" "+phrase[2], d)){
            System.out.print(translate(phrase[0], d) + " " + translate(phrase[1]+" "+phrase[2], d));
        }
        
        //if all three words exist as key in dictionary
        else{
            System.out.print(translate(phrase[0], d) + " " + translate(phrase[1], d) + " " + translate(phrase[2], d));
        }
        
        sc.close();
        
    }
}
