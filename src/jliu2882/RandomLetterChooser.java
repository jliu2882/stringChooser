package jliu2882;

public class RandomLetterChooser {
    private String word;

    public RandomLetterChooser(String word){
        this.word = word;
    }

    public static String[] getSingleLetters(String str){
        int num;
        String[] newArr  = new String[str.length()];
        for(int i = 0 ; i < str.length();i++){
            num = (int)(Math.random()*str.length());
            newArr[i]=str.substring(num,num+1);
            str = str.substring(0,num) + str.substring(num+1);
        }
        return newArr;
    }

    public  String getNext(){
        String[] newArr = getSingleLetters(word);
        String next = "NONE";
        if(word.length()>0) {
            int num = (int) (Math.random() * newArr.length);
            next = this.word.substring(num, num + 1);
            word = word.substring(0, num) + word.substring(num + 1);
        }
        return next;
    }
}
