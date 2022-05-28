package pl.migibud.day2.ex20and21and22sda;

public interface Fillable {
    int fill(double volume);

    default double doubleVolume(double figureVolume,double extraVolume){
        return figureVolume+extraVolume;
    }
}
