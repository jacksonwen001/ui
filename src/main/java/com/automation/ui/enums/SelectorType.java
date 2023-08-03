package com.automation.ui.enums;

import lombok.Getter;

@Getter
public enum SelectorType {
    CSS("css"),
    LINK("linkText"),
    XPATH("xpath");

    private String selector;
    SelectorType(String selector) {
        this.selector = selector;
    }
}
