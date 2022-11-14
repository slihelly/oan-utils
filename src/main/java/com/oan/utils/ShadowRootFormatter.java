package com.oan.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ShadowRootFormatter {

    public String formatLocatorForShadowRoot(List<String> locatorList, boolean isFindOne) {

        String formattedMiddleLocators = locatorList.stream().limit(locatorList.size() - 1)
                .map(loc -> String.format(".querySelector('%s')", loc))
                .collect(Collectors.joining(".shadowRoot"));

        return isFindOne ? String.format("return document%s.shadowRoot.querySelector('%s')",
                formattedMiddleLocators, locatorList.get(locatorList.size() - 1)) :
                String.format("return document%s.shadowRoot.querySelectorAll('%s')",
                        formattedMiddleLocators, locatorList.get(locatorList.size() - 1)
                );
    }
}
