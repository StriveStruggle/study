package com.jack.model;

/**
 * @author geqiang on 2017/11/13
 */
//Broken -violates symmetry!
public class CaseinsensitiveString {
    private final String s;
    public CaseinsensitiveString(String s){
        if(s==null) {
            throw new NullPointerException();
        }
        this.s=s;
    }

    //Broken -violates symmetry!
    @Override
    public boolean equals(Object o){
//        if(o instanceof CaseinsensitiveString) {
//            return s.equalsIgnoreCase(((CaseinsensitiveString) o).s);
//        }
//        if(o instanceof String) {
//            return s.equalsIgnoreCase((String) o);
//        }
        return  o instanceof CaseinsensitiveString&&((CaseinsensitiveString) o).s.equalsIgnoreCase(s);
    }
}
