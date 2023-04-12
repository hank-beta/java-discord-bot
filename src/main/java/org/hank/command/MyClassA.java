package org.hank.command;

import java.util.ArrayList;
import java.util.List;

public abstract class MyClassA extends MyClassB {
    int a;
    final List<MyClassA> g = new ArrayList();
    Object object;

    public MyClassA() {
        super("");
        a = 4;
    }
}
