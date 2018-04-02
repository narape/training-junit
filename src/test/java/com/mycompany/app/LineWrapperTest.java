package com.mycompany.app;

import static com.mycompany.app.LineWrapper.lineWrap;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineWrapperTest {

  @Test(expected = NullPointerException.class)
  public void shouldReturnErrorForNullText() {
    lineWrap(null, 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldReturnErrorForWithLessThanOne() {
    lineWrap("some text", 0);
  }

  @Test
  public void shouldNotCutShortLines() {
    String wrappedText = lineWrap("small", 10);

    assertEquals("small", wrappedText);
  }

  @Test
  public void shouldCutLongLines() {
    String wrappedText = lineWrap("a long line wider than width", 15);

    assertEquals("a long line\nwider than\nwidth", wrappedText);
  }

  @Test
  public void shouldLeaveLongWordsOnItsOwnLine() {
    String wrappedText = lineWrap("one twotwotwo three", 5);

    assertEquals("one\ntwotwotwo\nthree", wrappedText);
  }

  @Test
  public void shouldKeepParagraphApart() {
    String wrappedText = lineWrap("one two three four\nfive", 15);

    assertEquals("one two three\nfour\nfive", wrappedText);
  }


  @Test
  public void shouldKeepInternalWhitespaces() {
    String wrappedText = lineWrap("line    with whitespace", 50);

    assertEquals("line    with whitespace", wrappedText);
  }
}