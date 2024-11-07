package Farmer;

// Rider interface defines behavior for entities that can mount and dismount Rideable objects.
public interface Rider {
    void mount(Rideable rideable);

    void dismount(Rideable rideable);
}

