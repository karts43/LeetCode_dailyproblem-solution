// 2108. Find First Palindromic String in the Array 
 
class Solution {
    public String firstPalindrome(String[] words) {
        for(String A : words){
            if(palindrom(A)){
                return A;
            }
        }
            return "";
    }
    
    public boolean palindrom(String word){
        int i =0 , j= word.length() - 1;
        while(i < j ){
            if(word.charAt(i) != word.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
