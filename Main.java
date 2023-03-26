import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        BinaryTree binaryTree = new BinaryTree(hashMap);

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Traducir la palabra casa");
                System.out.println("2. Traducir la palabra perro");
                System.out.println("3. Traducir la palabra tarea");
                System.out.println("4. Traducir la palabra mujer");
                System.out.println("5. Traducir la palabra pueblo");
                System.out.println("6. Traducir la palabra si");
                System.out.println("7. Salir");

                System.out.print("Ingrese su elección: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("La traducción de casa es: " + SearchTree.search(binaryTree, 1));
                        break;
                    case 2:
                        System.out.println("La traducción de perro es: " + SearchTree.search(binaryTree, 2));
                        break;
                    case 3:
                        System.out.println("La traducción de tarea es: " + SearchTree.search(binaryTree, 3));
                        break;
                    case 4:
                        System.out.println("La traducción de mujer es: " + SearchTree.search(binaryTree, 4));
                        break;
                    case 5:
                        System.out.println("La traducción de pueblo es: " + SearchTree.search(binaryTree, 5));
                        break;
                    case 6:
                        System.out.println("La traducción de si es: " + SearchTree.search(binaryTree, 6));
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } while (choice != 7);
        }
    }
}
