package string;

// first take first sting from string array which is str[0]
// then apply for loop on that  string;
//  f l o w e r  in this when f is stored on ch
// take remianing two string start with 1 from string array and then
// first check they are i>= or not first sting is equal or larger if smaller then no meaning of checking
// if ch == str[j].charAt(i) then it will automatically increment
// else we will write condition to stop that  is str[j].charAt(i) != ch
// then return f_s.substring(0,i);


public class longest_common_prefix {
    static void main() {
        String[] str = {"flower","flow","flight"};
        String ans = longest_common(str);
        System.out.println(ans);
    }

    static String longest_common(String[] str){

        String f_s = str[1];

        for (int i = 0; i < f_s.length(); i++) {

            char ch = f_s.charAt(i);

            for (int j = 1; j < str.length; j++) {

                if(i >= str[j].length() || str[j].charAt(i) != ch){
                    return f_s.substring (0,i);
                }
            }
        }
        return f_s;
    }
}
