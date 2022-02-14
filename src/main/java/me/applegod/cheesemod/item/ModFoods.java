package me.applegod.cheesemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.LEVITATION, 100, 0), 0.3F).meat().build();

}
