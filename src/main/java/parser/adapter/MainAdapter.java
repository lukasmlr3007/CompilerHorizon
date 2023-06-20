package parser.adapter;

import parser.JavaGrammerParser;
import syntax.statement.Block;
import syntax.structure.MyMain;

public class MainAdapter {
    public static MyMain adapt(JavaGrammerParser.MainContext mainContext){
        Block block = BlockAdapter.adapt(mainContext.block());
        return new MyMain(block);
    }
}
