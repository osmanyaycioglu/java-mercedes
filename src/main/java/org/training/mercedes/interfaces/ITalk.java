package org.training.mercedes.interfaces;

public interface ITalk {

    public static final int TALK_ENGLISH_INDEX = 1;
    public static final int TALK_TURKISH_INDEX = 2;

    String goodMorning(String name);

    String goodAfternoon(String name);

    String goodNight(String name);

    default String talk(String name) {
        StringBuilder stringBuilder = new StringBuilder(50);
        return stringBuilder.append(goodMorning(name))
                            .append("\n")
                            .append(goodAfternoon(name))
                            .append("\n")
                            .append(goodNight(name))
                            .toString();
    }

    public static boolean isEmpty(String str){
        System.out.println( TALK_ENGLISH_INDEX);
        return str == null || str.isEmpty();
    }

}
