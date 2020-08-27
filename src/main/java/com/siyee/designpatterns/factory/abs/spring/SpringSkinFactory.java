package com.siyee.designpatterns.factory.abs.spring;

import com.siyee.designpatterns.factory.abs.*;

/**
 * 春天样式的皮肤工厂
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new SpringCheckBox();
    }

    @Override
    public ProgressBar createProgressBar() {
        return new SpringProgressBar();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

}
