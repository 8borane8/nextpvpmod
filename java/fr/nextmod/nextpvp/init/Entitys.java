package fr.nextmod.nextpvp.init;

import cpw.mods.fml.common.registry.EntityRegistry;
import fr.nextmod.nextpvp.Main;
import fr.nextmod.nextpvp.entitys.*;

public class Entitys {

    public static void registerEntitys() {
        createEntity(EntityDynamite.class, "dynamite");
        createEntity(EntityBigDynamite.class, "big_dynamite");
        createEntity(EntityNinjaDynamite.class, "ninja_dynamite");
        createEntity(EntityUltimateDynamite.class, "ultimate_dynamite");
        createEntity(EntitySicknessPotion.class, "sickness_potion");
        createEntity(EntityWebPotion.class, "web_potion");
        createEntity(ArrowEntity.class, "switch_arrow");
    }

    public static void createEntity(Class entityClass, String entityName) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.instance, 64, 1, true);
    }

}
