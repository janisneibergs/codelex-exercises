package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        BigDecimal constante = new BigDecimal(6.28);
        BigDecimal areaCircle = radius.multiply(constante);
        return areaCircle.setScale(2, RoundingMode.HALF_UP);
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        BigDecimal areaRectangle = length.multiply(width);
        return areaRectangle;
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal baseHeight = base.multiply(h);
        BigDecimal areaTriangle = baseHeight.multiply(BigDecimal.valueOf(0.5));
        return areaTriangle.setScale(2, RoundingMode.HALF_UP);
    }
}
