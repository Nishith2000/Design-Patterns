package org.design_pattern.adapter_pattern;

public class IntegerEnumerationConcrete implements IntegerEnumeration {

    private final int[] nums;
    private int index = 0;
    private static final int MAX_SIZE = 10;

    public IntegerEnumerationConcrete() {
        this.nums = new int[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            nums[i] = i;
        }
    }

    @Override
    public Integer nextElement() {
        return nums[index++];
    }

    @Override
    public boolean hasMoreElements() {
        return index < MAX_SIZE;
    }
}
