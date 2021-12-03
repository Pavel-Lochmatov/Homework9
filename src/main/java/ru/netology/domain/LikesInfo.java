package ru.netology.domain;

public class LikesInfo {
    private int count; //количество лайков записи
    private boolean canLike; //возможность лайка для текущего пользователя
    private boolean currentUserLike; // есть ли лайк от текущего пользователя

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCurrentUserLike(boolean currentUserLike) {
        this.currentUserLike = currentUserLike;
    }
}
