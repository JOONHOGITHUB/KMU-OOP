//아래 코드를 조건에 맞게 구현하며, 필요시 코드를 수정하세요.
abstract class CelestialBody {
    protected double distanceFromEarth, mass;

    public CelestialBody(double d, double m) {
        this.distanceFromEarth = d;
        this.mass = m;
    }

    public CelestialBody() {
        this(0, 0);
    }

    public double getDistanceFromEarth() {
        return this.distanceFromEarth;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}

class Star extends CelestialBody {
    private double brightness;

    public Star(double d, double m, double b) {
        super(d, m);
        this.brightness = b;
    }

    public Star() {
        super();
        this.brightness = 0;
    }

    public double getBrightness() {
        return this.brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }
}

class Planet extends CelestialBody {
    private double distanceFromStar;

    public Planet(double d1, double b, double d2) {
        super(d1, b);
        this.distanceFromStar = d2;
    }

    public Planet() {
        super();
        this.distanceFromStar = 0;
    }

    public double getDistanceFromStar() {
        return this.distanceFromStar;
    }

    public void setDistanceFromStar(double distanceFromStar) {
        this.distanceFromStar = distanceFromStar;
    }
}

// 아래 코드는 수정하지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}