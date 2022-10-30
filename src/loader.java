import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class loader {
    private ArrayList<produce> producelist;
    public void loader(String fileName) throws IOException {
        System.out.println("here");
        File file = new File(fileName);
        if(!file.exists())
            throw new IOException("your shit aint here");
        Scanner scnr = new Scanner(file);
        boolean done = false;
        while(!done) {
            String temp = scnr.nextLine();
            if(temp.equals("<producelist>\n"));
                done = true;
        }
        while(scnr.hasNext()) {
            String current = scnr.nextLine();
            String[] allthethings = current.split("<");
            if(current.contains("produce") && !current.contains("producelist")) {
                String[] anotherthing = allthethings[1].split("\"");
                produce temp = new produce(anotherthing[1]);
                current = scnr.nextLine();
                if(current.contains("name")) {
                    allthethings = current.split("<");

                    anotherthing = allthethings[1].split(">");
                    temp.setName(anotherthing[1]);
                    current = scnr.nextLine();
                    if(current.contains("price")) {
                        allthethings = current.split("<");
                        anotherthing = allthethings[1].split(">");
                        temp.setPrice(Double.parseDouble(anotherthing[1]));
                        current = scnr.nextLine();
                        producelist.add(temp);
                    }
                }

            }

        }
    }
    public loader(String filename) throws IOException {
        producelist = new ArrayList<produce>();
        loader(filename);
    }

    public ArrayList<produce> getProducelist() {
        return producelist;
    }
}
