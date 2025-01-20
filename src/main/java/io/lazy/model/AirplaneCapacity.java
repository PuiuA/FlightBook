package io.lazy.model;

public enum AirplaneCapacity {
    MEDIUM(4,9,16),
    LARGE(5,9,27),
    EXTRA_LARGE(6,9,32);

    private final int firstClassRows;
    private final int bussinesClassRows;
    private final int economyClassRows;
    private final int capacity;

    AirplaneCapacity(int firstClassRows, int bussinesClassRows, int economyClassRows) {
        this.firstClassRows = firstClassRows;
        this.bussinesClassRows = bussinesClassRows;
        this.economyClassRows = economyClassRows;
        this.capacity = firstClassRows + bussinesClassRows + economyClassRows;
    }

    public int getFirstClassRows() { return firstClassRows; }
    public int getBussinesClassRows() { return bussinesClassRows; }
    public int getEconomyClassRows() { return economyClassRows; }
    public int getCapacity() { return capacity; }


}
