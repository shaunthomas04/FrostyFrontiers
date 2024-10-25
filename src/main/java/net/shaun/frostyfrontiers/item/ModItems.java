package net.shaun.frostyfrontiers.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shaun.frostyfrontiers.FrostyFrontiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FrostyFrontiers.MOD_ID);

    //Frostine/ore/geological Items
    public static final RegistryObject<Item> FROSTINE = ITEMS.register("frostine", ()-> new Item (new Item.Properties()));
    public static final RegistryObject<Item> CREAMYSNOW = ITEMS.register("creamysnow", ()-> new Item (new Item.Properties()));

    //Food Items
    public static final RegistryObject<Item> SNOWBERRY = ITEMS.register("snowberry", ()-> new Item (new Item.Properties().food(ModFoodProperties.SNOWBERRY)));
    public static final RegistryObject<Item> SNOWBERRYPIE = ITEMS.register("snowberrypie", ()-> new Item (new Item.Properties().food(ModFoodProperties.SNOWBERRYPIE)));
    public static final RegistryObject<Item> ICECREAM = ITEMS.register("icecream", ()-> new Item (new Item.Properties().food(ModFoodProperties.ICECREAM)));

    //Yeti Items
    public static final RegistryObject<Item> YETIFUR = ITEMS.register("yetifur", ()-> new Item (new Item.Properties()));
    public static final RegistryObject<Item> YETICLAW = ITEMS.register("yeticlaw", ()-> new Item (new Item.Properties()));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
