package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int buttonPresses = 0;
        int buttonPressesBack = 0;

        String[] playlistClone = new String[playList.length];
        playlistClone[0] = playList[0];
        int j = 1;

        for(int i = playList.length - 1; i > 0; i--) {
            playlistClone[j] = playList[i];
            j++;
        }

        for (int i = startIndex; i < playlistClone.length; i++) {
            if(playlistClone[i].equals(selection)){
                break;
            } else {
                buttonPressesBack++;
            }
        }

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                break;
            } else {
                buttonPresses++;
            }
        }

        return (buttonPressesBack > 0 && buttonPressesBack < buttonPresses) ? buttonPressesBack : buttonPresses;
    }
}
