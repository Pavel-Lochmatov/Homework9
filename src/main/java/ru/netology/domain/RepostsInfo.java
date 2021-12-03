package ru.netology.domain;

public class RepostsInfo {
    private int count; //количество репостов записи
    private boolean currentUserRepost; //есть ли репост от текущего пользователя
    private boolean canRepost; // возможность репоста для текущего пользователя

    public int getCount() {
        return count;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCurrentUserRepost(boolean currentUserRepost) {
        this.currentUserRepost = currentUserRepost;
    }
}
