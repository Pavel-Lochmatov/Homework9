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
    // поля добавлены из описания вк
    private Donut donut;
    private int  postponed_id;
    private boolean marked_as_ads;
    private int signer_id;
    private Geo geo;
    private String post_type;
    private int friends_only;
    private int reply_post_id;
    private int reply_owner_id;
    private int created_by;

    public Donut getDonut() {
        return donut;
    }

    public Geo getGeo() {
        return geo;
    }

    public int getPostponed_id() {
        return postponed_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public int getSigner_id() {
        return signer_id;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setMarked_as_ads(boolean marked_as_ads) {
        this.marked_as_ads = marked_as_ads;
    }

    public void setPostponed_id(int postponed_id) {
        this.postponed_id = postponed_id;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

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
