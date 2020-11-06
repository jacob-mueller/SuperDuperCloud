package com.udacity.jwdnd.course1.cloudstorage.Model;

public class Notes {
    private int noteid;
    private String notetitle;
    private String notedescrition;
    private int userid;

    public Notes(int noteid, String notetitle, String notedescrition, int userid) {
        this.noteid = noteid;
        this.notetitle = notetitle;
        this.notedescrition = notedescrition;
        this.userid = userid;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getNotetitle() {
        return notetitle;
    }

    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle;
    }

    public String getNotedescrition() {
        return notedescrition;
    }

    public void setNotedescrition(String notedescrition) {
        this.notedescrition = notedescrition;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
