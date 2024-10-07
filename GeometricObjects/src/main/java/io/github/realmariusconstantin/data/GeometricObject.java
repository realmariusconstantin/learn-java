package io.github.realmariusconstantin.data;

import java.awt.*;
import java.time.LocalDate;

public class GeometricObject {
    private Color color;
    private boolean filled;
    private final LocalDate dateCreated;

    public GeometricObject() {
        color = Color.RED;
        filled = false;
        dateCreated = LocalDate.now();
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }


    @Override
    public String toString() {
        return String.format("color: %s filled: %b dateCreated : %s", color, filled, dateCreated);
    }

}
