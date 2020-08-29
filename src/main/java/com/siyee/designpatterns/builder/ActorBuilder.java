package com.siyee.designpatterns.builder;

public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    abstract void buildType();

    abstract void buildHairStyle();

    abstract void buildFace();

    abstract void buildSex();

    abstract void buildCostume();

    /**
     * 比如一些虫族的角色没有性别，则可以通过此判断
     * @return 默认需要
     */
    public boolean isNeedSex() {
        return true;
    }

    public Actor build() {
        return actor;
    }

}
