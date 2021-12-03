package ru.netology.domain;

public class Post {

    private int id; //ид записи
    private int avtorId; //ид автора записи
    private int ownerId; //ид владельца стены
    private int date; //дата записи
    private String note; //текст записи
    private boolean isPinned; //запись закреплена
    private boolean canPinned; //возможность закрепления записи
    private boolean canRemove; //возможность удаления записи
    private boolean canEdit; //возможность редактирования записи
    private boolean addBookmarks; //добавлена в закладки
    private boolean canComplain; //возможность пожаловаться на запись
    private int views; // колво просмотров

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;

    public int getAvtorId() {
        return avtorId;
    }

    public int getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getNote() {
        return note;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public int getViews() {
        return views;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }
    public void setAvtorId(int avtorId) {
        this.avtorId = avtorId;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setCanPinned(boolean canPinned) {
        this.canPinned = canPinned;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setCanRemove(boolean canRemove) {
        this.canRemove = canRemove;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setAddBookmarks(boolean addBookmarks) {
        this.addBookmarks = addBookmarks;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
