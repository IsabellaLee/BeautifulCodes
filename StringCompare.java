
//Given a string, find out the lexicographically smallest and largest substring of length.



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = sc.nextInt();
        
        SortedSet<String> ss = new TreeSet<String>();
        
        for(int i =0; i<=s.length()-l;i++){
            ss.add(s.substring(i,i+l));
        }
        
        System.out.println(ss.first());
        System.out.println(ss.last());
    
    }
}
