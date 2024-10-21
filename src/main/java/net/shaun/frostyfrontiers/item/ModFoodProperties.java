package net.shaun.frostyfrontiers.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SNOWBERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400), 0.30f).build();

}
