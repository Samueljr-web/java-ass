public class usFlag {
    public static void main(String[] args){
        int flagHeight = 6;
        for(int i = 0; i < flagHeight; i++){
            String row = " ";
            if (i < 3){
                row = "****=======****";
            }else{
                row = "=====  =====";
            }
        }
    }
}