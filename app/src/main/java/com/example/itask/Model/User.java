package com.example.itask.Model;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private long xp;
    private long points;
    private long deletable;
    private long max;
    private long spent;
    private long streak;

    public User(String i,String f,String l,String e,long xp, long points,long deletable,long max,long spent,long streak)
    {
        this.id=i;
        this.firstname=f;
        this.lastname=l;
        this.email=e;
        this.xp=xp;
        this.points=points;
        this.deletable=deletable;
        this.max=max;
        this.spent=spent;
        this.streak=streak;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public long getXp() {
        return xp;
    }

    public void setXp(long xp) {
        this.xp = xp;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public long getDeletable() {
        return deletable;
    }

    public void setDeletable(int deletable) {
        this.deletable = deletable;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getSpent() {
        return spent;
    }

    public void setSpent(long spent) {
        this.spent = spent;
    }

    public long getStreak() {
        return streak;
    }

    public void setStreak(long streak) {
        this.streak = streak;
    }
}
