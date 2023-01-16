
public class Main {
    public static void main(String[] args) {
    var imageStorage = new ImageStorage(new JPGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("helloWorld.png");
    }
     }



    /*
    * THE PROBLEM:
    * public class ImageStorage {
    private String compressor;
    private String filter;
    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void sotre(String fileName){
        if (compressor ==
   "jpeg")
            System.out.println("compressing using jpeg");
        else if (compressor == "png")
            System.out.println("Ciompressing using png");

        if (filter == "b&w")
            System.out.println("applying b&w filter");
        else if (filter == "applying High contrast filter");

    }
}
    * */