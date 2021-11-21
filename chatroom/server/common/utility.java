package common;

import java.util.Scanner;

public class utility {
    public static Scanner scanner = new Scanner(System.in);
    /**
     * 从控制台读取长度字符串
     * @return
     */
    public static String ReadString(){
        String content = scanner.nextLine();//read first line
        return content;
    }
}
