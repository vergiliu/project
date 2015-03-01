package io.github.vergiliu;


public class Greeting {
    private final long id;
    private final String name;
    private final String message;

    public Greeting(long anId, String aName) {
        this.id = anId;
        this.name = aName;
        this.message = String.valueOf(this.getId() * 100);
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public String getMessage() {
        return message;
    }
}
