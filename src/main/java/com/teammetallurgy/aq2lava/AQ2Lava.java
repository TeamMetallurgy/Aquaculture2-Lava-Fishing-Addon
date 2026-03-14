package com.teammetallurgy.aq2lava;

import com.teammetallurgy.aquaculture.api.AquacultureAPI;
import com.teammetallurgy.aquaculture.api.fishing.Hook;
import net.minecraft.ChatFormatting;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(value = AQ2Lava.MOD_ID)
public class AQ2Lava {
    public static AQ2Lava instance;
    public final static String MOD_ID = "aq2lava";

    //Hooks
    public static final Hook OBSIDIAN = new Hook.HookBuilder("obsidian").setColor(ChatFormatting.DARK_PURPLE).setFluid(FluidTags.LAVA).build();
    public static final Hook DOUBLE_OBSIDIAN = new Hook.HookBuilder("double_obsidian").setFluid(FluidTags.LAVA).setDoubleCatchChance(0.15).build();
    public static final Hook GLOWSTONE = new Hook.HookBuilder("glowstone").setColor(ChatFormatting.YELLOW).setFluid(FluidTags.LAVA).setLuckModifier(1).build();
    public static final Hook QUARTZ = new Hook.HookBuilder("quartz").setFluid(FluidTags.LAVA).setDurabilityChance(0.30).build();
    public static final Hook SOUL_SAND = new Hook.HookBuilder("soul_sand").setColor(ChatFormatting.DARK_GRAY).setFluid(FluidTags.LAVA).setCatchableWindow(40, 70).build();
    public static final Hook OBSIDIAN_NOTE = new Hook.HookBuilder("obsidian_note").setColor(ChatFormatting.LIGHT_PURPLE).setFluid(FluidTags.LAVA).setCatchSound(() -> SoundEvents.LAVA_EXTINGUISH).build();

    //Hook Items
    public static final DeferredItem<Item> OBSIDIAN_HOOK = AquacultureAPI.registerHook(OBSIDIAN);
    public static final DeferredItem<Item> DOUBLE_OBSIDIAN_HOOK = AquacultureAPI.registerHook(DOUBLE_OBSIDIAN);
    public static final DeferredItem<Item> GLOWSTONE_HOOK = AquacultureAPI.registerHook(GLOWSTONE);
    public static final DeferredItem<Item> QUARTZ_HOOK = AquacultureAPI.registerHook(QUARTZ);
    public static final DeferredItem<Item> SOUL_SAND_HOOK = AquacultureAPI.registerHook(SOUL_SAND);
    public static final DeferredItem<Item> OBSIDIAN_NOTE_HOOK = AquacultureAPI.registerHook(OBSIDIAN_NOTE);

    public AQ2Lava(ModContainer modContainer, IEventBus modBus) {
        instance = this;
        modBus.addListener(this::setupCommon);
        modBus.addListener(this::setupClient);
        //modContainer.registerConfig(ModConfig.Type.COMMON, AquaConfig.spec);
    }

    private void setupCommon(FMLCommonSetupEvent event) {
        //TODO Name Nether star hook work in lava
    }

    private void setupClient(FMLClientSetupEvent event) {
    }
}