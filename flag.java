public class flag {
    public static void main(String[] args) {
        int height = 4; 
        int width = 12;
        int stripeWidth = width / 3; 

        for (int row = 0; row < height; row++) { 
            for (int col = 0; col < width; col++) {
                if (col < stripeWidth) {
                    System.out.print("****");
                } else if (col < stripeWidth * 2) {
                    System.out.print("====");
                } else {
                    System.out.print("****");
                }
            }
            System.out.println();
        }
    }
}
