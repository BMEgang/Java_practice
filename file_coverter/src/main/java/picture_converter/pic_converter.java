package picture_converter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.*;

//    example
//    String src = "E:/2.";
//    new FormatConversion().Conversion(JPG,PNG,src);//JPG转成PNG
//    new FormatConversion().Conversion(JPG,GIF,src);//JPG转成GIF
//    new FormatConversion().Conversion(JPG,BMP,src);//JPG转成BMP

public class pic_converter {
    public static final String JPG = "jpg";
    public static final String GIF = "gif";
    public static final String PNG = "png";
    public static final String BMP = "bmp";

    //inputFormat表示原格式，outputFormat表示转化后的格式, src是图片的文件路径
    public void picture_Conversion(String inputFormat,String outputFormat,String src){
        try {
            File input = new File(src+inputFormat);
            BufferedImage bim = ImageIO.read(input);
            File output = new File(src+outputFormat);
            ImageIO.write(bim, outputFormat, output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
