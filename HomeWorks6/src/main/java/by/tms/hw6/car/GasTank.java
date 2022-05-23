package by.tms.hw6.car;

public class GasTank {
    private int volumeGasTank;
    private int amountOfGas;

    public GasTank(int volumeGasTank, int amountOfGas) {
        this.volumeGasTank = volumeGasTank;
        this.amountOfGas = amountOfGas;
    }

    public GasTank() {

    }

    public int getVolumeGasTank() {
        return volumeGasTank;
    }

    public void setVolumeGasTank(int volumeGasTank) {
        this.volumeGasTank = volumeGasTank;
    }

    public int getAmountOfGas() {
        return amountOfGas;
    }

    public void setAmountOfGas(int amountOfGas) {
        this.amountOfGas = amountOfGas;
    }
}
