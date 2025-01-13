package net.riflusso.sprintum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Sprintum {
    public static final String MOD_ID = "sprintum";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Initializing Sprintum");
    }
}
