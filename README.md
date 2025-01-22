# Sprintum

### UPDATE 22.01.2025
_Mojang has **OFFICIALLY** [reverted](https://www.minecraft.net/en-us/article/minecraft-snapshot-25w04a) this bug, so this mod will make Minecraft 1.21.4 work as it intended._

<img align="right" height="256" width="256" src="common/src/main/resources/assets/sprintum/icon.png" />

<div>
  <a href="https://modrinth.com/mod/sprintum">
    <img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg" />
  </a>
  <a href="https://fabricmc.net">
    <img alt="fabric" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/supported/fabric_vector.svg" />
  </a>
  <a href="https://neoforged.net/">
    <img alt="neoforged" height="56" src="https://raw.githubusercontent.com/Hyperbole-Devs/vectors/8494ec1ac495cfb481dc7e458356325510933eb0/assets/cozy/supported/neoforge_vector.svg" />
  </a>
</div>

<br />

**Sprintum** is a Minecraft mod designed to revert a specific behavior fix [[MC-152728]](https://bugs.mojang.com/browse/MC-152728) related to sprinting while performing certain actions, most notably when flying with Elytra. This mod ensures that players can continue sprinting under circumstances where the game would normally force them to stop. Importantly, Sprintum is not a cheat—it simply disables a client-side check without affecting server-side mechanics, making it a lightweight mod for players who prefer the original behavior.

## Key Features

- **Reverts a fix from Minecraft**: Sprintum restores the original behavior where players could continue sprinting even when performing actions that typically slow them down.
- **Fly Faster with Elytra**: The mod is particularly useful for Elytra users, as it allows players to maintain sprint while flying, resulting in smoother and faster travel.
- **No Server-Side Impact**: Sprintum only changes client-side logic (the `shouldStopSprinting` check), meaning it doesn’t interfere with server-side movement checks or introduce any unfair advantages.
- **Lightweight and Simple**: The mod makes a minimal modification to the game’s code, ensuring compatibility with other mods and Minecraft versions without altering any core mechanics.

## Why Sprintum?

In vanilla Minecraft, after the fix, certain actions such as flying with Elytra, blocking with a shield, or shooting a bow would stop the player from sprinting, even if they were already sprinting beforehand. This fix was intended to ensure the player is slowed down when performing specific actions. However, many players, especially those using Elytra for fast travel, found this change frustrating.

Sprintum modifies the following logic in `LocalPlayer.java`:

```java
public class LocalPlayer extends AbstractClientPlayer {
   ...
   public void aiStep() {
      ...
      if (this.shouldStopSprinting()) {
         this.setSprinting(false);
      }
      ...
   }
}
```

By making `shouldStopSprinting()` always return `false`, Sprintum allows players to continue sprinting even when performing actions that would normally slow them down.

## A Balanced Mod

Sprintum is not a cheat or exploit. It only removes an unnecessary client-side restriction that prevents sprinting during certain actions. It does not alter the game’s server-side functionality or bypass any server-enforced rules. The server still controls whether a player is moving too fast, so Sprintum doesn’t give players an unfair speed boost or other advantages in multiplayer environments.

## Affected Actions

Sprintum reverts the behavior specifically for actions that would normally stop sprinting:

- Sneaking
- Crawling
- Eating or drinking
- Using a spyglass
- Blocking with a shield
- Charging a bow or crossbow
- Preparing to throw a trident
- Using a goat horn
- **Flying with Elytra**

With Sprintum, players can retain sprinting speed during these actions, especially while flying with Elytra, where maintaining speed is most noticeable and beneficial.
