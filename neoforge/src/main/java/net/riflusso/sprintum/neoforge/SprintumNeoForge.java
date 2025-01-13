package net.riflusso.sprintum.neoforge;

import net.neoforged.api.distmarker.Dist;
import net.riflusso.sprintum.Sprintum;
import net.neoforged.fml.common.Mod;

@Mod(value = Sprintum.MOD_ID, dist = Dist.CLIENT)
public final class SprintumNeoForge {
    public SprintumNeoForge() {
        Sprintum.init();
    }
}
