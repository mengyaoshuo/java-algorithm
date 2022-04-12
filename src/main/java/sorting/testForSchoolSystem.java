package sorting;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testForSchoolSystem {
    public static void main(String[] args){
//        String keyword = "teacher=zhang   student = liu,li,wang student =     wang,xiao";
//        Map<String,String> mapOfKeyword = new HashMap<>();
//        String newKeyword = keyword.replaceAll("[\\s]*[=]+[\\s]*","=");
//
//        String[] keywordArr = newKeyword.split("([\s]+)|(=)");
//        for(int i = 0; i < keywordArr.length-1; i+=2){
//                mapOfKeyword.put(keywordArr[i],keywordArr[i+1]);
//        }
//        for(String str : mapOfKeyword.get("student"))
//        System.out.println(Arrays.toString(keywordArr));
//        System.out.println(mapOfKeyword);
//        String text = "  1,teacher name=wang subject = math";
//            Pattern p = Pattern.compile("^[\s]*[1,5][^a-zA-Z0-9]*[a-zA-Z]+");
//            Matcher m = p.matcher(text);
//            String result = null;
//            while (m.find()){
//                result = m.group();
//            }
//        System.out.println(result);
//        Pattern p_2 = Pattern.compile("[a-zA-Z]+");
//        Matcher m_2 = p_2.matcher(result);
//        while(m_2.find()){
//            result = m_2.group();
//        }
//        System.out.println(result);
        final File directoryPath = new File("/Users/yao.meng/Projects/schoolsystem/Doc");
        System.out.println(Arrays.toString(directoryPath.listFiles()));
    }
}
