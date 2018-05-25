package com.puyangsky.blog.util;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.ast.util.TextCollectingVisitor;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataSet;
import com.vladsch.flexmark.parser.Parser;

/**
 * Author:      puyangsky
 * Date:        2018/5/26 上午12:01
 */
public class MarkdownUtils {
    public static final DataHolder OPTIONS = PegdownOptionsAdapter.flexmarkOptions(
            Extensions.ALL
    );
    public static final MutableDataSet FORMAT_OPTIONS = new MutableDataSet();
    static {
        FORMAT_OPTIONS.set(Parser.EXTENSIONS, OPTIONS.get(Parser.EXTENSIONS));
    }
    public static final Parser PARSER = Parser.builder(OPTIONS).build();

    public static String markdownToText(String markdown) {
        Node document = PARSER.parse(markdown);
        TextCollectingVisitor textCollectingVisitor = new TextCollectingVisitor();
        return textCollectingVisitor.collectAndGetText(document);
    }

    public static void main(String[] args) {

    }
}
