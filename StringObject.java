

public class StringObject {
    public static void main(String[] args) {
        String str1 = "Java Program"; // this way it creates a str1 reference of string object which has "Java Program".
        char c[]={'A','b','g','d'};
        String str2 = new String(c); // This String constructor takes character array to create string object.
        byte b[]={66,87,74,77};
        String str3 = new String(b,3,1); // this creates string object from byte array
        String str4 = new String("   Java"); // this creates string object from string pool which has "Java" string literal
        String s = "Mr. Shahrukh Khan";
        String s1 = "Mr. Shahrukh Khan";
        String s2 = new String("Java Program");
        //Methods

        str1.toLowerCase();

        System.out.println(str1);

        str1 = str1.toUpperCase();
        System.out.println(str1);

        str4 = str4.trim();
        System.out.println(str4);
        System.out.println(s.startsWith("Mr."));
        System.out.println(s.startsWith("Shah", 4));

        System.out.println(s.equals(s1));

        System.out.println(str1.equalsIgnoreCase(s2));

        System.out.println(str1==s2);

        //Regular Expressions
        // [abc] one character with only a,b,c allowed.
        // [a-z][0-9] first character being alphabets from a to z, second character must be from digits 0-9
        // \d - only digits \D not digits(alphabets & special characters)
        // \w - words or digits  \W - not alphabets or digits 
        // \s - space character \S - Not space character.
        // * - 0 or multiple entries,+ - 1 or more entries ,? - 0 or 1 entry ,{X} - characters or digits upto X entries

        String r = "abc def";
        System.out.println(r.matches(".*")); // . represent any digit or word or space and * represent any number of entries
        r = "de";
        System.out.println(r.matches("[dfgh][rety]"));


        //Student Challenge

        String strr = "programmer@gmail.com";
        int indx = strr.indexOf('@');
        String user = strr.substring(0, indx);
        String domain = strr.substring(indx+1);
        if(strr.matches("\\w*@gmail.*"))
        {
            System.out.println("User name from "+ strr + " is " + user);
            System.out.println("Domain name from "+ strr+" is "+ domain);
        }

        // 2 Remove Special Characters from string
        String regstr = "^3-harsha";
        String regstr1 = regstr.replaceAll("\\W", "");
        System.out.println(regstr1);

    }
}
