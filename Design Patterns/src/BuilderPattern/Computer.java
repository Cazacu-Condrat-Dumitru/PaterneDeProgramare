package BuilderPattern;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();
            computer.CPU = this.CPU;
            computer.GPU = this.GPU;
            computer.RAM = this.RAM;
            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB]";
    }
}
