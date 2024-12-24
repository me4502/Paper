package io.papermc.paper.datapack;

import java.util.Set;
import net.kyori.adventure.text.Component;
import org.bukkit.FeatureFlag;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Unmodifiable;
import org.jspecify.annotations.NullMarked;

/**
 * This is a snapshot of a discovered datapack on the server. It
 * won't be updated as datapacks are updated.
 */
@NullMarked
@ApiStatus.NonExtendable
public interface DiscoveredDatapack {

    /**
     * Gets the name/id of this datapack.
     *
     * @return the name of the pack
     */
    @Contract(pure = true)
    String getName();

    /**
     * Gets the title component of this datapack.
     *
     * @return the title
     */
    Component getTitle();

    /**
     * Gets the description component of this datapack.
     *
     * @return the description
     */
    Component getDescription();

    /**
     * Gets if this datapack is required to be enabled.
     *
     * @return true if the pack is required
     */
    boolean isRequired();

    /**
     * Gets the compatibility status of this pack.
     *
     * @return the compatibility of the pack
     */
    Datapack.Compatibility getCompatibility();

    /**
     * Gets the set of required features for this datapack.
     *
     * @return the set of required features
     */
    @Unmodifiable
    Set<FeatureFlag> getRequiredFeatures();

    /**
     * Gets the source for this datapack.
     *
     * @return the pack source
     */
    DatapackSource getSource();
}
