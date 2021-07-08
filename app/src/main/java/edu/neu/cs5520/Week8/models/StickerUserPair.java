package edu.neu.cs5520.Week8.models;

public class StickerUserPair {
    public String sentByUsername;
    public String stickerName;

    public StickerUserPair() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public StickerUserPair(String sentByUsername, String stickerName) {
        this.sentByUsername = sentByUsername;
        this.stickerName = stickerName;
    }
}
