package com.fsforward.fswonders.items.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class CustomFoodComponents {
    public static final FoodComponent PUFFERFISH_TIN_CAN = createFoodWithEffects(1, 0.2f,
            new StatusEffectInstance(StatusEffects.POISON, 1200, 3),
            new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0)
    );
    public static final FoodComponent COD_FISH_TIN_CAN = createFood(6, 0.6f, true);
    public static final FoodComponent SALMON_FISH_TIN_CAN = createFood(6, 0.8f, true);
    public static final FoodComponent TROPICAL_FISH_TIN_CAN = createFood(7, 0.8f, true);
    public static final FoodComponent VEGETABLE_TIN_CAN = createFood(10, 0.8f, true);
    public static final FoodComponent MUFFIN = createFood(8, 0.5f);
    public static final FoodComponent SWEET_BERRIES_SOUP = createFood(6, 0.6f);
    public static final FoodComponent BROWN_MUNCHROOM = createFood(5, 0.6f);
    public static final FoodComponent RED_MUNCHROOM = createFood(5, 0.6f);
    public static final FoodComponent APPLE_PIE = createFood(8, 0.5f);
    public static final FoodComponent GREEN_APPLE = createFood(5, 1.0f);
    public static final FoodComponent RED_JAM = createFood(5, 0.5f, true);
    public static final FoodComponent GREEN_JAM = createFood(6, 1.0f, true);
    public static final FoodComponent RED_CANDY_CANE = createFood(1, 5.0f);
    public static final FoodComponent GREEN_CANDY_CANE = createFood(1, 5.0f);
    public static final FoodComponent BLUE_CANDY_CANE = createFood(1, 5.0f);
    public static final FoodComponent GOLDEN_CANDY_CANE = createFood(6, 5f);

    public static FoodComponent createFood(int hunger, float saturation, boolean... flags) {
        FoodComponent.Builder builder = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
        if (flags.length > 0 && flags[0]) builder.snack();
        if (flags.length > 1 && flags[1]) builder.meat();
        return builder.build();
    }

    public static FoodComponent createFoodWithEffects(int hunger, float saturation, StatusEffectInstance... effects) {
        FoodComponent.Builder builder = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);

        for (StatusEffectInstance effect : effects) {
            builder.statusEffect(effect, 0.8f);
        }

        return builder.build();
    }

}
