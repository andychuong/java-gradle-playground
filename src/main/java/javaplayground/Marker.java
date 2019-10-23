package javaplayground;

public class Marker {

    private boolean isCapped = true;
    private double inkLevel = 1.0;

    public Marker(boolean isCapped, double inkLevel) {
        this.isCapped = isCapped;
        this.inkLevel = inkLevel;
    }

    void cap(){
        isCapped = true;
    }

    void unCap(){
        isCapped = false;
    }

    // Assume each letter written is -0.05 ink
    void write(String letters){
        inkLevel -= letters.length() * 0.05f;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "isCapped=" + isCapped +
                ", inkLevel=" + inkLevel +
                '}';
    }

}
