// for solving String question you need to know some basic methods of string good to know 
// .equals , .substring , indexOf() , toCharArray() , .charAt() , .concat() , .replace() , 
// . compareTo() , .strip() , valueOf()

class Solution {
    public String gcdOfStrings(String str1, String str2) {
     
        // return the largest string which divides both 
        //start from the smaller string and then check if the larger string has the smaller string two time s
        // consider all edge cases // developers practice 
        int m = str1.length() , n = str2.length();
        if(n>m) return gcdOfStrings(str2 , str1);
        // if(str1==str2)
        // {
        //     return str1;
        // }
        // don't   use this way of comparing the two strings 
        // use comare method .equals
        
        if(str1.equals(str2))
        {
            return str1;
        }
        
        if(str1.startsWith(str2))
        {
           String st =  str1.substring(n);
            
            return gcdOfStrings( st, str2);
        }
        
        
        return "";
    }
}

// GOT TO LEARN SOME STRING METHODS 
