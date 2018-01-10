package com.jack.study;

import com.jack.model.CaseinsensitiveString;
import com.jack.model.ColorPoint;
import com.jack.model.Point;

import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author geqiang on 2017/11/13
 */
public class Test {
    private static final Set<Point> unitCircle;

    private final static Point[] PRIVATE_VALUE = {new Point(1, 2), new Point(2, 1)};
    public static final List<Point> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUE));

    public static void main(String[] args) {
        CaseinsensitiveString cis = new CaseinsensitiveString("abc");
        String s = "abc";
        System.out.println("cis.equals(s):" + cis.equals(s));
        System.out.println("s.equals(cis):" + s.equals(cis));
        System.out.println("s.equals(cis):" + s.equals(cis));
        List<CaseinsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println("list.contains(s):" + list.contains(s));
        Map<String, Object> map = new ConcurrentHashMap<String,Object>();
//        Point p=new Point(1,2);
//        ColorPoint cp=new ColorPoint(1,2, Color.RED);
//        System.out.println("p.equals(cp):"+p.equals(cp));
//        System.out.println("cp.equals(p):"+cp.equals(p));
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println("p1.equals(p2):" + p1.equals(p2));
        System.out.println("p2.equals(p3):" + p2.equals(p3));
        System.out.println("p1.equals(p3):" + p1.equals(p3));
        //Initialize UnitCircle to contain
        int i = -17;
        int j = ~i;
        i = i >>> 3;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        StringBuilder sb = new StringBuilder();

        VALUES.add(new Point(2, 2));
    }

    static {
        unitCircle = new HashSet<Point>();
        unitCircle.add(new Point(1, 0));
        unitCircle.add(new Point(0, 1));
        unitCircle.add(new Point(-1, 0));
        unitCircle.add(new Point(0, -1));
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static final Point[] values() {
        return PRIVATE_VALUE.clone();
    }
}
