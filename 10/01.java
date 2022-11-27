//아래 코드들을 조건에 맞게 구현하되, 필요하다면 코드를 변경 하세요
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this("white");
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int getArea();
}

class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        this("white", 1);
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return this.radius * this.radius * 3;
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this("white", 1, 1);
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }
}

// 아래 코드를 지우지 마세요.
class Solution {
    public int solution(int param0) {
        int answer = 0;
        return answer;
    }
}