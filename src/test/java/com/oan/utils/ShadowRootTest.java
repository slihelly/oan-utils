package com.oan.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class ShadowRootTest {
    ShadowRootFormatter formatter = new ShadowRootFormatter();

    @Test
    public void test1() {
        assertThat(
                formatter.formatLocatorForShadowRoot(Arrays.asList("aa", "bb"), false)).isEqualTo(
                "return document.querySelector('aa').shadowRoot.querySelectorAll('bb')");
    }

    @Test
    public void test2() {
        assertThat(formatter.formatLocatorForShadowRoot(Arrays.asList("aa", "bb", "cc", "dd"),
                false
        )).isEqualTo(
                "return document.querySelector('aa').shadowRoot.querySelector('bb').shadowRoot.querySelector('cc').shadowRoot.querySelectorAll('dd')");
    }

}
