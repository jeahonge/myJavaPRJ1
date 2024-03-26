package study;

public class Sample5 {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("원본 문자열 ==>" + str);
        String newstr = "";

        newstr = str.substring(0,1).toLowerCase();
        newstr += str.substring(1,2).toLowerCase();
        newstr += str.substring(2,3).toLowerCase();
        newstr += str.substring(3,4).toLowerCase();

        System.out.print("변환 문자열 ==> ");
        System.out.print(newstr);
    }
}
