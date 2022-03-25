package site.heitong;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
/**
 * @author yrq
 * @version 1.0
 * @description: TODO
 * @date 2022/3/16 14:01
 */
public class CommonsLangUtils {
    public static String capitalize(String str) {
        //首字母转成大写
        String capitalize = StringUtils.capitalize( str );
        return capitalize;

    }

    public static void main(String[] args) {
        System.out.println(capitalize("yrq"));
    }
}
