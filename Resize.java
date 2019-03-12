public class Resize {
    
    
    
    public static void main(String[] args) {
        float width = 600;
        float length = 400;
        
        float x = 800;
        float y = 2;
        float rate = length / width;
        
        for (float newWidth = x; newWidth > 0; newWidth--) {
            float newLenght = rate * newWidth;
            if (newLenght % 2 == 0 || newLenght % 2 == 1) {
                System.out.println(newWidth + " x " + newLenght);
                break;
            }
        }
    }
    
}