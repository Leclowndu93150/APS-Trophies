package com.leclowndu93150.aps_trophies;

import com.leclowndu93150.aps_trophies.block.RaceTrophyBlock;
import com.leclowndu93150.aps_trophies.block.TrophyBlock;
import com.leclowndu93150.aps_trophies.block.TrophyShapeProfile;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class APSTrophies implements ModInitializer {

    public static final String MOD_ID = "aps_trophies";
    private static BlockBehaviour.Properties trophyProps() {
        return BlockBehaviour.Properties.of().noOcclusion().lightLevel(s -> 5);
    }

    private static Block ballTrophy() {
        return new TrophyBlock(trophyProps(), TrophyShapeProfile.BALL);
    }

    private static Block statueTrophy() {
        return new TrophyBlock(trophyProps(), TrophyShapeProfile.SINGLE_STATUE);
    }

    private static Block raceTrophy() {
        return new RaceTrophyBlock(trophyProps());
    }

    public static final Block TIMERBALL_TROPHY_SMALL = ballTrophy();
    public static final Block SAFARIBALL_TROPHY_SMALL = ballTrophy();
    public static final Block QUICKBALL_TROPHY_SMALL = ballTrophy();
    public static final Block MOONBALL_TROPHY_SMALL = ballTrophy();
    public static final Block MASTERBALL_TROPHY_SMALL = ballTrophy();
    public static final Block LUXURYBALL_TROPHY_SMALL = ballTrophy();
    public static final Block LUREBALL_TROPHY_SMALL = ballTrophy();
    public static final Block DUSKBALL_TROPHY_SMALL = ballTrophy();
    public static final Block DIVEBALL_TROPHY_SMALL = ballTrophy();
    public static final Block BEASTBALL_TROPHY_SMALL = ballTrophy();
    public static final Block ANCIENTPOKEBALL_TROPHY_SMALL = ballTrophy();
    public static final Block ANCIENTORIGINBALL_TROPHY_SMALL = ballTrophy();
    public static final Block ANCIENTHEAVYBALL_TROPHY_SMALL = ballTrophy();
    public static final Block JADE_TROPHY = statueTrophy();
    public static final Block GOLD_BUGCATCHER_TROPHY = statueTrophy();
    public static final Block BRONZE_BUGCATCHER_TROPHY = statueTrophy();
    public static final Block SILVER_BUGCATCHER_TROPHY = statueTrophy();
    public static final Block SILVER_FISHER_TROPHY = statueTrophy();
    public static final Block BRONZE_FISHER_TROPHY = statueTrophy();
    public static final Block GOLD_FISHER_TROPHY = statueTrophy();
    public static final Block BRONZE_BOAT_TROPHY = raceTrophy();
    public static final Block BRONZE_CAR_TROPHY = raceTrophy();
    public static final Block BRONZE_PLANE_TROPHY = raceTrophy();
    public static final Block BRONZE_POKEMON_TROPHY = raceTrophy();
    public static final Block GOLD_BOAT_TROPHY = raceTrophy();
    public static final Block GOLD_CAR_TROPHY = raceTrophy();
    public static final Block GOLD_PLANE_TROPHY = raceTrophy();
    public static final Block GOLD_POKEMON_TROPHY = raceTrophy();
    public static final Block SILVER_BOAT_TROPHY = raceTrophy();
    public static final Block SILVER_CAR_TROPHY = raceTrophy();
    public static final Block SILVER_PLANE_TROPHY = raceTrophy();
    public static final Block SILVER_POKEMON_TROPHY = raceTrophy();
    public static final Block LUCARIO_POKEBALL_TROPHY = statueTrophy();
    public static final Block MELMETAL_GREATBALL_TROPHY = statueTrophy();
    public static final Block REGIGIGAS_ULTRABALL_TROPHY = statueTrophy();
    public static final Block AZURE_BALL_TROPHY = ballTrophy();
    public static final Block CHERISH_BALL_TROPHY = ballTrophy();
    public static final Block CITRINE_BALL_TROPHY = ballTrophy();
    public static final Block DREAM_BALL_TROPHY = ballTrophy();
    public static final Block FAST_BALL_TROPHY = ballTrophy();
    public static final Block FEATHER_TROPHY_SMALL = ballTrophy();
    public static final Block FRIEND_BALL_TROPHY = ballTrophy();
    public static final Block GREAT_BALL_TROPHY = ballTrophy();
    public static final Block HEAL_BALL_TROPHY = ballTrophy();
    public static final Block HEAVY_BALL_TROPHY = ballTrophy();
    public static final Block LEVEL_BALL_TROPHY = ballTrophy();
    public static final Block LOVE_BALL_TROPHY = ballTrophy();
    public static final Block NEST_BALL_TROPHY = ballTrophy();
    public static final Block NET_BALL_TROPHY = ballTrophy();
    public static final Block PARK_BALL_TROPHY = ballTrophy();
    public static final Block POKEBALL_TROPHY = ballTrophy();
    public static final Block PREMIER_BALL_TROPHY = ballTrophy();
    public static final Block REPEAT_BALL_TROPHY = ballTrophy();
    public static final Block ROSEATE_BALL_TROPHY = ballTrophy();
    public static final Block SLATE_BALL_TROPHY = ballTrophy();
    public static final Block SPORT_BALL_TROPHY = ballTrophy();
    public static final Block ULTRA_BALL_TROPHY = ballTrophy();
    public static final Block VERDANT_BALL_TROPHY = ballTrophy();

    public static final Item TIMERBALL_TROPHY_SMALL_ITEM = new BlockItem(TIMERBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item SAFARIBALL_TROPHY_SMALL_ITEM = new BlockItem(SAFARIBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item QUICKBALL_TROPHY_SMALL_ITEM = new BlockItem(QUICKBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item MOONBALL_TROPHY_SMALL_ITEM = new BlockItem(MOONBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item MASTERBALL_TROPHY_SMALL_ITEM = new BlockItem(MASTERBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item LUXURYBALL_TROPHY_SMALL_ITEM = new BlockItem(LUXURYBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item LUREBALL_TROPHY_SMALL_ITEM = new BlockItem(LUREBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item DUSKBALL_TROPHY_SMALL_ITEM = new BlockItem(DUSKBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item DIVEBALL_TROPHY_SMALL_ITEM = new BlockItem(DIVEBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item BEASTBALL_TROPHY_SMALL_ITEM = new BlockItem(BEASTBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item ANCIENTPOKEBALL_TROPHY_SMALL_ITEM = new BlockItem(ANCIENTPOKEBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item ANCIENTORIGINBALL_TROPHY_SMALL_ITEM = new BlockItem(ANCIENTORIGINBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item ANCIENTHEAVYBALL_TROPHY_SMALL_ITEM = new BlockItem(ANCIENTHEAVYBALL_TROPHY_SMALL, new Item.Properties());
    public static final Item JADE_TROPHY_ITEM = new BlockItem(JADE_TROPHY, new Item.Properties());
    public static final Item GOLD_BUGCATCHER_TROPHY_ITEM = new BlockItem(GOLD_BUGCATCHER_TROPHY, new Item.Properties());
    public static final Item BRONZE_BUGCATCHER_TROPHY_ITEM = new BlockItem(BRONZE_BUGCATCHER_TROPHY, new Item.Properties());
    public static final Item SILVER_BUGCATCHER_TROPHY_ITEM = new BlockItem(SILVER_BUGCATCHER_TROPHY, new Item.Properties());
    public static final Item SILVER_FISHER_TROPHY_ITEM = new BlockItem(SILVER_FISHER_TROPHY, new Item.Properties());
    public static final Item BRONZE_FISHER_TROPHY_ITEM = new BlockItem(BRONZE_FISHER_TROPHY, new Item.Properties());
    public static final Item GOLD_FISHER_TROPHY_ITEM = new BlockItem(GOLD_FISHER_TROPHY, new Item.Properties());
    public static final Item BRONZE_BOAT_TROPHY_ITEM = new BlockItem(BRONZE_BOAT_TROPHY, new Item.Properties());
    public static final Item BRONZE_CAR_TROPHY_ITEM = new BlockItem(BRONZE_CAR_TROPHY, new Item.Properties());
    public static final Item BRONZE_PLANE_TROPHY_ITEM = new BlockItem(BRONZE_PLANE_TROPHY, new Item.Properties());
    public static final Item BRONZE_POKEMON_TROPHY_ITEM = new BlockItem(BRONZE_POKEMON_TROPHY, new Item.Properties());
    public static final Item GOLD_BOAT_TROPHY_ITEM = new BlockItem(GOLD_BOAT_TROPHY, new Item.Properties());
    public static final Item GOLD_CAR_TROPHY_ITEM = new BlockItem(GOLD_CAR_TROPHY, new Item.Properties());
    public static final Item GOLD_PLANE_TROPHY_ITEM = new BlockItem(GOLD_PLANE_TROPHY, new Item.Properties());
    public static final Item GOLD_POKEMON_TROPHY_ITEM = new BlockItem(GOLD_POKEMON_TROPHY, new Item.Properties());
    public static final Item SILVER_BOAT_TROPHY_ITEM = new BlockItem(SILVER_BOAT_TROPHY, new Item.Properties());
    public static final Item SILVER_CAR_TROPHY_ITEM = new BlockItem(SILVER_CAR_TROPHY, new Item.Properties());
    public static final Item SILVER_PLANE_TROPHY_ITEM = new BlockItem(SILVER_PLANE_TROPHY, new Item.Properties());
    public static final Item SILVER_POKEMON_TROPHY_ITEM = new BlockItem(SILVER_POKEMON_TROPHY, new Item.Properties());
    public static final Item LUCARIO_POKEBALL_TROPHY_ITEM = new BlockItem(LUCARIO_POKEBALL_TROPHY, new Item.Properties());
    public static final Item MELMETAL_GREATBALL_TROPHY_ITEM = new BlockItem(MELMETAL_GREATBALL_TROPHY, new Item.Properties());
    public static final Item REGIGIGAS_ULTRABALL_TROPHY_ITEM = new BlockItem(REGIGIGAS_ULTRABALL_TROPHY, new Item.Properties());
    public static final Item AZURE_BALL_TROPHY_ITEM = new BlockItem(AZURE_BALL_TROPHY, new Item.Properties());
    public static final Item CHERISH_BALL_TROPHY_ITEM = new BlockItem(CHERISH_BALL_TROPHY, new Item.Properties());
    public static final Item CITRINE_BALL_TROPHY_ITEM = new BlockItem(CITRINE_BALL_TROPHY, new Item.Properties());
    public static final Item DREAM_BALL_TROPHY_ITEM = new BlockItem(DREAM_BALL_TROPHY, new Item.Properties());
    public static final Item FAST_BALL_TROPHY_ITEM = new BlockItem(FAST_BALL_TROPHY, new Item.Properties());
    public static final Item FEATHER_TROPHY_SMALL_ITEM = new BlockItem(FEATHER_TROPHY_SMALL, new Item.Properties());
    public static final Item FRIEND_BALL_TROPHY_ITEM = new BlockItem(FRIEND_BALL_TROPHY, new Item.Properties());
    public static final Item GREAT_BALL_TROPHY_ITEM = new BlockItem(GREAT_BALL_TROPHY, new Item.Properties());
    public static final Item HEAL_BALL_TROPHY_ITEM = new BlockItem(HEAL_BALL_TROPHY, new Item.Properties());
    public static final Item HEAVY_BALL_TROPHY_ITEM = new BlockItem(HEAVY_BALL_TROPHY, new Item.Properties());
    public static final Item LEVEL_BALL_TROPHY_ITEM = new BlockItem(LEVEL_BALL_TROPHY, new Item.Properties());
    public static final Item LOVE_BALL_TROPHY_ITEM = new BlockItem(LOVE_BALL_TROPHY, new Item.Properties());
    public static final Item NEST_BALL_TROPHY_ITEM = new BlockItem(NEST_BALL_TROPHY, new Item.Properties());
    public static final Item NET_BALL_TROPHY_ITEM = new BlockItem(NET_BALL_TROPHY, new Item.Properties());
    public static final Item PARK_BALL_TROPHY_ITEM = new BlockItem(PARK_BALL_TROPHY, new Item.Properties());
    public static final Item POKEBALL_TROPHY_ITEM = new BlockItem(POKEBALL_TROPHY, new Item.Properties());
    public static final Item PREMIER_BALL_TROPHY_ITEM = new BlockItem(PREMIER_BALL_TROPHY, new Item.Properties());
    public static final Item REPEAT_BALL_TROPHY_ITEM = new BlockItem(REPEAT_BALL_TROPHY, new Item.Properties());
    public static final Item ROSEATE_BALL_TROPHY_ITEM = new BlockItem(ROSEATE_BALL_TROPHY, new Item.Properties());
    public static final Item SLATE_BALL_TROPHY_ITEM = new BlockItem(SLATE_BALL_TROPHY, new Item.Properties());
    public static final Item SPORT_BALL_TROPHY_ITEM = new BlockItem(SPORT_BALL_TROPHY, new Item.Properties());
    public static final Item ULTRA_BALL_TROPHY_ITEM = new BlockItem(ULTRA_BALL_TROPHY, new Item.Properties());
    public static final Item VERDANT_BALL_TROPHY_ITEM = new BlockItem(VERDANT_BALL_TROPHY, new Item.Properties());

    @Override
    public void onInitialize() {
        registerBlock("timerball_trophy_small", TIMERBALL_TROPHY_SMALL);
        registerBlock("safariball_trophy_small", SAFARIBALL_TROPHY_SMALL);
        registerBlock("quickball_trophy_small", QUICKBALL_TROPHY_SMALL);
        registerBlock("moonball_trophy_small", MOONBALL_TROPHY_SMALL);
        registerBlock("masterball_trophy_small", MASTERBALL_TROPHY_SMALL);
        registerBlock("luxuryball_trophy_small", LUXURYBALL_TROPHY_SMALL);
        registerBlock("lureball_trophy_small", LUREBALL_TROPHY_SMALL);
        registerBlock("duskball_trophy_small", DUSKBALL_TROPHY_SMALL);
        registerBlock("diveball_trophy_small", DIVEBALL_TROPHY_SMALL);
        registerBlock("beastball_trophy_small", BEASTBALL_TROPHY_SMALL);
        registerBlock("ancientpokeball_trophy_small", ANCIENTPOKEBALL_TROPHY_SMALL);
        registerBlock("ancientoriginball_trophy_small", ANCIENTORIGINBALL_TROPHY_SMALL);
        registerBlock("ancientheavyball_trophy_small", ANCIENTHEAVYBALL_TROPHY_SMALL);
        registerBlock("jade_trophy", JADE_TROPHY);
        registerBlock("gold_bugcatcher_trophy", GOLD_BUGCATCHER_TROPHY);
        registerBlock("bronze_bugcatcher_trophy", BRONZE_BUGCATCHER_TROPHY);
        registerBlock("silver_bugcatcher_trophy", SILVER_BUGCATCHER_TROPHY);
        registerBlock("silver_fisher_trophy", SILVER_FISHER_TROPHY);
        registerBlock("bronze_fisher_trophy", BRONZE_FISHER_TROPHY);
        registerBlock("gold_fisher_trophy", GOLD_FISHER_TROPHY);
        registerBlock("bronze_boat_trophy", BRONZE_BOAT_TROPHY);
        registerBlock("bronze_car_trophy", BRONZE_CAR_TROPHY);
        registerBlock("bronze_plane_trophy", BRONZE_PLANE_TROPHY);
        registerBlock("bronze_pokemon_trophy", BRONZE_POKEMON_TROPHY);
        registerBlock("gold_boat_trophy", GOLD_BOAT_TROPHY);
        registerBlock("gold_car_trophy", GOLD_CAR_TROPHY);
        registerBlock("gold_plane_trophy", GOLD_PLANE_TROPHY);
        registerBlock("gold_pokemon_trophy", GOLD_POKEMON_TROPHY);
        registerBlock("silver_boat_trophy", SILVER_BOAT_TROPHY);
        registerBlock("silver_car_trophy", SILVER_CAR_TROPHY);
        registerBlock("silver_plane_trophy", SILVER_PLANE_TROPHY);
        registerBlock("silver_pokemon_trophy", SILVER_POKEMON_TROPHY);
        registerBlock("lucario_pokeball_trophy", LUCARIO_POKEBALL_TROPHY);
        registerBlock("melmetal_greatball_trophy", MELMETAL_GREATBALL_TROPHY);
        registerBlock("regigigas_ultraball_trophy", REGIGIGAS_ULTRABALL_TROPHY);
        registerBlock("azure_ball_trophy", AZURE_BALL_TROPHY);
        registerBlock("cherish_ball_trophy", CHERISH_BALL_TROPHY);
        registerBlock("citrine_ball_trophy", CITRINE_BALL_TROPHY);
        registerBlock("dream_ball_trophy", DREAM_BALL_TROPHY);
        registerBlock("fast_ball_trophy", FAST_BALL_TROPHY);
        registerBlock("feather_trophy_small", FEATHER_TROPHY_SMALL);
        registerBlock("friend_ball_trophy", FRIEND_BALL_TROPHY);
        registerBlock("great_ball_trophy", GREAT_BALL_TROPHY);
        registerBlock("heal_ball_trophy", HEAL_BALL_TROPHY);
        registerBlock("heavy_ball_trophy", HEAVY_BALL_TROPHY);
        registerBlock("level_ball_trophy", LEVEL_BALL_TROPHY);
        registerBlock("love_ball_trophy", LOVE_BALL_TROPHY);
        registerBlock("nest_ball_trophy", NEST_BALL_TROPHY);
        registerBlock("net_ball_trophy", NET_BALL_TROPHY);
        registerBlock("park_ball_trophy", PARK_BALL_TROPHY);
        registerBlock("pokeball_trophy", POKEBALL_TROPHY);
        registerBlock("premier_ball_trophy", PREMIER_BALL_TROPHY);
        registerBlock("repeat_ball_trophy", REPEAT_BALL_TROPHY);
        registerBlock("roseate_ball_trophy", ROSEATE_BALL_TROPHY);
        registerBlock("slate_ball_trophy", SLATE_BALL_TROPHY);
        registerBlock("sport_ball_trophy", SPORT_BALL_TROPHY);
        registerBlock("ultra_ball_trophy", ULTRA_BALL_TROPHY);
        registerBlock("verdant_ball_trophy", VERDANT_BALL_TROPHY);

        registerItem("timerball_trophy_small", TIMERBALL_TROPHY_SMALL_ITEM);
        registerItem("safariball_trophy_small", SAFARIBALL_TROPHY_SMALL_ITEM);
        registerItem("quickball_trophy_small", QUICKBALL_TROPHY_SMALL_ITEM);
        registerItem("moonball_trophy_small", MOONBALL_TROPHY_SMALL_ITEM);
        registerItem("masterball_trophy_small", MASTERBALL_TROPHY_SMALL_ITEM);
        registerItem("luxuryball_trophy_small", LUXURYBALL_TROPHY_SMALL_ITEM);
        registerItem("lureball_trophy_small", LUREBALL_TROPHY_SMALL_ITEM);
        registerItem("duskball_trophy_small", DUSKBALL_TROPHY_SMALL_ITEM);
        registerItem("diveball_trophy_small", DIVEBALL_TROPHY_SMALL_ITEM);
        registerItem("beastball_trophy_small", BEASTBALL_TROPHY_SMALL_ITEM);
        registerItem("ancientpokeball_trophy_small", ANCIENTPOKEBALL_TROPHY_SMALL_ITEM);
        registerItem("ancientoriginball_trophy_small", ANCIENTORIGINBALL_TROPHY_SMALL_ITEM);
        registerItem("ancientheavyball_trophy_small", ANCIENTHEAVYBALL_TROPHY_SMALL_ITEM);
        registerItem("jade_trophy", JADE_TROPHY_ITEM);
        registerItem("gold_bugcatcher_trophy", GOLD_BUGCATCHER_TROPHY_ITEM);
        registerItem("bronze_bugcatcher_trophy", BRONZE_BUGCATCHER_TROPHY_ITEM);
        registerItem("silver_bugcatcher_trophy", SILVER_BUGCATCHER_TROPHY_ITEM);
        registerItem("silver_fisher_trophy", SILVER_FISHER_TROPHY_ITEM);
        registerItem("bronze_fisher_trophy", BRONZE_FISHER_TROPHY_ITEM);
        registerItem("gold_fisher_trophy", GOLD_FISHER_TROPHY_ITEM);
        registerItem("bronze_boat_trophy", BRONZE_BOAT_TROPHY_ITEM);
        registerItem("bronze_car_trophy", BRONZE_CAR_TROPHY_ITEM);
        registerItem("bronze_plane_trophy", BRONZE_PLANE_TROPHY_ITEM);
        registerItem("bronze_pokemon_trophy", BRONZE_POKEMON_TROPHY_ITEM);
        registerItem("gold_boat_trophy", GOLD_BOAT_TROPHY_ITEM);
        registerItem("gold_car_trophy", GOLD_CAR_TROPHY_ITEM);
        registerItem("gold_plane_trophy", GOLD_PLANE_TROPHY_ITEM);
        registerItem("gold_pokemon_trophy", GOLD_POKEMON_TROPHY_ITEM);
        registerItem("silver_boat_trophy", SILVER_BOAT_TROPHY_ITEM);
        registerItem("silver_car_trophy", SILVER_CAR_TROPHY_ITEM);
        registerItem("silver_plane_trophy", SILVER_PLANE_TROPHY_ITEM);
        registerItem("silver_pokemon_trophy", SILVER_POKEMON_TROPHY_ITEM);
        registerItem("lucario_pokeball_trophy", LUCARIO_POKEBALL_TROPHY_ITEM);
        registerItem("melmetal_greatball_trophy", MELMETAL_GREATBALL_TROPHY_ITEM);
        registerItem("regigigas_ultraball_trophy", REGIGIGAS_ULTRABALL_TROPHY_ITEM);
        registerItem("azure_ball_trophy", AZURE_BALL_TROPHY_ITEM);
        registerItem("cherish_ball_trophy", CHERISH_BALL_TROPHY_ITEM);
        registerItem("citrine_ball_trophy", CITRINE_BALL_TROPHY_ITEM);
        registerItem("dream_ball_trophy", DREAM_BALL_TROPHY_ITEM);
        registerItem("fast_ball_trophy", FAST_BALL_TROPHY_ITEM);
        registerItem("feather_trophy_small", FEATHER_TROPHY_SMALL_ITEM);
        registerItem("friend_ball_trophy", FRIEND_BALL_TROPHY_ITEM);
        registerItem("great_ball_trophy", GREAT_BALL_TROPHY_ITEM);
        registerItem("heal_ball_trophy", HEAL_BALL_TROPHY_ITEM);
        registerItem("heavy_ball_trophy", HEAVY_BALL_TROPHY_ITEM);
        registerItem("level_ball_trophy", LEVEL_BALL_TROPHY_ITEM);
        registerItem("love_ball_trophy", LOVE_BALL_TROPHY_ITEM);
        registerItem("nest_ball_trophy", NEST_BALL_TROPHY_ITEM);
        registerItem("net_ball_trophy", NET_BALL_TROPHY_ITEM);
        registerItem("park_ball_trophy", PARK_BALL_TROPHY_ITEM);
        registerItem("pokeball_trophy", POKEBALL_TROPHY_ITEM);
        registerItem("premier_ball_trophy", PREMIER_BALL_TROPHY_ITEM);
        registerItem("repeat_ball_trophy", REPEAT_BALL_TROPHY_ITEM);
        registerItem("roseate_ball_trophy", ROSEATE_BALL_TROPHY_ITEM);
        registerItem("slate_ball_trophy", SLATE_BALL_TROPHY_ITEM);
        registerItem("sport_ball_trophy", SPORT_BALL_TROPHY_ITEM);
        registerItem("ultra_ball_trophy", ULTRA_BALL_TROPHY_ITEM);
        registerItem("verdant_ball_trophy", VERDANT_BALL_TROPHY_ITEM);

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "trophies"),
                FabricItemGroup.builder()
                        .title(Component.translatable("itemgroup.aps_trophies"))
                        .icon(() -> new ItemStack(DUSKBALL_TROPHY_SMALL_ITEM))
                        .displayItems((params, output) -> {
                            output.accept(TIMERBALL_TROPHY_SMALL_ITEM);
                            output.accept(SAFARIBALL_TROPHY_SMALL_ITEM);
                            output.accept(QUICKBALL_TROPHY_SMALL_ITEM);
                            output.accept(MOONBALL_TROPHY_SMALL_ITEM);
                            output.accept(MASTERBALL_TROPHY_SMALL_ITEM);
                            output.accept(LUXURYBALL_TROPHY_SMALL_ITEM);
                            output.accept(LUREBALL_TROPHY_SMALL_ITEM);
                            output.accept(DUSKBALL_TROPHY_SMALL_ITEM);
                            output.accept(DIVEBALL_TROPHY_SMALL_ITEM);
                            output.accept(BEASTBALL_TROPHY_SMALL_ITEM);
                            output.accept(ANCIENTPOKEBALL_TROPHY_SMALL_ITEM);
                            output.accept(ANCIENTORIGINBALL_TROPHY_SMALL_ITEM);
                            output.accept(ANCIENTHEAVYBALL_TROPHY_SMALL_ITEM);
                            output.accept(JADE_TROPHY_ITEM);
                            output.accept(GOLD_BUGCATCHER_TROPHY_ITEM);
                            output.accept(BRONZE_BUGCATCHER_TROPHY_ITEM);
                            output.accept(SILVER_BUGCATCHER_TROPHY_ITEM);
                            output.accept(SILVER_FISHER_TROPHY_ITEM);
                            output.accept(BRONZE_FISHER_TROPHY_ITEM);
                            output.accept(GOLD_FISHER_TROPHY_ITEM);
                            output.accept(BRONZE_BOAT_TROPHY_ITEM);
                            output.accept(BRONZE_CAR_TROPHY_ITEM);
                            output.accept(BRONZE_PLANE_TROPHY_ITEM);
                            output.accept(BRONZE_POKEMON_TROPHY_ITEM);
                            output.accept(GOLD_BOAT_TROPHY_ITEM);
                            output.accept(GOLD_CAR_TROPHY_ITEM);
                            output.accept(GOLD_PLANE_TROPHY_ITEM);
                            output.accept(GOLD_POKEMON_TROPHY_ITEM);
                            output.accept(SILVER_BOAT_TROPHY_ITEM);
                            output.accept(SILVER_CAR_TROPHY_ITEM);
                            output.accept(SILVER_PLANE_TROPHY_ITEM);
                            output.accept(SILVER_POKEMON_TROPHY_ITEM);
                            output.accept(LUCARIO_POKEBALL_TROPHY_ITEM);
                            output.accept(MELMETAL_GREATBALL_TROPHY_ITEM);
                            output.accept(REGIGIGAS_ULTRABALL_TROPHY_ITEM);
                            output.accept(AZURE_BALL_TROPHY_ITEM);
                            output.accept(CHERISH_BALL_TROPHY_ITEM);
                            output.accept(CITRINE_BALL_TROPHY_ITEM);
                            output.accept(DREAM_BALL_TROPHY_ITEM);
                            output.accept(FAST_BALL_TROPHY_ITEM);
                            output.accept(FEATHER_TROPHY_SMALL_ITEM);
                            output.accept(FRIEND_BALL_TROPHY_ITEM);
                            output.accept(GREAT_BALL_TROPHY_ITEM);
                            output.accept(HEAL_BALL_TROPHY_ITEM);
                            output.accept(HEAVY_BALL_TROPHY_ITEM);
                            output.accept(LEVEL_BALL_TROPHY_ITEM);
                            output.accept(LOVE_BALL_TROPHY_ITEM);
                            output.accept(NEST_BALL_TROPHY_ITEM);
                            output.accept(NET_BALL_TROPHY_ITEM);
                            output.accept(PARK_BALL_TROPHY_ITEM);
                            output.accept(POKEBALL_TROPHY_ITEM);
                            output.accept(PREMIER_BALL_TROPHY_ITEM);
                            output.accept(REPEAT_BALL_TROPHY_ITEM);
                            output.accept(ROSEATE_BALL_TROPHY_ITEM);
                            output.accept(SLATE_BALL_TROPHY_ITEM);
                            output.accept(SPORT_BALL_TROPHY_ITEM);
                            output.accept(ULTRA_BALL_TROPHY_ITEM);
                            output.accept(VERDANT_BALL_TROPHY_ITEM);
                        })
                        .build());
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), item);
    }
}
