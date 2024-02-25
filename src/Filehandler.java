/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Csajbók-Reményi László, 2024-02-25
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    FileWriter fileWriter;
    public void fileWriter(Koltseg koltseg) {
        try {
            fileWriter = new FileWriter("adat.txt", true);
            writeFile(koltseg);
            fileWriter.close();
        } catch (IOException exception) {
            System.err.println("Hiba: " + exception.getMessage());
        }
    }

    private void writeFile(Koltseg koltseg) throws IOException{
            fileWriter.write(koltseg.szallitas.toString() + ":");
            fileWriter.write(koltseg.uzlet.toString() + ":");
            fileWriter.write(koltseg.javitas.toString() + "\n");
    }
}
