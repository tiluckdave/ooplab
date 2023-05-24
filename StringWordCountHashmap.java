// Write a Java Program to count the number of words in a string using HashMap.Output:
// Input :Enter String: "This this is is done by Saket Saket";
// {Saket=2, by=1, this=1, This=1, is=2, done=1}


import java.util.HashMap;

public class StringWordCountHashmap {
    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket ";
        String[] arr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}