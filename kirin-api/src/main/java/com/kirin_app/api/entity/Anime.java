package com.kirin_app.api.entity;

public class Anime {
    private int id;
    private Title title;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Title {
        private String romaji;
        private String english;
        private String nativeTitle;

        public String getRomaji() {
            return romaji;
        }

        public void setRomaji(String romaji) {
            this.romaji = romaji;
        }

        public String getEnglish() {
            return english;
        }

        public void setEnglish(String english) {
            this.english = english;
        }

        public String getNativeTitle() {
            return nativeTitle;
        }

        public void setNativeTitle(String nativeTitle) {
            this.nativeTitle = nativeTitle;
        }
    }
}
