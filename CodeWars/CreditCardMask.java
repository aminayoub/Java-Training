public class CreditCardMask {

    public static void main(String[] args){
        System.out.println(maskify("4556364607935616"));
    }


    public static String maskify(String str){
        if(str.length() <= 4){
            return str;
        }
        String strPosition = str.substring(0, str.length() -4);
        StringBuilder sb = new StringBuilder(strPosition.length());

        for(int i = 0; i < strPosition.length(); i++){
            sb.append('#');
        }

        return sb.toString() + str.substring(str.length() - 4);
    }
}

