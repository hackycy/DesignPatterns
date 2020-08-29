package com.siyee.designpatterns.builder;

/**
 * 角色控制器，充当指挥者
 */
public class ActorController {

    public Actor createActor(ActorBuilder builder) {
        builder.buildCostume();
        builder.buildFace();
        builder.buildHairStyle();
        if (builder.isNeedSex()) {
            builder.buildSex();
        }
        builder.buildType();
        return builder.build();
    }

}
