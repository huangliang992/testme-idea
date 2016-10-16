package com.weirddev.testme.intellij

/**
 * Date: 10/15/2016
 * @author Yaron Yamin
 */
class IconTokensReplacerTest extends GroovyTestCase {
    private String text = "TestMe w/ <JUnit>JUnit4 & <Mockito>Mockito"

    void testStripTokens() {
      assert "TestMe w/ JUnit4 & Mockito" == new IconTokensReplacer().stripTokens(text)
    }

    void testTokenize() {
        assert [new IconizedLabel("TestMe w/ ",Icons.TEST_ME),new IconizedLabel("JUnit4 & ",IconTokensReplacer.token2Icon.get("JUnit")),new IconizedLabel("Mockito",IconTokensReplacer.token2Icon.get("Mockito"))] == new IconTokensReplacer().tokenize(text, Icons.TEST_ME)
    }
}
