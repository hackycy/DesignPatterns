package com.siyee.designpatterns.builder;

public class HeroActorBuilder extends ActorBuilder {

    @Override
    void buildType() {
        actor.setType("英雄");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("短发");
    }

    @Override
    void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    void buildSex() {
        actor.setSex("男");
    }

    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }

}
