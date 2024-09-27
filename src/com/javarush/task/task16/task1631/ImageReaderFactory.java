package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        try {
            switch (types) {
                case BMP:
                    return new BmpReader();
                case PNG:
                    return new PngReader();
                case JPG:
                    return new JpgReader();
                default:
                    throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
