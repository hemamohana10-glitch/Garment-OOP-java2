# Garment-OOP-java2

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


OUTPUT:
<img width="485" height="178" alt="Screenshot 2026-08-27 202814" src="https://github.com/user-attachments/assets/1924d53b-28f3-49f5-bdbc-7a512f82bd78" />
