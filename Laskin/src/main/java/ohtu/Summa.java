/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author juuso_j0pbwen
 */
public class Summa implements Komento {

    private final Sovelluslogiikka sovellus;
    private final JTextField tuloskentta;
    private final JTextField syotekentta;
    private int syote;
    private int tulos;

    Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        tulos = Integer.parseInt(tuloskentta.getText());
        syote = Integer.parseInt(syotekentta.getText());
        syotekentta.setText("");
        tuloskentta.setText((tulos + syote) + "");
    }

    @Override
    public void peru() {
        tuloskentta.setText((Integer.parseInt(tuloskentta.getText()) - syote) + "");
    }

}
