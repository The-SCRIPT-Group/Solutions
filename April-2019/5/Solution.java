import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.valueOf(br.readLine());
        // A map to store the input, as it is in phrase:meaning (key:value) format
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 1; i <= lines; i++) {
            // Split the input into a 2 element string array using split(), and ':' as a delimiter
            String arr[] = br.readLine().split(":");
            // Add the 2 elements of the array (the phrase and its meaning) into the map
            hashMap.put(arr[0], arr[1]);
        }
        // Accept the phrase
        String phrase = br.readLine();
        // Split the phrase into individual words
        String words[] = phrase.split(" ");
        // containsKey() let's us check if the parameter exists as a key
        // Check if the entire phrase is a key
        // If so, print out the value corresponding to the phrase
        if (hashMap.containsKey(phrase)) {
            System.out.println(hashMap.get(phrase));
        // Check if the first 2 words in the input phrase are a key
        } else if (hashMap.containsKey(words[0]+" "+words[1])) {
            System.out.println(hashMap.get(words[0]+" "+words[1])+" "+hashMap.get(words[2]));
        // Check if the last 2 words in the input phrase are a key
        } else if (hashMap.containsKey(words[1]+" "+words[2])) {
            System.out.println(hashMap.get(words[0])+" "+hashMap.get(words[1]+" "+words[2]));
        // Otherwise, each of the individual phrases will be keys. Display them.
        } else {
            System.out.println(hashMap.get(words[0])+" "+hashMap.get(words[1])+" "+hashMap.get(words[2]));
        }
    }
}