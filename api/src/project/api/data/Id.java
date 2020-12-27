package project.api.data;

public class Id<U> {
    public Id(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Id)) return false;
        Id<U> otherId = (Id<U>) o;
        return otherId.value == this.value;
    }
}