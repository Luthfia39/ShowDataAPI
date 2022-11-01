package com.example.showdataapi;

import com.google.gson.annotations.SerializedName;

public class Joke {
    @SerializedName("type")
    private String type;

    @SerializedName("setup")
    private String setup;

    @SerializedName("punchline")
    private String punchline;

    public Joke(String type, String setup, String punchline) {
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public String getType() {
        return type;
    }

    public String getSetup() {
        return setup;
    }

    public String getPunchline() {
        return punchline;
    }
}
