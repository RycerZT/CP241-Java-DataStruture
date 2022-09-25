import java.awt.*;

public class MyColor implements ColorADT{
    private ColorEnum color;

    public  MyColor(ColorEnum s){
        color = s;
    }

    @Override
    public ColorEnum Mix(ColorEnum color1, ColorEnum color2) {
        ColorEnum smixColor;
        smixColor = ColorEnum.RED;
        if(color1 == ColorEnum.RED){
            if (color2 == ColorEnum.YELLOW)
                smixColor  = ColorEnum.ORANGE;
            else
                smixColor = ColorEnum.VIOLET;
        }
        if (color1 == ColorEnum.YELLOW){
            if(color2 == ColorEnum.BLUE)
                smixColor = ColorEnum.GREEN;
            else
                smixColor = ColorEnum.ORANGE;
        }
        if(color1 == ColorEnum.BLUE){
            if ((color2 == ColorEnum.RED)){
                smixColor = ColorEnum.VIOLET;
            }
            else
                smixColor = ColorEnum.GREEN;
        }
        return smixColor;
    }

    @Override
    public boolean primary(ColorEnum color1) {
        if(color1 == ColorEnum.BLUE||color1 == ColorEnum.RED||color1 == ColorEnum.YELLOW ){
            return true;
        }else
            return false;
    }

    @Override
    public ColorEnum[] form(ColorEnum color1) {
        ColorEnum[] colorEnum = new ColorEnum[2];
        if(color1 == ColorEnum.ORANGE){
            colorEnum[0] = ColorEnum.RED;
            colorEnum[1] = ColorEnum.YELLOW;
        }
        if(color1 == ColorEnum.GREEN){
            colorEnum[0] = ColorEnum.BLUE;
            colorEnum[1] = ColorEnum.YELLOW;
        }
        if (color1 == ColorEnum.VIOLET){
            colorEnum[0] = ColorEnum.RED;
            colorEnum[1] = ColorEnum.BLUE;
        }
        return colorEnum;
    }

    @Override
    public ColorEnum assign(ColorEnum color2) {
        ColorEnum NAssign = color2;
        return NAssign;
    }
}
