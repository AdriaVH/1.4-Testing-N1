package org.ex3.main;

import org.ex3.classes.ThrowsIndexOutBounds;

public class Main {
    public static void main(String[] args) {
        ThrowsIndexOutBounds throwsIndexOutBounds = new ThrowsIndexOutBounds();

        String valueOutOfBounds = throwsIndexOutBounds.accesElement(new int[] {0, 2, 4}, 7);
    }
}
