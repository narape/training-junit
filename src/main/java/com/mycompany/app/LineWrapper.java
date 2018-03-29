package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LineWrapper {

  public static String lineWrap(String text, int witdh) {
    Objects.requireNonNull(text);
    if (witdh < 1) {
      throw new IllegalArgumentException("width must be at least 1: " + witdh);
    }

    String[] paragraphs = text.split("\n");
    return Arrays.stream(paragraphs)
        .map(paragraph -> lineWrapParagraph(paragraph, witdh))
        .collect(Collectors.joining("\n"));
  }

  private static String lineWrapParagraph(String paragraph, int width) {
    String[] words = paragraph.split(" ");
    StringBuilder line = new StringBuilder();
    List<String> lines = new ArrayList<>();
    for (String word : words) {
      if (line.length() > 0 && line.length() + word.length() + 1 > width) {
        lines.add(line.toString());
        line = new StringBuilder();
      }
      if (line.length() > 0) {
        line.append(' ');
      }
      line.append(word);
    }
    lines.add(line.toString());
    return lines.stream()
        .collect(Collectors.joining("\n"));
  }
}

