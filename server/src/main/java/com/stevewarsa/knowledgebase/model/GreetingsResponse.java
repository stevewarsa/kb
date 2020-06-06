package com.stevewarsa.knowledgebase.model;

public class GreetingsResponse {
    private String greetingsTitle;
    private String greetingsBody;

    public GreetingsResponse() {}
    public GreetingsResponse(String greetingsTitle, String greetingsBody) {
        this.greetingsTitle = greetingsTitle;
        this.greetingsBody = greetingsBody;
    }

    public String getGreetingsTitle() {
        return greetingsTitle;
    }

    public void setGreetingsTitle(String greetingsTitle) {
        this.greetingsTitle = greetingsTitle;
    }

    public String getGreetingsBody() {
        return greetingsBody;
    }

    public void setGreetingsBody(String greetingsBody) {
        this.greetingsBody = greetingsBody;
    }
}
