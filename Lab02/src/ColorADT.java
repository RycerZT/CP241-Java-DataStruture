public interface ColorADT {
    public enum ColorEnum {RED, YELLOW, BLUE, GREEN, ORANGE, VIOLET};
    public ColorEnum Mix(ColorEnum color1, ColorEnum color2);
    public boolean primary(ColorEnum color1);
    public ColorEnum[] form(ColorEnum color1);
    public ColorEnum assign(ColorEnum color2);
}
