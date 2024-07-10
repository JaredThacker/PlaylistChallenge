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

        for (int i = startIndex; i >= 0; i--){
            if(playList[i].equals(selection)){
                break;
            }
            else if(i == 0){
                i = playList.length;
            }
            buttonPressesBack++;
        }

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                break;
            } else {
                buttonPresses++;
            }
        }

        return (buttonPressesBack < buttonPresses) ? buttonPressesBack : buttonPresses;
    }
}
