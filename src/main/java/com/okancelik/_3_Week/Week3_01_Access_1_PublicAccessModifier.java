package com.okancelik._3_Week;

import com.okancelik.utils.SpecialColor;

public class Week3_01_Access_1_PublicAccessModifier {


    public String publicData = "public data";
    private String privateData = "private data";
    protected String protectedData = "protected data";
     String defaultData = "default data";

    public static void main(String[] args) {
        Week3_01_Access_1_PublicAccessModifier accesModifier = new Week3_01_Access_1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE +accesModifier.publicData+ SpecialColor.RESET);
        System.out.println(SpecialColor.PURPLE+accesModifier.defaultData+SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW+accesModifier.protectedData+SpecialColor.RESET);
        System.out.println(SpecialColor.RED+accesModifier.privateData+SpecialColor.RESET);

    }
}
