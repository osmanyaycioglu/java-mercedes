package org.training.mercedes.interfaces;

public class TalkRunner  {


    public static void main(String[] xyz) {
        ITalk talk = new TalkFull();
        System.out.println(talk.talk("osman"));
    }
}
