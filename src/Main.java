import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            loader yes = new loader("C:\\Users\\marke\\IdeaProjects\\CS400\\HashtableImplementation\\xmlloader\\src\\data\\producelist.xml");
            for(produce p : yes.getProducelist())
                System.out.println("[" +p.getName() + ", " + p.getID() + ", $" + p.getPrice() + "]");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


}