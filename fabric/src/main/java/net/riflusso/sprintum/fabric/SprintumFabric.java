package net.riflusso.sprintum.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.riflusso.sprintum.Sprintum;

public final class SprintumFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Sprintum.init();
    }
}
