package net.runelite.client.plugins.microbot.shunter.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum hunterMode {
    BUTTERFLY("Butterflies"),
    SALAMANDER("Salamander");


    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
