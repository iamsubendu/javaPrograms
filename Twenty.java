class Twenty {
    // attributes
    static String planet; // class attribute
    String name;
    String color;
    boolean canFly;
    private static int count = 0;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void updateCount() {
        count++;
        System.out.println(count);
    }
}
