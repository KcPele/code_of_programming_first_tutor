package Generics;

import java.util.ArrayList;

class Picture{
    public String toString(){
        return "I am taking a picture for someone";
    }

}
class Snap extends Picture{
@Override
public String toString(){
    return "I am taking a picture for someone";
}
}



public class GenAndWildCards {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<Picture>();
        list.add(new Picture());
        list.add(new Picture());
        showList(list);

    }
    public static void showList(ArrayList<Picture> list){
        for(Picture value: list){
            System.out.println(value);
        }
    }
}
