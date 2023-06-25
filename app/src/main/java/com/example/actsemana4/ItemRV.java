package com.example.actsemana4;

public class ItemRV {

    int image;
    int imageHueso;
    String text;
    String text2;
    int imagenHuesoDorado;


    public ItemRV(int image, int imageHueso, String text, String text2, int imagenHuesoDorado) {
        this.image = image;
        this.imageHueso = imageHueso;
        this.text = text;
        this.text2 = text2;
        this.imagenHuesoDorado = imagenHuesoDorado;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImageHueso() {
        return imageHueso;
    }

    public void setImageHueso(int imageHueso) {
        this.imageHueso = imageHueso;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getImagenHuesoDorado() {
        return imagenHuesoDorado;
    }

    public void setImagenHuesoDorado(int imagenHuesoDorado) {
        this.imagenHuesoDorado = imagenHuesoDorado;
    }
}
