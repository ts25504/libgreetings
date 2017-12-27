package com.mozilla.greetings;

/**
 * Created by TangSheng (tangsheng02@meituan.com) on 27/12/2017.
 */

public class RustGreetings {

    private static native String greeting(final String pattern);

    public String sayHello(String to) {
        return greeting(to);
    }
}
