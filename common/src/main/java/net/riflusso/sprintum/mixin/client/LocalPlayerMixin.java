package net.riflusso.sprintum.mixin.client;

import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LocalPlayer.class)
public class LocalPlayerMixin {
    @Inject(method = "shouldStopSprinting", at = @At("RETURN"), cancellable = true)
    private void injectShouldStopSprinting(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
