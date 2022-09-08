package leetCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class myerror {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        File file = new File(" ");
        BufferedReader reader = null;
        try {
            reader= new BufferedReader(new FileReader(file));
            String tempString =null;
            while(tempString.indexOf('/',8) != -1){
                String subString = tempString.substring(tempString.indexOf("//") +2,
                        tempString.indexOf('/',8));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
