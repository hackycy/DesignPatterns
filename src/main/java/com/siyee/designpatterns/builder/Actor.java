package com.siyee.designpatterns.builder;

/**
 * 游戏角色
 */
public class Actor {

    /**
     * 游戏角色类型：英雄、天使、恶魔
     */
    String type;

    String hairStyle;

    String face;

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                ", face='" + face + '\'' +
                ", sex='" + sex + '\'' +
                ", costume='" + costume + '\'' +
                '}';
    }

    String sex;

    String costume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }
}
