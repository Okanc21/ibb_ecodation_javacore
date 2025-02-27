package com.okancelik._3_AccessModifier;

import com.okancelik._3_Week.Week3_01_Access_1_PublicAccessModifier;
import com.okancelik.utils.SpecialColor;

public class _4_AllAccessModifier {

    public static void main(String[] args) {
        Week3_01_Access_1_PublicAccessModifier accesModifier = new Week3_01_Access_1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE +accesModifier.publicData+ SpecialColor.RESET);
        //System.out.println(SpecialColor.PURPLE+accesModifier.defaultData+SpecialColor.RESET);
       //System.out.println(SpecialColor.YELLOW+accesModifier.protectedData+SpecialColor.RESET);
        //System.out.println(SpecialColor.RED+accesModifier.privateData+SpecialColor.RESET);

    }

}
