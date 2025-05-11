package org.design_pattern.builder_pattern;

public class Manual {
    private StringBuilder content = new StringBuilder();

    public void addSection(String section) {
        content.append(section).append("\n");
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
