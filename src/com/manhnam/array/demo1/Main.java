package com.manhnam.array.demo1;

import java.util.Arrays;

import static com.manhnam.array.demo1.ArrayDemo.*;
public class Main {

    public static void main(String[] args) {
        String a = "aa";
        String b = "bb";
        String c = "cc";
        Object[] obj = new String[][][]{
                {{a,c}
                },
                {{a,b,c},{a,b,c}
                },
                {{a,b,c}
                }

        };
        for (Object element : obj
        ) {
            System.out.println(obj.getClass().getSimpleName());
            System.out.println(Arrays.deepToString(obj));

        }
    }
}

