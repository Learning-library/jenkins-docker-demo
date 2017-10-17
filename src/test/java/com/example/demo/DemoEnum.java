package com.example.demo;

/**
 * @Author changwenhu
 * @Date 2017/10/16
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public enum DemoEnum {

    PECIALLIST_C("SpecialList_c", "1"), APPLYLOANSTR("ApplyLoanStr", ""), INFORELATION("InfoRelation", ""), EXECUTION("Execution", "");


    private String a;
    private String b;

    DemoEnum(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        System.out.println(EXECUTION.getB());

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }


}
