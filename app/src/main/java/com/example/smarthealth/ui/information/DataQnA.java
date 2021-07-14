package com.example.smarthealth.ui.information;

public class DataQnA {
    String title;
    String script;

    public DataQnA(String title, String script){
        this.title = title;
        this.script = script;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
}
