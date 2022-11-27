//아래 코드를 조건에 맞게 구현하되, 필요 하다면 코드를 수정하세요.
abstract class Entity {
    public int hp, ap;
    public String classification;

    public Entity(int hp, int ap, String classification) {
        this.hp = hp;
        this.ap = ap;
        this.classification = classification;
    }

    public Entity(String classification) {
        this(100, 10, classification);
    }

    public abstract int Attack();

    public abstract void Damaged(int attacked);
}

class Player extends Entity {
    public int mp;
    public String nickname;

    public Player(int hp, int ap, int mp, String classification, String nickname) {
        super(hp, ap, classification);
        this.mp = mp;
        this.nickname = nickname;
    }

    public Player(String nickname) {
        this(100, 10, 100, "초보자", nickname);
    }

    @Override
    public int Attack() {
        if (this.mp >= 10) {
            this.mp -= 10;
            return this.ap;
        }
        return 0;
    }

    @Override
    public void Damaged(int attacked) {
        this.hp -= attacked;
        if (this.hp < 0)
            this.hp = 0;
    }
}

class Mob extends Entity {
    public int dp;

    public Mob(int hp, int ap, int dp, String classification) {
        super(hp, ap, classification);
        this.dp = dp;
    }

    public Mob(String classification) {
        this(100, 10, 1, classification);
    }

    @Override
    public int Attack() {
        return this.ap;
    }

    @Override
    public void Damaged(int attacked) {
        attacked -= this.dp;
        if (attacked <= 1)
            attacked = 1;
        this.hp -= attacked;
        if (this.hp < 0)
            this.hp = 0;
    }
}

// 아래 코드는 수정하지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}