package com.leclowndu93150.aps_trophies;

import com.leclowndu93150.aps_trophies.block.RaceTrophyBlock;
import com.leclowndu93150.aps_trophies.block.TrophyBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@Mod(APSTrophies.MOD_ID)
public class APSTrophies {

    public static final String MOD_ID = "aps_trophies";

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    private static BlockBehaviour.Properties trophyProps() {
        return BlockBehaviour.Properties.of().noOcclusion().lightLevel(s -> 5);
    }

    public static final DeferredBlock<Block> TIMERBALL_TROPHY_SMALL = BLOCKS.register("timerball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SAFARIBALL_TROPHY_SMALL = BLOCKS.register("safariball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> QUICKBALL_TROPHY_SMALL = BLOCKS.register("quickball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> MOONBALL_TROPHY_SMALL = BLOCKS.register("moonball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> MASTERBALL_TROPHY_SMALL = BLOCKS.register("masterball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> LUXURYBALL_TROPHY_SMALL = BLOCKS.register("luxuryball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> LUREBALL_TROPHY_SMALL = BLOCKS.register("lureball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> DUSKBALL_TROPHY_SMALL = BLOCKS.register("duskball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> DIVEBALL_TROPHY_SMALL = BLOCKS.register("diveball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BEASTBALL_TROPHY_SMALL = BLOCKS.register("beastball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> ANCIENTPOKEBALL_TROPHY_SMALL = BLOCKS.register("ancientpokeball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> ANCIENTORIGINBALL_TROPHY_SMALL = BLOCKS.register("ancientoriginball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> ANCIENTHEAVYBALL_TROPHY_SMALL = BLOCKS.register("ancientheavyball_trophy_small", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> JADE_TROPHY = BLOCKS.register("jade_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_BUGCATCHER_TROPHY = BLOCKS.register("gold_bugcatcher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_BUGCATCHER_TROPHY = BLOCKS.register("bronze_bugcatcher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_BUGCATCHER_TROPHY = BLOCKS.register("silver_bugcatcher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_FISHER_TROPHY = BLOCKS.register("silver_fisher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_FISHER_TROPHY = BLOCKS.register("bronze_fisher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_FISHER_TROPHY = BLOCKS.register("gold_fisher_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_BOAT_TROPHY = BLOCKS.register("bronze_boat_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_CAR_TROPHY = BLOCKS.register("bronze_car_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_PLANE_TROPHY = BLOCKS.register("bronze_plane_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> BRONZE_POKEMON_TROPHY = BLOCKS.register("bronze_pokemon_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_BOAT_TROPHY = BLOCKS.register("gold_boat_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_CAR_TROPHY = BLOCKS.register("gold_car_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_PLANE_TROPHY = BLOCKS.register("gold_plane_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> GOLD_POKEMON_TROPHY = BLOCKS.register("gold_pokemon_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_BOAT_TROPHY = BLOCKS.register("silver_boat_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_CAR_TROPHY = BLOCKS.register("silver_car_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_PLANE_TROPHY = BLOCKS.register("silver_plane_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> SILVER_POKEMON_TROPHY = BLOCKS.register("silver_pokemon_trophy", () -> new RaceTrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> LUCARIO_POKEBALL_TROPHY = BLOCKS.register("lucario_pokeball_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> MELMETAL_GREATBALL_TROPHY = BLOCKS.register("melmetal_greatball_trophy", () -> new TrophyBlock(trophyProps()));
    public static final DeferredBlock<Block> REGIGIGAS_ULTRABALL_TROPHY = BLOCKS.register("regigigas_ultraball_trophy", () -> new TrophyBlock(trophyProps()));

    public static final DeferredItem<BlockItem> TIMERBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(TIMERBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> SAFARIBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(SAFARIBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> QUICKBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(QUICKBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> MOONBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(MOONBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> MASTERBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(MASTERBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> LUXURYBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(LUXURYBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> LUREBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(LUREBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> DUSKBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(DUSKBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> DIVEBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(DIVEBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> BEASTBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(BEASTBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> ANCIENTPOKEBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(ANCIENTPOKEBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> ANCIENTORIGINBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(ANCIENTORIGINBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> ANCIENTHEAVYBALL_TROPHY_SMALL_ITEM = ITEMS.registerSimpleBlockItem(ANCIENTHEAVYBALL_TROPHY_SMALL);
    public static final DeferredItem<BlockItem> JADE_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(JADE_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_BUGCATCHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_BUGCATCHER_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_BUGCATCHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_BUGCATCHER_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_BUGCATCHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_BUGCATCHER_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_FISHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_FISHER_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_FISHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_FISHER_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_FISHER_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_FISHER_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_BOAT_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_BOAT_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_CAR_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_CAR_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_PLANE_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_PLANE_TROPHY);
    public static final DeferredItem<BlockItem> BRONZE_POKEMON_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(BRONZE_POKEMON_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_BOAT_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_BOAT_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_CAR_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_CAR_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_PLANE_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_PLANE_TROPHY);
    public static final DeferredItem<BlockItem> GOLD_POKEMON_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(GOLD_POKEMON_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_BOAT_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_BOAT_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_CAR_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_CAR_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_PLANE_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_PLANE_TROPHY);
    public static final DeferredItem<BlockItem> SILVER_POKEMON_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(SILVER_POKEMON_TROPHY);
    public static final DeferredItem<BlockItem> LUCARIO_POKEBALL_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(LUCARIO_POKEBALL_TROPHY);
    public static final DeferredItem<BlockItem> MELMETAL_GREATBALL_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(MELMETAL_GREATBALL_TROPHY);
    public static final DeferredItem<BlockItem> REGIGIGAS_ULTRABALL_TROPHY_ITEM = ITEMS.registerSimpleBlockItem(REGIGIGAS_ULTRABALL_TROPHY);

    public static final Supplier<CreativeModeTab> TROPHY_TAB = TABS.register("trophies", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.aps_trophies"))
                    .icon(() -> new ItemStack(DUSKBALL_TROPHY_SMALL_ITEM.get()))
                    .displayItems((params, output) -> {
                        output.accept(TIMERBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(SAFARIBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(QUICKBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(MOONBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(MASTERBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(LUXURYBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(LUREBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(DUSKBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(DIVEBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(BEASTBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(ANCIENTPOKEBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(ANCIENTORIGINBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(ANCIENTHEAVYBALL_TROPHY_SMALL_ITEM.get());
                        output.accept(JADE_TROPHY_ITEM.get());
                        output.accept(GOLD_BUGCATCHER_TROPHY_ITEM.get());
                        output.accept(BRONZE_BUGCATCHER_TROPHY_ITEM.get());
                        output.accept(SILVER_BUGCATCHER_TROPHY_ITEM.get());
                        output.accept(SILVER_FISHER_TROPHY_ITEM.get());
                        output.accept(BRONZE_FISHER_TROPHY_ITEM.get());
                        output.accept(GOLD_FISHER_TROPHY_ITEM.get());
                        output.accept(BRONZE_BOAT_TROPHY_ITEM.get());
                        output.accept(BRONZE_CAR_TROPHY_ITEM.get());
                        output.accept(BRONZE_PLANE_TROPHY_ITEM.get());
                        output.accept(BRONZE_POKEMON_TROPHY_ITEM.get());
                        output.accept(GOLD_BOAT_TROPHY_ITEM.get());
                        output.accept(GOLD_CAR_TROPHY_ITEM.get());
                        output.accept(GOLD_PLANE_TROPHY_ITEM.get());
                        output.accept(GOLD_POKEMON_TROPHY_ITEM.get());
                        output.accept(SILVER_BOAT_TROPHY_ITEM.get());
                        output.accept(SILVER_CAR_TROPHY_ITEM.get());
                        output.accept(SILVER_PLANE_TROPHY_ITEM.get());
                        output.accept(SILVER_POKEMON_TROPHY_ITEM.get());
                        output.accept(LUCARIO_POKEBALL_TROPHY_ITEM.get());
                        output.accept(MELMETAL_GREATBALL_TROPHY_ITEM.get());
                        output.accept(REGIGIGAS_ULTRABALL_TROPHY_ITEM.get());
                    })
                    .build());

    public APSTrophies(IEventBus modBus) {
        BLOCKS.register(modBus);
        ITEMS.register(modBus);
        TABS.register(modBus);
    }
}
