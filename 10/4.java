//아래 코드를 조건에 맞게 구현 하세요, 필요시 코드를 수정 해야 합니다.
class Weapon {
    private int weaponPower;

    public Weapon(int weaponPower) {
        this.weaponPower = weaponPower;
    }

    public Weapon() {
        this(0);
    }

    public int getWeaponPower() {
        return this.weaponPower;
    }

    public void setWeaponPower(int weaponPower) {
        this.weaponPower = weaponPower;
    }
}

abstract class Monster {
    protected int hp, monsterPower;

    public Monster(int hp, int monsterPower) {
        this.hp = hp;
        this.monsterPower = monsterPower;
    }

    public Monster() {
        this(0, 0);
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMonsterPower() {
        return this.monsterPower;
    }

    public void setMonsterPower(int monsterPower) {
        this.monsterPower = monsterPower;
    }

    public void getAttacked(int damage) {
        this.hp -= damage;
    }

    public abstract int attackDamage();
}

class Slime extends Monster {
    public Slime(int hp, int monsterPower) {
        super(hp, monsterPower);
    }

    public Slime() {
        super();
    }

    @Override
    public int attackDamage() {
        return this.monsterPower;
    }
}

class Goblin extends Monster {
    private Weapon weapon;

    public Goblin(int hp, int monsterPower, Weapon weapon) {
        super(hp, monsterPower);
        this.weapon = weapon;
    }

    public Goblin() {
        super();
        this.weapon = new Weapon();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int attackDamage() {
        return this.monsterPower + weapon.getWeaponPower();
    }
}

interface Flyable {
    public void fly();

    public void setIsFlying(boolean isFlying);

    public boolean getIsFlying();
}

class Dragon extends Monster implements Flyable {
    private boolean isFlying;

    Dragon(int hp, int monsterPower, boolean isFlying) {
        super(hp, monsterPower);
        this.isFlying = isFlying;
    }

    Dragon() {
        super();
        this.isFlying = false;
    }

    @Override
    public boolean getIsFlying() {
        return this.isFlying;
    }

    @Override
    public void setIsFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    @Override
    public void fly() {
        this.isFlying = true;
    }

    @Override
    public int attackDamage() {
        return this.isFlying ? this.monsterPower * 2 : this.monsterPower;
    }
}

// 아래 코드는 수정하지 마세요.
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}