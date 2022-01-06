public class MyException extends Exception{
    String str1;
    MyException(String str2) {
        str1=str2;
    }
    public String toString(){
        return ("MyException Occured: "+str1);
    }
}
class Example{
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
            throw new MyException("This is my error Message");
        }
        catch(MyException exp){
            System.out.println("Catch Block");
            System.out.println(exp);
        }
    }
}
