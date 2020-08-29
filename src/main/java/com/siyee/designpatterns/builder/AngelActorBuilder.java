package com.siyee.designpatterns.builder;

public class AngelActorBuilder extends ActorBuilder {

    @Override
    void buildType() {
        actor.setType("天使");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("长发");
    }

    @Override
    void buildFace() {
        actor.setFace("披肩长发");
    }

    @Override
    void buildSex() {
        actor.setSex("女");
    }

    @Override
    void buildCostume() {
        actor.setCostume("长裙");
    }

}
