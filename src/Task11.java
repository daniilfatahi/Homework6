public class Task11 {
    public static void main(String[] args) {
        String str = "Let's DO sOmE Homework";
        StringBuffer newStr = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++){

            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if ((Character.isUpperCase(str.charAt(i)))){

                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));

            }

            System.out.println("Your new char is: " + newStr);



        }




    }
}
