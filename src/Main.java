public class Main{
    public static void main(String[] args){
        String str = "壱百満";

        try{
            int value = Integer.parseInt(str);
            System.out.println(value);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatExceptionが発生しました。");
            System.out.println("エラーが発生しました。 " + e.getMessage());
        }
    }
}