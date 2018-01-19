
package com.corey.mustardrocket.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Liveries {

    @SerializedName("liveries")
    @Expose
    public List<Livery> liveries = null;

}
