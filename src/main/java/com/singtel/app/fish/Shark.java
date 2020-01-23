package com.singtel.app.fish;

import com.singtel.app.model.Fish;
import com.singtel.app.util.Color;
import com.singtel.app.util.Size;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Shark  extends Fish {

    public  Shark(){
        this.size= Size.LARGE;
        this.color=Color.GREY;
    }
}
