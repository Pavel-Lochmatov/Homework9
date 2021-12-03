package ru.netology.domain;

public class Donut {
    private boolean is_donut;
    private int paid_duration;
    private boolean can_publish_free_copy;
    private String edit_mode;

    public void setCan_publish_free_copy(boolean can_publish_free_copy) {
        this.can_publish_free_copy = can_publish_free_copy;
    }

    public void setEdit_mode(String edit_mode) {
        this.edit_mode = edit_mode;
    }

    public void setIs_donut(boolean is_donut) {
        this.is_donut = is_donut;
    }

    public void setPaid_duration(int paid_duration) {
        this.paid_duration = paid_duration;
    }

    public int getPaid_duration() {
        return paid_duration;
    }

    public String getEdit_mode() {
        return edit_mode;
    }
}
