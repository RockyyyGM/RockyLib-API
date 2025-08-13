package dev.rocky.rockylib.platform.services;

public interface ForgeRockyLibEventSetup {
    /**
     * Registers common event handlers for the RockyLib mod.
     */
    void registerCommon();

    /**
     * Registers client-specific event handlers for the RockyLib mod.
     */
    void registerClient();

    /**
     * Registers server-specific event handlers for the RockyLib mod.
     */
    void registerServer();
}
