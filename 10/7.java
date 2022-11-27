//아래 코드를 조건에 맞게 구현하세요, 필요 시엔 코드를 수정해야 합니다.
abstract class AudioDevice {
    protected int volume, soundQuality;

    public AudioDevice(int volume, int soundQuality) {
        this.volume = volume;
        this.soundQuality = soundQuality;
    }

    public AudioDevice() {
        this(0, 0);
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSoundQuality() {
        return this.soundQuality;
    }

    public void setSoundQuality(int soundQuality) {
        this.soundQuality = soundQuality;
    }
}

interface BluetoothInterface {
    public boolean getBluetoothMode();

    public void setBluetoothMode(boolean bluetoothMode);
}

interface MicrophoneInterface {
    public int getMicQuality();

    public void setMicQuality(int micQuality);
}

class Speaker extends AudioDevice {
    protected int way;

    public Speaker(int volume, int soundQuality, int way) {
        super(volume, soundQuality);
        this.way = way;
    }

    public Speaker() {
        this(0, 0, 1);
    }

    public int getWay() {
        return this.way;
    }

    public void setWay(int way) {
        this.way = way;
    }
}

class BluetoothSpeaker extends Speaker implements BluetoothInterface {
    private boolean bluetoothMode;

    public BluetoothSpeaker(int volume, int soundQuality, int way, boolean bluetoothMode) {
        super(volume, soundQuality, way);
        this.bluetoothMode = bluetoothMode;
    }

    public BluetoothSpeaker() {
        this(0, 0, 1, false);
    }

    @Override
    public boolean getBluetoothMode() {
        return this.bluetoothMode;
    }

    @Override
    public void setBluetoothMode(boolean bluetoothMode) {
        this.bluetoothMode = bluetoothMode;
    }
}

class Headset extends AudioDevice implements MicrophoneInterface {
    private int micQuality;

    public Headset(int volume, int soundQuality, int micQuality) {
        super(volume, soundQuality);
        this.micQuality = micQuality;
    }

    public Headset() {
        this(0, 0, 0);
    }

    @Override
    public int getMicQuality() {
        return this.micQuality;
    }

    @Override
    public void setMicQuality(int micQuality) {
        this.micQuality = micQuality;
    }
}

// 아래 코드는 변경하지 마세요.
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}