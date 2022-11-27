//아래 코드를 조건에 맞게 구현 하세요, 필요시 수정해야 합니다.

abstract class Computer {
    protected String memory, disk;
    protected boolean powered;

    public Computer(String memory, String disk, boolean powered) {
        this.memory = memory;
        this.disk = disk;
        this.powered = powered;
    }

    public Computer() {
        this("4GB", "300GB", false);
    }

    public String getMemory() {
        return this.memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return this.disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public boolean getPowered() {
        return this.powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    abstract public void powerOn();
}

class Notebook extends Computer {
    private int battery;

    public Notebook(String memory, String disk, boolean powered, int battery) {
        super(memory, disk, powered);
        this.battery = battery;
    }

    public Notebook() {
        super();
        this.battery = 100;
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public void powerOn() {
        if (this.battery > 0)
            this.powered = true;
    }
}

class Desktop extends Computer {
    private boolean plugged;

    public Desktop(String memory, String disk, boolean powered, boolean plugged) {
        super(memory, disk, powered);
        this.plugged = plugged;
    }

    public Desktop() {
        super();
        this.plugged = false;
    }

    public boolean getPlugged() {
        return this.plugged;
    }

    public void setPlugged(boolean plugged) {
        this.plugged = plugged;
    }

    @Override
    public void powerOn() {
        if (this.plugged)
            this.powered = true;
    }
}

// 아래 코드는 지우지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}