
package com.corey.mustardrocket.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Livery {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("year")
    @Expose
    public String year;
    @SerializedName("reg")
    @Expose
    public String reg;

}
