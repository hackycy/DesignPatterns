package com.siyee.designpatterns.builder;

public class ZergActorBuilder extends ActorBuilder {

    @Override
    void buildType() {
        actor.setType("虫族");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("触手");
    }

    @Override
    void buildFace() {
        actor.setFace("圆脸");
    }

    @Override
    void buildSex() {

    }

    @Override
    void buildCostume() {
        actor.setCostume("黏液");
    }

    @Override
    public boolean isNeedSex() {
        return false;
    }
}
