//다음 클래스들을 조건에 맞게 구현하세요, 필요시 코드를 수정합니다.
abstract class Transportation {
    protected int timeCost;

    public Transportation(int timeCost) {
        this.timeCost = timeCost;
    }

    public Transportation() {
        this(60);
    }

    public int getTimeCost() {
        return this.timeCost;
    }

    public void setTimeCost(int timeCost) {
        this.timeCost = timeCost;
    }

    public abstract int computeCost();
}

class Bus extends Transportation {
    private String busStop;
    private int busFee;

    public Bus(int timeCost, int busFee, String busStop) {
        super(timeCost);
        this.busStop = busStop;
        this.busFee = busFee;
    }

    public Bus() {
        this(60, 1300, "국민대학교");
    }

    public String getBusStop() {
        return this.busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }

    public int getBusFee() {
        return this.busFee;
    }

    public void setBusFee(int busFee) {
        this.busFee = busFee;
    }

    @Override
    public int computeCost() {
        return this.busFee;
    }
}

class Subway extends Transportation {
    private String subwayStation;
    private int subwayFee;

    public Subway(int timeCost, int subwayFee, String subwayStation) {
        super(timeCost);
        this.subwayFee = subwayFee;
        this.subwayStation = subwayStation;
    }

    public Subway() {
        this(60, 1500, "길음역");
    }

    public String getSubwayStation() {
        return this.subwayStation;
    }

    public void setSubwayStation(String subwayStation) {
        this.subwayStation = subwayStation;
    }

    public int getSubwayFee() {
        return this.subwayFee;
    }

    public void setSubwayFee(int subwayFee) {
        this.subwayFee = subwayFee;
    }

    @Override
    public int computeCost() {
        return this.subwayFee;
    }
}

class Car extends Transportation {
    private int gas;

    public Car(int timeCost, int gas) {
        super(timeCost);
        this.gas = gas;
    }

    public Car() {
        this.gas = 0;
    }

    public int getGas() {
        return this.gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    @Override
    public int computeCost() {
        return 0;
    }
}

// 메소드 solution()의 코드는 변경하지 않고, 메소드 computeTotalCost()를 조건에맞게 구현하세요.
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }

    public int computeTotalCost(Transportation[] transports) {
        int totalCost = 0;
        for (Transportation t : transports) {
            if (t instanceof Car) {
                if (((Car) t).getGas() <= 0) {
                    totalCost += 50000;
                }
            } else {
                totalCost += t.computeCost();
            }
        }
        return totalCost;
    }
}