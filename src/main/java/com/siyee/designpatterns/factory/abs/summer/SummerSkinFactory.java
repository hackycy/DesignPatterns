package com.siyee.designpatterns.factory.abs.summer;

import com.siyee.designpatterns.factory.abs.*;

/**
 * 夏天样式的皮肤工厂
 */
public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new SummerCheckBox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new SummerProgressBar();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

}
