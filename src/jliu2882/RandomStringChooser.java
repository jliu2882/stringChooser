package jliu2882;

import java.util.ArrayList;

public class RandomStringChooser {
    private String[] strings;

    public RandomStringChooser(String[] strs){
        this.strings = strs;
    }

    public String getNext(){
        int num = (int)(Math.random()*strings.length);
        String next = "NONE";
        if(strings.length>0) {
            next = strings[num];
            strings = remove(strings, num);
        }
        return next;
    }

    public String[] remove(String[] arr, int pl){
        String[] newArr = new String[arr.length-1];
        for(int i = 0; i < pl; i++){
            newArr[i] = arr[i];
        }
        for(int i = pl; i < arr.length-1; i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    }
}
