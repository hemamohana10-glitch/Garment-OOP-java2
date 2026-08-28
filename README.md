# Garment Management System

1. Problem Statement:

Develop a Java application to represent a garment using object-oriented
programming concepts. The program should store garment type, size, and
tailor name and display the garment details.

2. Objective

To develop a simple Java application using classes, objects,
constructors, encapsulation-related concepts, and methods.

3.OOP Concepts Used

1. Class
2. Object
3. Constructor
4. Encapsulation
5. Methods

4. Class Diagram

Hema
![Uploading garrment classs diagram.jpeg…]()


5. Algorithm

1. Start the program.
2. Create the Hema class.
3. Declare type, size, and tailorName.
4. Create a constructor to initialize the values.
5. Create the display() method.
6. Create an object of the Hema class.
7. Call display() to print garment details.
8. Stop the program.

6. Program Execution

1. Install Java JDK.
2. Open the project in VS Code or another Java IDE.
3. Save the file as Hema.java.
4. Compile using:

javac Hema.java

 Run using:

java Hema

## Sample Output

--- Garment Details ---
Type   : Shirt
Size   : M
Tailor : Ravi

## Test Cases

| Test Case | Type | Size | Tailor | Expected Result |
|-----------|------|------|--------|-----------------|
| 1 | Shirt | M | Ravi | Details displayed |
| 2 | Pant | L | Kumar | Details displayed |
| 3 | Kurta | S | Arun | Details displayed |

## Challenges Faced and Solutions

### Challenge 1
The constructor name was incorrect.

### Solution
The constructor name was changed to match the class name.

### Challenge 2
The object was not created correctly.

### Solution
A Hema object was created using the parameterized constructor.

## Conclusion

The Garment Management System was successfully developed using Java
and basic OOP concepts. The program was compiled, executed, and tested
with different inputs.# Garment-OOP-java2

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

Challenges I faced:

1. Constructor Error
The constructor name was incorrectly written as Main instead of Hema.
Solution: Changed the constructor name to match the class name Hema.


2. Compilation Error
The program initially showed errors while compiling.
Solution: Corrected the class, constructor, object creation, and method calls.


3. GitHub Repository Creation
Initially, I faced difficulty creating and organizing the project files in GitHub.
Solution: Created a repository, uploaded the .java file, and added a README.md file.


4. README Documentation
Preparing all the required sections such as the objective, algorithm, test cases, and UML diagram was challenging.
Solution: Organized the README into separate sections according to the assignment requirements.


<img width="1920" height="1080" alt="Screenshot 2026-08-27 200908" src="https://github.com/user-attachments/assets/f11d39c0-278c-4266-aa53-4e4d479afbe0" />
<img width="1920" height="1080" alt="Screenshot 2026-08-27 200448" src="https://github.com/user-attachments/assets/54729d73-2295-422c-92e7-85319fea1006" />


