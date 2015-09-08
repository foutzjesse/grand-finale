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
    //Variables
    private byte status;
    private byte channel;
    private byte one;
    private byte two;
    
    //MIDI messages
    public ArrayList<ArrayList<int[]>> score = new ArrayList<ArrayList<int[]>>();
    
    //Add note to pianoRoll
    public void addNote()
    
    //Delete note from pianoRoll
    //By default, replace with rest
    public void delNote()
    
    //Delete rest from pianoRoll
    //Shore up tick differences.
    public void delRest()
}

//This plays the MIDI data from MidiData
public class MidiPlay{
    //Get sequencer, open, create sequence, add track
    Sequencer sequer = MidiSystem.getSequencer();
    sequer.open();
    private Sequence seq = new Sequence(Sequence.PPQ, 120);
    private Track trk = seq.createTrack();
    
    //Import MIDI data.
    public void midiImport(ArrayList<ArrayList<int[]>> score){
        private Iterator itr = score.iterator();
        private ArrayList<int[]> channel = new ArrayList<int[]>;
        private int[] eventData = new int[];
        private MidiEvent event = new MidiEvent();
        private ShortMessage a = new ShortMessage();
        
        //Channel by channel
        private int channelNo = 0;
        while(itr.hasNext()){
            channelNo++;
            //Event by event
            channel = score.next();
            private Iterator jtr = channel.iterator();
            while(jtr.hasNext()){
                eventData = jtr.next();
                
                //Make MIDI message out of data
                //status, channel, byte 1, byte 2
                a.setMessage(eventData[0], channelNo, eventData[1], eventData[2]);
                //Make MidiEvent out of message
                //message, tick
                event = new MidiEvent(a, eventData[3]);
                
                //Add to track
                trk.add(event);
            }
        }
        
        //Play.
        sequer.start();
    }
}
//This saves the MIDI file
public class MidiSave{
    
}
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
