
public class String_Methods {
    public static void main(String[] args) {
        // String a="Vaishvi";
        // String a1= new String("Vaishvi");
        // System.out.println(a);

        // 1. name.length() --> Returns length of a string name

        String name="Vaishvi";
        int value =name.length();
        System.out.println(value);

        //String s = "vaishvi";
        //System.out.println(s.length());  //7

        // 2. name.tolowercase() 

        String lstring =name.toLowerCase();
        System.out.println(lstring);

        // 3. name.touppercase()

        String upper=name.toUpperCase();
        System.out.println(upper);

        // 4. name.trim() -> Removes leading and trailing spaces

        String nonTrimmedString ="   Vaishvi    ";
        System.out.println(nonTrimmedString);
        String trimmed =nonTrimmedString.trim();
        System.out.println(trimmed);

        // 5. name.substring(int start) -->returns a substring from start to the end substring(3) returns "ant".

        System.out.println(name.substring(3));

        // 6. name.substring(int start,int end) --> returns a substring from start index to the end index . sart index is inclided and end index is excuded.

        System.out.println(name.substring(2,4 ));

        //  7. name.replace(char 'r',char 'p') --> returns a new string after replacing r with p. Happy is returned in the case.

        System.out.println(name.replace('a', 't'));
        System.out.println(name.replace("ant", "nya"));

        //  8. name.startswith()

        System.out.println(name.startsWith("Us"));

        // 9. name.endswith()

        System.out.println(name.endsWith("nt"));

        // 10. name.charAt() ->Returns the character at a specific position (index starts from 0)

        System.out.println(name.charAt(3));

        // 11. name.indexOf()
        
        System.out.println(name.indexOf("n"));

        String modifiedName="]vaiiiishviii";
        // System.out.println(modifiedName.indexOf("iiish"));
        System.out.println(modifiedName.indexOf("iish",5));
        System.out.println(modifiedName.indexOf("viii",5));
       
        // 12. name.lastindexOf()

        System.out.println(modifiedName.lastIndexOf("n"));
        System.out.println(modifiedName.lastIndexOf("n",8));

        // 13. name.equals()

        System.out.println(name.equals("Vaishvi"));

        // 14. name.equalsignorecase()

        System.out.println(name.equalsIgnoreCase("USHANT"));

        // ESCAPE SEQUENCE CHARACTERS 

        // --> escape sequence characters consist of more than one characters but represents one character when used within the string.

        // Ex:- \n, \t , \` ,\\ --> \ ,etc.

        System.out.println("I am Escape sequence \\ double quote");
        System.out.println("I am Escape sequence \n double quote");
        System.out.println("I am Escape sequence \t double quote");
        // System.out.println("I am Escape sequence \t double quote");

    }
}