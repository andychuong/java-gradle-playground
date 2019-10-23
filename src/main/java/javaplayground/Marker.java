package javaplayground;

public class Marker {
    @Override
    public String toString() {
        return "Marker{" +
                "isCapped=" + isCapped +
                ", inkLevel=" + inkLevel +
                '}';
    }

    private boolean isCapped = true;

    private float inkLevel = 1.0;

}
