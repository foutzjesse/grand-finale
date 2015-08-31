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
    private void playMusic(int tempo){
        try {
            private Sequencer sequencer;
            // Get default sequencer.
            sequencer = MidiSystem.getSequencer(); 
            if (sequencer == null) {
                // Error -- sequencer device is not supported.
                // Inform user and return...
            } else {
                // Acquire resources and make operational.
                sequencer.open();
            }
            
            private Sequence mySeq = new Sequence(Sequence.PPQ, 60);
            private Track track = mySeq.createTrack();
            
            // Add events to track using makeEvent
            //track.add(makeEvent(command, channel, first byte, second byte, tick));
            
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(tempo);
            sequencer.start();
        } catch(Exception exc){}
    }
    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
       MidiEvent event = null;
       try {
           ShortMessage a = new ShortMessage();
           a.setMessage(comd, chan, one, two);
           event = new MidiEvent(a, tick);
       } catch (Exception exc){}
       return event;
    }
}
