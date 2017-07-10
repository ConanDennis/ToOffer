package toOffer;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by wenjie.zhou on 2017/7/10.
 */
public class InterviewQues_2 {
    public static void main (String[] args) {
        String sentence = "We are happy";
        String str = "%20";
        System.out.println(strReplace(sentence , str));
    }

    public static String strReplace (String sentence , String str) {
        String[] sArr = sentence.split(" ");
        String res = "";
        for(int i = 0; i < sArr.length; i ++) {
            res = res + sArr[i] + str;
        }
        return res;
    }
}
