/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

public class Koltseg {
    Double szallitas;
    Double uzlet;
    Double javitas;

    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }

}
