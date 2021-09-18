package com.redli.test;
import com.redli.util.FileUtil;
import org.junit.Test;

public class TestFileUtil {
    @Test
    public void TestreadFire() {
        String str = FileUtil.readFile("D:\\mycode\\PaperCheck\\TestTxt\\orig.txt");
        String[] strings = str.split("");
        for (String string : strings){
            System.out.println(string);
        }
    }
    @Test
    public void TestwriteFire() {
        double[] fileElem = {0.01,0.02,0.03,0.04,0.05};
        for (double v : fileElem) {
            FileUtil.writeFile(v, "D:\\mycode\\PaperCheck\\TestOutput\\TestOutput1.txt");
        }
    }
}
