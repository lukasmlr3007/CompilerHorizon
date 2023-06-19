package parser.adapter;

import parser.JavaGrammerParser;

public class SysoutAdapter {

    public static SysoutAdapter adapt(JavaGrammerParser.SysoutContext sysoutContext){
        return new SysoutAdapter();
    }
}
