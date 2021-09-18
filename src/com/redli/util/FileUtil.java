package com.redli.util;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtil {
    public static String readFile(String filePath) {
        String str = "";
        String strLine;
        // 将 txt文件按行读入 str中
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void writeFile(double fileElem,String filePath){
        String str = Double.toString(fileElem);
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");
            // 关闭资源
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
