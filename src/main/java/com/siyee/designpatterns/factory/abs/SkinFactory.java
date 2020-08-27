package com.siyee.designpatterns.factory.abs;

/**
 * 抽象工厂
 */
public interface SkinFactory {

    Button createButton();

    CheckBox createCheckBox();

    ProgressBar createProgressBar();

    TextField createTextField();

}
