/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Administrateur
 */
public class Synthetiseur {

    private boolean on;
    private String instrument;
    private int volume;
    private String note;

    ////////////// ALLUMAGE ///////////////////////////////////////////////
    public void allumage() {
        if (on == true) {
            on = false;
        } else {
            on = true;
        }
    }

    ///////////// VOLUME PLUS //////////////////////////////////////////
    public void VolumePlus() {
        
        if ( volume<10){
            volume = volume +1;
        }
    }

    ////////// VOLUME MOINS ///////////////////////////////////////////
    public void VolumeMoins() {
        volume = volume - 1;

        if (volume < 0) {
            volume = 0;
        }

    }
    //////// INSTRUMENT ///////////////////////////////////////////////

    public void instrument(String instru) {
        this.instrument = instru;
    }

    //////// Jouer note ////////////////////////////////////////////////
    public void JouerNote(String laNote) throws MidiUnavailableException, InterruptedException {

        int abc=0;

        if (laNote == "do") {
            abc = 60;
        }
        if (laNote =="re"){
            abc = 62;
        }
        if (laNote =="mi"){
            abc = 64;
        }
        if (laNote =="fa"){
            abc = 65;
        }
        if (laNote =="sol"){
            abc = 67;
        }
        if (laNote =="la"){
            abc = 69;
        }
        if (laNote =="si"){
            abc = 71;
        }
        if (laNote =="do1"){
            abc = 72;
        }
        if (laNote =="lol"){
            abc = 80;
        }

        Synthesizer synth = MidiSystem.getSynthesizer();

        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument(instrus[1]);
        channels[5].noteOn(abc, 600);
        Thread.sleep(500);

    }

///////Affichage ///////////////////////////////////////////////////
public void affiche() {
        System.out.println(" la machine est sur : " + on + "  L'instrument utilisé est : " + instrument
                + " Le volume est à :" + volume + " La note jouée est : " + note);
    }

    /////////////// INITIALISE////////////////////////////////////////////
    public void initialise(boolean on, String instrument, int volume, String note) {
        this.instrument = instrument;
        this.note = note;
        this.on = on;
        this.volume = volume;
    }

    /////////////////SET GET///////////////////////////////////////
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
