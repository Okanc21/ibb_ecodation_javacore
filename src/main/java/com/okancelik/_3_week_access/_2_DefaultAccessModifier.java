package com.okancelik._3_week_access;

import com.okancelik.utils.SpecialColor;

public class _2_DefaultAccessModifier {

    public static void main(String[] args) {
        _1_PublicAccessModifier accesModifier = new _1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE +accesModifier.publicData+ SpecialColor.RESET);
        System.out.println(SpecialColor.PURPLE+accesModifier.defaultData+SpecialColor.RESET);
        System.out.println(SpecialColor.YELLOW+accesModifier.protectedData+SpecialColor.RESET);
     //   System.out.println(SpecialColor.RED+accesModifier.privateData+SpecialColor.RESET);

    }
}
