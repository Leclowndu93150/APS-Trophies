package com.leclowndu93150.aps_trophies.client;

import com.leclowndu93150.aps_trophies.APSTrophies;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class APSTrophiesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        RenderType translucent = RenderType.translucent();
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.TIMERBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SAFARIBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.QUICKBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.MOONBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.MASTERBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.LUXURYBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.LUREBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.DUSKBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.DIVEBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BEASTBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.ANCIENTPOKEBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.ANCIENTORIGINBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.ANCIENTHEAVYBALL_TROPHY_SMALL, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.JADE_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_BUGCATCHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_BUGCATCHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_BUGCATCHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_FISHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_FISHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_FISHER_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_BOAT_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_CAR_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_PLANE_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.BRONZE_POKEMON_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_BOAT_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_CAR_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_PLANE_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.GOLD_POKEMON_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_BOAT_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_CAR_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_PLANE_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.SILVER_POKEMON_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.LUCARIO_POKEBALL_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.MELMETAL_GREATBALL_TROPHY, translucent);
        BlockRenderLayerMap.INSTANCE.putBlock(APSTrophies.REGIGIGAS_ULTRABALL_TROPHY, translucent);
    }
}
