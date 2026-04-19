public class FindFirstPalindrome {
    public boolean isPalindrome(String s){
        int f = 0;
        int r = s.length()-1;

        while(f<r){
            if(s.charAt(f)!=s.charAt(r)){
                return false;
            }
            f++;
            r--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "" ;
    }
}
