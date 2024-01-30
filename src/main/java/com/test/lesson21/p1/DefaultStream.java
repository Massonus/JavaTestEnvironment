package com.test.lesson21.p1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class DefaultStream {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        PrintStream out = System.out;
        PrintStream err = System.err;

        int code = 0;

        out.println("Please, enter characters:");
        while (code != (int)'l') {
            code = in.read();
            out.write(code);

            if (code == 'l'){
                err.println("Exit program");
            }
        }
    }


}

