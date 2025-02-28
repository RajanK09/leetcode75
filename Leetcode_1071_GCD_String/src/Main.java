//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution sln = new Solution();
        String value = sln.gcdOfStrings("ABC","ABCABCABCABCABC");
        System.out.println(value);
        System.out.println(sln.gcd("ABC","ABCABCABCABCABC"));

        value = sln.gcdOfStrings("ABC","ABC");
        System.out.println(value);
        System.out.println(sln.gcd("ABC","ABC"));

        value = sln.gcdOfStrings("AB","ABABABABABABABAB");
        System.out.println(value);
        System.out.println(sln.gcd("AB","ABABABABABABABAB"));

        value = sln.gcdOfStrings("ABAB","ABABABABABABABABC");
        System.out.println(value);
        System.out.println(sln.gcd("ABAB","ABABABABABABABABC"));


    }
}