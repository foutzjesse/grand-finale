package com.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import javax.swing.*;
import java.awt.*;
import javax.sound.midi.*;

public class GrandFinale extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
//This contains the data used to construct the MIDI sequence.
public static class MidiData{
    //MIDI messages
    public ArrayList<ArrayList<int[]>> pianoRoll = new ArrayList<ArrayList<int[]>>();
    
    //Add note to pianoRoll
    public addNote
    
    //Delete note from pianoRoll
    //By default, replace with rest
    public delNote
    
    //Delete rest from pianoRoll
    //Shore up tick differences.
    public delRest
}
//This plays the MIDI data from MidiData, or saves the file.
public class MidiPlay

/*********************************************************
    //Compiles and plays whole piece.
    public static void makeMusic(int tempo){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            
            private Sequence mySeq = new Sequence(Sequence.PPQ, 120);
            private Track track = mySeq.createTrack();
            public void addNote(int chan, int one, int two, int tick){
                MidiEvent on = noteOn(chan, one, two, tick);
                MidiEvent off = null;
                
            }
            
            // Add events to track using makeEvent
            //track.add(addNote(command, channel, first byte, second byte, tick));
            
            sequencer.setSequence(mySeq);
            sequencer.setTempoInBPM(tempo);
            public void play(){
                sequencer.start();
            }
        } catch(Exception exc){}
    }
    // code to add NOTE_ON
    public MidiEvent noteOn(int chan, int one, int two, int tick) {
       MidiEvent event = null;
       try {
           ShortMessage a = new ShortMessage();
           a.setMessage(a.NOTE_ON, chan, one, two);
           event = new MidiEvent(a, tick);
       } catch (Exception exc){}
       return event;
    }
    public MidiEvent noteOff(int chan, int one, int two, int tick) {
       MidiEvent event = null;
       try {
           ShortMessage a = new ShortMessage();
           a.setMessage(a.NOTE_OFF, chan, one, two);
           event = new MidiEvent(a, tick);
       } catch (Exception exc){}
       return event;
    }
}
