import java.util.*;

class Q4
{
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o' ,'u'}; // character array of vowels

        List<Character> al = Arrays.asList(vowels); // to create a new array list of vowels

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }
    // public main method
    public static void main(String[] args)
    {
        String str = "India\nUnited States\nGermany\nEgypt\nczechoslovakia\n";
        System.out.println(str);
        System.out.println("--------After Removing the Vowel from the String--------");

        System.out.println(remVowel(str));// pass the string to the remove vowels function
    }
}
