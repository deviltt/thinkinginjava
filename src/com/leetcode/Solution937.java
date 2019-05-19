package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 重新排列日志文件
 * 你有一个日志数组 logs。每条日志都是以空格分隔的字串。
 * 对于每条日志，其第一个字为字母数字标识符。然后，要么：
 * 标识符后面的每个字将仅由小写字母组成，或；
 * 标识符后面的每个字将仅由数字组成。
 * 我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
 * 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按内容字母顺序排序，
 * 忽略标识符；在内容相同时，按标识符排序。数字日志应该按原来的顺序排列。
 * 返回日志的最终顺序。
 * 输入：["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * 输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 */
public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        /**
         * 排序的规则：
         * 1.字母日志优先于数字日志
         * 2.字母日志先按内容排序，再按标识符排序
         * 3.数字日志顺序不变
         */
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = o1.split(" ");
                String[] split2 = o2.split(" ");
                //通过第2个元素的第一个字符来判断是字母日志还是数字日志
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
                if (!isDigit1 && !isDigit2) {
                    //要一直往后比较，知道到达数组末尾
                    int cmp;
                    for (int i = 1; i < Math.min(split1.length, split2.length); i++) {
                        cmp = split1[i].compareTo(split2[i]);
                        if (cmp != 0)
                            return cmp;
                    }
                    if (split1.length>split2.length){
                        return 1;
                    }else if (split1.length<split2.length){
                        return -1;
                    }else
                        return split1[0].compareTo(split2[0]);
                }
                /**
                 *  如果两个都是数字日志，则返回0，表示默认顺序排序
                 *  如果1不是2肯定是，则按降序排列，返回-1
                 *  1是2不是，则按升序排列，数字在后面，返回1
                 */
                return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
            }
        });
        return logs;
    }
}
