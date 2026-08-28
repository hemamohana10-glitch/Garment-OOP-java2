
// Main class representing the garment program

public class Hema{
    String type;
    String size;
    String tailorName;
    public Hema(String type, String size, String tailorName) {
        this.type = type;
        this.size = size;
        this.tailorName = tailorName;
    }
    public void display() {
        System.out.println("--- Garment Details ---");
        System.out.println("Type   : " + type);
        System.out.println("Size   : " + size);
        System.out.println("Tailor : " + tailorName);
    }
    public static void main(String[] args) {
        // Create object and call display
        Hema garment = new Hema("Shirt", "Medium", "John Tailors");
        garment.display();
    }
}


