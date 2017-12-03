package fakih.cert.finalizer.vulnerable;

class Vulnerable {

    Integer value = 0;

    Vulnerable(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Vulnerable value must be positive");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return (value.toString());
    }
}