
public class ImageProcessor {
    public static void main(String[] args) {
        // Representing an image as a 2D array of pixel values (0-255)
        int[][] image = {
                {100, 200, 50},
                {150, 250, 100},
                {200, 50, 150}
        };

        // Invert the image
        int[][] invertedImage = invertImage(image);

        // Print the inverted image
        for (int i = 0; i < invertedImage.length; i++) {
            for (int j = 0; j < invertedImage[0].length; j++) {
                System.out.print(invertedImage[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] invertImage(int[][] image) {
        int[][] invertedImage = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                // Invert the pixel value by subtracting from 255
                invertedImage[i][j] = 255 - image[i][j];
            }
        }

        return invertedImage;
    }
}

