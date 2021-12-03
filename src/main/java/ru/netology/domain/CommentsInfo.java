package ru.netology.domain;

public class CommentsInfo {
    private int count; // количество коментов
    private boolean canPost; //может ли текущий пользователь комментировать запись
    private boolean canOpen;  //может ли текущий пользователь открыть коментарии к записи
    private boolean canClose;  //может ли текущий пользователь закрыть коментарии к записи
    private boolean canRemove; //может ли текущий пользователь удалить коментарий
    private boolean canLike; //может ли текущий пользователь нажать понравиться у комментария
    private int date;       //дата и время комментария
    private boolean canRepost; //может ли текущий пользователь репостнуть комментарий
    private boolean canAnswer; // может ли текущий пользователь ответить на комментарий
    private String textComment; // текст комментария
    private int avtorId; //автор комментария

    public int getCount() {
        return count;
    }

    public int getDate() {
        return date;
    }

    public int getAvtorId() {
        return avtorId;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public void setCanRemove(boolean canRemove) {
        this.canRemove = canRemove;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setCanAnswer(boolean canAnswer) {
        this.canAnswer = canAnswer;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setAvtorId(int avtorId) {
        this.avtorId = avtorId;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
}
